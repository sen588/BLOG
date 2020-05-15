package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TBlogSpider;
import com.bgamq.utils.entity.TBlogSpiderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlogSpiderMapper {
    int countByExample(TBlogSpiderExample example);

    int deleteByExample(TBlogSpiderExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TBlogSpider record);

    int insertSelective(TBlogSpider record);

    List<TBlogSpider> selectByExampleWithBLOBs(TBlogSpiderExample example);

    List<TBlogSpider> selectByExample(TBlogSpiderExample example);

    TBlogSpider selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);

    int updateByExampleWithBLOBs(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);

    int updateByExample(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);

    int updateByPrimaryKeySelective(TBlogSpider record);

    int updateByPrimaryKeyWithBLOBs(TBlogSpider record);

    int updateByPrimaryKey(TBlogSpider record);
}