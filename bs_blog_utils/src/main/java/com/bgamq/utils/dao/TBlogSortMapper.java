package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TBlogSort;
import com.bgamq.utils.entity.TBlogSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlogSortMapper {
    int countByExample(TBlogSortExample example);

    int deleteByExample(TBlogSortExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TBlogSort record);

    int insertSelective(TBlogSort record);

    List<TBlogSort> selectByExample(TBlogSortExample example);

    TBlogSort selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TBlogSort record, @Param("example") TBlogSortExample example);

    int updateByExample(@Param("record") TBlogSort record, @Param("example") TBlogSortExample example);

    int updateByPrimaryKeySelective(TBlogSort record);

    int updateByPrimaryKey(TBlogSort record);
}