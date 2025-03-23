package com.example.upandrunningfirst;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class UpAndRunningFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpAndRunningFirstApplication.class, args);
    }

}
@Entity
class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee() {
        this.id = UUID.randomUUID().toString();
    }

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
