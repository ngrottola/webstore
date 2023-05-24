package com.tailoring.webstore.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "hello")
@Getter
@Setter
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false)
    private long id;

    @Column(name = "HELLO")
    private String hello;

}
