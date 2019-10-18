package com.joker.jedis;

import redis.clients.jedis.Jedis;

/**
 * @PackageName:com.joker.jedis
 * @Date:2019/10/17 21:34
 * @Author: zsy
 */
public class SimpleJedis {
    public static void main(String[] args) {
        //指定Redis服务器的IP地址和端口号
        Jedis jedis = new Jedis("192.168.252.128", 6379);
        //执行ping命令
        String ping = jedis.ping();
        System.out.println(ping);
        //关闭连接
        jedis.close();
    }
}
