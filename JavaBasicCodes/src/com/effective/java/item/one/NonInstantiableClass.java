package com.effective.java.item.one;

/*
 * Make the constructor private: to make class nonInstantiable class
 * A private constructor is the normal object-oriented solution. However, 
 * it would still be possible to instantiate such a class using reflection, 
 * like this:
 * Constructor<Useless> con = Useless.class.getDeclaredConstructor();
 * con.setAccessible(true); // bypass "private"
 * Useless object = con.newInstance();
 */
public class NonInstantiableClass {
	private int temp;
	private NonInstantiableClass()
	{
		throw new RuntimeException();
	}
	
	public void setTemp(int temp) {
		this.temp=temp;
	}
	
	public int getTemp() {
		return this.temp;
	}

}
