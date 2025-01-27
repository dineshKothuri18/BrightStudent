public class Staff extends CommonProperties {

    @Override
    String getFullName() {
        return "Mr." + this.fName + " " + this.lName;
    }

    Staff(String fName, String lName) {
        super(fName, lName);
    }
    Staff(String email) {
        super(email);
    }
    Staff(String fName,String lName,String email) {
        super(fName,lName,email);
    }
}
