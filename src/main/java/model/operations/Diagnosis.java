package model.operations;

import jakarta.persistence.*;

@Entity
@Table(name = "diganoses")
public class Diagnosis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer diagnosisId; // [cite: 6]
    @ManyToOne @JoinColumn(name = "encounter_id")
    private Encounter encounter; // [cite: 6]
    private String description; // [cite: 6]
    private String icdCode;

}
