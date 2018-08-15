package com.example.shirodemo;

import com.example.shirodemo.entity.User;
import com.example.shirodemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShirodemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		User user = userService.selectUserByUserName("test");
			System.out.println(user.getPassword()+" * "+user.getUsername());
	}

}
