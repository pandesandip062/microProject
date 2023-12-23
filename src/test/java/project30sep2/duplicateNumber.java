package project30sep2;

public class duplicateNumber
{
    public static void main(String[] args) {
        int a[]={2, 3, 2, 10, 10};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    System.out.println("duplicate number is --> "+a[i]);                }
            }
        }
    }
}
