package com.cyber.hunting.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class MenusVo implements Serializable {
    private String id;

    private String name;

    private String path;

    private List<MenusVo> children = new ArrayList<>();//如果是父类，这里存孩子节点
}
