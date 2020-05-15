package com.bgamq.utils.dao;

import com.bgamq.utils.entity.TTodo;
import com.bgamq.utils.entity.TTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTodoMapper {
    int countByExample(TTodoExample example);

    int deleteByExample(TTodoExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TTodo record);

    int insertSelective(TTodo record);

    List<TTodo> selectByExample(TTodoExample example);

    TTodo selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TTodo record, @Param("example") TTodoExample example);

    int updateByExample(@Param("record") TTodo record, @Param("example") TTodoExample example);

    int updateByPrimaryKeySelective(TTodo record);

    int updateByPrimaryKey(TTodo record);
}