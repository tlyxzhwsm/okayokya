package com.okayokya.orderService.dto;

import com.okayokya.orderService.model.Product;
import com.okayokya.orderService.model.User;

import java.math.BigDecimal;
import java.sql.Date;

/***
 * @ClassName: CartDto
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/2 18:43
 * @version : V1.0
 */
public class CartDto {
    private Product product;
    private String uid;
    private int deleted;
    private String account;
    private String mobile;
    private String email;
    private String nickname;
    private int status;
    private float points;
    private int pid;
    private Date createDate;
    private Date updateDate;
    private String sn;
    private String name;
    private int pgId;
    private BigDecimal purchasePrice;
    private BigDecimal price;
    private int stock;
    private int lockedStock;
    private String imagePath;
    private String imageSever;
    private int categoryId;
    private int brandId;
    private int isOnsale;
    private int isBest;
    private int isNew;
    private int isHot;
    private int seckillId;
    private String origin;
    private float weight;

    public CartDto(Product product, String uid, int deleted, String account, String mobile, String email, String nickname, int status, float points, int pid, Date createDate, Date updateDate, String sn, String name, int pgId, BigDecimal purchasePrice, BigDecimal price, int stock, int lockedStock, String imagePath, String imageSever, int categoryId, int brandId, int isOnsale, int isBest, int isNew, int isHot, int seckillId, String origin, float weight) {
        this.product = product;
        this.uid = uid;
        this.deleted = deleted;
        this.account = account;
        this.mobile = mobile;
        this.email = email;
        this.nickname = nickname;
        this.status = status;
        this.points = points;
        this.pid = pid;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.sn = sn;
        this.name = name;
        this.pgId = pgId;
        this.purchasePrice = purchasePrice;
        this.price = price;
        this.stock = stock;
        this.lockedStock = lockedStock;
        this.imagePath = imagePath;
        this.imageSever = imageSever;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.isOnsale = isOnsale;
        this.isBest = isBest;
        this.isNew = isNew;
        this.isHot = isHot;
        this.seckillId = seckillId;
        this.origin = origin;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "product=" + product +
                ", uid='" + uid + '\'' +
                ", deleted=" + deleted +
                ", account='" + account + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", points=" + points +
                ", pid=" + pid +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", pgId=" + pgId +
                ", purchasePrice=" + purchasePrice +
                ", price=" + price +
                ", stock=" + stock +
                ", lockedStock=" + lockedStock +
                ", imagePath='" + imagePath + '\'' +
                ", imageSever='" + imageSever + '\'' +
                ", categoryId=" + categoryId +
                ", brandId=" + brandId +
                ", isOnsale=" + isOnsale +
                ", isBest=" + isBest +
                ", isNew=" + isNew +
                ", isHot=" + isHot +
                ", seckillId=" + seckillId +
                ", origin='" + origin + '\'' +
                ", weight=" + weight +
                '}';
    }

    public CartDto() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPgId() {
        return pgId;
    }

    public void setPgId(int pgId) {
        this.pgId = pgId;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getLockedStock() {
        return lockedStock;
    }

    public void setLockedStock(int lockedStock) {
        this.lockedStock = lockedStock;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageSever() {
        return imageSever;
    }

    public void setImageSever(String imageSever) {
        this.imageSever = imageSever;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getIsOnsale() {
        return isOnsale;
    }

    public void setIsOnsale(int isOnsale) {
        this.isOnsale = isOnsale;
    }

    public int getIsBest() {
        return isBest;
    }

    public void setIsBest(int isBest) {
        this.isBest = isBest;
    }

    public int getIsNew() {
        return isNew;
    }

    public void setIsNew(int isNew) {
        this.isNew = isNew;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public int getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(int seckillId) {
        this.seckillId = seckillId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
