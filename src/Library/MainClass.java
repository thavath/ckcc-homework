package Library;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library[] librarys = new Library[3];
		librarys[0] = new Library("Hun Sen Library", 900, 1700);
		librarys[1] = new Library("CKCC Library", 900, 1700);
		librarys[2] = new Library("CJCC Library", 900, 1700);
		Library.Address[] address = new Library.Address[3];
		address[0] = librarys[0].new Address(153, "Russian Blv", "1200", "hsl@gmail.com", "beng kok", "phnom penh"); 
		address[1] = librarys[1].new Address(153, "Russian Blv", "1200", "ckcc@gmail.com", "beng kok", "phnom penh"); 
		address[2] = librarys[2].new Address(153, "Russian Blv", "1200", "cjcc@gmail.com", "beng kok", "phnom penh"); 
		int selects;
		do {		
			System.out.println("=============================================");
			System.out.println("=====   Welcome to Libraries		=====");
			System.out.println("=====	1/.Hun Sen Libraries.		=====");
			System.out.println("=====	2/.CKCC Libraries.		=====");
			System.out.println("=====	3/.CJCC Libraries.		=====");
			System.out.println("=====	4/.Close the Program.		=====");
			System.out.println("\n=====   Please select choice :");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			selects = input.nextInt();
			switch(selects) {
			case 1:
				int select;
				do {
				System.out.println("============Welcom to Hun Sen Libraries================");
				System.out.println("========	1/. Add book to Library		========");
				System.out.println("========	2/. Show book have		========");
				System.out.println("========    	3/. Borrow Our Book		========");
				System.out.println("=======    	4/. Return the Book		========");
				System.out.println("========    	5/. Back to main menu		========");
				System.out.println("\n======   Please select choice :");
				select = input.nextInt();
				switch(select) {
				case 1:

					System.out.println("\n==================================================================================");
					System.out.println("================Add book to Hun Sen Library===============");
					System.out.println("Note: Books have many type. One type has many book.");
					System.out.println("Input total type of book to add: ");
					int n = input.nextInt();
					Library.Book[] hbook = new Library.Book[n];
					for (int i = 0; i < hbook.length; i++) {
						hbook[i] = librarys[0].new Book();
						System.out.println("Input Book ID: ");
						hbook[i].bookId = input.nextInt(); 
						System.out.println("Input Book Name: ");
						hbook[i].bookName = input.next();
						System.out.println("Input Book Type: ");
						hbook[i].bookType= input.next();
						System.out.println("Input Total Book : ");
						hbook[i].totalBook = input.nextInt();
						System.out.println("Input Book Status(true/false): ");
						hbook[i].bookStatus = input.nextBoolean();
					}
					System.out.println("==================================================================================");
					System.out.println("Library "+ librarys[1].toString());
					System.out.println(address[0].toString()+"\n");
					System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
					for (int i = 0; i < hbook.length; i++) {
						System.out.println(" "+hbook[i].toString());
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5: 
					break;
				}
				}while(select!=5);
			case 2:	
						System.out.println("==================================================================================");
						System.out.println("================Add book to CKCC Library===============");
						System.out.println("Note: Books have many type. One type has many book.");
						System.out.println("Input total type of book to add: ");
					
						int nkk = input.nextInt();
						Library.Book[] cbook = new Library.Book[nkk];
						
						for (int i = 0; i < cbook.length; i++) {
							cbook[i] = librarys[1].new Book();
							System.out.println("Input Book ID: ");
							cbook[i].bookId = input.nextInt(); 
							System.out.println("Input Book Name: ");
							cbook[i].bookName = input.next();
							System.out.println("Input Book Type: ");
							cbook[i].bookType= input.next();
							System.out.println("Input Total Book : ");
							cbook[i].totalBook = input.nextInt();
							System.out.println("Input Book Status(true/false): ");
							cbook[i].bookStatus = input.nextBoolean();
						}
						System.out.println("==================================================================================");
						System.out.println("Library "+ librarys[1].toString());
						System.out.println(address[1].toString()+"\n");
						System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
						for (int i = 0; i < cbook.length; i++) {
							System.out.println(" "+cbook[i].bookName);
						}
						int choices;
						do {

							System.out.println("=============================================");
							System.out.println("=====      Welcome to My Books		=====");
							System.out.println("=====	1/.Show our books lists.	=====");
							System.out.println("=====	2/.Borrow our books.		=====");
							System.out.println("=====	3/.Show books had borrowed.	=====");
							System.out.println("=====	4/.Return the book.		=====");
							System.out.println("=====	5/.Close the Program.		=====");
							System.out.println("=============================================");
							
							Scanner inputs = new Scanner(System.in);
							System.out.print("=====	Please input your choice :");
							choices = inputs.nextInt();
							switch(choices){
								case 1: 
										System.out.println("---------show book list---------");
										System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
										for (int i = 0; i < cbook.length; i++) {
											System.out.println(" "+cbook[i].toString());
										}
										System.out.println("====================================");
										break;
								case 2: 
										System.out.println("Which book do you want to borrow (title) :");
										String cBook = input.next();
										for (int i = 0; i < cbook.length; i++) {
											if(cBook.toLowerCase().equals(cbook[i].bookName.toLowerCase())){
												System.out.println("Yes this book is available.\r How many book do you want to borrow :");
												int tBook = input.nextInt();
												if(tBook <= cbook[i].totalBook){
													System.out.println("Your Name :");
													String bName = input.next();
													System.out.println("Your contact number :");
													String bPhone = input.next();
													System.out.println("Input Date Borrow (day/month/year):");
													String date = input.next(); 
													int tBooks = cbook[i].totalBook - tBook;
													cbook[i].borrowDate = date;
													cbook[i].borrowBook = tBook;
													cbook[i].totalBook = tBooks; 
													cbook[i].borrowerName = bName;
													cbook[i].borrowerPhone = bPhone;
													System.out.println("You are successfully borrowed the "+cbook[i].bookName+" Book total is: "+tBook+" book.");
													break;
												}else{
													System.out.println("This book doesn't have enough..");
													
												}
											}
										}
									
										break;
								case 3: for (int j = 0; j < cbook.length; j++) {
											if(cbook[j].totalBook==0){

												System.out.println("====================================");
												System.out.println("Id 		: "+cbook[j].bookId);
												System.out.println("Book Name 	: "+cbook[j].bookName);
												System.out.println("Book type 	: "+cbook[j].bookType);
												System.out.println("Total Book 	: "+cbook[j].borrowBook);
												System.out.println("Date borrow 	: "+cbook[j].borrowDate);
												System.out.println("Borrower Name 	: "+cbook[j].borrowerName);
												System.out.println("Borrower Phone 	: "+cbook[j].borrowerPhone);
											}
										}
										System.out.println("====================================");
										break;
								case 4: Scanner rinput = new Scanner(System.in);
										System.out.println("Which book do you want to borrow (title) :");
										String rBook = rinput.next();
										for (int i = 0; i < cbook.length; i++) {
											if(rBook.toLowerCase().equals(cbook[i].bookName.toLowerCase())){
												System.out.println("How many book do you want to return :");
												int rtBook = rinput.nextInt();
												if(cbook[i].totalBook==0){
													System.out.println("Input Date :");
													String rdate = rinput.next(); 
													int rtBooks = cbook[i].totalBook + rtBook;
													int rtBookb = cbook[i].borrowBook - rtBook;
													cbook[i].returnDate = rdate;
													cbook[i].borrowBook = rtBookb;
													cbook[i].totalBook = rtBooks; 
													System.out.println("You are successfully return the "+cbook[i].bookName+"Book total is: "+rtBook+" book. \nreturn date : "+cbook[i].returnDate);
													break;
												}else{
													System.out.println("This book wasn't borrowed. are you sure? ");
													
												}
											}
										}
									
										break;
							}
						} while (choices != 5);
				break;
			case 3:	
					System.out.println("==================================================================================");
					System.out.println("================Add book to CJCC Library===============");
					System.out.println("Note: Books have many type. One type has many book.");
					System.out.println("Input total type of book to add: ");	
					int nk = input.nextInt();
					Library.Book[] books = new Library.Book[nk];
						for (int i = 0; i < books.length; i++) {
							books[i] = librarys[1].new Book();
							System.out.println("Input Book ID: ");
							books[i].bookId = input.nextInt(); 
							System.out.println("Input Book Name: ");
							books[i].bookName = input.next();
							System.out.println("Input Book Type: ");
							books[i].bookType= input.next();
							System.out.println("Input Total Book : ");
							books[i].totalBook = input.nextInt();
							System.out.println("Input Book Status(true/false): ");
							books[i].bookStatus = input.nextBoolean();
						}
						System.out.println("==================================================================================");
						System.out.println("Library "+ librarys[1].toString());
						System.out.println(address[1].toString()+"\n");
						System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
						for (int i = 0; i < books.length; i++) {
							System.out.println(" "+books[i].toString());
						}
						
						int choice;
						do {

							System.out.println("=============================================");
							System.out.println("=====      Welcome to My Books		=====");
							System.out.println("=====	1/.Show our books lists.	=====");
							System.out.println("=====	2/.Borrow our books.		=====");
							System.out.println("=====	3/.Show books had borrowed.	=====");
							System.out.println("=====	4/.Return the book.		=====");
							System.out.println("=====	5/.Close the Program.		=====");
							
							System.out.println("=============================================");
							
							Scanner inputs = new Scanner(System.in);
							System.out.print("=====	Please input your choice :");
							choice = inputs.nextInt();
							switch(choice){
								case 1: 
										System.out.println("---------show book list---------");
										System.out.println(" Bood ID\tBook Name\tBook Type\t\tTotal Book\t Status\n");
										for (int i = 0; i < books.length; i++) {
											System.out.println(" "+books[i].toString());
										}
										System.out.println("====================================");
										break;
								case 2: 
										System.out.println("Which book do you want to borrow (title) :");
										String cBook = input.next();
										for (int i = 0; i < books.length; i++) {
											if(cBook.toLowerCase().equals(books[i].bookName.toLowerCase())){
												System.out.println("Yes this book is available.\r How many book do you want to borrow :");
												int tBook = input.nextInt();
												if(tBook <= books[i].totalBook){
													System.out.println("Your Name :");
													String bName = input.next();
													System.out.println("Your contact number :");
													String bPhone = input.next();
													System.out.println("Input Date Borrow (day/month/year):");
													String date = input.next(); 
													int tBooks = books[i].totalBook - tBook;
													books[i].borrowDate = date;
													books[i].borrowBook = tBook;
													books[i].totalBook = tBooks; 
													books[i].borrowerName = bName;
													books[i].borrowerPhone = bPhone;
													System.out.println("You are successfully borrowed the "+books[i].bookName+" Book total is: "+tBook+" book.");
													break;
												}else{
													System.out.println("This book doesn't have enough..");
													
												}
											}
										}
									
										break;
								case 3: for (int j = 0; j < books.length; j++) {
											if(books[j].totalBook==0){

												System.out.println("====================================");
												System.out.println("Id 		: "+books[j].bookId);
												System.out.println("Book Name 	: "+books[j].bookName);
												System.out.println("Book type 	: "+books[j].bookType);
												System.out.println("Total Book 	: "+books[j].borrowBook);
												System.out.println("Date borrow 	: "+books[j].borrowDate);
												System.out.println("Borrower Name 	: "+books[j].borrowerName);
												System.out.println("Borrower Phone 	: "+books[j].borrowerPhone);
											}
										}
										System.out.println("====================================");
										break;
								case 4: Scanner rinput = new Scanner(System.in);
										System.out.println("Which book do you want to borrow (title) :");
										String rBook = rinput.next();
										for (int i = 0; i < books.length; i++) {
											if(rBook.toLowerCase().equals(books[i].bookName.toLowerCase())){
												System.out.println("How many book do you want to return :");
												int rtBook = rinput.nextInt();
												if(books[i].totalBook==0){
													System.out.println("Input Date :");
													String rdate = rinput.next(); 
													int rtBooks = books[i].totalBook + rtBook;
													int rtBookb = books[i].borrowBook - rtBook;
													books[i].returnDate = rdate;
													books[i].borrowBook = rtBookb;
													books[i].totalBook = rtBooks; 
													System.out.println("You are successfully return the "+books[i].bookName+"Book total is: "+rtBook+" book. \nreturn date : "+books[i].returnDate);
													break;
												}else{
													System.out.println("This book wasn't borrowed. are you sure? ");
													
												}
											}
										}
									
										break;
							}
						} while (choice != 5);
						
			break;
			}
		}while(selects!=4);
	}

}
