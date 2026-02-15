package Exception_Handling;

public class NullPointException {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("NUll point Exception");
    }
}
//output:
//java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
//NUll point Exception