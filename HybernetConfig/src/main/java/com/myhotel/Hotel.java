package com.myhotel;

import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String location;

    @Column(name = "available_rooms")
    private int roomsAvailable;

    public Hotel() {
    }

    public Hotel(String name, String location, int roomsAvailable) {
        this.name = name;
        this.location = location;
        this.roomsAvailable = roomsAvailable;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRoomsAvailable(int roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }

    @Override
    public String toString() {
        return "Hotel{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", location='" + location + '\'' +
               ", roomsAvailable=" + roomsAvailable +
               '}';
    }
}

