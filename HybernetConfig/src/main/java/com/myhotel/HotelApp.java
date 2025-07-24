package com.myhotel;

import jakarta.persistence.*;

import java.util.List;

public class HotelApp {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HotelUnit");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Hotel h1 = new Hotel("Palm Resort", "Goa", 25);
            Hotel h2 = new Hotel("Skyline Inn", "Mumbai", 40);
            em.persist(h1);
            em.persist(h2);

            em.getTransaction().commit();

            System.out.println("\n--- List of Hotels ---");
            List<Hotel> hotels = em.createQuery("SELECT h FROM Hotel h", Hotel.class).getResultList();
            hotels.forEach(System.out::println);

            // Update a hotel
            em.getTransaction().begin();
            Hotel foundHotel = em.find(Hotel.class, h1.getId());
            if (foundHotel != null) {
                foundHotel.setRoomsAvailable(20);
                System.out.println("\nUpdated: " + foundHotel);
            }
            em.getTransaction().commit();

            // Delete a hotel
            em.getTransaction().begin();
            Hotel toRemove = em.find(Hotel.class, h2.getId());
            if (toRemove != null) {
                em.remove(toRemove);
                System.out.println("\nDeleted: " + toRemove);
            }
            em.getTransaction().commit();

            // Final list
            System.out.println("\n--- Final Hotel List ---");
            em.createQuery("SELECT h FROM Hotel h", Hotel.class).getResultList().forEach(System.out::println);

        } finally {
            em.close();
            emf.close();
        }
    }
}
