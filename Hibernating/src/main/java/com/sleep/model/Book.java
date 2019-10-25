package com.sleep.model;

public class Book {
	
	private int isbn;
	private String title;
	private boolean haspictures;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isHaspictures() {
		return haspictures;
	}
	public void setHaspictures(boolean haspictures) {
		this.haspictures = haspictures;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (haspictures ? 1231 : 1237);
		result = prime * result + isbn;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (haspictures != other.haspictures)
			return false;
		if (isbn != other.isbn)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", haspictures=" + haspictures + "]";
	}
	public Book(int isbn, String title, boolean haspictures) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.haspictures = haspictures;
	}
	public Book() {
		super();
	}
	
	
	
	

}
