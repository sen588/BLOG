package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TFeedback;
import com.bgamq.utils.entity.TFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFeedbackMapper {
    int countByExample(TFeedbackExample example);

    int deleteByExample(TFeedbackExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TFeedback record);

    int insertSelective(TFeedback record);

    List<TFeedback> selectByExample(TFeedbackExample example);

    TFeedback selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByExample(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByPrimaryKeySelective(TFeedback record);

    int updateByPrimaryKey(TFeedback record);
}