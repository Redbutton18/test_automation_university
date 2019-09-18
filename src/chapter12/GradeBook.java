package chapter12;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {

        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> newGrades = TestResults.getMakeUpGrades();

        for(var student : newGrades.entrySet()) {
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = newGrades.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final grades: ");
        gradeBook.forEach((a,b) -> System.out.println("Student: " + a + ", Grade: " + b));
    }
}
