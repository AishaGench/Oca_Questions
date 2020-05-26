package Q_10;

public class CheckingAccount {
    public int amount;
    public CheckingAccount (int amount){
        this.amount = amount;
    }
    public int getAmount () {
        return amount ;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void changeAmount(int x){
        amount += x;
    }
    //And given this main method, located in another class:
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));//Math.random() it will be random number .
        // line n1
       // acct.amount = 0;
        //acct.setAmount(0);
        //acct.changeAmount(-acct.amount);

        System.out.println(acct.getAmount());
    }

}
    /*
    Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
    A. acct.setAmount(-acct.getAmount());
    B. acct.amount = 0; <option D earlier>
    C. acct.setAmount(0);           // we can call instance variable
    D. acct.getAmount() = 0; <option E earlier>
    E. this.amount = 0; <option A earlier>
    F. acct.changeAmount(0); <option F earlier>
    G. acct.changeAmount(-acct.amount); <option G earlier>


    Answer is: B. acct.amount = 0; <option D earlier>
               C. acct.setAmount(0);
               G. acct.changeAmount(-acct.amount); <option G earlier>
     */
