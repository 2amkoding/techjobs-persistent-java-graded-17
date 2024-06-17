package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {
    @Size(max = 500)
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public Skill(String description, List<Job> jobs) {
        this.description = description;
        if (jobs != null) {
            this.jobs.addAll(jobs);
        }
    }


        public void setDescription (String description){
            this.description = description;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Skill skill = (Skill) o;
            return Objects.equals(description, skill.description);
        }

        @Override
        public int hashCode () {
            return Objects.hash(super.hashCode(), description);
        }

        @Override
        public String toString () {
            return description;
        }

        public List<Job> getJobs () {
            return jobs;
        }

        public void setJobs(Job jobs) {
        this.jobs.add(jobs);
        }


    public String getDescription() {
        return description;
    }


    }


