package com.okayokya.orderService.model;

/***
 * @ClassName: OrderProduct
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/2 22:04
 * @version : V1.0
 */
public class OrderProduct {
    private String id;
    private String orderId;
    private String productId;

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id='" + id + '\'' +
                ", orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderProduct() {
    }

    public OrderProduct(String orderId, String productId) {
        this.orderId = orderId;
        this.productId = productId;
    }
}
