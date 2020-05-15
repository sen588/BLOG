package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TSysLog;
import com.bgamq.utils.entity.TSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TSysLogMapper extends Mapper<TSysLog> {
    int countByExample(TSysLogExample example);

    int deleteByExample(TSysLogExample example);

    List<TSysLog> selectByExampleWithBLOBs(TSysLogExample example);

    List<TSysLog> selectByExample(TSysLogExample example);

    int updateByExampleSelective(@Param("record") TSysLog record, @Param("example") TSysLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TSysLog record, @Param("example") TSysLogExample example);

    int updateByExample(@Param("record") TSysLog record, @Param("example") TSysLogExample example);
}