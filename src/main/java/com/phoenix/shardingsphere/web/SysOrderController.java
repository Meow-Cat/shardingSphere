package com.phoenix.shardingsphere.web;

import com.phoenix.shardingsphere.domain.AjaxResult;
import com.phoenix.shardingsphere.domain.SysOrder;
import com.phoenix.shardingsphere.service.ISysOrderService;
import com.phoenix.shardingsphere.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class SysOrderController extends BaseController
{

    @Autowired
    private ISysOrderService sysOrderService;

    @GetMapping("/add/{userId}")
    public AjaxResult add(@PathVariable("userId") Long userId)
    {
        SysOrder sysOrder = new SysOrder();
        sysOrder.setUserId(userId);
        sysOrder.setStatus("0");
        sysOrder.setOrderNo(IdUtils.fastSimpleUUID());
        return AjaxResult.success(sysOrderService.insertSysOrder(sysOrder));
    }

    @GetMapping("/list")
    public AjaxResult list(SysOrder sysOrder)
    {
        return AjaxResult.success(sysOrderService.selectSysOrderList(sysOrder));
    }

    @GetMapping("/query/{orderId}")
    public AjaxResult query(@PathVariable("orderId") Long orderId)
    {
        return AjaxResult.success(sysOrderService.selectSysOrderById(orderId));
    }
}
