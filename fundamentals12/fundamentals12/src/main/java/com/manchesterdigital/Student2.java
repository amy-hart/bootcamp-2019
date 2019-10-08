/*package com.manchesterdigital;

public class Student {
    private final String name;
    private final String subject;
    private final Integer score;

    public Student(String name, String subject, Integer score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}*/

package com.manchesterdigital.challenges;

public class Student2 {
    private final String name;
    private final Integer score;
    private final String subject;

    public Student2(String name, Integer score, String subject) {
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
