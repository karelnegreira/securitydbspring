package com.karelcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.karelcode.model.Users;
import com.karelcode.repos.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThemyleafJpaPostgresSecurityDbProyectApplicationTests {

	@Autowired
	private UsersRepository usersrepos;
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	public void createUserTest() {
		Users users = new Users();
		users.setId(1);
		users.setUsername("maike");
		users.setPassword(encoder.encode("123"));
		Users returnedUser=usersrepos.save(users);
		//the below sentence verifies if the returned users matches with the one we passed through
		assertTrue(returnedUser.getPassword().equalsIgnoreCase(users.getPassword()));
	}

}
