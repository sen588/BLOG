package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TRole;
import com.bgamq.core.entity.TRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TRoleMapper extends Mapper<TRole> {
    int countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

    List<TRole> selectByExampleWithBLOBs(TRoleExample example);

    List<TRole> selectByExample(TRoleExample example);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);
}
