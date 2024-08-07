package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "tbl_material")
public class Material {
    @Id
    private String materialCode;
    private String materialName;
    private String materialStand;
    private String materialTexture;
    private String materialDrawFile;
    private String materialEtcFile;
    private LocalDateTime materialRegDate;
    private LocalDateTime materialModDate;
    private Integer materialSafeQuantity;

    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Unit> units;
}
