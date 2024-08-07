package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.ProcurementPlan;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
public class ProcurementPlanRepositoryTests {
    @Autowired
    private ProcurementPlanRepository procurementPlanRepository;

    @Test
    public void insertProcurementPlan(){
        IntStream.rangeClosed(1,20).forEach(i->{
            ProcurementPlan procurementPlan = ProcurementPlan.builder()
                    .procurementPlanCode("PPC-"+i)
                    .procurementPlanDeadLine(LocalDateTime.now())
                    .procurementPlantRegDate(LocalDateTime.now())
                    .procurementPlanQuantity(i)
                    .build();
            procurementPlanRepository.save(procurementPlan);
        });
    }
}
