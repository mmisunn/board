package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Getter
@Data
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeNumber;

    private String noticeTitle;

    private String noticeContent;

    private String noticeWriter;

//    @CreationTimestamp
//    @Column(updatable = false)
    private LocalDate noticeRegDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}
