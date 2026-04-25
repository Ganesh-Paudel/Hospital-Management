package model.operations;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import model.AccessControl.Staff;
import model.PatientManagement.Patient;

import java.time.LocalDateTime;

@Entity
@Table(name="appointments")
@Getter @Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Integer appointmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id") // Points to staff_id in staff table
    private Staff doctor;

    @Column(name = "scheduled_time")
    private LocalDateTime scheduledTime;

    @Column(name = "status", length = 50)
    private String status;
}
