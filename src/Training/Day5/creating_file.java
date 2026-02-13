package Training.Day5;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class creating_file {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\hp\\Desktop\\hello.txt");
        if(f.createNewFile()){
            System.out.println("new File created");
        }else{
            System.out.println("File not created");
        }

        // check file is present
        if(f.exists()){
            System.out.print("File is present");
        }else{
            System.out.println("file not present");
        }

        // deleting file is the function f.delete()

        //write data in file
        FileWriter fw = new FileWriter(f);
        fw.write("Welcome to Hello");
        fw.close();
        System.out.println("File is created sucessfully");

//        FileReader fr = new FileReader(f);
//        int i;
//        while((i= fr.read()) != -1 ){
//            System.out.println((char)i);
//        }
//        fr.close();

          if(f.canRead()){
              System.out.println("yES");
          }else{
              System.out.println("NO");
          }

        System.out.println(f.canWrite()?"wriatable":"not writeable");
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.length());
        System.out.println(f.isFile());

    }
}
