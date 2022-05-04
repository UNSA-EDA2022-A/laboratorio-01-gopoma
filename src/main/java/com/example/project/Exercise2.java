package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a[]) {
		final int MAXIMA_LONGITUD_SALTO = 50;
        	final int POSICION_INICIAL = 0;
        
        	if(a[0] - POSICION_INICIAL > MAXIMA_LONGITUD_SALTO) {
            		return -1;
        	}
        	for(int i = 0; i < a.length - 1; i++) {
            		if(a[i + 1] - a[i] > MAXIMA_LONGITUD_SALTO) {
                		return -1;
            		}
        	}
        
        	int actual = POSICION_INICIAL;
        	int saltos = 0;
        	for(int i = 0; i < a.length; i++) {
            		if(!(a[i] - actual <= MAXIMA_LONGITUD_SALTO)) {
                		actual = a[i - 1];
                		saltos++;
            		}
        	}
        	return ++saltos;
    	}
}
