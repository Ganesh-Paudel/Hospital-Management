package model.Lab;

import jakarta.persistence.*;
import model.operations.Encounter;

@Entity
@Table(name="laborders")
public class LabOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @ManyToOne @JoinColumn(name = "encounter_id")
    private Encounter encounter;
    private Integer orderedBy;
    private String status;
}
