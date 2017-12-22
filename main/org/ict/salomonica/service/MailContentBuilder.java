package org.ict.salomonica.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailContentBuilder {
 
    private TemplateEngine templateEngine;
 
    @Autowired
    public MailContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    
    public String build(String template, Map<String, String> vars) {

	  Context context = new Context();
	  if(vars != null) {
		  vars.forEach((name, value) -> context.setVariable(name, value));
	  }
      return templateEngine.process(template, context);    
    }
 
}