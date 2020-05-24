package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TCommentReport;
import com.bgamq.core.entity.TCommentReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TCommentReportMapper extends Mapper<TCommentReport> {
    int countByExample(TCommentReportExample example);

    int deleteByExample(TCommentReportExample example);

    List<TCommentReport> selectByExample(TCommentReportExample example);

    int updateByExampleSelective(@Param("record") TCommentReport record, @Param("example") TCommentReportExample example);

    int updateByExample(@Param("record") TCommentReport record, @Param("example") TCommentReportExample example);
}
