package com.pdt.webapp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdt.core.dao.GenericDao;
import com.pdt.core.model.Tour;
import com.pdt.core.service.TourService;
import com.pdt.core.util.ServiceResolver;

@Controller
public class HomeController {

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		TourService tourService = ServiceResolver.findService(TourService.class);
		tourService.createSubjectTours();
		model.put("tours", ServiceResolver.findService(GenericDao.class).findAll(Tour.class));
		return "home";
	}

}
