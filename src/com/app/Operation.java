package com.app;

public class Operation {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
		System.out.println(i+" is prime "+isPrime(i));
		}
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}