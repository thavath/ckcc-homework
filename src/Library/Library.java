package Library;

public class Library {
	String libraryName;
	int startTime;
	int endTime;
	class Book{
		int totalBook;
		int bookId;
		String bookType;
		String bookName;
		Boolean bookStatus;
		String borrowDate;
		int borrowBook;
		String returnDate;
		String borrowerName;
		String borrowerPhone;

		
		
		public Book() {
			this.totalBook = 0;
			this.bookId = 0;
			this.bookType = "unknow";
			this.bookName = "unknow";
			this.bookStatus = false;
		}
		@Override
		public String toString() {
			return bookId + "\t\t" + bookName +  "\t\t" + bookType + "\t\t"
					+ totalBook + "\t\t" + bookStatus;
		}
		public Book( int bookId, String bookName, String bookType, int totalBook, Boolean bookStatus) {
			this.bookId = bookId;
			this.totalBook = totalBook;
			this.bookType = bookType;
			this.bookName = bookName;
			this.bookStatus = bookStatus;
		}
	}
	class Address{
		int streetNumber;
		String streetName;
		String zipCode;
		String contact;
		String state;
		String city;
		
		public Address() {
			this.streetNumber = 0000;
			this.streetName = "unknow";
			this.zipCode = "unknow";
			this.contact = "unknow";
			this.state = "unknow";
			this.city = "unknow";
		}
		public Address(int streetNumber, String streetName, String zipCode, String contact, String state, String city) {
			this.streetNumber = streetNumber;
			this.streetName = streetName;
			this.zipCode = zipCode;
			this.contact = contact;
			this.state = state;
			this.city = city;
		}
		@Override
		public String toString() {
			return "Address \n streetNumber	=	" + streetNumber + ",\n streetName	=	" + streetName + ",\n zipCode	=	" + zipCode
					+ ",\n contact	=	" + contact + ",\n state		=	" + state + ",\n city		=	" + city + ",";
		}
		
	}
	@Override
	public String toString() {
		return "\n libraryName	=	" + libraryName + ",\n startTime	=	0" + startTime + ",\n endTime	=	" + endTime +",";
	}
	
	public Library() {
		this.libraryName = "unknow";
		this.startTime = 900;
		this.endTime = 1700;
	}



	public Library(String libraryName, int startTime, int endTime) {
		this.libraryName = libraryName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
}
