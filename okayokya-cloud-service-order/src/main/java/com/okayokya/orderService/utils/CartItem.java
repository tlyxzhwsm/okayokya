package com.okayokya.orderService.utils;

import com.okayokya.orderService.model.Product;


/***
 * @ClassName: Cart
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/2 18:00
 * @version : V1.0
 */
public class CartItem{

    private String key;
    private Product product;
    private long time;
    private String status;
    private  int quantity;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "key='" + key + '\'' +
                ", product=" + product +
                ", time=" + time +
                ", status='" + status + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public CartItem() {
    }

    public CartItem(String key, Product product, long time, String status, int quantity) {
        this.key = key;
        this.product = product;
        this.time = time;
        this.status = status;
        this.quantity = quantity;
    }
}
