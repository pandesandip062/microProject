package String;

public class OvalString {

    public static void main(String[] args) {
        String str = "My name is Sandip Pande";
        int count=0;

        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a=='a'|| a=='e' || a=='i' ||a=='o' || a=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
