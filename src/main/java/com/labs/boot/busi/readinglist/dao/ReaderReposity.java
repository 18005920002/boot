package com.labs.boot.busi.readinglist.dao;

import com.labs.boot.busi.readinglist.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: tanyun.zheng
 * @Date: 2020/3/10
 */
public interface ReaderReposity extends JpaRepository<Reader,String> {

}
