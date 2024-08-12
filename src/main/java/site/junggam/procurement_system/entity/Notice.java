package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class Notice {

    private String noticeTitle;

    private String noticeContent;

    private LocalDateTime noticeRegDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeNumber;

    private String noticeWriter;

}
