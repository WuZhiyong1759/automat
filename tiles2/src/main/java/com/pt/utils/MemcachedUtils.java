package com.pt.utils;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.danga.MemCached.MemCachedClient;
@Repository
public class MemcachedUtils implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2157108856175147909L;
	@Resource
    MemCachedClient memCachedClient;

    public void setMemCachedClient(MemCachedClient memCachedClient) {
        this.memCachedClient = memCachedClient;

        // 序列化
        if (this.memCachedClient != null) {
            this.memCachedClient.setPrimitiveAsString(true);
        }
    }

    public boolean delete(String key) {
        return memCachedClient.delete(key);
    }
    
    public boolean add(String key, Object object) {
        return memCachedClient.add(key,object);
    }

    public void set(String key, Object object) {
        if (object != null)
            memCachedClient.set(key, object);
        else memCachedClient.delete(key);
    }

    public Object get(String key) {
        return memCachedClient.get(key);
    }

    public boolean deleteWithType(String key, Class clazz) {
        return memCachedClient.delete(getKeyWithType(key, clazz));
    }

    public Object getWithType(String key, Class clazz) {
        return memCachedClient.get(getKeyWithType(key, clazz));
    }

    public void setWithType(String key, Object object) {
        memCachedClient.set(getKeyWithType(key, object.getClass()), object);
    }

    public void setWithType(String key, Object object, Class clazz) {
        if (object != null)
            memCachedClient.set(getKeyWithType(key, clazz), object);
        else memCachedClient.delete(getKeyWithType(key, clazz));
    }

    protected String getKeyWithType(String key, Class clazz) {
        return clazz.getSimpleName() + "-" + key;
    }

    public Object[] getWithType(String[] keys, Class clazz) {
        for (int i = 0; i < keys.length; i++) {
            keys[i] = getKeyWithType(keys[i], clazz);
        }
        try {
            return memCachedClient.getMultiArray(keys);
        } catch (Exception e) {}
        return new Object[0];
    }

    public void setWithType(String[] keys, Class clazz, Object[] objects) {
        for (int i = 0; i < keys.length; i++) {
            memCachedClient.set(getKeyWithType(keys[i], clazz), objects[i]);
        }
    }


}
