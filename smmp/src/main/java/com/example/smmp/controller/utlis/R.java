package com.example.smmp.controller.utlis;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;

    public R(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
}
