package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Getter
public class Notice {

    @Id
    @GeneratedValue
    private Integer noticeNumber;

    private String noticeTitle;

    private String noticeContent;

    private String noticeWriter;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime noticeRegDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}
