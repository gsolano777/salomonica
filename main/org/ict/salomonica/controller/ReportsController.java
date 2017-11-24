package org.ict.salomonica.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ict.salomonica.entity.Report5x7;
import org.ict.salomonica.repository.Report5x7Repository;
import org.ict.salomonica.service.Report5x7Service;
import org.ict.salomonica.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/reports")
public class ReportsController {
	
	private Log LOG = LogFactory.getLog(ReportsController.class);
	
	@Autowired
	private Report5x7Repository repo5x7Repository;
	
	@Autowired
	private Report5x7Service report5x7Service;
	
	@RequestMapping(path="/5x7")
	public @ResponseBody ModelAndView report5x7(
			@RequestParam(name="personId", required=true) long personId, 
			@RequestParam(name="year", required=false) Integer yearParam, 
			@RequestParam(name="week", required=false) Integer weekParam) {
		
		LOG.trace("Person id:" + personId);
		
		int year = (yearParam != null ? yearParam : DateUtils.getCurrentYear());
		int week = (weekParam != null ? weekParam : DateUtils.getCurrentWeekOfTheYear());
		
		Map<String, Object> params = new HashMap<>();
        params.put("report", new Report5x7(personId, year, week));
 
		return new ModelAndView("report5x7", params );
	}

	
	@PostMapping(path="/add5x7")
	public @ResponseBody ModelAndView add5x7(final Report5x7 report, final BindingResult bindingResult) {
		LOG.trace(String.format("Saving 5x7 for person:%s, year:%s, week:%s", report.getPersonId(), report.getYear(), report.getWeek()));
		repo5x7Repository.save(report);
		Map<String, Object> params = new HashMap<>();
		List<Report5x7> reports = report5x7Service.getCurrentMonth5x7(report.getPersonId());
		
        params.put("reports", reports);
		return new ModelAndView("saved5x7", params);
	}
}
