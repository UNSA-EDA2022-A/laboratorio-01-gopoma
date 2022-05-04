package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}
	
	public boolean esUnNumeroEnBaseGabriel(int a) {
        	String aS = String.valueOf(a);
        	boolean hayUnDigitoDos = false;
        	int digitoDosPos = -1;
        	for(int i = 0; i < aS.length(); i++) {
            		if(!(aS.substring(i, i + 1).equals("0") || aS.substring(i, i + 1).equals("1") || aS.substring(i, i + 1).equals("2"))) {
                		return false;
            		} else if(aS.substring(i, i + 1).equals("2") && !hayUnDigitoDos) {
                		digitoDosPos = i;
                		hayUnDigitoDos = true;
            		}
        	}
        	if(!hayUnDigitoDos) {
            		return true;
        	}
        	for(int i = digitoDosPos + 1; i < aS.length(); i++) {
            		if(!aS.substring(i, i + 1).equals("0")) {
                		return false;
            		}
        	}
        	return true;
    	}
	
    	public String convertirBaseGabriel(int a) {
		if(esUnNumeroEnBaseGabriel(a)) {
            		String aS = String.valueOf(a);
            		int conversion = 0;
            		for(int i = 0; i < aS.length(); i++) {
                		conversion += Integer.parseInt(aS.substring(i, i + 1)) * (Math.pow(2, aS.length() - i) - 1);
            		}
            		return String.valueOf(conversion);
       		} else {
            		return "El numero proporcionado no esta en base Gabriel.";
        	}
    	}
}
