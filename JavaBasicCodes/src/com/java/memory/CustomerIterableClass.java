package com.java.memory;

public class CustomerIterableClass implements CustomerIterableClassReadOnly {
	private String name;
	
	public CustomerIterableClass(String name){
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see com.java.memory.CustomerIterableClassReadOnly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.java.memory.CustomerIterableClassReadOnly#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
