package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TLink;
import com.bgamq.core.entity.TLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TLinkMapper extends Mapper<TLink> {
    int countByExample(TLinkExample example);

    int deleteByExample(TLinkExample example);

    List<TLink> selectByExample(TLinkExample example);

    int updateByExampleSelective(@Param("record") TLink record, @Param("example") TLinkExample example);

    int updateByExample(@Param("record") TLink record, @Param("example") TLinkExample example);
}
