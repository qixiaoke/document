package controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by qixin on 2017/12/10.
 */
@Component
public class HealthTest implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().build();
    }
}
