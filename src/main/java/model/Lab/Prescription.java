package model.Lab;

import jakarta.persistence.*;
import model.AccessControl.Staff;
import model.operations.Encounter;

import java.time.LocalDateTime;

@Entity @Table(name = "prescriptions")
public class Prescription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prescriptionId;
    @ManyToOne @JoinColumn(name = "encounter_id")
    private Encounter encounter;
    @ManyToOne @JoinColumn(name = "doctor_id")
    private Staff doctor;
    private LocalDateTime createdAt;
}
