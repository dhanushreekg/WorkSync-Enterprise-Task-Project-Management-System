package com.worksync.workSync;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class ProjectController {
    @GetMapping("/projects")
    public List<String>  projectList() {
        return List.of("Task Management", "Traking Financials", "Team Collaboration", "Reporting and Analytics", "Resource Management");
    }
    // Controller method or controller accessing to validate project name using ProjectService
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping ("/projects/validate")
    public boolean validateProjectName(@RequestParam String name) {
        return projectService.isValidProjectName(name);
    }
    //========================================= 
    
}
