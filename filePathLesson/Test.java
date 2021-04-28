package filePathLesson;





import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Test {
    public static void main(String[] args) {
        FileService.createFolder("txtFiles");
        try {
            FileService.createFile("txtFiles", "student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileService.write("txtFiles\\student.txt", "Hayk,Arabyan,1998,m,77.5\nAni,Babayan,1980,f,47.5\nKarine,Vancyan,2000,f,87.5");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] read = new String[0];
        Student[] students = new Student[3];
        int count=0;
        try {
            String[] studentsArr;
            read = FileService.read("txtFiles\\student.txt");
            for (String x : read) {
//                System.out.println(x);
                studentsArr = x.split(",");
                Student S1 = new Student(studentsArr[0], studentsArr[1], Integer.parseInt(studentsArr[2]));
                S1.setGender(studentsArr[3].charAt(0));
                S1.setMark(Double.parseDouble(studentsArr[4]));
                students[count]=S1;
                count++;


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        StudentService.printFullNamesOfStudents(students);
        StudentService.printMaleStudents(students);
        StudentService.femaleStudentsGreaterMark(students);
        StudentService.minMarkStudentInfo(students);
        StudentService.biggestMaleStudent(students);
        StudentService.sortedByMark(students);
        StudentService.sortedByYearFemale(students);



    }


}
