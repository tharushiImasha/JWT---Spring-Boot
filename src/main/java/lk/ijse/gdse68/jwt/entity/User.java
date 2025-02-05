package lk.ijse.gdse68.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "systemuser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uid;
    private String email;
    private String password;
    private String name;
    private String companyName;
    private String role;
}
