package model.operations;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity @Table(name="vitals")
public class Vital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vitalId; // [cite: 11]
    @ManyToOne @JoinColumn(name = "encounter_id")
    private Encounter encounter; // [cite: 11]
    private LocalDateTime recordedAt; // [cite: 11]
    private String bloodPressure; // [cite: 11]
    private Integer heartRate; // [cite: 11]
    private Double temperature;
}
