package cn.edu.jxnu.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
@EnableDiscoveryClient // 激活发现
public class HelloApplication {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Autowired
	private DiscoveryClient client;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("/hello,host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
		return "Hello World";
	}

}
