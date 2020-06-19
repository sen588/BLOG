package com.bgamq.admin.mapper;

import com.bgamq.core.entity.TTodo;
import com.bgamq.core.entity.TTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TTodoMapper extends Mapper<TTodo> {
    int countByExample(TTodoExample example);

    int deleteByExample(TTodoExample example);

    List<TTodo> selectByExample(TTodoExample example);

    int updateByExampleSelective(@Param("record") TTodo record, @Param("example") TTodoExample example);

    int updateByExample(@Param("record") TTodo record, @Param("example") TTodoExample example);
}
