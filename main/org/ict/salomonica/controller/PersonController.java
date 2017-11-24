package org.ict.salomonica.controller;

import java.util.HashMap;
import java.util.Map;

import org.ict.salomonica.entity.Person;
import org.ict.salomonica.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(path="/add")
	public @ResponseBody ModelAndView addPerson() {
		
		Map<String, Object> params = new HashMap<>();
        params.put("person", new Person());

		return new ModelAndView("addPerson", params);
	}
	
	@PostMapping(path="/save")
	public @ResponseBody ModelAndView savePerson(final Person person) {		
		personRepository.save(person);
		
		Map<String, Object> params = new HashMap<>();
        params.put("persons", personRepository.findAll());

        return new ModelAndView("showAllPersons", params);
	}
	

	@RequestMapping(path="/showAll")
	public @ResponseBody ModelAndView showAll() {
		Map<String, Object> params = new HashMap<>();
		params.put("persons", personRepository.findAll());

        return new ModelAndView("showAllPersons", params);
	}
	

}
