package com.libyao;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisUsage {

    public static void runRedis() {
        JedisPool pool = new JedisPool("localhost", 6379);

        try (Jedis jedis = pool.getResource()) {
            jedis.set("clientName", "Jedis");

            String name = jedis.get("clientName");
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        runRedis();
    }

}
