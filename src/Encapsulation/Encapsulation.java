package Encapsulation;


public class Encapsulation {
    //instance or global variable
    private long aadharno;
    private String AccountNumber;

    void set_Aadharno(){
        this.aadharno = 1234567890;
    }
    void set_accountNumber(){
        this.AccountNumber = "ISO12345678";
    }

    //getter method;
    long get_Aadharno(){
        return aadharno;
    }

    String get_accountNumber(){
        return AccountNumber;
    }
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.set_Aadharno();
        System.out.println("Student Aadhar no: "+en.get_Aadharno());

        en.set_accountNumber();
        System.out.println("Student Account number: "+en.get_accountNumber());
    }
}
