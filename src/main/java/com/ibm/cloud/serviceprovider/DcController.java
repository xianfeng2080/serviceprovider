package com.ibm.cloud.serviceprovider;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	@GetMapping("/dc")
	public String dc() {
		try {
			TimeUnit.SECONDS.sleep(5L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String services = "Services2001 001: " + discoveryClient.getServices();
		System.out.println("2001 : " + services);
		return services;
	}
}
