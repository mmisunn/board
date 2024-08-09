package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.Contract;
import site.junggam.procurement_system.entity.Purchaser;
import site.junggam.procurement_system.entity.TemMaterial;

import java.time.LocalTime;
import java.util.stream.IntStream;

@SpringBootTest
public class ContractRepositoryTest {

    @Autowired
    private ContractRepository contractRepository;

    @Test
    public void insertContract() {
        IntStream.rangeClosed(1,20).forEach(i -> {
            Contract contract = Contract.builder()
                    .contractCode("CC-"+i)
                    .contractFile("계약서경로"+i)
                    .contractLeadTime(i)
                    .contractPrice((double)i)
                    .temMaterial(TemMaterial.builder().materialCode("MATE-"+i).build())
                    .purchaser(Purchaser.builder().purchaserCode("PCC-"+i).build())
                    .build();
            contractRepository.save(contract);
        });
    }
}
