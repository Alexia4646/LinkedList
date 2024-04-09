public class Book {

    private String title; //title of the book
    private String author; //author of the book
    private int pages; // number of pages in the book
    private String genre; // genre of the book

    // constructor for initializing the Book objrct
    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

        public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Genre: " + genre;
        }
    // Get method to retrieve the title
    public String getTitle() {
        return title;
    }
    // Set method to update the title
    public void setTitle(String title) {
        this.title = title;
    }
    // Get method to retrieve the author
    public String getAuthor() {
        return author;
    }
    // Set method to update the author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Get method to retrieve the number of pages
    public int getPages() {
        return pages;
    }
    // Set method to update the number of pages
    public void setPages(int pages) {
        this.pages = pages;
    }
    // Get method to retrieve the genre
    public String getGenre() {
        return genre;
    }
    // Set method to update the genre
    public void setGenre(String genre) {
        this.genre = genre;
    }
}

