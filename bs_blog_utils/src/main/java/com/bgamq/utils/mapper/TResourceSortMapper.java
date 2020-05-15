package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TResourceSort;
import com.bgamq.utils.entity.TResourceSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TResourceSortMapper extends Mapper<TResourceSort> {
    int countByExample(TResourceSortExample example);

    int deleteByExample(TResourceSortExample example);

    List<TResourceSort> selectByExample(TResourceSortExample example);

    int updateByExampleSelective(@Param("record") TResourceSort record, @Param("example") TResourceSortExample example);

    int updateByExample(@Param("record") TResourceSort record, @Param("example") TResourceSortExample example);
}