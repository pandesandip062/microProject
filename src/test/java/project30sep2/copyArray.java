package project30sep2;

public class copyArray {

    public static void main(String[] args) {
        int a[]={1,4,5,7,4,7,8};
        int b[]= new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i:b){
            System.out.println(i);
        }
    }

}
