package com.bjpowernode.dataservice.mapper;

import com.bjpowernode.api.model.IncomeRecord;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IncomeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IncomeRecord record);

    int insertSelective(IncomeRecord record);

    IncomeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IncomeRecord record);

    int updateByPrimaryKey(IncomeRecord record);

    /*到期的收益记录*/
    List<IncomeRecord> selectExpiredIncome(@Param("expiredDate") Date expiredDate);
}