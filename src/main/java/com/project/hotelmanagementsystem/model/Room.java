package com.project.hotelmanagementsystem.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "price_per_night")
    private Double pricePerNight;
    private Integer capacity;
    private String status;
    private String description;


}
