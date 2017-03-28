package com.pt.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import redis.clients.jedis.ShardedJedis;
@Repository
public class RedisClientTemplate {
	 private static final Logger log = LoggerFactory.getLogger(RedisClientTemplate.class);
	 @Autowired
	 private RedisDataSource  redisDataSource;
	
	 public void disconnect() {
	        ShardedJedis shardedJedis = redisDataSource.getRedisClient();
	        shardedJedis.disconnect();
	    }
	 
	 /**
	     * 设置单个值
	     * 
	     * @param key
	     * @param value
	     * @return
	     */
	    public String set(byte[] key, byte[] value) {
	        String result = null;

	        ShardedJedis shardedJedis = redisDataSource.getRedisClient();
	        if (shardedJedis == null) {
	            return result;
	        }
	        try {
	            result = shardedJedis.set(key, value);
	        } catch (Exception e) {
	            log.error(e.getMessage(), e);
	        } finally {
	            redisDataSource.returnResource(shardedJedis);
	        }
	        return result;
	    }
	    public byte[] get(byte[] key) {
	    	byte[] result = null;
	        ShardedJedis shardedJedis = redisDataSource.getRedisClient();
	        if (shardedJedis == null) {
	            return result;
	        }
	        try {
	            result = shardedJedis.get(key);
	        } catch (Exception e) {
	            log.error(e.getMessage(), e);
	        } finally {
	            redisDataSource.returnResource(shardedJedis);
	        }
	        return result;
	    }
	    
	    
}
