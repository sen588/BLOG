package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TPictureSort;
import com.bgamq.utils.entity.TPictureSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPictureSortMapper {
    int countByExample(TPictureSortExample example);

    int deleteByExample(TPictureSortExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TPictureSort record);

    int insertSelective(TPictureSort record);

    List<TPictureSort> selectByExample(TPictureSortExample example);

    TPictureSort selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TPictureSort record, @Param("example") TPictureSortExample example);

    int updateByExample(@Param("record") TPictureSort record, @Param("example") TPictureSortExample example);

    int updateByPrimaryKeySelective(TPictureSort record);

    int updateByPrimaryKey(TPictureSort record);
}