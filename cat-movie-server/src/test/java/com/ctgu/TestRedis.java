package com.ctgu;
import redis.clients.jedis.Jedis;


public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println("正在连接:"+jedis.ping());
        jedis.set("name","cxh");
        System.out.println("name:"+jedis.get("name"));
    }
}

