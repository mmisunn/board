package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tbl_notice_board")
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Getter
public class Notice {

    private String noticeTitle;

    private String noticeContent;

    private LocalDate noticeRegDate = LocalDate.now();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeNumber;

    private String noticeWriter;

}
