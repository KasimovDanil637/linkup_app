package web.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import web.constants.RoleType;

import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String username;
    private String name;
    private String secondName;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private RoleType userRole;
    @OneToOne
    @JoinColumn(name = "email_id")
    private Email email;
    private Boolean isDeleted;
}