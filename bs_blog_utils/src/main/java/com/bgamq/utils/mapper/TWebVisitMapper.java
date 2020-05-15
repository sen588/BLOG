package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TWebVisit;
import com.bgamq.utils.entity.TWebVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TWebVisitMapper extends Mapper<TWebVisit> {
    int countByExample(TWebVisitExample example);

    int deleteByExample(TWebVisitExample example);

    List<TWebVisit> selectByExample(TWebVisitExample example);

    int updateByExampleSelective(@Param("record") TWebVisit record, @Param("example") TWebVisitExample example);

    int updateByExample(@Param("record") TWebVisit record, @Param("example") TWebVisitExample example);
}