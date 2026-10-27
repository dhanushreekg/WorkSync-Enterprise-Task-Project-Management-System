package com.worksync.workSync;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column (length=150)
    private String projectName;
    // Getter and Setter methods for projectName
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String value) {
        this.projectName = value;
    }   

    @Column (length=500)
    private String projectDescription;
    // Getter and Setter methods for projectDescription
    public String getProjectDescription() {
        return projectDescription;
    }
    public void setProjectDescription(String value) {
        this.projectDescription = value;
    }
}

