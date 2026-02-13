package Training.Day4;

public class Practice1 {
    String brand;
    String model;
    int year;

    public static void main(String[] args) {
        Practice1 a = new Practice1();
        a.brand ="Mahindra";
        a.model ="XUV";
        a.year = 2021;
        System.out.println("Car brand is:" + a.brand);
        System.out.println("Car model is: "+ a.model);
        System.out.println("car Manufactured year: "+a.year);
    }
}
