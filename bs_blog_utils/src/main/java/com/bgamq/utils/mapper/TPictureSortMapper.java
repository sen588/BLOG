package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TPictureSort;
import com.bgamq.utils.entity.TPictureSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TPictureSortMapper extends Mapper<TPictureSort> {
    int countByExample(TPictureSortExample example);

    int deleteByExample(TPictureSortExample example);

    List<TPictureSort> selectByExample(TPictureSortExample example);

    int updateByExampleSelective(@Param("record") TPictureSort record, @Param("example") TPictureSortExample example);

    int updateByExample(@Param("record") TPictureSort record, @Param("example") TPictureSortExample example);
}