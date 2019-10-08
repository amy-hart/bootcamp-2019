package com.manchesterdigital;

public class Student {
    private final String name;
    private final Integer score;
    private final String subject;

    public Student(String name, Integer score, String subject) {
        this.name = name;
        this.score = score;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", subject='" + subject + '\'' +
                '}';
    }
}