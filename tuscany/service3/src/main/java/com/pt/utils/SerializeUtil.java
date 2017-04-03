package com.pt.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeUtil {
	public static <T> byte[] serialize(List<T> value) {  
        if (value == null) {  
            throw new NullPointerException("Can't serialize null");  
        }  
        byte[] rv=null;  
        ByteArrayOutputStream bos = null;  
        ObjectOutputStream os = null;  
        try {  
            bos = new ByteArrayOutputStream();  
            os = new ObjectOutputStream(bos);  
            for(T t : value){  
                os.writeObject(t);  
            }  
            os.writeObject(null);  
            os.close();  
            bos.close();  
            rv = bos.toByteArray();  
        } catch (IOException e) {  
            throw new IllegalArgumentException("Non-serializable object", e);  
        } finally {  
            close(os);  
            close(bos);  
        }  
        return rv;  
    }  
	
	public static <T> List<T> deserialize(byte[] in) {  
        List<T> list = new ArrayList<T>();  
        ByteArrayInputStream bis = null;  
        ObjectInputStream is = null;  
        try {  
            if(in != null) {  
                bis=new ByteArrayInputStream(in);  
                is=new ObjectInputStream(bis);  
                while (true) {  
                    T t = (T) is.readObject();  
                    if(t == null){  
                        break;  
                    }else{  
                        list.add(t);  
                    }  
                }  
                is.close();  
                bis.close();  
            }  
        } catch (IOException e) {  
        	e.printStackTrace();
        } catch (ClassNotFoundException e) {  
        	e.printStackTrace();
        } finally {  
          close(is);  
          close(bis);  
        }  
        return list;  
    }  
	
	
	
	
	
	
	
		public static byte[] serialize(Object object) {
			if (object == null) {  
	            throw new NullPointerException("Can't serialize null");  
	        }  
			byte[] bytes = null;
			 ObjectOutputStream oos = null;
	         ByteArrayOutputStream baos = null;
	         try {
	              // 序列化
	             baos = new ByteArrayOutputStream();
	             oos = new ObjectOutputStream(baos);
	             oos.writeObject(object);
	             bytes = baos.toByteArray();
	             
	        } catch (Exception e) {
	        	 throw new IllegalArgumentException("Non-serializable object", e);
	        }finally{
					close(oos);
					close(baos);
	        } 
	         return bytes;
			}

		   public static Object unserialize( byte[] bytes) {
			   if(bytes==null){
				throw new NullPointerException("Can't serialize null"); 
			   }
			   Object rv=null; 
		        ByteArrayInputStream bais = null;
		        ObjectInputStream ois = null;
		         try {
		              // 反序列化
		             bais = new ByteArrayInputStream(bytes);
		              ois = new ObjectInputStream(bais);
		              rv =	ois.readObject();
		            
		        } catch (Exception e) {
		        	throw new IllegalArgumentException("Non-serializable object", e);
		        }finally{
		        	close(bais);
		        	close(ois);
		        }   return rv;
		   	}
		   public static void close(Closeable closeable) {  
		       if (closeable != null) {  
		               try {
						closeable.close();
					} catch (IOException e) {
						e.printStackTrace();
					}  
		       		}  
		    
		   		}  
}
