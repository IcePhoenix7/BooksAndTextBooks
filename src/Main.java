public class Main {
    public static void main(String[] args) {
        Book[] Books = {
                new Book("ABC",100),
                new Book("Arabic",100),
                new Textbook("Data Structure",200,"ICS-202"),
                new Textbook("Writing Practice",300,"ENGL-101"),
                new Textbook("Algebra",500,"MATH-101"),
                new Book("Water conservation",200),
                new Book("Environment",150),
                new Book("Teach yourself Visual C++",300),
                new Book("Notebook",300),
                new Textbook("Introduction to Technology",500,"TECH-102"),
        };

        int booksNum = 0,textbooksNum = 0;
        for (Book book : Books) {
            System.out.println(book);
            if (book instanceof Textbook) {
                textbooksNum++;
            } else {
                booksNum++;
            }
        }
        System.out.println("Number of Books = "+booksNum);
        System.out.println("Number of Text Books = "+textbooksNum);

    }
}