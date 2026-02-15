package Exception_Handling;

public class ArrayINdexOUtofBound {
    public static void main(String[] args) {
        char[] ch = new char[2];
        ch[0] = 'A';
        ch[1]= '*';
        try{
            ch[2] ='0';
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("the above is exception");
    }
}

//output:
//java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//the above is exception
