package com.flyfire.model;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 菜单表
 */
@Table("w_ment_info")
public class MentInfo {

    @Id
    public int id;//菜单id

    @Column("ment_name")
    public String mentName; //菜单名称

    @Column
    public String level;//菜单级别

    @Column
    public int index; //权重
}
