package com.joker.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Protocol;

/**
 * @PackageName:com.joker.jedis
 * @Date:2019/10/17 21:47
 * @Author: zsy
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        //声明Linux服务器IP地址
        String host = "192.168.252.128";
        //声明Redis端口号
        int port = Protocol.DEFAULT_PORT;

        //创建连接池对象
        JedisPool jedisPool = new JedisPool(host, port);
        //获取Jedis对象连接Redis
        Jedis jedis = jedisPool.getResource();

        //执行具体操作
        String ping = jedis.ping();
        System.out.println(ping);

        //关闭连接
        jedisPool.close();
    }
}
