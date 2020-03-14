package com.labs.boot.busi.readinglist.dao;

import com.labs.boot.busi.readinglist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:
 * @Author: tanyun.zheng
 * @Date: 2020/3/9
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
