package com.wsh.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClient {
	public static void main(String[] args) {
		JedisPool jedisPool = new JedisPool("192.168.48.129", 6379);
		Jedis jedis = jedisPool.getResource();
		jedis.set("wsh", "nothing");
		System.out.println(jedis.get("wsh"));
		jedis.close();
		jedisPool.close();
			
	}
}
