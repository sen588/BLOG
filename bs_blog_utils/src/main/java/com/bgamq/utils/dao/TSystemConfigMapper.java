package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TSystemConfig;
import com.bgamq.utils.entity.TSystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemConfigMapper {
    int countByExample(TSystemConfigExample example);

    int deleteByExample(TSystemConfigExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TSystemConfig record);

    int insertSelective(TSystemConfig record);

    List<TSystemConfig> selectByExample(TSystemConfigExample example);

    TSystemConfig selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TSystemConfig record, @Param("example") TSystemConfigExample example);

    int updateByExample(@Param("record") TSystemConfig record, @Param("example") TSystemConfigExample example);

    int updateByPrimaryKeySelective(TSystemConfig record);

    int updateByPrimaryKey(TSystemConfig record);
}