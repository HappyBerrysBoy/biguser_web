package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.T_vessel_schedule_history;
import com.spring.main.TerminalInfo;

@Controller
public class DataGetController implements ApplicationContextAware{

	private WebApplicationContext context = null;
	private TerminalInfo terminalInfo = null;
	
	public DataGetController(){}
	
	public void setTerminalInfo(TerminalInfo terminalInfo){
		this.terminalInfo = terminalInfo;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = (WebApplicationContext) applicationContext;		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView createForm(HttpServletRequest request, HttpSession session) {
		System.out.println("createForm-GET");
		
		ModelAndView model = new ModelAndView();

		model.setViewName("main/home");
		model.addObject("A", "value a");
		
		return model;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ModelAndView createForm_post(HttpServletRequest request, HttpSession session) {
		System.out.println("createForm-post");
		ModelAndView model = new ModelAndView();		
		model.setViewName("main/success");
		return model;
	}
	
	@RequestMapping(value="{pagename}", method=RequestMethod.GET)
	public ModelAndView move(HttpServletRequest request, HttpSession session, ModelAndView model) {
		
		System.out.println("move-GET");
		model.setViewName("main/home");
		 
		return model;
		//return pageInfo.getViewName();
	}
	
	@RequestMapping(value="{pagename}", method=RequestMethod.POST)
	public ModelAndView search(HttpServletRequest request, ModelAndView model, BindingResult result) {
		System.out.println("search-POST");
		model.setViewName("main/home");
		return model;
	}
}
