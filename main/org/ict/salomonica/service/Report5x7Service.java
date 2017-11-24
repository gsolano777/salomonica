package org.ict.salomonica.service;

import java.util.List;

import org.ict.salomonica.entity.Report5x7;
import org.ict.salomonica.repository.Report5x7Repository;
import org.ict.salomonica.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class Report5x7Service {
	
	@Autowired
	private Report5x7Repository repo5x7Repository;

	public List<Report5x7> getCurrentMonth5x7(long personId) {
		int currentWeekOfMonth =  DateUtils.getCurrentWeekOfTheMonth();
		System.out.println("Current week: " + currentWeekOfMonth);
		return repo5x7Repository.findByPersonIdOrderByYearDescWeekDesc(personId, new PageRequest(0,currentWeekOfMonth));
	}
}
