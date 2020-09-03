package com.combest.bms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("bms_borrowreturn")
public class Borrowreturn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 借书id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据id,关联bms_books
     */
    private Integer bookId;

    /**
     * 读者id,关联bms_user
     */
    private Integer userId;

    /**
     * 借书日期
     */
    @TableField("BorrowDate")
    private LocalDateTime BorrowDate;

    /**
     * 还书日期
     */
    @TableField("ReturnDate")
    private LocalDateTime ReturnDate;


}
