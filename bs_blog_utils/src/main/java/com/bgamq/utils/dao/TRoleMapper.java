package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TRole;
import com.bgamq.utils.entity.TRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    int countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExampleWithBLOBs(TRoleExample example);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKeyWithBLOBs(TRole record);

    int updateByPrimaryKey(TRole record);
}