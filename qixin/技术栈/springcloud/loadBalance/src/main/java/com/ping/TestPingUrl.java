package com.ping;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qixin on 2018/1/21.
 */
public class TestPingUrl {
    public static void main(String[] args) throws InterruptedException {
        BaseLoadBalancer lb = new BaseLoadBalancer();

        lb.setPing(new PingUrl());
        lb.setPingInterval(2);

        List<Server> servers = new ArrayList<>();
        servers.add(new Server("localhost", 8080));
        servers.add(new Server("localhost", 8081));
        lb.addServers(servers);

//        for(int i = 0; i < 6; i++) {
//            Server s = lb.chooseServer(null);
//            System.out.println(s);
//        }

        Thread.sleep(6000);
    }
}
