package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TBlogSpider;
import com.bgamq.core.entity.TBlogSpiderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TBlogSpiderMapper extends Mapper<TBlogSpider> {
    int countByExample(TBlogSpiderExample example);

    int deleteByExample(TBlogSpiderExample example);

    List<TBlogSpider> selectByExampleWithBLOBs(TBlogSpiderExample example);

    List<TBlogSpider> selectByExample(TBlogSpiderExample example);

    int updateByExampleSelective(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);

    int updateByExampleWithBLOBs(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);

    int updateByExample(@Param("record") TBlogSpider record, @Param("example") TBlogSpiderExample example);
}
