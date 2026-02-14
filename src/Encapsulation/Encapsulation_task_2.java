package Encapsulation;
import java.util.*;
public class Encapsulation_task_2 {
    private float salary;
    private long employee_id;

    void set_empid(long employee_id){
        this.employee_id = employee_id;
    }
    long get_empid(){
        return employee_id;
    }

    void set_empsalary(float salary){
        this.salary = salary;
    }
    float get_empsalary(){
        return salary;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long id;
        float sal;

        System.out.println("Enter the employee_id:");
        id = s.nextLong();

        System.out.println("Enter the employee salary: ");
        sal = s.nextFloat();

        Encapsulation_task_2 obj = new Encapsulation_task_2();
        obj.set_empid(id);
        System.out.println("Employee id:"+obj.get_empid());

        obj.set_empsalary(sal);
        System.out.println("Employee salary: "+obj.get_empsalary());

    }
}
