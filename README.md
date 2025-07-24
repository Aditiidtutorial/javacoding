# Contacts:

Name: Aditi Patil
Email:aduu.patil9@gmail.com
Name:Shrutika Dubal
Email:shrutikadubal8@gmail.com
Name:Ankita Kamble
Email:ankitakamble154@gmail.com

# 📁 Project Structure

hotel-management/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── myhotel/
│   │   │           ├── Hotel.java            # JPA Entity class representing Hotel
│   │   │           └── HotelApp.java         # Main application class with CRUD operations
│   │   └── resources/
│   │       └── META-INF/
│   │           └── persistence.xml           # JPA persistence configuration
│
├── pom.xml                                   # Maven build and dependency configuration
└── README.md                                 # Project documentation

---
 #✨ Features Demonstrated
 
🆕 Persisting new Hotel entities

🔍 Retrieving all hotels from the database

🔄 Updating a hotel's available rooms

❌ Deleting a hotel entry

🖥️ Printing results to the console with SQL logs visible



## 📝 Description

This project implements a basic hotel management system using:

- 🛠️ **Jakarta Persistence API (JPA)** with Hibernate as the persistence provider  
- 🐘 **PostgreSQL** as the primary database  
- 📦 Maven for project management and dependency resolution  
- ☕ Java 17 as the programming language
  

## ⚙️ Configuration

### persistence.xml

Located under `src/main/resources/META-INF/`, this file defines:

- 🔖 Persistence unit named **HotelUnit**  
- 🔌 Connection properties for PostgreSQL  
- 🐉 Hibernate-specific properties (dialect, auto schema update, show SQL)  

### Maven pom.xml

Includes dependencies for:

- 🦄 Hibernate Core  
- 🗃️ Jakarta Persistence API  
- 🐘 PostgreSQL Driver  
- 💾 H2 Database (runtime scope, optional for testing)  
- 🪵 JBoss Logging  

---

## ▶️ How to Run

1. **Ensure PostgreSQL is installed and running** with a database created named `mydb`.

2. Update the database connection settings in `persistence.xml` if necessary:

   ```xml
   <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/mydb"/>
   <property name="jakarta.persistence.jdbc.user" value="postgres"/>
   <property name="jakarta.persistence.jdbc.password" value="1234"/>

   ## Dependencies

     <dependencies>
        <!-- Hibernate Core -->
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.2.5.Final</version>
        </dependency>

        <!-- Jakarta Persistence API -->
        <dependency>
            <groupId>jakarta.persistence</groupId>
            <artifactId>jakarta.persistence-api</artifactId>
            <version>3.1.0</version>
        </dependency>

        <!-- H2 in-memory database -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.1.214</version>
            <scope>runtime</scope>
        </dependency>

        <!-- Logging (optional but helpful) -->
        <dependency>
            <groupId>org.jboss.logging</groupId>
            <artifactId>jboss-logging</artifactId>
            <version>3.5.3.Final</version>
        </dependency>
        <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version> <!-- Use the latest stable version -->
</dependency>

    </dependencies>

#Output:

Hibernate: 
    create table hotels (
       id serial not null,
        available_rooms integer not null,
        location varchar(255),
        name varchar(255) not null,
        primary key (id)
    )
Hibernate: 
    insert 
    into
        hotels
        (available_rooms, location, name) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        hotels
        (available_rooms, location, name) 
    values
        (?, ?, ?)

--- List of Hotels ---
Hotel{id=1, name='Palm Resort', location='Goa', roomsAvailable=25}
Hotel{id=2, name='Skyline Inn', location='Mumbai', roomsAvailable=40}

Updated: Hotel{id=1, name='Palm Resort', location='Goa', roomsAvailable=20}

Deleted: Hotel{id=2, name='Skyline Inn', location='Mumbai', roomsAvailable=40}

--- Final Hotel List ---
Hotel{id=1, name='Palm Resort', location='Goa', roomsAvailable=20}



