package com.hakaton.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name ="sports")
public class Sports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sport_id", unique = true)
    private Long id;

    @Column(name = "sport_name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "JOIN_USER_SPORT",
            joinColumns = {@JoinColumn(name = "user", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "sport", referencedColumnName = "sport_id")}
    )
    private List<User> userList;


}
