package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TExceptionLog;
import com.bgamq.core.entity.TExceptionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TExceptionLogMapper extends Mapper<TExceptionLog> {
    int countByExample(TExceptionLogExample example);

    int deleteByExample(TExceptionLogExample example);

    List<TExceptionLog> selectByExample(TExceptionLogExample example);

    int updateByExampleSelective(@Param("record") TExceptionLog record, @Param("example") TExceptionLogExample example);

    int updateByExample(@Param("record") TExceptionLog record, @Param("example") TExceptionLogExample example);
}
