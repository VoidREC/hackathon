package com.example.base_demo.service.impl;

import com.example.base_demo.exception.StudentLoginIncorrectException;
import com.example.base_demo.mapper.OneTermDownMapper;
import com.example.base_demo.mapper.OneTermUpMapper;
import com.example.base_demo.mapper.TwoTermDownMapper;
import com.example.base_demo.mapper.TwoTermUpMapper;
import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.pojo.entity.*;
import com.example.base_demo.pojo.vo.StudentScoreVO;
import com.example.base_demo.service.ScoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ScoreServieImpl implements ScoreService {

    private final OneTermUpMapper oneTermUpMapper;
    private final OneTermDownMapper oneTermDownMapper;
    private final TwoTermUpMapper twoTermUpMapper;
    private final TwoTermDownMapper twoTermDownMapper;

    public ScoreServieImpl(OneTermUpMapper oneTermUpMapper, OneTermDownMapper oneTermDownMapper, TwoTermUpMapper twoTermUpMapper, TwoTermDownMapper twoTermDownMapper) {
        this.oneTermUpMapper = oneTermUpMapper;
        this.oneTermDownMapper = oneTermDownMapper;
        this.twoTermUpMapper = twoTermUpMapper;
        this.twoTermDownMapper = twoTermDownMapper;
    }

    @Override
    public Object getOneScore(ScoreInfoDTO dto) {
        if (dto.getTerm()==1){
            OneTermUp oneTermUp = oneTermUpMapper.selectByPrimaryKey(dto.getUid());
            return oneTermUp;
        }
        if (dto.getTerm()==2){
            OneTermDown oneTermDown = oneTermDownMapper.selectByPrimaryKey(dto.getUid());
            return oneTermDown;
        }
        if (dto.getTerm()==3){
            TwoTermUp twoTermUp = twoTermUpMapper.selectByPrimaryKey(dto.getUid());
            return twoTermUp;
        }
        if (dto.getTerm()==4){
            TwoTermDown TwoTermDown = twoTermDownMapper.selectByPrimaryKey(dto.getUid());
            return twoTermDownMapper;
        }
        else throw new StudentLoginIncorrectException("不正确的学号");
    }

}
