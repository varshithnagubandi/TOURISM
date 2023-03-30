package projectca;

import java.util.Scanner;

class tourcap
{
	public void menu()
	{
		System.out.println ("---------  CVS TRAVEL AND TOURISM YOU CAN VISIT ALL BELOW MENTION PLACES-----------" );
		System.out.println("1.HYDERABAD");
		System.out.println("2.VIJAYAWADA");
		System.out.println("3.CHENNAI");
		System.out.println("4.BANGALORE");
		System.out.println("5.KERALA");
		System.out.println("6.AMRITSAR");
		System.out.println("7.MUMBAI");
		System.out.println("8.DELHI");
		System.out.println("9.VISAKHAPATNAM");
		System.out.println("10.QUIT");
		
		
		System.out.println("------ENTER THE OPTIONS FROM 1 TO 10 TO ENJOY YOUR HOLIDAYS--------");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			HYDERABAD();
			break;
			
		}
		case 2:
		{
			VIJAYAWADA();
			break;
			
		}
		case 3:
		{
			CHENNAI();
			break;
			
		}
		case 4:
		{
			BANGALORE();
			break;
			
		}
		case 5:
		{
			KERALA();
			break;
			
		}
		case 6:
		{
			AMRITSAR();
			break;
			
		}
		case 7:
		{
			MUMBAI();
			break;
			
		}
		case 8:
		{
			DELHI();
			break;
			
		}
		case 9:
		{
			VISAKHAPATNAM();
			break;
			
		}
		case 10:
		{
			QUIT();
			break;
		}
		default:
			System.out.println("PLEASE ENTER THE VALID NUMBER");
			menu();
			break;
		}
		
		sc.close();
			
			
		
		
		
		}
		
		public void HYDERABAD()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN HYDERABAD----");
			System.out.println("---WE WILL SPEND 3 DAYS IN HYDERABAD---");
			System.out.println("1.RAMOJI FILM CITY");
			System.out.println("2.GOLCONDA FORT");
			System.out.println("3.SALAR JUNG MUSEUM");
			System.out.println("4.BIRLA MANDIR");
			System.out.println("5.TAJ FALAKNUMA PALACE");
			System.out.println("6.CHARMINAR");
			System.out.println("7.CHILKUR BALAJI TEMPLE");
			System.out.println("8.CHOWMAHALLA PALACE");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void VIJAYAWADA()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN VIJAYAWADA----");
			System.out.println("---WE WILL SPEND 2 DAYS IN VIJAYAWADA---");
			System.out.println("1.KANAKA DURGA TEMPLE");
			System.out.println("2.UNDAVALLI CAVES");
			System.out.println("3.PRAKASAM BARRAGE");
			System.out.println("4.BHAVANI ISLAND");
			System.out.println("5.VICTORIA JUBILEE MUSEUM");
			System.out.println("6.KONDAPALLI FORT");
			System.out.println("7.GANDHI HILL");
			System.out.println("8.VMC DISNEY LAND");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void CHENNAI()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN CHENNAI----");
			System.out.println("---WE WILL SPEND 4 DAYS IN CHENNAI---");
			System.out.println("1.MARINA BEACH");
			System.out.println("2.THOUSAND LIGHTS MOSQUE");
			System.out.println("3.DAKHINACHITRA");
			System.out.println("4.KAPALEESWARAR TEMPLE");
			System.out.println("5.ROYAPURAM FISHING HARBOUR");
			System.out.println("6.VALLUVAR KOTTAM");
			System.out.println("7.MYLAPORE");
			System.out.println("8.CONNEMARA PUBLIC LIBRARY");
			System.out.println("9.SEMMOZHI POONGA");
			System.out.println("10.CONNEMARA PUBLIC LIBRARY");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		public void BANGALORE()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN BANGALORE----");
			System.out.println("---WE WILL SPEND 4 DAYS IN BANGALORE---");
			System.out.println("1.BANGALORE PALACE");
			System.out.println("2.ISKON TEMPLE BANGALORE");
			System.out.println("3.LALBAGH");
			System.out.println("4.BANNERGHATTA NATIONAL PARK");
			System.out.println("5.CUBBON PARK");
			System.out.println("6.WONDERLA AMUSEMENT PARK");
			System.out.println("7.INNOVATIVE FILM CITY");
			System.out.println("8.NANDI HILLS");
			System.out.println("9.HAL AEROSPACE MUSEUM");
			System.out.println("10.FREEDOM PARK");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void KERALA()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN KERALA----");
			System.out.println("---WE WILL SPEND 3 DAYS IN CHENNAI---");
			System.out.println("1.ALLEPPPEY");
			System.out.println("2.WAYANAD");
			System.out.println("3.COCHIN");
			System.out.println("4.MUNNAR");
			System.out.println("5.KUMARAKOM");
			System.out.println("6.KOLLAM");
			System.out.println("7.POOVAR");
			System.out.println("8.IDUKKI");
			System.out.println("9.BEKAL");
			System.out.println("10.KASARGOD BACKWATERS");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void AMRITSAR()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN AMRITSAR----");
			System.out.println("---WE WILL SPEND 3 DAYS IN AMRITSAR---");
			System.out.println("1.GOLDEN TEMPLE");
			System.out.println("2.JALLIANWALA BAGH");
			System.out.println("3.THE PARTITION MUSEUM");
			System.out.println("4.AKAL TAKHT");
			System.out.println("5.DURGIANA TEMPLE");
			System.out.println("6.MAHARAJA RANJIT  SINGH STATUE");
			System.out.println("7.GOBINDGARH FORT");
			System.out.println("8.MANDIR MATA LAL DEVI");
			System.out.println("9.TARN TARAN SAAHIB");
			System.out.println("10.SADDA PIND");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		public void MUMBAI()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN MUMBAI----");
			System.out.println("---WE WILL SPEND 4 DAYS IN MUMBAI---");
			System.out.println("1.GATEWAY OF INDIA");
			System.out.println("2.MARINE DRIVE");
			System.out.println("3.SHREE SIDDHIVINAYAK");
			System.out.println("4.BANDRA-WORLI SEA LINK");
			System.out.println("5.CHH");
			System.out.println("6.KOLLAM");
			System.out.println("7.POOVAR");
			System.out.println("8.IDUKKI");
			System.out.println("9.BEKAL");
			System.out.println("10.KASARGOD BACKWATERS");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void DELHI()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN DELHI----");
			System.out.println("---WE WILL SPEND 3 DAYS IN DELHI---");
			System.out.println("1.INDIA GATE");
			System.out.println("2.QUTUB MINAR");
			System.out.println("3.AKSHARDHAM TEMPLE");
			System.out.println("4.HUMAYUN'S TOMB");
			System.out.println("5.NATIONAL GALLERY OF MODERN ART");
			System.out.println("6.LOTUS TEMPLE");
			System.out.println("7.RED FORT");
			System.out.println("8.AGRASEN KI BAOLI");
			System.out.println("9.SUNDER NURSERY");
			System.out.println("10.GARDEN OF FIVE SENSES");
			System.out.println("11.CHANDNI CHOWK");
			System.out.println("12.JANTAR MANTAR");
			System.out.println("13.MEHRAULI ARCHAEOLOGICAL PARK");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void VISAKHAPATNAM()
		{
			System.out.println("ENTER THE NUMBER OF PERSONS TO TRAVEL");
			Scanner sc=new Scanner(System.in);
			int persons=sc.nextInt();
			System.out.println("----WE WILL COVER FOLLOWING PLACES IN VISAKHAPATNAM----");
			System.out.println("---WE WILL SPEND 3 DAYS IN VISAKHAPATNAM---");
			System.out.println("1.INS KURUSURA SUBMARINE MUSEUM");
			System.out.println("2.BORRA CAVES");
			System.out.println("3.KAILASAGIRI");
			System.out.println("4.VARAHA LAKSHMI NARASIMHA TEMPLE");
			System.out.println("5.RISHIKONDA BEACH");
			System.out.println("6.YARADA BEACH");
			System.out.println("7.TU 142 AIR CRAFT MUSEUM");
			System.out.println("8.ARAKU VALLEY");
			System.out.println("9.INDIRA GANDHI ZOOLOGICAL PARK");
			System.out.println("---THANK YOU FOR TAKING PART IN CVS TOURISM---");
			
			sc.close();
			
			
			
		}
		
		public void QUIT()
		{
			System.out.println("-----YOU ARE WELCOME VISIT AGAIN CVS TOURISM-----");
			
		}
}


public class Tour {
	public static void main(String arg[])
	{
		
		tourcap t=new tourcap();
		t.menu();
		
		
	}

}
