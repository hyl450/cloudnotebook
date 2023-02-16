package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNoteActivity;
import com.hyl.cloudnote.entity.CnNoteActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNoteActivityMapper {
    long countByExample(CnNoteActivityExample example);

    int deleteByExample(CnNoteActivityExample example);

    int deleteByPrimaryKey(String cnNoteActivityId);

    int insert(CnNoteActivity record);

    int insertSelective(CnNoteActivity record);

    List<CnNoteActivity> selectByExampleWithBLOBs(CnNoteActivityExample example);

    List<CnNoteActivity> selectByExample(CnNoteActivityExample example);

    CnNoteActivity selectByPrimaryKey(String cnNoteActivityId);

    int updateByExampleSelective(@Param("record") CnNoteActivity record, @Param("example") CnNoteActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") CnNoteActivity record, @Param("example") CnNoteActivityExample example);

    int updateByExample(@Param("record") CnNoteActivity record, @Param("example") CnNoteActivityExample example);

    int updateByPrimaryKeySelective(CnNoteActivity record);

    int updateByPrimaryKeyWithBLOBs(CnNoteActivity record);

    int updateByPrimaryKey(CnNoteActivity record);
}