package com.bgamq.utils.mapper;

import com.bgamq.utils.entity.TUser;
import com.bgamq.utils.entity.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TUserMapper extends Mapper<TUser> {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    List<TUser> selectByExample(TUserExample example);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);
}