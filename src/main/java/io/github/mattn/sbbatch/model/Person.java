package io.github.mattn.sbbatch.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by mattn on 2016/09/07.
 */
@Data
@Entity
@Table(name = "PERSON_INFO")
public class Person {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;
}
