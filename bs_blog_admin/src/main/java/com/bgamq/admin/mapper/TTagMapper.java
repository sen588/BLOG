package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TTag;
import com.bgamq.core.entity.TTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TTagMapper extends Mapper<TTag> {
    int countByExample(TTagExample example);

    int deleteByExample(TTagExample example);

    List<TTag> selectByExample(TTagExample example);

    int updateByExampleSelective(@Param("record") TTag record, @Param("example") TTagExample example);

    int updateByExample(@Param("record") TTag record, @Param("example") TTagExample example);
}
