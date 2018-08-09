package com.myportfolio.home;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myportfolio.MyPortfolio;

@RestController
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(MyPortfolio.class);
	
	@RequestMapping("/homePageInfo")
	@ResponseBody
	public ResponseEntity<Object> getHomePageInfo() {
		logger.info("Home Page Info service is called");
		final ArrayList<String> otherDetailsList = new ArrayList<>();
		otherDetailsList.add("+91-9892761957");
		otherDetailsList.add("nevilledsouza28@gmail.com");
		otherDetailsList.add("28th May, 1991");
		otherDetailsList.add("Mumbai-55, India");
		
		HomeModel hm = new HomeModel();
		hm.setTitle("Hi, I'm Neville D'souza.");
		hm.setDesignation("SENIOR SOFTWARE ENGINEER");
		hm.setCompanyName("BNP PARIBAS INDIA SOLUTIONS");
		hm.setSkills("WEB DEVELOPER - ANGULAR JS | SPRING BOOT | ORACLE | JENKINS");
		hm.setShortDescription("I'm a full stack web developer, primarily working on applications built on AngularJS and Spring Boot framework, living in India, Mumbai.");
		hm.setListOfOtherDetails(otherDetailsList);
		return new ResponseEntity<>(hm, HttpStatus.OK);
	}
}
