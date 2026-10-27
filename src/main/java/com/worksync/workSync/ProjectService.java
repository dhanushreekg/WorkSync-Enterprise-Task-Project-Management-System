package com.worksync.workSync;

import org.springframework.stereotype.Service;

@Service 
public class ProjectService {
    public void validateProjectName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Project name is required");
        }
    }

    public boolean isValidProjectName(String name) {
        if(name!=null && !name.isBlank()) {
            return true;
        } else{
            return false;  
        }
    }
//Constructor injection of the ProjectRepository
    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository){
        this.repository = repository;
    }
}
