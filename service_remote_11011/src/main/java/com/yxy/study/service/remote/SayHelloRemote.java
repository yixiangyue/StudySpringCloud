package com.yxy.study.service.remote;
import java.util.Map;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "eureka_service")
public interface SayHelloRemote {

    Map<String,Object> sayhello();
}
