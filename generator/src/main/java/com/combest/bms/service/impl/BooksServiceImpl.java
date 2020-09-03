package com.combest.bms.service.impl;

import com.combest.bms.entity.Books;
import com.combest.bms.mapper.BooksMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.combest.bms.service.IBooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-08-27
 */
@Slf4j
@Service
@Transactional
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements IBooksService {

}
