package privateKeyword;

import javax.crypto.spec.PSource;
import java.util.Scanner;

class class1 {

  public static void main(String[] args) {

   int a[]={3,12,5,8};
   int temp;
   for(int i=0;i<a.length;i++){
    for(int j=0;j<i;j++){
     if(a[i]>a[j]){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
     }

    }
   }
   for (int i:a){
    System.out.println(i);
   }

  }

}
