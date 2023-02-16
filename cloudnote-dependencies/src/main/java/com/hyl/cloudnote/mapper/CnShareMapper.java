package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnShare;
import com.hyl.cloudnote.entity.CnShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnShareMapper {
    long countByExample(CnShareExample example);

    int deleteByExample(CnShareExample example);

    int deleteByPrimaryKey(String cnShareId);

    int insert(CnShare record);

    int insertSelective(CnShare record);

    List<CnShare> selectByExampleWithBLOBs(CnShareExample example);

    List<CnShare> selectByExample(CnShareExample example);

    CnShare selectByPrimaryKey(String cnShareId);

    int updateByExampleSelective(@Param("record") CnShare record, @Param("example") CnShareExample example);

    int updateByExampleWithBLOBs(@Param("record") CnShare record, @Param("example") CnShareExample example);

    int updateByExample(@Param("record") CnShare record, @Param("example") CnShareExample example);

    int updateByPrimaryKeySelective(CnShare record);

    int updateByPrimaryKeyWithBLOBs(CnShare record);

    int updateByPrimaryKey(CnShare record);
}