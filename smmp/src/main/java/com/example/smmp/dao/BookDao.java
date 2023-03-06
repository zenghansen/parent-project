package com.example.smmp.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smmp.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


@Mapper
public interface BookDao extends BaseMapper<Book> {

    @Select("select * from tpl_book where id in (${ids})")
    List<Book> getByIds(String ids);

}
