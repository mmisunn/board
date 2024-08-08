package site.junggam.procurement_system.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.Warehousing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class WarehousingRepositoryTests {

    @Autowired
    private WarehousingRepository warehousingRepository;

    @Test
    public void insertWarehousingTest(){
        IntStream.rangeClosed(1,10).forEach(i->{
            Warehousing warehousing = Warehousing.builder()
                    .warehousingDate(LocalDateTime.now())
                    .warehousingShipmentSpec(LocalDateTime.now())
                    .warehousingSpec("파일경로랑이름"+i)
                    .warehousingResultMemo("메모")
                    .build();
            warehousingRepository.save(warehousing);

        });


    }

    @Test
    public void WarehousingSpecReadTest() {
        List<Warehousing> list = warehousingRepository.findAll();


    }





}
