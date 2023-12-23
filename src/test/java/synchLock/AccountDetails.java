package synchLock;

public class AccountDetails implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            makeWithdrawal(1000);
            if(a.getBalence()<0){

            }
        }
    }

    Account a =new Account();

    public void makeWithdrawal(int withdrawalAmount){
        if(a.withdrawal(withdrawalAmount)>=withdrawalAmount){
            System.out.println(Thread.currentThread().getName()+" is withdrwaing amount");
            int b = a.withdrawal(withdrawalAmount);
            System.out.println(Thread.currentThread().getName()+" is withdrwaing compeletd-->"+b);
        }
    }
}