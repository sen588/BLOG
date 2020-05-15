package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TLink;
import com.bgamq.utils.entity.TLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLinkMapper {
    int countByExample(TLinkExample example);

    int deleteByExample(TLinkExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TLink record);

    int insertSelective(TLink record);

    List<TLink> selectByExample(TLinkExample example);

    TLink selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TLink record, @Param("example") TLinkExample example);

    int updateByExample(@Param("record") TLink record, @Param("example") TLinkExample example);

    int updateByPrimaryKeySelective(TLink record);

    int updateByPrimaryKey(TLink record);
}