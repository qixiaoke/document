package com.myRule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * Created by qixin on 2018/1/21.
 */
public class MyRule implements IRule {

    private ILoadBalancer lb;

    public MyRule(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public Server choose(Object key) {
        List<Server> servers = lb.getAllServers();
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }
}
