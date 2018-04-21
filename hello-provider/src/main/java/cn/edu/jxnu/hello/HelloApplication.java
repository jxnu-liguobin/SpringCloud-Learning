package cn.edu.jxnu.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@SpringBootApplication
@EnableDiscoveryClient // 激活发现
@Slf4j
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Autowired
	private DiscoveryClient client;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		ServiceInstance instance = client.getLocalServiceInstance();
		log.info("生成者：/hello,host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
		return "生产者 ："+"Hello World";
	}

}
