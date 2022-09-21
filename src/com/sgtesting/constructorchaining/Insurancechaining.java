package com.sgtesting.constructorchaining;

class Insurance1
{
	Insurance1 (String insuranceprovider)
	{
		System.out.println("insurance provider:"+insuranceprovider);
	}
	Insurance1(int insuranceid)
	{
		this("health");
		System.out.println("insurance id:"+insuranceid);
	}
}

public class Insurancechaining {

	public static void main(String[] args) {
		Insurance1 o1=new Insurance1(22);

	}

}




