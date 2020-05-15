package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TResourceSort;
import com.bgamq.utils.entity.TResourceSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TResourceSortMapper {
    int countByExample(TResourceSortExample example);

    int deleteByExample(TResourceSortExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TResourceSort record);

    int insertSelective(TResourceSort record);

    List<TResourceSort> selectByExample(TResourceSortExample example);

    TResourceSort selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TResourceSort record, @Param("example") TResourceSortExample example);

    int updateByExample(@Param("record") TResourceSort record, @Param("example") TResourceSortExample example);

    int updateByPrimaryKeySelective(TResourceSort record);

    int updateByPrimaryKey(TResourceSort record);
}