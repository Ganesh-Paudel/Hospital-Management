package model.operations;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import model.AccessControl.Staff;
import model.PatientManagement.Patient;

import java.time.LocalDateTime;

@Entity
@Table(name = "encounters")
@Getter
@Setter
public class Encounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "encounter_id")
    private Integer id;

    @Column(name = "visit_type", length = 50)
    private String visitType;

    @Column( name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Staff doctor;
}
