package com.axis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	private static JedisPool jedisPool = null;
	/**
	 * 初始化Redis连接池
	 */
	static {
		try {
			String redisIp =  BasePropertiesUtil.get("redis_ip");
			String port = BasePropertiesUtil.get("redis_ip_port");
			// 创建jedis池配置实例
			JedisPoolConfig config = new JedisPoolConfig();
			// 设置池配置项值
			config.setMaxTotal(5000);
			//config.setMaxActive(500);
			config.setMaxIdle(1000);
			config.setMaxWaitMillis(1000 * 100);
			//config.setMaxWait(1000 * 100);
			config.setTestOnBorrow(true);
			jedisPool = new JedisPool(config, redisIp, Integer.parseInt(port), 10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Redis保存字符串
	 * 
	 * @param key
	 * @param value
	 */
	public static void setData(String key, String value,Integer seconds) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.set(key, value);
			if(seconds!=null){
				jedis.expire(key, seconds);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeJedis(jedis);
		}
	}
	
	public static String getData(String key) {
		Jedis jedis = null;
		String ret =  "";
		try {
			jedis = jedisPool.getResource();
			ret=jedis.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeJedis(jedis);
		}
		return ret;
	}
	
	public static Long getOverTime(String key){
		Jedis jedis = null;
		Long second = null;
		try {
			jedis = jedisPool.getResource();
			second = jedis.ttl(key);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeJedis(jedis);
		}
		return second;
	}
	
	public static Long delData(String key){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			return jedis.del(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeJedis(jedis);
		}
		return 0L;
	}
	
	public static void closeJedis(Jedis jedis){
		if(jedis!=null){
			jedis.close();
		}
	}
}
