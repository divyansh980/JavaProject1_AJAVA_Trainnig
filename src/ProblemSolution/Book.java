package Day7.ProblemSolution;

public class Book {

        private int bookID;
        private String bookName;
        private String authorName;

        public Book(int bookId, String bookName, String authorName) {
                this.bookID = bookId;
                this.bookName = bookName;
                this.authorName = authorName;
                
        }

        public int getbookId(){
                return bookID;
        }

        public String getbookName(){
                return bookName;
        }

        public String getauthorName(){
                return authorName;
        }
        
}
