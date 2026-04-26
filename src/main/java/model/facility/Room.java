package model.facility;

import jakarta.persistence.*;

@Entity @Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer room_id;

    private String type;
    private String status;
}
