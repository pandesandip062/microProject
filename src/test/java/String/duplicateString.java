package String;

public class duplicateString {

    public static void main(String[] args) {
        String a = "my name is sandeep pande";
        for(int i=0;i<a.length();i++){
            for(int j=1;j<=i;j++){
                if(a.charAt(i)==a.charAt(j)){
                    System.out.println("duplicate char are "+a.charAt(i));
                }
            }
        }
    }
}
