package com.flyfire.model;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;

/**
 * 标签表
 */
@Table("w_tag_info")
public class TagInfo {

    @Id
    public int id;

    @Column("tag_name")
    public String tagName;

    @Column("create_date")
    public Date createDate;
}
