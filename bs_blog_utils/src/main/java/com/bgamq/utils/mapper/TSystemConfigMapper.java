package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TSystemConfig;
import com.bgamq.utils.entity.TSystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TSystemConfigMapper extends Mapper<TSystemConfig> {
    int countByExample(TSystemConfigExample example);

    int deleteByExample(TSystemConfigExample example);

    List<TSystemConfig> selectByExample(TSystemConfigExample example);

    int updateByExampleSelective(@Param("record") TSystemConfig record, @Param("example") TSystemConfigExample example);

    int updateByExample(@Param("record") TSystemConfig record, @Param("example") TSystemConfigExample example);
}