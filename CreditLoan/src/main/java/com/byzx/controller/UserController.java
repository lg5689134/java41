package com.byzx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.byzx.dao.UserDao;
import com.byzx.model.User;


@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/findById")
	@ResponseBody
	public User findUser(Integer id){
		return userDao.findById(id);
	}
	//@Scheduled(cron = "*/5 * * * * ?")//@Scheduled(fixedRate = 5000)
	/*public void main() {
		System.out.println("1245");
	}*/
	@RequestMapping("/test12")
	public String findAll() {
		return "MyJsp";
	}
	
}
