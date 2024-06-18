package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private  List<Skill> skills = new ArrayList<>();


    public Job() {
    }

    // Initialize the id and value fields.

    public Job(Employer employer) {

        this.employer = employer;

    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        if(skills != null) {
            this.skills.addAll(skills);
        }
    }


    // Getters and setters.


    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skillObjs) {
        this.skills = skillObjs;
    }



}
