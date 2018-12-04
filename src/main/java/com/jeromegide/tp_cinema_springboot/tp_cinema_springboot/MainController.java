package com.jeromegide.tp_cinema_springboot.tp_cinema_springboot;

import com.jeromegide.tp_cinema_springboot.tp_cinema_springboot.data.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController{

	@Autowired
	DataModel dataModel;
	@GetMapping("/")
	public String main(Model model){
		//model.addAllAttributes("films", dataModel.films());
	}


}
