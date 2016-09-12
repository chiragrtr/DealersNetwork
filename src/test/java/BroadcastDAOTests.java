import com.cdk.dealersnetwork.dao.BroadcastDAO;
import com.cdk.dealersnetwork.dao.DealerDAO;
import com.cdk.dealersnetwork.dto.Broadcast;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by malir on 9/8/2016.
 */

public class BroadcastDAOTests {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    BroadcastDAO broadcastDAO = (BroadcastDAO) applicationContext.getBean("broadcastDAO");

    @Test

    public void getBroadcast() {
        int bid = 1;
        assertEquals(1, broadcastDAO.getBroadcast(bid).getDealerId());
    }


    @Test
    public void createBroadcast() {
        int id = 1;

        Date date = new Date();
        Broadcast broadcast = new Broadcast(3, 1, "bmw", "bmw1", "red", date, 0);
        Broadcast broadcast1 = new Broadcast(1, "bmw", "bmw1", "red", date, 0);
        assertEquals(broadcast, broadcastDAO.createBroadcast(broadcast1));
    }


}
