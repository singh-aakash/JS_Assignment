package companyProject;

public class Payment
{
	public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount)
	{
		if(sender.getAccountBalance()>= amount)
		{
			sender.withDraw(amount);
			reciever.deposit(amount); 
			return true;
		}
		else
			return false;
	}
}