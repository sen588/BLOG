package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TVisitor;
import com.bgamq.core.entity.TVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TVisitorMapper extends Mapper<TVisitor> {
    int countByExample(TVisitorExample example);

    int deleteByExample(TVisitorExample example);

    List<TVisitor> selectByExample(TVisitorExample example);

    int updateByExampleSelective(@Param("record") TVisitor record, @Param("example") TVisitorExample example);

    int updateByExample(@Param("record") TVisitor record, @Param("example") TVisitorExample example);
}
