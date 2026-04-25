package model.AccessControl;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import model.operations.Encounter;

import java.util.List;

@Entity
@Table(name="staff")
@Getter @Setter
public class Staff {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="staff_id")
    private Long staff_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="depratment_id")
    private Department department;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", columnDefinition = "TEXT")
    private String passwordHash;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Encounter> encounters;
}
