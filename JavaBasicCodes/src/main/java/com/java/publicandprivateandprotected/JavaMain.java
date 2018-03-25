package com.java.publicandprivateandprotected;

public class JavaMain {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		System.out.println(publicClass.a);
		
		PrivateClass privateClass = new PrivateClass();
		System.out.println(privateClass.getString());
		
		ProtectedClass protectedClass = new ProtectedClass();
		System.out.println(protectedClass.a);
		
		DefaultClass defaultClass = new DefaultClass();
		System.out.println(defaultClass.a);

	}

}
