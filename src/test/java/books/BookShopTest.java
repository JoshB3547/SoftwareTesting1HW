package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

	BookShop bookShop = new BookShop("TestShop");
	int[] books = {0,0,8,0,9};
	
	
    @Test
    public void myFirstTest(){
        assertEquals(0, bookShop.cost(books));
    }
}