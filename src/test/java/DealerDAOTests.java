import com.cdk.dealersnetwork.dao.DealerDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by malir on 9/12/2016.
 */
public class DealerDAOTests {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    DealerDAO dealerDAO = (DealerDAO) applicationContext.getBean("dealerDAO");

    @Test
    public void getDealer() {
        int dealerId = 1;
        assertEquals("Rohini Mali",dealerDAO.getDealer(dealerId).getName());
    }
}
