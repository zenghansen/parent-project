package com.example.smmp.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smmp.dao.BookDao;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService
{

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> search(int[] ids ,int current,int size) {
        //IPage iPage = new Page(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.in("id",  new ArrayList<Integer>(Arrays.asList(1,3)));
        //this.page(iPage,queryWrapper);
        return this.list(queryWrapper);
        //return iPage.getRecords();
    }

    @Override
    public List<Book> getByIds(String ids){



      return bookDao.getByIds(ids);
    }
}
