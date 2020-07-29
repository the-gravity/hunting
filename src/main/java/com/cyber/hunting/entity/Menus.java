package com.cyber.hunting.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_menus")
@Data
public class Menus {

    @Id
    private String id;

    private String name;

    private String path;

    private String parentid;
}
