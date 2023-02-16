package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNoteType;
import com.hyl.cloudnote.entity.CnNoteTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNoteTypeMapper {
    long countByExample(CnNoteTypeExample example);

    int deleteByExample(CnNoteTypeExample example);

    int deleteByPrimaryKey(String cnNoteTypeId);

    int insert(CnNoteType record);

    int insertSelective(CnNoteType record);

    List<CnNoteType> selectByExampleWithBLOBs(CnNoteTypeExample example);

    List<CnNoteType> selectByExample(CnNoteTypeExample example);

    CnNoteType selectByPrimaryKey(String cnNoteTypeId);

    int updateByExampleSelective(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    int updateByExample(@Param("record") CnNoteType record, @Param("example") CnNoteTypeExample example);

    int updateByPrimaryKeySelective(CnNoteType record);

    int updateByPrimaryKeyWithBLOBs(CnNoteType record);

    int updateByPrimaryKey(CnNoteType record);
}