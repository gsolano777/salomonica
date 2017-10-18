package org.ict.salomonica.controller;

import java.util.HashMap;
import java.util.Map;

import org.ict.salomonica.entity.Report5x7;
import org.ict.salomonica.repository.Report5x7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/reports")
public class ReportsController {
	
	@Autowired
	private Report5x7Repository repo5x7;
	
	@RequestMapping(path="/5x7")
	public @ResponseBody ModelAndView report5x7() {
		
		Map<String, Object> params = new HashMap<>();
        params.put("report", new Report5x7());

		return new ModelAndView("report5x7", params );
	}

	
	@PostMapping(path="/add5x7")
	public @ResponseBody ModelAndView add5x7(final Report5x7 report, final BindingResult bindingResult) {

		
		repo5x7.save(report);
		return new ModelAndView("saved5x7");
	}
}
