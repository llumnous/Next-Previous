package com.bassania;
import java.io.*; 
       
public class Solution {

   public static void main(String[] args) throws Exception { 
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	        System.out.print("Input number: "); 
	        String a = reader.readLine(); 
	        int x = Integer.parseInt(a); 
	        System.out.print("The next number for the number " + x + " is " ); 
	         
	       int  y; 
	            y = x+1; 
	            
	            System.out.println(y); 
	         
	        System.out.print("The previous number for the number " + x + " is "  ); 
	        x = x-1; 
	         
	        System.out.println(x); 
	           
	    } 
	 
	}