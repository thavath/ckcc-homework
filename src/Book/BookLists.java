package Book;

import java.util.Scanner;

public class BookLists {
	
	public static void main(String[] args) {

		Book[] books = new Book[8];
		books[0] = new Book(1,"Java","Programming",1);
		books[1] = new Book(2,"King","History",1);
		books[2] = new Book(3,"CPP","Programming",1);
		books[3] = new Book(4,"VBA","Database",1);
		books[4] = new Book(5,"Datacom","Network",1);
		books[5] = new Book(6,"Sara","Literature",1);
		books[6] = new Book(7,"English","Literature",1);
		books[7] = new Book(8,"Cambodia","History",1);
		
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
						System.out.println("Id\tName\t\t\tType\t\t\tTotal");
						for (int i = 0; i < books.length; i++) {
							if(books[i].getTotalBook()!=0){
								books[i].showBook();
							}
						}
						System.out.println("====================================");
						break;
				case 2: Scanner input = new Scanner(System.in);
						System.out.println("Which book do you want to borrow (title) :");
						String cBook = input.next();
						for (int i = 0; i < books.length; i++) {
							if(cBook.toLowerCase().equals(books[i].getBookName().toLowerCase())){
								System.out.println("Yes this book is available.\r How many book do you want to borrow :");
								int tBook = input.nextInt();
								if(tBook <= books[i].getTotalBook()){
									System.out.println("Your Name :");
									String bName = input.next();
									System.out.println("Your contact number :");
									String bPhone = input.next();
									System.out.println("Input Date Borrow (day/month/year):");
									String date = input.next(); 
									int tBooks = books[i].getTotalBook() - tBook;
									books[i].setBorrowDate(date);
									books[i].setBorrowBook(tBook);
									books[i].setTotalBook(tBooks); 
									books[i].setBorrowerName(bName);
									books[i].setBorrowerPhone(bPhone);
									System.out.println("You are successfully borrowed the "+books[i].getBookName()+" Book total is: "+tBook+" book.");
									break;
								}else{
									System.out.println("This book doesn't have enough..");
									
								}
							}
						}
					
						break;
				case 3: for (int j = 0; j < books.length; j++) {
							if(books[j].getTotalBook()==0){

								System.out.println("====================================");
								System.out.println("Id 		: "+books[j].getBookID());
								System.out.println("Book Name 	: "+books[j].getBookName());
								System.out.println("Book type 	: "+books[j].getBookType());
								System.out.println("Total Book 	: "+books[j].getBorrowBook());
								System.out.println("Date borrow 	: "+books[j].getBorrowDate());
								System.out.println("Borrower Name 	: "+books[j].getBorrowerName());
								System.out.println("Borrower Phone 	: "+books[j].getBorrowerPhone());
							}
						}
						System.out.println("====================================");
						break;
				case 4: Scanner rinput = new Scanner(System.in);
						System.out.println("Which book do you want to borrow (title) :");
						String rBook = rinput.next();
						for (int i = 0; i < books.length; i++) {
							if(rBook.toLowerCase().equals(books[i].getBookName().toLowerCase())){
								System.out.println("How many book do you want to return :");
								int rtBook = rinput.nextInt();
								if(books[i].getTotalBook()==0){
									System.out.println("Input Date :");
									String rdate = rinput.next(); 
									int rtBooks = books[i].getTotalBook() + rtBook;
									int rtBookb = books[i].getBorrowBook() - rtBook;
									books[i].setReturnDate(rdate);
									books[i].setBorrowBook(rtBookb);
									books[i].setTotalBook(rtBooks); 
									System.out.println("You are successfully return the "+books[i].getBookName()+"Book total is: "+rtBook+" book. \nreturn date : "+books[i].getReturnDate());
									break;
								}else{
									System.out.println("This book wasn't borrowed. are you sure? ");
									
								}
							}
						}
					
						break;
			}
		} while (choice != 5);
		
	}
}
