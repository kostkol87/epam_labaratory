package java8.lesson05_04_2016;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookExamples {

    static class Book {
//פûגפûגפû
        enum Genre {
            FICTION,
            HISTORICAL,
            PROGRAMMING
        }

        String title;
        int[] pageCount;
        double height;
        Genre genre;

        public Book(String title, int[] pageCount, double height, Genre genre) {
            this.genre = genre;
            this.title = title;
            this.pageCount = pageCount;
            this.height = height;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int[] getPageCount() {
            return pageCount;
        }

        public void setPageCount(int[] pageCount) {
            this.pageCount = pageCount;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
        }
    }


    public static void main(String[] args) {

        Book b1 = new Book("451 degree by F", new int[]{256}, 25.5, Book.Genre.FICTION);
        Book b2 = new Book("Martian's chronicles", new int[]{300}, 20.5, Book.Genre.FICTION);
        Book b3 = new Book("War an the PEace", new int[]{500, 450, 300, 600}, 50.0, Book.Genre.HISTORICAL);
        Book b4 = new Book("War an the PEace", new int[]{100}, 15.0, Book.Genre.PROGRAMMING);

        List<Book> library = Arrays.asList(b1, b2, b3, b4);

        Stream<Book> fitredBookStream = library.stream().filter(b -> b.getGenre() == Book.Genre.PROGRAMMING);

        Stream<String> bookTitlesStream = library.stream().map(Book::getTitle);

        library.stream().sorted(Comparator.comparing(Book::getTitle));
        library.stream().sorted(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }
}
