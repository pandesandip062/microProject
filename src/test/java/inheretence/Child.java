package inheretence;


import javafx.scene.Parent;

public class Child extends Paraent {
    int a= 45;
    int b= 46;
    void sun(){
        System.out.println("Hot sun is shining");
    }
    public int show1(int a){
        int p=10;
        return a;
    }
  /* public static void  show(){
        System.out.println("Child class method");
    }
*/
    public static void main(String[] args) {
        Child p1= new Child();
        p1.run();
        p1.show1(7);




        //System.out.println(p.a);
      //p.show();

    }
}
