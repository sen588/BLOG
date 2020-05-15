package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TStudyVideo;
import com.bgamq.utils.entity.TStudyVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStudyVideoMapper {
    int countByExample(TStudyVideoExample example);

    int deleteByExample(TStudyVideoExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TStudyVideo record);

    int insertSelective(TStudyVideo record);

    List<TStudyVideo> selectByExample(TStudyVideoExample example);

    TStudyVideo selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TStudyVideo record, @Param("example") TStudyVideoExample example);

    int updateByExample(@Param("record") TStudyVideo record, @Param("example") TStudyVideoExample example);

    int updateByPrimaryKeySelective(TStudyVideo record);

    int updateByPrimaryKey(TStudyVideo record);
}