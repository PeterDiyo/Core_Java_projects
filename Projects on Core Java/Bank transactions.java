class BankAcc{
    private double balance;
        public BankAcc(double opBalance){
    balance = opBalance;
    }
    
    public void deposit(double customer){
        balance = balance + customer;
    }
    public void withdraw(double customer){
        balance = balance - customer;
    }
    public void display(){
        System.out.println("Balance: " + balance);
    }
}
public class Main
{
	public static void main(String[] args) {
	    BankAcc ba1 = new BankAcc(100.00);
		System.out.println("before transactions,");
		 ba1.display();
		 ba1.deposit(74.35);
		 ba1.withdraw(20.00);
		 System.out.println("After transaction,");
		 ba1.display();
	}
}