package has_a_relationship;

public class test1 {

    public static void main(String[] args) {
       int a=0;
       int b=1;
        System.out.println(a+" "+b);
        for(int i=1;i<10;i++){
            int c= a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
