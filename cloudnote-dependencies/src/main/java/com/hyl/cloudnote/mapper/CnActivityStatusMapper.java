package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnActivityStatus;
import com.hyl.cloudnote.entity.CnActivityStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnActivityStatusMapper {
    long countByExample(CnActivityStatusExample example);

    int deleteByExample(CnActivityStatusExample example);

    int deleteByPrimaryKey(String cnActivityStatusId);

    int insert(CnActivityStatus record);

    int insertSelective(CnActivityStatus record);

    List<CnActivityStatus> selectByExample(CnActivityStatusExample example);

    CnActivityStatus selectByPrimaryKey(String cnActivityStatusId);

    int updateByExampleSelective(@Param("record") CnActivityStatus record, @Param("example") CnActivityStatusExample example);

    int updateByExample(@Param("record") CnActivityStatus record, @Param("example") CnActivityStatusExample example);

    int updateByPrimaryKeySelective(CnActivityStatus record);

    int updateByPrimaryKey(CnActivityStatus record);
}