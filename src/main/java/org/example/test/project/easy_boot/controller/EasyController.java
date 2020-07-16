package org.example.test.project.easy_boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.test.project.easy_boot.dto.InputForm;
import org.example.test.project.easy_boot.services.ResordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@Slf4j
@RequestMapping(value = "/easy_boot")
public class EasyController {

    private final ResordsService recordsService;

    @Autowired
    public EasyController(ResordsService resordsService) {
        this.recordsService = resordsService;
    }

    @GetMapping
    public String index(InputForm inputForm) {
        return "input_page";
    }

    @PostMapping
    public String uploadData(@Valid InputForm inputForm, Errors errors) {
        if (!errors.hasErrors()) {
            log.info("data: {} validated, saving data", inputForm);
            recordsService.saveInputFormData(inputForm);
            return "redirect:/easy_boot";
        } else {
            log.info("error validating data");
            return "input_page";
        }
    }
}
