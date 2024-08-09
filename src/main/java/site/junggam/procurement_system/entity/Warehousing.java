package site.junggam.procurement_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Table(name="tbl_warehousing")
public class Warehousing {

    @Id
    private LocalDateTime warehousingDate;
    private LocalDateTime warehousingShipmentSpec ;
    private String warehousingSpec;
    private String warehousingResultMemo;







}
