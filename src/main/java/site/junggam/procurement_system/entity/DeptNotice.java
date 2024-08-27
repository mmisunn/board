package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_dept_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Getter
public class DeptNotice {

    @Id
    @GeneratedValue
    private Integer deptNoticeNumber;

    private String deptNoticeTitle;

    private String deptNoticeContent;

    private String deptNoticeWriter;

//    @CreationTimestamp
//    @Column(updatable = false)
    private LocalDate deptNoticeRegDate;

    @UpdateTimestamp
    private LocalDateTime deptUpdateDate;

}
