import DAO.BookDAO;
import model.MyBook;

public class Runner {
    public static void main(String[] args) {
        MyBook myBook=new MyBook("first","some things");
        BookDAO bookDAO = new BookDAO();
        bookDAO.save(myBook);

        System.out.println(bookDAO.findAll());
    }
}
