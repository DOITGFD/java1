package bank;
class Ab{
    private String name;
    private int age;

    public void setDetatils(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    private void myMethod(){
        System.out.println("This is private method");
    }

    public void resultMethod(){
        myMethod();
    }
}
public class firstCL{
    public static void main(String[] args) {
        Ab obj = new Ab();
        obj.setDetatils("bank", 18);
        System.out.println("Age:"+obj.getAge());
        System.out.println("Name:"+obj.getName());
        obj.resultMethod();
    }
}