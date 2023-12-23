package project30sep2;

public class arrayDescOrder {
    public static void main(String[] args) {
        int a[]={4,6,1,3,9,12};
        int temp=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
