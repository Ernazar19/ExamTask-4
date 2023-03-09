import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Author author1 = new Author("Чынгыз","Айтматов","Aitmatov.@maill.com",'M');
        Author author2 = new Author("Алыкул ","Осмонов","Osmonov.@maill.com",'M');
        Author author3 = new Author("Лев ","Толстой","Lev.@maill.com",'M');
        Author author4 = new Author("Николай ","Гоголь","Gogol.@maill.com",'M');
        Author author5 = new Author("Иван","Тургенев","Turgenev.@maill.com",'M');
        Book book1 = new Book("Живи и помни", author1,450.0,0);
        Book book2 = new Book("Кол толкуну",author2,350.0,0);
        Book book3 = new Book("Казаки",author3,400,0);
        Book book4 = new Book("Ревизор",author4,380,0);
        Book book5 = new Book("Жизнь замечательных людей",author5,450,0);
        while (true){
            switch (scanner.next()){
                case "book1":
                    System.out.println(book1);
                    break;
                case "book2":
                    System.out.println(book2);
                    break;
                case "book3":
                    System.out.println(book3);
                    break;
                case "book4":
                    System.out.println(book4);
                break;
                case "book5":
                    System.out.println(book5);
                break;
                default:
                    System.err.println("error");

            }
        }





    }
}