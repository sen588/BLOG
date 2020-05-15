package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TVisitor;
import com.bgamq.utils.entity.TVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVisitorMapper {
    int countByExample(TVisitorExample example);

    int deleteByExample(TVisitorExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TVisitor record);

    int insertSelective(TVisitor record);

    List<TVisitor> selectByExample(TVisitorExample example);

    TVisitor selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TVisitor record, @Param("example") TVisitorExample example);

    int updateByExample(@Param("record") TVisitor record, @Param("example") TVisitorExample example);

    int updateByPrimaryKeySelective(TVisitor record);

    int updateByPrimaryKey(TVisitor record);
}