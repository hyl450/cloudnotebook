package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnUser;
import com.hyl.cloudnote.entity.CnUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnUserMapper {
    long countByExample(CnUserExample example);

    int deleteByExample(CnUserExample example);

    int deleteByPrimaryKey(String cnUserId);

    int insert(CnUser record);

    int insertSelective(CnUser record);

    List<CnUser> selectByExampleWithBLOBs(CnUserExample example);

    List<CnUser> selectByExample(CnUserExample example);

    CnUser selectByPrimaryKey(String cnUserId);

    CnUser selectByUserName(String cnUserName);

    int updateByExampleSelective(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByExampleWithBLOBs(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByExample(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByPrimaryKeySelective(CnUser record);

    int updateByPrimaryKeyWithBLOBs(CnUser record);

    int updateByPrimaryKey(CnUser record);
}