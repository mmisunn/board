package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptNoticeNumber;

    private String deptNoticeWriter;

}
