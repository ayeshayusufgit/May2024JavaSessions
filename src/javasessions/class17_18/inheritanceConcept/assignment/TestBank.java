package javasessions.class17_18.inheritanceConcept.assignment;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bObj=new BankAccount();
		bObj.setAccountNumber("1234567890");
		bObj.setOwner("Ayesha");
		bObj.setBalance(5000);
		bObj.printStatement();
		bObj.deposit(100);
		bObj.printStatement();
		bObj.withdraw(100);
		bObj.printStatement();
		bObj.withdraw(-100);
		bObj.printStatement();
		bObj.withdraw(5001);
		bObj.printStatement();
		bObj.withdraw(5000);
		bObj.printStatement();
		bObj.withdraw(10);
		
	}

}
