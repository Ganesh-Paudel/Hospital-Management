package model.PatientManagement;

import jakarta.persistence.*;
import lombok.*;
import model.operations.Encounter;

import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "first_name", length = 50)
    private String firstName;


    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 100)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(name = "emergency_contact", columnDefinition = "TEXT")
    private String emergencyContact;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Encounter> encounters;

}
