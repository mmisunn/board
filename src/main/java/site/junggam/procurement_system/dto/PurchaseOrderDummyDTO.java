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
public class PurchaseOrderDummyDTO {

    private String purchaseDummyid;
    private String purchaseDummmyName;
    private String purchaseDummyPath;
    private LocalDateTime purchaseDummyUploadTime;
}
