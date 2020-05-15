package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TSysLog;
import com.bgamq.utils.entity.TSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysLogMapper {
    int countByExample(TSysLogExample example);

    int deleteByExample(TSysLogExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TSysLog record);

    int insertSelective(TSysLog record);

    List<TSysLog> selectByExampleWithBLOBs(TSysLogExample example);

    List<TSysLog> selectByExample(TSysLogExample example);

    TSysLog selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TSysLog record, @Param("example") TSysLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TSysLog record, @Param("example") TSysLogExample example);

    int updateByExample(@Param("record") TSysLog record, @Param("example") TSysLogExample example);

    int updateByPrimaryKeySelective(TSysLog record);

    int updateByPrimaryKeyWithBLOBs(TSysLog record);

    int updateByPrimaryKey(TSysLog record);
}