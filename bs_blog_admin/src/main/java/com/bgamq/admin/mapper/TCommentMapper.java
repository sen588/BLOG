package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TComment;
import com.bgamq.core.entity.TCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TCommentMapper extends Mapper<TComment> {
    int countByExample(TCommentExample example);

    int deleteByExample(TCommentExample example);

    List<TComment> selectByExample(TCommentExample example);

    int updateByExampleSelective(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByExample(@Param("record") TComment record, @Param("example") TCommentExample example);
}
