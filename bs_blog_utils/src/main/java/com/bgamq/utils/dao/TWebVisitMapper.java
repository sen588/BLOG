package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TWebVisit;
import com.bgamq.utils.entity.TWebVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWebVisitMapper {
    int countByExample(TWebVisitExample example);

    int deleteByExample(TWebVisitExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TWebVisit record);

    int insertSelective(TWebVisit record);

    List<TWebVisit> selectByExample(TWebVisitExample example);

    TWebVisit selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TWebVisit record, @Param("example") TWebVisitExample example);

    int updateByExample(@Param("record") TWebVisit record, @Param("example") TWebVisitExample example);

    int updateByPrimaryKeySelective(TWebVisit record);

    int updateByPrimaryKey(TWebVisit record);
}