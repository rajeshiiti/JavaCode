package com.code.lru.cache;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ILRUCache lruCache = new LRUCache();
		Scanner inp = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			String url = inp.nextLine();
			lruCache.accessPage(url);
			lruCache.printAllPage();
		}
		System.out.println();
		inp.close();
	}
	
}