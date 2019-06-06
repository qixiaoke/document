package com;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qixin on 2018/1/21.
 */

/**
 * 负载均衡
 */
public class Run {
    public static void main(String[] args) {
        ILoadBalancer lb = new BaseLoadBalancer();

        List<Server> servers = new ArrayList<>();
        servers.add(new Server("localhost", 8080));
        servers.add(new Server("localhost", 8081));
        lb.addServers(servers);

        for(int i = 0; i < 6; i++) {
            Server s = lb.chooseServer(null);
            System.out.println(s);
        }
    }
}
