package com.flyfire.model;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;
import java.util.List;

/**
 * 文章表
 */
@Table("w_article_info")
public class ArticleInfo {

    @Id
    public long id;

    @Column
    public long title; //标题

    @Column
    public String content; // 内容


    @Column("create_date")
    public Date createDate; //创建日期

    @Column("user_id")
    public long userId; //用户id

//    @Column("tag_id")
//    public long tagId;//标签id

    @Many(field = "masterId")
    public List<TagInfo> tags; // 标签id

    @Column
    public int isPrivate = 0;//是不是私密的



}
