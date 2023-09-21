package org.example;

import redis.clients.jedis.Jedis;

import java.util.Map;

class RedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        System.out.println("Method add dictionary.");
        System.out.println(jedis.hset("TestSetKey", "Field", "Value"));
        System.out.println(jedis.hset("TestSetKey", "another", "testValue"));

        System.out.println(jedis.hget("TestSetKey", "another"));

        Map<String, String> fields = jedis.hgetAll("TestSetKey");
        for (String field : fields.keySet()) {
            System.out.println(field);
        }

        System.out.println(fields.get("another"));

        System.out.println(jedis.del("TestSetKey"));
    }

}
