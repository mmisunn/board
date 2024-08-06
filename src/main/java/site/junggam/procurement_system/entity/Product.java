package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCode;
    private String productName;
    private Double productPrice;
    private String productStand;
    private String productTexture;
    private String productDrawFile;
    private String productEtcFile ;
    private LocalDateTime productRegDate;
    private LocalDateTime productModDate;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Unit> units;
}
