package site.junggam.procurement_system.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.Order;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
public class OrderRepositoyTests {
    
    @Autowired
    private OrderRepository orderRepository;
    
    public void insertOrder(){
//        내일 와서 확인
//        IntStream.rangeClosed(1,10).forEach(i->
//                        Order order = Order.builder()
//                                    .orderCode("ORDE"+i)
//                                    .orderDate(LocalDateTime.now())
//                                    .order_memo("발주비고"+i);
//                );
    }
}
