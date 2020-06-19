package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TPictureSort;
import com.bgamq.core.entity.TPictureSortExample;
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
