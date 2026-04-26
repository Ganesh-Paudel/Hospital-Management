package model.Billing;

import jakarta.persistence.*;
import model.operations.Encounter;

@Entity @Table(name = "bills")
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billId;
    @ManyToOne @JoinColumn(name = "encounter_id")
    private Encounter encounter;
    private Double totalAmount;
    private String status;
}
