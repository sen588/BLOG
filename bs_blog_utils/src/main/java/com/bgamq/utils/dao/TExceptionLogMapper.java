package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TExceptionLog;
import com.bgamq.utils.entity.TExceptionLogExample;
import com.bgamq.utils.entity.TExceptionLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExceptionLogMapper {
    int countByExample(TExceptionLogExample example);

    int deleteByExample(TExceptionLogExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TExceptionLogWithBLOBs record);

    int insertSelective(TExceptionLogWithBLOBs record);

    List<TExceptionLogWithBLOBs> selectByExampleWithBLOBs(TExceptionLogExample example);

    List<TExceptionLog> selectByExample(TExceptionLogExample example);

    TExceptionLogWithBLOBs selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TExceptionLogWithBLOBs record, @Param("example") TExceptionLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TExceptionLogWithBLOBs record, @Param("example") TExceptionLogExample example);

    int updateByExample(@Param("record") TExceptionLog record, @Param("example") TExceptionLogExample example);

    int updateByPrimaryKeySelective(TExceptionLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TExceptionLogWithBLOBs record);

    int updateByPrimaryKey(TExceptionLog record);
}