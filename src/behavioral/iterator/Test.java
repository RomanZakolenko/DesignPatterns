package behavioral.iterator;

public class Test {
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf(5);
		bookshelf.addBook(new Book("Lord of the Ring"));
		bookshelf.addBook(new Book("Thinking in Java"));
		bookshelf.addBook(new Book("One Flew Over the Cuckoo's Nest"));
		BookshelfIterator bookIter = new BookshelfIterator(bookshelf);
		while (bookIter.hasNext()) {
			System.out.println(bookIter.next().getTitle());
		}
	}
}
