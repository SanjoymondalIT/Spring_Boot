package com.soa.SpringAOP;

public class FactoryBean {
	
	public Object  getObject(String objName)
	{
		if(objName.equals("BankSbi"))
			return new ProxyBankSbi();
		return new BankAxis;
		return null;
		
	}

}
