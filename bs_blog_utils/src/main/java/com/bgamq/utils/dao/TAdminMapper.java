package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TAdmin;
import com.bgamq.utils.entity.TAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminMapper {
    int countByExample(TAdminExample example);

    int deleteByExample(TAdminExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TAdmin record);

    int insertSelective(TAdmin record);

    List<TAdmin> selectByExampleWithBLOBs(TAdminExample example);

    List<TAdmin> selectByExample(TAdminExample example);

    TAdmin selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExampleWithBLOBs(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExample(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByPrimaryKeySelective(TAdmin record);

    int updateByPrimaryKeyWithBLOBs(TAdmin record);

    int updateByPrimaryKey(TAdmin record);
}