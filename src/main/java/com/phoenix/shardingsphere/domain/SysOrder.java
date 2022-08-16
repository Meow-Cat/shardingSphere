package com.phoenix.shardingsphere.domain;

/**
 * 订单对象 tb_order
 * @author Phoenix
 */
public class SysOrder
{
    private static final long serialVersionUID = 1L;

    /** 订单编号 */
    private Long orderId;

    /** 用户编号 */
    private Long userId;

    /** 状态 */
    private String status;

    /** 订单编号 */
    private String orderNo;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
