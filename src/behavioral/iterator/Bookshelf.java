package behavioral.iterator;

public class Bookshelf {
	private Book[] books;
	private int position;

	public Bookshelf(int size) {
		books = new Book[size];
	}

	public boolean addBook(Book b) {
		if (position < books.length) {
			books[position++] = b;
			return true;
		} else {
			return false;
		}
	}

	public Book[] getBooks() {
		return books;
	}
}
