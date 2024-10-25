class Test implements Rundemo{
    public void run(){

    }
}
public class Rundemo {
    public static void main(String[] args) {
        int n=10;
        Thread obj=new Thread(new Test(n));
        obj.start();
    }
}
