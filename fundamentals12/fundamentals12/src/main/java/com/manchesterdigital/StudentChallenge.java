package com.manchesterdigital;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Given a list of students, for English, German and French,
 * collect the students into individual groups such that
 *
 * All students are language specific
 * Each student must have a score greater than 50
 * Each students name must start with A or S
 *
 * Print out your final lists.
 */
public class StudentChallenge {
    public static void main(String[] args) {
        Student english1 = new Student("Alan", 55, "English");
        Student english2 = new Student("Angela", 22, "English");

        Student ger1 = new Student("Angela", 65, "German");
        Student ger2 = new Student("Schmitd", 25, "German");

        Student french1 = new Student("Henry", 35, "French");
        Student french2 = new Student("Juliette", 75, "French");

        List<Student> students =
                List.of(english1, english2, ger1, ger2, french1, french2);

        List<Student> english = students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("english"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());

        List<Student> german = students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("german"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());

        List<Student> french = students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("french"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());

        System.out.println("french = " + french);
        System.out.println("german = " + german);
        System.out.println("english = " + english);

        // Refactored to use a defined criteria:
        System.out.println("english = " +
                extractStudents(students, "English", 20));
    }

    private static List<Student> extractStudents(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase(subject))
                .filter(student -> student.getScore() > minScore)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());
    }

    private  static List<Student> extractStudentsUsingPredicate(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }
    /* Breaking out the filter so it can be reused, studentFilter is called in the stream above,
    like passing a function to map in JS */
    private static Predicate<Student> studentFilter(String subject, Integer minScore) {
        return student -> student.getSubject().equalsIgnoreCase(subject) &&
                student.getScore() > minScore &&
                (student.getName().startsWith("A") || student.getName().startsWith("S"));
    }
}