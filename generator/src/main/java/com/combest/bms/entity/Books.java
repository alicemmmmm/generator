package com.combest.bms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("bms_books")
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图书编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 图书作者
     */
    private String author;

    /**
     * 图书类别
     */
    private String category;

    /**
     * 图书状态,0不可用,1正常
     */
    private Boolean status;

    /**
     * 图书库存
     */
    private Integer num;

    /**
     * 录入日期
     */
    private LocalDateTime date;


}
