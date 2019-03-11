package com.wuleshen.miniprogram.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by wuleshen on 2019/3/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {

    private Integer id;

    private String name;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    public Area(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public Area(Integer id, String name, Integer priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}
