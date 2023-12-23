package practisePackage;

public class primenumber {
    public static void main(String[] args) {
        int num =100;
        int count =0;
        for(int i=1;i<num;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==0){
                System.out.println(i+ " is prime num");
            }else {
                count=0;
            }
        }
    }
}
