package com.myportfolio.menu;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
	@RequestMapping(value = "/getMenuList")
	public ResponseEntity<Object> getMenu() {
		ArrayList<MenuModel> menuList = new ArrayList<>();
		MenuModel home = new MenuModel();
		home.setId("01");
		home.setName("home");
		menuList.add(home);

		MenuModel about = new MenuModel();
		about.setId("02");
		about.setName("about");
		menuList.add(about);

		MenuModel skills = new MenuModel();
		skills.setId("03");
		skills.setName("skills");
		menuList.add(skills);

		MenuModel work = new MenuModel();
		work.setId("04");
		work.setName("work");
		menuList.add(work);

		MenuModel education = new MenuModel();
		education.setId("05");
		education.setName("education");
		menuList.add(education);

		return new ResponseEntity<>(menuList, HttpStatus.OK);
	}
}
