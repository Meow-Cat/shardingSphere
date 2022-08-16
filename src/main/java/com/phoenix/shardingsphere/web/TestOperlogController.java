package com.phoenix.shardingsphere.web;

import com.phoenix.shardingsphere.domain.SysOperLog;
import com.phoenix.shardingsphere.service.ISysOperLogService;
import com.phoenix.shardingsphere.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/operlog")
public class TestOperlogController extends BaseController{

    @Autowired
    private ISysOperLogService operLogService;

    @GetMapping("/{method}")
    public AjaxResult operlog(@PathVariable("method") String method)
    {
        SysOperLog operLog = new SysOperLog();
        operLog.setTitle("测试数据");
        operLog.setOperName("admin");
        operLog.setRequestMethod(method);
        return toAjax(operLogService.insertOperlog(operLog));
    }

    @GetMapping("/list")
    public AjaxResult list()
    {
        return AjaxResult.success(operLogService.selectOperLogList(new SysOperLog()));
    }

    @GetMapping("/query/{id}")
    public AjaxResult query(@PathVariable("id") Long id)
    {
        return AjaxResult.success(operLogService.selectOperLogById(id));
    }
}
