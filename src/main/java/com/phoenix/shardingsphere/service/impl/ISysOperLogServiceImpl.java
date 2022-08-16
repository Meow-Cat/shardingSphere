package com.phoenix.shardingsphere.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.phoenix.shardingsphere.domain.SysOperLog;
import com.phoenix.shardingsphere.service.ISysOperLogService;
import com.phoenix.shardingsphere.mapper.SysOperLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysOperLogServiceImpl implements ISysOperLogService {

    @Autowired
    private SysOperLogMapper operLogMapper;

    /**
     * 新增操作日志
     *
     * @param operLog 操作日志对象
     * @return 结果
     */
    @Override
    @DS("sharding")
    public int insertOperlog(SysOperLog operLog)
    {
        return operLogMapper.insertOperlog(operLog);
    }

    /**
     * 查询系统操作日志集合
     *
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    @Override
    @DS("sharding")
    public List<SysOperLog> selectOperLogList(SysOperLog operLog)
    {
        return operLogMapper.selectOperLogList(operLog);
    }

    /**
     * 批量删除系统操作日志
     *
     * @param operIds 需要删除的操作日志ID
     * @return 结果
     */
    @Override
    @DS("sharding")
    public int deleteOperLogByIds(Long[] operIds)
    {
        return operLogMapper.deleteOperLogByIds(operIds);
    }

    /**
     * 查询操作日志详细
     *
     * @param operId 操作ID
     * @return 操作日志对象
     */
    @Override
    @DS("sharding")
    public SysOperLog selectOperLogById(Long operId)
    {
        return operLogMapper.selectOperLogById(operId);
    }

    /**
     * 清空操作日志
     */
    @Override
    @DS("sharding")
    public void cleanOperLog()
    {
        operLogMapper.cleanOperLog();
    }
}
