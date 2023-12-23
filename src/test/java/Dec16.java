public class Dec16 {

    public static void main(String[] args) {
        String s = "abbaq";
        String final1 = s;


        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev+s.charAt(i);

        } System.out.println(rev);
        if(final1.equals(rev)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
        }
    }
