package com.example.smmp;

import com.example.smmp.dao.BookDao;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SmmpApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Autowired
    @Qualifier("IBookServiceImpl")
    private IBookService bookService;


    public static String getInCond(String str) {
        String[] strArr = str.split(",");
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < strArr.length; i++){
            if(i == strArr.length-1){
                sb.append("'"+strArr[i]+"'");
            }else{
                sb.append("'"+strArr[i]+"'"+",");
            }
        }
        return sb.toString();
    }

    @Test
    void contextLoads() {

        String str = "1,2,3";
        System.out.printf(getInCond(str));
        String newStr = getInCond(str);




    }

}
