package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNoteStatus;
import com.hyl.cloudnote.entity.CnNoteStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNoteStatusMapper {
    long countByExample(CnNoteStatusExample example);

    int deleteByExample(CnNoteStatusExample example);

    int deleteByPrimaryKey(String cnNoteStatusId);

    int insert(CnNoteStatus record);

    int insertSelective(CnNoteStatus record);

    List<CnNoteStatus> selectByExample(CnNoteStatusExample example);

    CnNoteStatus selectByPrimaryKey(String cnNoteStatusId);

    int updateByExampleSelective(@Param("record") CnNoteStatus record, @Param("example") CnNoteStatusExample example);

    int updateByExample(@Param("record") CnNoteStatus record, @Param("example") CnNoteStatusExample example);

    int updateByPrimaryKeySelective(CnNoteStatus record);

    int updateByPrimaryKey(CnNoteStatus record);
}