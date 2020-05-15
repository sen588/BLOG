package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TExceptionLog;
import com.bgamq.utils.entity.TExceptionLogExample;
import com.bgamq.utils.entity.TExceptionLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TExceptionLogMapper extends Mapper<TExceptionLog> {
    int countByExample(TExceptionLogExample example);

    int deleteByExample(TExceptionLogExample example);

    List<TExceptionLogWithBLOBs> selectByExampleWithBLOBs(TExceptionLogExample example);

    List<TExceptionLog> selectByExample(TExceptionLogExample example);

    int updateByExampleSelective(@Param("record") TExceptionLogWithBLOBs record, @Param("example") TExceptionLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TExceptionLogWithBLOBs record, @Param("example") TExceptionLogExample example);

    int updateByExample(@Param("record") TExceptionLog record, @Param("example") TExceptionLogExample example);
}