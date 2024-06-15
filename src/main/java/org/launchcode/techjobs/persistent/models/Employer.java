package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 255)
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}
}

