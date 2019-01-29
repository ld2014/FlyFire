package com.flyfire.model;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * 系统配置表
 */
@Table("w_sys_config")
public class SysConfig {

    @Column
    public String name;

    @Column
    public String value;
}
