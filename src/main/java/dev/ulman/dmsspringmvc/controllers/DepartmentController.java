package dev.ulman.dmsspringmvc.controllers;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dev.ulman.dmsspringmvc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("departments")
@Controller
public class DepartmentController {

    private RestTemplate restTemplate;

    @Autowired
    public DepartmentController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(path = "{id}")
    @HystrixCommand(fallbackMethod = "getServiceDisableInfo")
    public String getDepartmentById(@PathVariable("id") long id, Model model){

        Department department = restTemplate.getForObject("http://DMS-GATEWAY/dms-api/departments/" + id, Department.class);

        model.addAttribute("department", department);

        return "department";
    }

    public String getServiceDisableInfo(@PathVariable("id") long id, Model model){

        return "error/error";
    }
}
