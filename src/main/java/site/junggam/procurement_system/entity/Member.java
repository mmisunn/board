package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
@Table(name = "tbl_member")
public class Member {

    @Id
    private String memberId;
    private String memberPw;
    private Integer memberNumber;
    private String memberName;
    private String memberImageFile;
    private String memberDept;
    private String memberTeam;
    private String memberRank;
    private String memberEmail;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private MemberStatus memberStatus=MemberStatus.ACTIVE;
    private LocalDateTime memberBirth;
    private String memberTel;

}
