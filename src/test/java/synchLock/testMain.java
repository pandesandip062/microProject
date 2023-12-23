package synchLock;

public class testMain {

    public static void main(String[] args) {
        AccountDetails a = new AccountDetails();
        Thread a1 = new Thread(a);
        a1.setName("sandeep");
        a1.start();
        Thread a2 = new Thread(a);
        a2.setName("Padam");
        a2.start();

    }
}
