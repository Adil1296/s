package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;


@RestController
public class Controller 
{
	@Autowired
	RestTemplate rt;
	@RequestMapping("/")
	public ModelAndView LoginPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("LoginPage.jsp");
		return mv;
	}

	@RequestMapping("/Registration")
	public ModelAndView RegPge()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Registration.jsp");
		return mv;
	}
	@RequestMapping("/saveuser")
	public String save(User u1)
	{
		String res="fail";
		//System.out.println(u1.toString());
		res=rt.postForObject("http://localhost:8085/save", u1, String.class);
		return res;
	}
	
	@RequestMapping("/validate")
	public String valid(User u1)
	{
		String res="fail";
		//System.out.println(u1.toString());
		res=rt.postForObject("http://localhost:8085/validate", u1, String.class);
		return res;
	}
	

	
}
