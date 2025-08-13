package classesandobjects;

public class Student {

    public int id;
    public String name;
    public String email;
    public String gender;
    public String address;
    public String grade;

    // constructor - is used to initialize the objects

    public Student() { // default constructor
    }

    public Student(int id, String name, String email, String gender, String address, String grade) { // parameterized constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
    }

    // this will convert the object into string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
