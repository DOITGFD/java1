class outer {
    String name=" Dhanush";
    class inner {
        int age=18;
    public void display(){
        System.out.println("name:"+name);
    }
}
     inner in=new inner();
     public void Show(){
        System.out.println("age:"+in.age);
    }
}
public class main{
    public static void main(String[] args) {
        outer o =new outer();
        outer.inner i=o.new inner();
        i.display();
        o.Show();
    }
}
    
