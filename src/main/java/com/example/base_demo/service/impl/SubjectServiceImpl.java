package com.example.base_demo.service.impl;

import com.example.base_demo.mapper.OneTermDownMapper;
import com.example.base_demo.mapper.OneTermUpMapper;
import com.example.base_demo.mapper.TwoTermDownMapper;
import com.example.base_demo.mapper.TwoTermUpMapper;
import com.example.base_demo.pojo.vo.SubjectInfoVO;
import com.example.base_demo.service.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final OneTermUpMapper oneTermUpMapper;
    private final OneTermDownMapper oneTermDownMapper;
    private final TwoTermUpMapper twoTermUpMapper;
    private final TwoTermDownMapper twoTermDownMapper;

    public SubjectServiceImpl(OneTermUpMapper oneTermUpMapper, OneTermDownMapper oneTermDownMapper, TwoTermUpMapper twoTermUpMapper, TwoTermDownMapper twoTermDownMapper) {
        this.oneTermUpMapper = oneTermUpMapper;
        this.oneTermDownMapper = oneTermDownMapper;
        this.twoTermUpMapper = twoTermUpMapper;
        this.twoTermDownMapper = twoTermDownMapper;
    }


    @Override
    public SubjectInfoVO getInfo(Integer uid) {
        if (uid == 1){

        }
        return null;
    }
}
