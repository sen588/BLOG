package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TStudyVideo;
import com.bgamq.utils.entity.TStudyVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TStudyVideoMapper extends Mapper<TStudyVideo> {
    int countByExample(TStudyVideoExample example);

    int deleteByExample(TStudyVideoExample example);

    List<TStudyVideo> selectByExample(TStudyVideoExample example);

    int updateByExampleSelective(@Param("record") TStudyVideo record, @Param("example") TStudyVideoExample example);

    int updateByExample(@Param("record") TStudyVideo record, @Param("example") TStudyVideoExample example);
}