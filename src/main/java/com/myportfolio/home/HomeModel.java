package com.myportfolio.home;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HomeModel {
	private String title;
	private String designation;
	private String companyName;
	private String skills;
	private ArrayList<String> listOfOtherDetails = new ArrayList<>();
	private String shortDescription;
}
