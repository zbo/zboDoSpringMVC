package com.springapp.mvc;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/upload")
public class UploadController {
	@RequestMapping(method = RequestMethod.GET)
	public String uploadPage(ModelMap model) {
		model.addAttribute("message", "upload!");
        model.addAttribute("time", DateTime.now());
		return "upload/upload";
	}
}