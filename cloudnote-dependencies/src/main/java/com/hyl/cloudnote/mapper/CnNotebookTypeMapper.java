package com.hyl.cloudnote.mapper;

import com.hyl.cloudnote.entity.CnNotebookType;
import com.hyl.cloudnote.entity.CnNotebookTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnNotebookTypeMapper {
    long countByExample(CnNotebookTypeExample example);

    int deleteByExample(CnNotebookTypeExample example);

    int deleteByPrimaryKey(String cnNotebookTypeId);

    int insert(CnNotebookType record);

    int insertSelective(CnNotebookType record);

    List<CnNotebookType> selectByExampleWithBLOBs(CnNotebookTypeExample example);

    List<CnNotebookType> selectByExample(CnNotebookTypeExample example);

    CnNotebookType selectByPrimaryKey(String cnNotebookTypeId);

    int updateByExampleSelective(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    int updateByExample(@Param("record") CnNotebookType record, @Param("example") CnNotebookTypeExample example);

    int updateByPrimaryKeySelective(CnNotebookType record);

    int updateByPrimaryKeyWithBLOBs(CnNotebookType record);

    int updateByPrimaryKey(CnNotebookType record);
}