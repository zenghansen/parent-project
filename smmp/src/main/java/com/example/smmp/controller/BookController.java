package com.example.smmp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.smmp.controller.utlis.R;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private IBookService iBookService;


    @GetMapping("getByIds")
    public R getByIds() throws Exception {


        //if(true) throw new Exception("hahah");
        List<Book> list = iBookService.getByIds("2,3");
        return new R(true,list);

    }

    @GetMapping("getById/{id}")
    public R getById(@PathVariable int id, @Validated Book book){

        book.setId(id);
        System.out.printf(book.toString()+"3333333333");
        QueryWrapper queryWrapper = new QueryWrapper(book);

        Book one = iBookService.getOne(queryWrapper);
        Book book1 = new Book();
        book1.setDescription("abcdefg");
        book1.setName("abcdefg");
        book1.setType("abcdefg");
        iBookService.save(book1);

        return new R(true,one);

    }
    @GetMapping("page/{page}/{pageSize}")
    public R getPage(@PathVariable int page, @PathVariable int pageSize)  {

        List<Book> list = iBookService.search(new int[]{3, 4},page,pageSize);
        //if(true) throw  new Exception("error");

        return new R(true,list);

    }

}
