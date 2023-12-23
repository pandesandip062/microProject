package project30sep2;

public class maximumNumber {

    public static void main(String[] args) {
        int a []={9, 94, 3, 55, 18};
        int temp=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<i;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }

            System.out.println("maximum number is --> "+a[0]);

    }
}
