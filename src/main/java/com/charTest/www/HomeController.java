package com.charTest.www;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		
		return "home";
	}
	
	@RequestMapping(value = "echo-go" , method = RequestMethod.GET)
	public String goEcho(Locale locale, Model model){
		
		logger.info("echo go");
		return "echo-ws";
	}
	
	@RequestMapping(value = "chat-go" , method = RequestMethod.GET)
	public String goChat(Locale locale, Model model){
	
		logger.info("chat go");
		
		return "chat-ws";
	}
	@RequestMapping(value ="echo-sockjs-go" , method = RequestMethod.GET)
	public String goEchojs(Locale locale, Model model){
		
		logger.info("echo-sockjs-go");
		
		return "echo-sockjs";
	}
	
	@RequestMapping(value ="chat-sockjs-go" , method = RequestMethod.GET)
	public String goChatjs(Locale locale, Model model){
		
		logger.info("chat-sockjs-go");
		
		
		return "chat-sockjs";
	}
	
	@RequestMapping(value ="webRtc-1-go" , method = RequestMethod.GET)
	public String gowebRtc1(Locale locale , Model model){
		
		logger.info("webRtc-1");
		
		
		return "webRtc-1";
	}
	
	@RequestMapping(value ="webRtc-2-go" , method = RequestMethod.GET)
	public String gowebRtc2(Locale locale , Model model){
		
		logger.info("webRtc-2");
		
		
		return "webRtc-2";
	}
	
}

