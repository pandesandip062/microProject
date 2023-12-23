package Exception;

import insufficentBalenceExceptionj.insufficentBalenceException;

public class SBI {

    private int balence=3000;
    public int getBalence(){
        return balence;
    }
    public void makeWithdrawal(int amount){
        if(amount>balence){
            throw new insufficentBalenceException("insufficent fund in your account, please check once");

        }else {
            int newBalence = balence-amount;
            System.out.println(" New balence "+ newBalence);
        }

    }

    public static void main(String[] args) {
        SBI s = new SBI();
        s.makeWithdrawal(30000);
    }
}
