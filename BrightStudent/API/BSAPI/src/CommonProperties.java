public class CommonProperties {
    String fName;
    String lName;
    String email;

    String getFullName(){
        return this.fName + " " + this.lName;
    }

    CommonProperties(String fName,String lName){
        this.fName = fName;
        this.lName = lName;
    }
    CommonProperties(String email){
        this.email = email;
    }
    CommonProperties(String fName,String lName,String email){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    int addNumbers(int a, int b){
        return  a + b;
    }
    int addNumbers(int a, int b,int c){
        return  a + b + c;
    }
    int addNumbers(int a, int b,int c,int d){
        return  a + b + c + d;
    }
    int addNumbers(int a, int b,int c,int d,int e){
        return  a + b + c + d + e;
    }

}
