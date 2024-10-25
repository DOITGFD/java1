class Demo <T>{
    A a,b;
    public Demo(T a,T b){
        this.a=a;
        this.b=b;
    }
    public <T> void display(){
        System.out.println(a+" "+b);
    }
    public <T,U> void calculate(T a,U b){
        System.out.println(a+" "+b);
    }
}
public class GenericsDemo1 {
   public static void main(String[] args) {
       Demo<Integer> obj = new Demo < > (5, 10);
       Demo<Integer> obj1 = new Demo < > ("hai","hello");
       obj.display();
       obj1.display();
       obj.calculate(16, 15.2);
       obj1.calculate("java", 'B');
   }
}
