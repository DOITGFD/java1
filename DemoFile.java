import java.io.File;

public class DemoFile {
    public static void main(String[] args) throws Exception  {
        File obj=new File("demo.txt");
        try {
        if(obj.createNewFile()){
            System.out.println("File created");
        }
        //else if(obj.exists()){
            //Fileoutputstrem output=new FileOutputStream(obj);
            //String content="Hello World";
            //output.write(content.getBytes());

        //}
        else if(obj.exists()){
            System.out.println(obj.getName());
            System.out.println(obj.getAbsoluteFile());
            System.out.println(obj.canRead());
            System.out.println(obj.canWrite());
            
        }
        else{
            System.out.println("Already exists");
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}