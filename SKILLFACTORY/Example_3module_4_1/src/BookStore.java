import BooksMarket.Book;

public class BookStore {
    public static void main(String[] args) {
        Book[] bookList = new Book[9];
        Book book1 = new Book();
        book1.bookName = "Oliver Twist";
        book1.bookPrice = 888;
        book1.editionYear = 1836;
        addBook(bookList, book1);

        printAllBookList(bookList);

    }
    public static boolean checkBook(Book[] bookList, Book book) {
        for (Book item : bookList) {
            if (item != null && item.bookName.equals(book.bookName) && item.editionYear==book.editionYear) {
                System.out.println("Данная книга есть");
                return  true;
            }
        }
        System.out.println("Данной книги нет");
        return false;
     }

    public static void addBook(Book[] bookList, Book book) {
        if (!checkBook(bookList, book)) {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена");
                    break;
                }
                if (i == bookList.length - 1) {
                    System.out.println("Переполнение");
                }
            }
        }
    }
    public static void printAllBookList(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("книга №%d : название: %s, год издания: %d г., цена: %d \n", i + 1,
                        bookList[i].bookName, bookList[i].editionYear, bookList[i].bookPrice);
            }
        }
    }
}