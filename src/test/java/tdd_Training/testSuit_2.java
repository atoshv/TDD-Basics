package tdd_Training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testSuit_2 {
	private BankAccount bAccount;
	private String accountId = "1234567890";
	
	public testSuit_2() {
	}
	
	
	@Before
	public void init() {
		bAccount = new BankAccount(accountId, 100);
		//Repo initialise
	}
	
	@Test
	public void testCase_01_Deposit_Negative_Number() {
		Exception ex = Assert.assertThrows(Exception.class, () -> bAccount.deposit(-1));
	}
	
	@Test
	public void testCase_02_Withdraw_Negative_Number() {
		Exception ex = Assert.assertThrows(Exception.class, () -> bAccount.withDraw(-1));
	}
	
	@Test
	public void testCase_02_Withdraw_When_Balance_Is_Low() {
		Exception ex = Assert.assertThrows(Exception.class, () -> bAccount.withDraw(101));
	}
	
	@Test
	public void testCase_02_Withdraw_Balance() throws Exception {
		
		bAccount.withDraw(50);
		Assert.assertEquals(50, (int) bAccount.getBalance());
	}
	
	@Test
	public void testCase_09_CheckBalance() {
		double response = bAccount.getBalance();
		Assert.assertEquals(100, (int) response);
	}
	
// 10 -> 09
}
