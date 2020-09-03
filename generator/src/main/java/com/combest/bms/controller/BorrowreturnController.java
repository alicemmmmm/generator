package com.combest.bms.controller;


import org.springframework.stereotype.Controller;
import com.combest.bms.service.IBorrowreturnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2020-08-27
 */
@Slf4j
@Controller
@Api(value = "", tags = "", description="")
public class BorrowreturnController {

    @Autowired
    private BorrowreturnService borrowreturnService;
}
