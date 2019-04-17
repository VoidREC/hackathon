package com.example.base_demo.mapper;


import com.example.base_demo.pojo.entity.Score;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {


    @Select("Select score.#{subjectId} as score,score.uid as uid from score")
    List<Score> getScore(Integer subjectId);

    @Select("Select score.#{subjectId} as score,score.uid as uid from score where uid = #{uid}")
    Score getScoreByUidAndSubjectId(String uid,Integer subjectId);
}
