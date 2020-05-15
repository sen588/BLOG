package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TFeedback;
import com.bgamq.utils.entity.TFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TFeedbackMapper extends Mapper<TFeedback> {
    int countByExample(TFeedbackExample example);

    int deleteByExample(TFeedbackExample example);

    List<TFeedback> selectByExample(TFeedbackExample example);

    int updateByExampleSelective(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByExample(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);
}