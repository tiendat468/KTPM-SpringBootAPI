package com.example.springbootapi.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "Employee")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}
