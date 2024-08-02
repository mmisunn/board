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
@Table(name="tbl_user")
public class User {

    @Id
    private String userId;
    private String userPw;
    private Long userNumber;
    private String userName;
    private String userImageFile;
    private String userDept;
    private String userTeam;
    private String userRank;
    private String userEmail;
    private String userStatus;
    private LocalDateTime userBirth;
    private String userTel;


}
