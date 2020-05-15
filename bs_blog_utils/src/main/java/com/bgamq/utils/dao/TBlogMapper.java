package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TBlog;
import com.bgamq.utils.entity.TBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlogMapper {
    int countByExample(TBlogExample example);

    int deleteByExample(TBlogExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TBlog record);

    int insertSelective(TBlog record);

    List<TBlog> selectByExampleWithBLOBs(TBlogExample example);

    List<TBlog> selectByExample(TBlogExample example);

    TBlog selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TBlog record, @Param("example") TBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TBlog record, @Param("example") TBlogExample example);

    int updateByExample(@Param("record") TBlog record, @Param("example") TBlogExample example);

    int updateByPrimaryKeySelective(TBlog record);

    int updateByPrimaryKeyWithBLOBs(TBlog record);

    int updateByPrimaryKey(TBlog record);
}