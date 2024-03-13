package Day7.ProblemSolution;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                ArrayList<Book> books = new ArrayList<Book>();

                books.add(new Book(101,"let us c","Yashwant"));
                books.add(new Book(102,"head first java","Kathy"));

                System.out.println("/--Book Details--/");

                for(Book book : books){
                        System.out.println("Book ID : "+ book.getbookId()+", Book Name: "+book.getbookName()+", Author Name: "+book.getauthorName());
                }
        }

}
