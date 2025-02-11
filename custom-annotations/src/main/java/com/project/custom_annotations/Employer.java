package com.project.custom_annotations;

import lombok.Data;

@Data
public class Employer {

    @ValidateEmployeeType
    String employer;
}
