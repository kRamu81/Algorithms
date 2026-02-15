package Exception_Handling;

public class Arthimetic_exception {
    public static void main(String[] args) {
        try{
            int num = 9/0;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Sunday");
    }
}

//output:
//java.lang.ArithmeticException: / by zero
//Sunday
