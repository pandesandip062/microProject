package synchLock;

 class Account {

    private int balence = 50000;

    public int getBalence(){
        return balence;
    }
   public int withdrawal(int amount){
        balence= balence-amount;
        return balence;
   }
}
