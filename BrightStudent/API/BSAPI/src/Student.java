public class Student extends CommonProperties{

    @Override
    String getFullName() {
        return this.lName + " " + this.fName;
    }

    Student(String fName, String lName) {
        super(fName, lName);
    }
    Student(String email) {
        super(email);
    }
    Student(String fName,String lName,String email) {
        super(fName,lName,email);
    }
}
