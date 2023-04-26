package org.example.record;

import lombok.Value;

record Student(String name, int age) {
    private static final int ageAdult = 18;
    public boolean isAdult() {
        return age >= ageAdult;
    }


    public static Student createAdultStudent(String name) {
        return new Student(name, ageAdult);
    }
}
