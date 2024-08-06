package site.junggam.procurement_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_dept_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class DeptNotice {

    private String deptNoticeTitle;

    private String deptNoticeContent;

    private LocalDateTime deptNoticeRegDate;

    @Id
    private Integer deptNoticeNumber;

}
