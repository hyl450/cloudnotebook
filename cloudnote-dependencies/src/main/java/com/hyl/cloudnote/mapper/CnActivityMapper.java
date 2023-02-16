package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnActivity;
import com.hyl.cloudnote.entity.CnActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnActivityMapper {
    long countByExample(CnActivityExample example);

    int deleteByExample(CnActivityExample example);

    int deleteByPrimaryKey(String cnActivityId);

    int insert(CnActivity record);

    int insertSelective(CnActivity record);

    List<CnActivity> selectByExampleWithBLOBs(CnActivityExample example);

    List<CnActivity> selectByExample(CnActivityExample example);

    CnActivity selectByPrimaryKey(String cnActivityId);

    int updateByExampleSelective(@Param("record") CnActivity record, @Param("example") CnActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") CnActivity record, @Param("example") CnActivityExample example);

    int updateByExample(@Param("record") CnActivity record, @Param("example") CnActivityExample example);

    int updateByPrimaryKeySelective(CnActivity record);

    int updateByPrimaryKeyWithBLOBs(CnActivity record);

    int updateByPrimaryKey(CnActivity record);
}