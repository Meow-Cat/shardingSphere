package com.phoenix.shardingsphere.service.impl;

import com.phoenix.shardingsphere.domain.SysOrder;
import com.phoenix.shardingsphere.mapper.SysOrderMapper;
import com.phoenix.shardingsphere.service.ISysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysOrderServiceImpl implements ISysOrderService
{

    @Autowired
    private SysOrderMapper myShardingMapper;

    /**
     * 查询订单
     *
     * @param orderId 订单编号
     * @return 订单信息
     */
    @Override
    @DS("order")
    public SysOrder selectSysOrderById(Long orderId)
    {
        return myShardingMapper.selectSysOrderById(orderId);
    }

    /**
     * 查询订单列表
     *
     * @param sysOrder 订单信息
     * @return 订单列表
     */
    @Override
    @DS("order")
    public List<SysOrder> selectSysOrderList(SysOrder sysOrder)
    {
        return myShardingMapper.selectSysOrderList(sysOrder);
    }

    /**
     * 新增订单
     *
     * @param sysOrder 订单
     * @return 结果
     */
    @Override
    @DS("order")
    public int insertSysOrder(SysOrder sysOrder)
    {
        return myShardingMapper.insertSysOrder(sysOrder);
    }
}
