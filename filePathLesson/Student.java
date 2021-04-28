package filePathLesson;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private  char gender;
    private double mark;

    public Student(String firstName, String lasttName, int year) {
        this.firstName = firstName;
        this.lastName = lasttName;
        this.year = year;
    }
    public void fullName() {
        System.out.printf("Name: %s %s\n", firstName, lastName);
    }

    public void printInfo() {
        System.out.println(".......-------........");
        System.out.printf("Name: %s %s\n", firstName, lastName);
        System.out.println("year: " + year);
        System.out.println("gender: " + (gender == 'm' ? "male" : "female"));
        System.out.println("mark: " + mark);
    }
    @Override
    public String toString() {
        return String.format("Name: %s %s\n", firstName, lastName);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public void setLasttName(String lasttName) {
        this.lastName = lasttName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
