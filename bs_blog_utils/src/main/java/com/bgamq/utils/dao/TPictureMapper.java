package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TPicture;
import com.bgamq.utils.entity.TPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPictureMapper {
    int countByExample(TPictureExample example);

    int deleteByExample(TPictureExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TPicture record);

    int insertSelective(TPicture record);

    List<TPicture> selectByExample(TPictureExample example);

    TPicture selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByExample(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByPrimaryKeySelective(TPicture record);

    int updateByPrimaryKey(TPicture record);
}