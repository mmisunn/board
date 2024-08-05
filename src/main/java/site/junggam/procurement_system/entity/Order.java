package site.junggam.procurement_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Table(name="tbl_order")
public class Order {

    @Id
    private String orderCode;
    private LocalDateTime orderDate;
    private String order_memo;
}
