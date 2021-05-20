package com.samaspace.service;

import java.util.ArrayList;
import java.util.List;

public class ClientJavaWS {

	public static void main(String[] args) {
		
		ServiceBank STUB = new ServiceBankService().getServiceBankPort();
		double resultat = STUB.conversionDollarToDHS(67.09);
		System.out.println("convert from DHS to Dollars"+" "+resultat);
		System.out.println("###################");
		
		Compte cpt = STUB.takeOneAccount(2L);
		System.out.println("Code "+" "+cpt.getCodeAcount()+" "+"Amount"+" "+cpt.getAmountAcount()+" Date: "+cpt.getDateCreationOfAccount());
		System.out.println("###################");
		
		List<Compte> listOfAccounts = STUB.getAllAccounts();
		for(int i=1;i<listOfAccounts.size();i++) {
			System.out.println("##########################");
			
			System.out.println("----------"+" "+i+" "+"----------");
			System.out.println("Code: "+listOfAccounts.get(i-1).getCodeAcount());
			System.out.println("Amount: "+listOfAccounts.get(i-1).getAmountAcount());
			System.out.println("Date: "+listOfAccounts.get(i-1).getDateCreationOfAccount());
			
		}

	}

}
