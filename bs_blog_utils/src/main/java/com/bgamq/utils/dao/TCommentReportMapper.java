package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TCommentReport;
import com.bgamq.utils.entity.TCommentReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommentReportMapper {
    int countByExample(TCommentReportExample example);

    int deleteByExample(TCommentReportExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TCommentReport record);

    int insertSelective(TCommentReport record);

    List<TCommentReport> selectByExample(TCommentReportExample example);

    TCommentReport selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TCommentReport record, @Param("example") TCommentReportExample example);

    int updateByExample(@Param("record") TCommentReport record, @Param("example") TCommentReportExample example);

    int updateByPrimaryKeySelective(TCommentReport record);

    int updateByPrimaryKey(TCommentReport record);
}