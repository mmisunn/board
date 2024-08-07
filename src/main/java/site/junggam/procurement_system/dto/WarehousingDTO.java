package site.junggam.procurement_system.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class WarehousingDTO {

    private LocalDateTime warehousingDate;
    private LocalDateTime warehousingShipmentSpec ;
    private String warehousingSpec;
    private String warehousingResultMemo;


}
