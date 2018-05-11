package Book;

public class Book {

	private int bookID;
	private String bookName;
	private String bookType;
	private int totalBook;
	private String borrowDate;
	private int borrowBook;
	private String returnDate;
	private String borrowerName;
	private String borrowerPhone;
	
	public Book() {
		this.bookID = 0;
		this.bookName = "unknow";
		this.bookType = "unknow";
		this.totalBook = 0;
	}
	
	public Book(int bookID, String bookName, String bookType, int totalBook) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookType = bookType;
		this.totalBook = totalBook;
	}
	
	public int getBookID() {
		return this.bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public  String getBookType() {
		return this.bookType;
	}
	
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	public int getTotalBook() {
		return this.totalBook;
	}
	public void setTotalBook(int totalBooks){
		this.totalBook = totalBooks;
	}
	
	public String getBorrowDate() {
		return this.borrowDate;
	}
	
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	public String getReturnDate() {
		return this.returnDate;
	}
	
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int bookBorrow(int bookBorrow){
		bookBorrow++;   
		return bookBorrow;
	}
	
	public void showBook(){	
		System.out.println(+bookID + "\t"+ bookName + "\t\t\t"+ bookType +"\t\t\t" +totalBook);
	}
	
	public void addBook(int moreBook){
		totalBook = totalBook + moreBook;
	}

	public int getBorrowBook() {
		return borrowBook;
	}

	public void setBorrowBook(int borrowBook) {
		this.borrowBook = borrowBook;
	}

	public String getBorrowerPhone() {
		return borrowerPhone;
	}

	public void setBorrowerPhone(String borrowerPhone) {
		this.borrowerPhone = borrowerPhone;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
}
