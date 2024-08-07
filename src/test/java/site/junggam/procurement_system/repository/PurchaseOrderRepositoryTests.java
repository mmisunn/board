package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.ProcurementPlan;
import site.junggam.procurement_system.entity.PurchaseOrder;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
public class PurchaseOrderRepositoryTests {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Test
    public void insertPurchaseOrder(){
        IntStream.rangeClosed(1,20).forEach(i->{
            PurchaseOrder purchaseOrder = PurchaseOrder.builder()
                    .purchaseOrderCode("PO"+i)
                    .purchaseOrderDate(LocalDateTime.now())
                    .purchaseOrderMemo("발주비고 입니다"+i)
                    .procurementPlan(ProcurementPlan.builder().procurementPlanCode("PPC-"+i).build())
                    .build();
            purchaseOrderRepository.save(purchaseOrder);
        });

    }

}
