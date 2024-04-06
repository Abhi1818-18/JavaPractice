package a1;

public class Book {
	
	private String title;
    private String ISBN;
    private Author author;
    
    public Book(String title,String ISBN,Author author) {
    	this.title=title;
    	this.ISBN=ISBN;
    	this.author=author;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
    
    

}
