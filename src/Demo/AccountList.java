package Demo;

import java.util.ArrayList;

public class AccountList {
	private ArrayList<Account> accList;
	public AccountList() {
		accList = new ArrayList<Account>();
		accList.add(new Account("admin", "123"));
	}
	public void addAcc(Account acc) {
		accList.add(acc);
	}
	public Account searchAcc(String name) {
		for (Account acc:accList) {
			if (acc.getUserName().equals(name)){
				return acc;
			}
		}
		return null;
	}
	public boolean isVerify(String name, String password) {
		for (Account acc:accList) {
			if (acc.verify(name, password)){
				return true;
			}
		}
		return false;
	}
	public boolean isExist(String name) {
		for (Account acc:accList) {
			if (acc.getUserName().equals(name)){
				return true;
			}
		}
		return false;
	}
}
