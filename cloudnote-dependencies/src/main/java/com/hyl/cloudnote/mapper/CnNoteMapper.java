package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNote;
import com.hyl.cloudnote.entity.CnNoteExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CnNoteMapper {
    long countByExample(CnNoteExample example);

    int deleteByExample(CnNoteExample example);

    int deleteByPrimaryKey(String cnNoteId);

    int insert(CnNote record);

    int insertSelective(CnNote record);

    List<CnNote> selectByExampleWithBLOBs(CnNoteExample example);

    List<CnNote> selectByExample(CnNoteExample example);

    List<CnNote> findByBookId(String bookId);

    List<CnNote> selectCnNoteByLikeBody(Map<String, Object> inMap);

    CnNote selectByPrimaryKey(String cnNoteId);

    int updateByExampleSelective(@Param("record") CnNote record, @Param("example") CnNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") CnNote record, @Param("example") CnNoteExample example);

    int updateByExample(@Param("record") CnNote record, @Param("example") CnNoteExample example);

    int updateByPrimaryKeySelective(CnNote record);

    int updateByPrimaryKeyWithBLOBs(CnNote record);

    int updateByPrimaryKey(CnNote record);
}