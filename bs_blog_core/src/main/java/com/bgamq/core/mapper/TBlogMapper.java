package com.bgamq.core.mapper;

import com.bgamq.core.entity.TBlog;
import com.bgamq.core.entity.TBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TBlogMapper extends Mapper<TBlog> {
    int countByExample(TBlogExample example);

    int deleteByExample(TBlogExample example);

    List<TBlog> selectByExampleWithBLOBs(TBlogExample example);

    List<TBlog> selectByExample(TBlogExample example);

    int updateByExampleSelective(@Param("record") TBlog record, @Param("example") TBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TBlog record, @Param("example") TBlogExample example);

    int updateByExample(@Param("record") TBlog record, @Param("example") TBlogExample example);
}