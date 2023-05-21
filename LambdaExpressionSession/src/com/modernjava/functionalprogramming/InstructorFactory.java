package com.modernjava.functionalprogramming;

import java.util.List;

public interface InstructorFactory {
    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourse, List<String>courses);
}
