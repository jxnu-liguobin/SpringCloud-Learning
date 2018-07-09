package cn.edu.jxnu.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 梦境迷离
 * @description
 * @time 2018年4月5日
 */
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		String string = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
		System.out.println("消费者:" + string);
		return "消费者：" + string;
	}

	@RequestMapping(value = "/user-consumer", method = RequestMethod.GET)
	public String userConsumer() {
		String user = restTemplate.getForEntity("http://USER-SERVICE/user", String.class).getBody();
		System.out.println("消费者:" + user);

		return "消费者：" + user;
	}
}
