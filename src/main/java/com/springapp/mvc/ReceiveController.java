package com.springapp.mvc;

import com.springapp.model.File;
import com.springapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/receive")
public class ReceiveController {
    @RequestMapping(method = RequestMethod.POST)
    public String dataIn(User user, @RequestParam("file") MultipartFile file, HttpServletRequest request, ModelMap model) {
        File modFile=new File();
        if (!file.isEmpty()) {
            modFile.setName(file.getName());
            modFile.setPrimitiveName(file.getOriginalFilename());
            modFile.setSize(file.getSize());
            modFile.setType(file.getContentType());
        }
        model.addAttribute("user", user);
        model.addAttribute("file",file);
        return "upload/receive";
    }
}