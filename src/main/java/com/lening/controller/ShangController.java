package com.lening.controller;

import com.lening.entity.Shang;
import com.lening.service.ShangService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shangController")
public class ShangController {
    @Resource
    private ShangService shangService;
    @RequestMapping("/getAll")
    public  Object getAll(){
        List<Shang> list = shangService.getAll();
        return  list;
    }
}
