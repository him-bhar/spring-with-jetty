package com.himanshu.spring.rmi.test;

import com.himanshu.spring.ws.AccountService;

public class RMIAccountServiceClient {
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public void pleasePrint() {
		getAccountService().printMe();
	}
	
}
