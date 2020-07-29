package com.cyber.hunting.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_menus")
@Data
public class Menus {

    @Id
    private int id;

    private String name;

    private String path;

    @Column(nullable = true)
    private int parentid;
}
