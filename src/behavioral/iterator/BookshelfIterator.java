package behavioral.iterator;

public class BookshelfIterator implements Iterator<Book> {
	private Bookshelf bookshelf;
	private int position;

	public BookshelfIterator(Bookshelf b) {
		this.bookshelf = b;
	}

	@Override
	public boolean hasNext() {
		if (position < bookshelf.getBooks().length && bookshelf.getBooks()[position] != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		return bookshelf.getBooks()[position++];
	}

}
