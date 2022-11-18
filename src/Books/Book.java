package Books;

public class Book {

    public String name_of_book;
    public int days_in_use;
    public String condition;
    public String genre;

    static {
        System.out.println("Информация по книгам:\n");
    }

    public Book(String name_of_book, int days_in_use, String condition) {
        this.name_of_book = name_of_book;
        this.days_in_use = days_in_use;
        this.condition = condition;
        this.genre = this.getClass().getSimpleName();
    }

    public String give_out(){
        return "Книга " + name_of_book + " из жанра " + genre + " впервые была выдана " + days_in_use + " дней назад. Её состояние " + condition + ".";
    }
}
