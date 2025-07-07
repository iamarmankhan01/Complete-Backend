package com.app.arman.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int stdId;
    private String stdName;
    private double stdFee;
    private String stdCourse;
}
