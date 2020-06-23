package com.bgamq.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Table;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/2315:58
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "user")
public class User {

    private int id;

    private String name;
}
