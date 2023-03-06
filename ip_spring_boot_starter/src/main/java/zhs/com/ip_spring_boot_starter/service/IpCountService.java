package zhs.com.ip_spring_boot_starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class IpCountService {

    @Autowired
    private HttpServletRequest httpServletRequest;
    private static final HashMap<String,Integer> map  = new HashMap<>();



    public void count(){

        String ip = httpServletRequest.getRemoteAddr() ;
        if(map.get(ip) == null){
            map.put(ip,1);
        }else{
            map.put(ip,map.get(ip)+1);
        }

        System.out.println(map+"ip");
    }

    @Scheduled(cron = "0/5 * * * * ?")
    public void print(){
        System.out.println(map+"**");
    }

}
