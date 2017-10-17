package com.maryanto.dimas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "s_user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private boolean active;
    @OneToMany(mappedBy = "user")
    private List<UserRoles> roles = new ArrayList<>();
}
