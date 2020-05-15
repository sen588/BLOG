package com.bgamq.core.mapper;

import com.bgamq.core.entity.TPicture;
import com.bgamq.core.entity.TPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TPictureMapper extends Mapper<TPicture> {
    int countByExample(TPictureExample example);

    int deleteByExample(TPictureExample example);

    List<TPicture> selectByExample(TPictureExample example);

    int updateByExampleSelective(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByExample(@Param("record") TPicture record, @Param("example") TPictureExample example);
}