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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;
}
