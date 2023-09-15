public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    
    // Constructor
    public Student(int studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
    
    public static void main(String[] args) {
        // Creating instances of the Student class with sample data
        Student student1 = new Student(1, "John", "Doe", 20);
        Student student2 = new Student(2, "Jane", "Smith", 22);
        
        // Displaying the student information
        System.out.println(student1);
        System.out.println(student2);
    }
}
