package com.example.demo;

import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class ProjectRestController {
    @Autowired
    private ProjectRepository projRepo;

    @Autowired
    private ReportService reportService;

    @RequestMapping("api/v1/projects")
    public List<Project> getAllProjects(){
        return projRepo.findAll();
    }





}
