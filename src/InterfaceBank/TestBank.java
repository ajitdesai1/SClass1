package InterfaceBank;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
		HSBCBank hb = new HSBCBank();
		hb.credit();
		hb.debit();
		hb.moneyTransfer();
		hb.educationLoan();
		hb.agriLoan();
		hb.mutualFund();
		System.out.println("************");
		
		//dynamic polymorphism
		 //child class object can be referred by parent Interface reference variable 
		 USBank u = new HSBCBank();
		 u.credit();
		 u.debit();
		 u.moneyTransfer();
		 //cannot access other methods 
			System.out.println("************");
	
		 BrazilBank b = new HSBCBank();
		 b.mutualFund();
		 //cannot access other methods 
	}

}
