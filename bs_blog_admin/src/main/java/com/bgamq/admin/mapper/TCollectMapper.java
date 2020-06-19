package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TCollect;
import com.bgamq.core.entity.TCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TCollectMapper extends Mapper<TCollect> {
    int countByExample(TCollectExample example);

    int deleteByExample(TCollectExample example);

    List<TCollect> selectByExample(TCollectExample example);

    int updateByExampleSelective(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByExample(@Param("record") TCollect record, @Param("example") TCollectExample example);
}
