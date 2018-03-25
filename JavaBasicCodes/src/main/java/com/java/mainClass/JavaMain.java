package com.java.mainClass;

import com.java.publicandprivateandprotected.DefaultClass;
import com.java.publicandprivateandprotected.PrivateClass;
import com.java.publicandprivateandprotected.ProtectedClass;
import com.java.publicandprivateandprotected.PublicClass;

public class JavaMain extends ProtectedClass{

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		System.out.println(publicClass.a);
		
		PrivateClass privateClass = new PrivateClass();
		System.out.println(privateClass.getString());
		
		ProtectedClass protectedClass = new ProtectedClass();
		System.out.println(protectedClass);
		
		DefaultClass defaultClass = new DefaultClass();
		System.out.println(defaultClass.getString());
	}

}
