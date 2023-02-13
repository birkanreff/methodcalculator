package metotHesapMakinesi;

import java.util.Scanner;

public class metotlarlaHesapMakinesi {

	static int sum(int a, int b) {
		int result = a+b;
		System.out.println("Sayıların toplamı = " + result);
		return result;
		}
	
	static int minus(int a, int b) {
		int result = a-b ;
		System.out.println("Sayıların farkı = " + result);
		return result;
		}
	
	static int times(int a, int b) {
		int result = a*b;
		System.out.println("Sayıların çarpımı = " + result);
		return result;
		}
	
	static double divided(int a, int b) {
		int result = a / b;
		System.out.println("Bölümün sonucu = " + result);
		return result;
		}
	
	static int power(int a, int b) {
		int result = 1 ;
		  for(int i=1; i<=b; i++) {
			  result *= a ;
			 }
		  System.out.println(result);
		return result;
		  }

	static int mod(int a, int b) {
		int result = a%b ;
		System.out.println("Mod : " + result);
		return result;
		}
	
	static int geometry(int a, int b) {
		
		int alan = a*b;
		System.out.println("Dikdörtgenin alanı: " + alan);
		return alan;
		
		}
	
	public static void main(String args []) {
		
		Scanner input = new Scanner(System.in);
		int secim;
		String menu = "1 - Toplama işlemi \n"
				+ "2 - Çıkarma işlemi \n"
				+ "3- Çarpma işlemi \n"
		        + "4 - Bölme işlemi \n"
				+ "5 - Üs alma işlemi \n"
		        + "6 - Mod alma işlemi \n"
				+ "7 - Dikdörtgende alan hesabı" ;
		
		
		do {
			System.out.println(menu);
			System.out.println("Lütfen yapmak istediğiniz işlem tercihinizi giriniz: ");
			secim = input.nextInt();
			 if (secim==0) {
				 break;
			 }
				
			 System.out.print("Birinci sayıyı giriniz: ");
			 int a = input.nextInt();
			 System.out.print("İkinci sayıyı giriniz: ");
			 int b = input.nextInt();
			 
			 switch(secim) {
			 
			 case 1:
				 sum(a,b);
				 break;
			 case 2:
			 minus(a,b);
			 break;
			 case 3:
				 times(a,b);
				 break;
			 case 4:
				 divided(a,b);
				 break;
			 case 5:
				 power(a,b);
				 break;
			 case 6:
				 mod(a,b);
				 break;
			 case 7:
				 geometry(a,b);
				 break;
				 default:
				 System.out.println("Yanlış bir değer girdiniz tekrar deneyiniz!");
				  }
			
		} while (secim != 0);
		
		        
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
