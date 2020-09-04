package com.lening.service.impl;

import com.lening.entity.Shang;
import com.lening.mapper.ShangMapper;
import com.lening.service.ShangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ShangServiceImpl implements ShangService {
    @Resource
    private ShangMapper shangMapper;
    public List<Shang> getAll() {
        List<Shang> list = shangMapper.getAll();
        return list;
    }
}
