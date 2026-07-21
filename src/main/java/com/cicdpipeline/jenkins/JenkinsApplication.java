package com.cicdpipeline.jenkins;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		System.out.println("JenkinsApplication started");
		System.out.println("now i will commit from IDE");
		System.out.println("Changes done from GIT by another developer");

	}

}
