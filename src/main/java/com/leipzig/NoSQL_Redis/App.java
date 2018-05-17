package com.leipzig.NoSQL_Redis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1", 6379);
        try {
            System.out.println("Connected to jedis " + jedis.ping());
            jedis.set("foo", "bar");
            String value = jedis.get("foo");
            System.out.println(value);
            jedis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
