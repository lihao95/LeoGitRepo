package com.leo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
//@EnableConfigServer
@EnableDiscoveryClient
public class CloudConfigServer {
    public  static  void  main (String[] args){
        SpringApplication.run(CloudConfigServer.class,args);

    }
}
