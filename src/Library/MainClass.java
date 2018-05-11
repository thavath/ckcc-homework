package Library;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library[] librarys = new Library[4];
		librarys[0] = new Library("Hun Sen Library", 900, 1700);
		librarys[1] = new Library("CKCC Library", 900, 1700);
		librarys[2] = new Library("CJCC Library", 900, 1700);
		librarys[3] = new Library("IFL Library", 900, 1700);
		Library.Address[] address = new Library.Address[4];
		address[0] = librarys[0].new Address(153, "Russian Blv", "1200", "hsl@gmail.com", "beng kok", "phnom penh"); 
		address[1] = librarys[1].new Address(153, "Russian Blv", "1200", "ckcc@gmail.com", "beng kok", "phnom penh"); 
		address[2] = librarys[2].new Address(153, "Russian Blv", "1200", "cjcc@gmail.com", "beng kok", "phnom penh"); 
		address[3] = librarys[3].new Address(153, "Russian Blv", "1200", "ifl@gmail.com", "beng kok", "phnom penh"); 
		int selects;
		do {		
			System.out.println("=============================================");
			System.out.println("=====      Welcome to My Books		=====");
			System.out.println("=====	1/.Add books to Libraries.	=====");
			System.out.println("=====	2/.Borrow our books.		=====");
			System.out.println("=====	3/.Show books had borrowed.	=====");
			System.out.println("=====	4/.Return the book.		=====");
			System.out.println("=====	5/.Close the Program.		=====");
			System.out.println("\n=====   Please select choice :");
			Scanner input = new Scanner(System.in);
			selects = input.nextInt();
			switch(selects) {
			case 1:
				int select;
				System.out.println("========================================================");
				System.out.println("========	1/. Add book to Hen Sen Library		========");
				System.out.println("========	2/. Add book to CKCC Library		========");
				System.out.println("\n=====   Please select choice :");
				do {
				select = input.nextInt();
				switch(select) {
				case 1:
					System.out.println("\n==================================================================================");
					System.out.println("================Add book to Hun Sen Library===============");
					System.out.println("Note: Books have many type. One type has many book.");
					System.out.println("Input total type of book to add: ");
					int n = input.nextInt();
					Library.Book[] book = new Library.Book[n];
					for (int i = 0; i < book.length; i++) {
						book[i] = librarys[0].new Book();
						System.out.println("Input Book ID: ");
						book[i].bookId = input.nextInt(); 
						System.out.println("Input Book Name: ");
						book[i].bookName = input.next();
						System.out.println("Input Book Type: ");
						book[i].bookType= input.next();
						System.out.println("Input Total Book : ");
						book[i].totalBook = input.nextInt();
						System.out.println("Input Book Status(true/false): ");
						book[i].bookStatus = input.nextBoolean();
					}
					System.out.println("==================================================================================");
					System.out.println("Library "+ librarys[1].toString());
					System.out.println(address[0].toString()+"\n");
					System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
					for (int i = 0; i < book.length; i++) {
						System.out.println(" "+book[i].toString());
					}
					System.out.println("\5 Press 5 to continue: ");
					break;
				case 2:
							System.out.println("==================================================================================");
							System.out.println("================Add book to CKCC Library===============");
							System.out.println("Note: Books have many type. One type has many book.");
							System.out.println("Input total type of book to add: ");
							int nk = input.nextInt();
							Library.Book[] nbook = new Library.Book[nk];
							for (int i = 0; i < nbook.length; i++) {
								nbook[i] = librarys[1].new Book();
								System.out.println("Input Book ID: ");
								nbook[i].bookId = input.nextInt(); 
								System.out.println("Input Book Name: ");
								nbook[i].bookName = input.next();
								System.out.println("Input Book Type: ");
								nbook[i].bookType= input.next();
								System.out.println("Input Total Book : ");
								nbook[i].totalBook = input.nextInt();
								System.out.println("Input Book Status: ");
								nbook[i].bookStatus = input.nextBoolean();
							}
							System.out.println("==================================================================================");
							System.out.println("Library "+ librarys[1].toString());
							System.out.println(address[1].toString()+"\n");
							System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
							for (int i = 0; i < nbook.length; i++) {
								System.out.println(" "+nbook[i].toString());
							}
							System.out.println("\nPress 5 to continue: ");
							
					break;
				}
				}while(select!=5);
				break;
			case 2:
				break;
			}
		}while(selects!=5);
	}

}
