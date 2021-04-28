package filePathLesson;


public class StudentService {

    public static void printFullNamesOfStudents(Student[] name) {
        for (Student m : name) {
            m.fullName();

        }
        System.out.println("..........");
    }

    public static void printMaleStudents(Student[] name) {
        for (Student m : name) {
            if (m.getGender() == 'm') {
                m.fullName();
            }
        }
        System.out.println("...........");

    }

    public static void femaleStudentsGreaterMark(Student[] name) {
        for (Student m : name) {
            if (m.getGender() == 'f' && m.getMark() > 50.4)
                m.fullName();

        }
        System.out.println("...........");

    }

    public static void minMarkStudentInfo(Student[] name) {
        Student min = name[0];
        for (int i = 0; i < name.length; i++) {
            if (name[i].getMark() < min.getMark())
                min = name[i];

        }
        min.printInfo();

    }

    public static void biggestMaleStudent(Student[] name) {
        Student max = name[0];
        for (int i = 0; i < name.length; i++) {
            if (name[i].getGender() == 'm') {
                if (name[i].getYear() < max.getYear())
                    max = name[i];
            }
        }
        max.printInfo();
    }

    public static void sortedByMark(Student[] students) {
        boolean isActive = true;
        int countFors = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < students.length - 1 - countFors; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student x = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = x;
                    isActive = true;
                }
            }
            countFors++;

        }
        System.out.println("...........");
        for (Student y : students) {
            System.out.println(y);

        }

    }

    public static void sortedByYearFemale(Student[] students) {
        boolean isActive = true;
        int countFors = 0;
        int pop=0;
        int num=0;

        for (Student m : students) {
            if (m.getGender() == 'f') {
               pop++;
            }
        }
        Student[] arr=new Student[pop];


        for (Student m : students) {
            if (m.getGender() == 'f') {
                arr[num++]=m;
            }
        }
        while (isActive) {
            isActive = false;
            for (int i = 0; i < arr.length - 1 - countFors; i++) {

                    if (arr[i].getYear() < arr[i + 1].getYear()) {
                        Student x = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = x;
                        isActive = true;
                    }

            }
            countFors++;

        }
        System.out.println("...........");
        for (Student y : arr) {
            System.out.println(y);

        }


    }
}
