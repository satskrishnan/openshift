package com.infosys.creams.usermaintenance.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class AppHealthCheck extends AbstractHealthIndicator {

	@Override
	protected void doHealthCheck(Health.Builder bldr) throws Exception {
		boolean running = true;
		if (running) {
			bldr.up().withDetail("Event", "All is well");
		} else {
			bldr.down().withDetail("Event", "I'm sick");
		}
	}
}
