package Kalkulator;


import Kalkulator.Implementer;

public class Running {
	public static void main(String[] args)  throws Exception   {

	Implementer implementer = new Implementer(); 
	//interface tidak punya data sendiri
	 //implementer.test1(); //interface1 class
	 //implementer.test2(); //interface2 class

	 int a = Implementer.BaseUrl;
	 int b = Implementer.BaseUrl2;
	 int tambah = a+b;
	 int kurang = a-b;
	 int kali = a*b;
	 
	 System.out.println(kurang);	
	 System.out.println(kali);
	 
	 int e = a + b;
		try { 
			int choice =  e;
            
			while (choice ==  14 ) {
			    System.out.println(" Jawaban benar");	
			
			}}catch (NumberFormatException ex) // If exception, try again.
	    {
				ex.printStackTrace();
				throw new Exception("Ini Errror Woy"); // tambah exception
	    }
	}
}
