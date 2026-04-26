package model.facility;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity @Table(name = "inventory")
public class Inventory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private String name;
    private String category;
    private Integer quantity;
    private LocalDate expiryDate;
    private String batchNumber;
}
