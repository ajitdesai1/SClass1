package InterfaceBank;

public class HSBCBank implements USBank, BrazilBank{

	public void credit() {
		System.out.println("HSBC Credit");
	}
	public void debit() {
		System.out.println("HSBC Debit");
	}
	public void moneyTransfer() {
		System.out.println("HSBC transferMoney");
	}
	public void mutualFund() {
		System.out.println("HSBC mutaul Fund");
	}
	public void educationLoan() {
		System.out.println("HSBC education loan");
	}
	public void agriLoan() {
		System.out.println("HSBC agri Loan");
	}
	
}
