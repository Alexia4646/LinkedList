import java.util.LinkedList;
public class MainBook {

    // storing the book list and copied book list
    static LinkedList<Book> bookList = new LinkedList<>();
    static LinkedList<Book> copyBookList = new LinkedList<>();

    // creating book objects
    static Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 320, "Fantasy");
    static Book book2 = new Book("Moby-Dick", "Herman Melville", 585, "Adventure");
    static Book book3 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 320, "Fantasy");
    static Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, "Fiction");
    static Book book5 = new Book("To Kill a Mockingbird", "Harper Lee", 281, "Fiction");
    static Book book6 = new Book("The Adventures of Huckleberry Finn", "Mark Twain", 320, "Adventure");
   static Book book7 =  new Book("The Hobbit", "J.R.R. Tolkien", 320, "Fantasy");

    // method to remove the book after a given book node
    public static void removeAfter(Book node) {

        for (int i = 0; i < bookList.size(); i++) {
            Book bElement = bookList.get(i);

            if (bElement.equals(node)) {
                try {
                    bElement = bookList.get(i + 1);
                    bookList.remove(bElement);
                    break;

                }catch (IndexOutOfBoundsException exception){
                    break;
                }
            }
        }
    }

    // method to copy books beginning from a given book node
    public static LinkedList<Book> copy(Book node) {

        for (int count = bookList.indexOf(node); count < bookList.size(); count++) {
            copyBookList.add(bookList.get(count));
        }
        return copyBookList;
    }
// method to remove duplicates the same attributes,§§§§§ but it keeps the node at the key inputted
    public static void removeDuplicate(Book node, int key){

        for (int i = 0; i < bookList.size(); i++) {

            if (bookList.get(i).getTitle().equals(node.getTitle())
                    && bookList.get(i).getAuthor().equals(node.getAuthor())
                    && bookList.get(i).getPages() == node.getPages()
                    && bookList.get(i).getGenre() == node.getGenre()
                    && i != key) {
                Book bElement = bookList.get(i);
                bookList.remove(bElement);
            }
        }
    }

    // method to find the book with the maximum number of pages
    public static String max(Book node){
        String title = "";
        int maxPages = 0;

        for (int count = bookList.indexOf(node); count < bookList.size(); count++) {

            if (maxPages < bookList.get(count).getPages()) {
                title = bookList.get(count).getTitle();
                maxPages = bookList.get(count).getPages();
            }
        }

        if (maxPages == 0){
            return "No books found.";
        }
        return "The book with the most pages is " + title + " with " + maxPages + " pages.";
    }

    public static void main(String[] args) {
        // adding books to the book list
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        System.out.println("Book List: " + bookList); // I am printing the original book list

        System.out.println();
        System.out.println("Copying BookLists");
        System.out.println("Copied List: " + copy(book2)); // I am copying the book list starting from book 2
        System.out.println("Original: " + bookList);

        System.out.println();
        System.out.println("Book with the most pages: " + max(book1)); // I am printing the book with the most pages

        System.out.println();
        removeDuplicate(book3, 2);
        System.out.println("List stays the same: " + bookList);
        System.out.println();
        removeDuplicate(book1, 0);
        System.out.println("List after removing duplicates: " + bookList); // I am removing duplicates from the list

        System.out.println();
        removeAfter(book6);
        System.out.println("The list remains the same: " + bookList); // The list stays the same because book 6 is the last book
        System.out.println();
        removeAfter(book4);
        System.out.println("List after removing the element after 'The Great Gatsby': " + bookList); // I am removing the book after "The Great Gatsby"

    }
}
