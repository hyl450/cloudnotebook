package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNotebook;
import com.hyl.cloudnote.entity.CnNotebookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNotebookMapper {
    long countByExample(CnNotebookExample example);

    int deleteByExample(CnNotebookExample example);

    int deleteByPrimaryKey(String cnNotebookId);

    int insert(CnNotebook record);

    int insertSelective(CnNotebook record);

    List<CnNotebook> selectByExampleWithBLOBs(CnNotebookExample example);

    List<CnNotebook> selectByExample(CnNotebookExample example);

    CnNotebook selectByPrimaryKey(String cnNotebookId);

    int updateByExampleSelective(@Param("record") CnNotebook record, @Param("example") CnNotebookExample example);

    int updateByExampleWithBLOBs(@Param("record") CnNotebook record, @Param("example") CnNotebookExample example);

    int updateByExample(@Param("record") CnNotebook record, @Param("example") CnNotebookExample example);

    int updateByPrimaryKeySelective(CnNotebook record);

    int updateByPrimaryKeyWithBLOBs(CnNotebook record);

    int updateByPrimaryKey(CnNotebook record);
}