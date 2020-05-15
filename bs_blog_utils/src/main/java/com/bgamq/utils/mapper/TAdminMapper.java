package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TAdmin;
import com.bgamq.utils.entity.TAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TAdminMapper extends Mapper<TAdmin> {
    int countByExample(TAdminExample example);

    int deleteByExample(TAdminExample example);

    List<TAdmin> selectByExampleWithBLOBs(TAdminExample example);

    List<TAdmin> selectByExample(TAdminExample example);

    int updateByExampleSelective(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExampleWithBLOBs(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExample(@Param("record") TAdmin record, @Param("example") TAdminExample example);
}