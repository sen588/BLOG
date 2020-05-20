package com.bgamq.core.mapper;

import com.bgamq.core.entity.TBlogSort;
import com.bgamq.core.entity.TBlogSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TBlogSortMapper extends Mapper<TBlogSort> {
    int countByExample(TBlogSortExample example);

    int deleteByExample(TBlogSortExample example);

    List<TBlogSort> selectByExample(TBlogSortExample example);

    int updateByExampleSelective(@Param("record") TBlogSort record, @Param("example") TBlogSortExample example);

    int updateByExample(@Param("record") TBlogSort record, @Param("example") TBlogSortExample example);
}