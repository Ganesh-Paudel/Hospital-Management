package model.Billing;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity @Table(name = "payments")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;
    @ManyToOne @JoinColumn(name = "bill_id")
    private Bill bill;
    private Double amount;
    private String method;
    private LocalDateTime date;
}
