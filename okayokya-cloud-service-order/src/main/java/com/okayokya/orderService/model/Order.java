package com.okayokya.orderService.model;

import java.math.BigDecimal;
import java.sql.Date;

/***
 * @ClassName: Order
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/1 17:54
 * @version : V1.0
 */
public class Order {
    private int id;
    private String sn;
    private Date createDate;
    private Date updateDate;
    private int deleted;
    private int userId;
    private String note;
    private int isPointUsed;
    private BigDecimal gainedPoint;
    private BigDecimal usedPoint;
    private BigDecimal pointDeductionTotal;
    private int prodTotalQuantity;
    private BigDecimal prodTotalPrice;
    private BigDecimal totalPrice;
    private String status;
    private String cancelReason;
    private int paymentId;
    private String paymentCode;
    private String paymentName;
    private int addressId;
    private String addressConsignee;
    private String addressDetail;
    private String addressPhone;
    private String addressEmail;
    private String dlyMethod;
    private int isCouponused;
    private int usedCouponId;
    private String usedCouponMsg;
    private BigDecimal couponDeductionTotal;
    private BigDecimal freight;
    private BigDecimal balanceDeductionTotal;
    private int isBalanceUsed;
    private BigDecimal usedBalance;

    public Order(int id, String sn, Date createDate, Date updateDate, int deleted, int userId, String note, int isPointUsed, BigDecimal gainedPoint, BigDecimal usedPoint, BigDecimal pointDeductionTotal, int prodTotalQuantity, BigDecimal prodTotalPrice, BigDecimal totalPrice, String status, String cancelReason, int paymentId, String paymentCode, String paymentName, int addressId, String addressConsignee, String addressDetail, String addressPhone, String addressEmail, String dlyMethod, int isCouponused, int usedCouponId, String usedCouponMsg, BigDecimal couponDeductionTotal, BigDecimal freight, BigDecimal balanceDeductionTotal, int isBalanceUsed, BigDecimal usedBalance) {

        this.id = id;
        this.sn = sn;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.deleted = deleted;
        this.userId = userId;
        this.note = note;
        this.isPointUsed = isPointUsed;
        this.gainedPoint = gainedPoint;
        this.usedPoint = usedPoint;
        this.pointDeductionTotal = pointDeductionTotal;
        this.prodTotalQuantity = prodTotalQuantity;
        this.prodTotalPrice = prodTotalPrice;
        this.totalPrice = totalPrice;
        this.status = status;
        this.cancelReason = cancelReason;
        this.paymentId = paymentId;
        this.paymentCode = paymentCode;
        this.paymentName = paymentName;
        this.addressId = addressId;
        this.addressConsignee = addressConsignee;
        this.addressDetail = addressDetail;
        this.addressPhone = addressPhone;
        this.addressEmail = addressEmail;
        this.dlyMethod = dlyMethod;
        this.isCouponused = isCouponused;
        this.usedCouponId = usedCouponId;
        this.usedCouponMsg = usedCouponMsg;
        this.couponDeductionTotal = couponDeductionTotal;
        this.freight = freight;
        this.balanceDeductionTotal = balanceDeductionTotal;
        this.isBalanceUsed = isBalanceUsed;
        this.usedBalance = usedBalance;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIsPointUsed() {
        return isPointUsed;
    }

    public void setIsPointUsed(int isPointUsed) {
        this.isPointUsed = isPointUsed;
    }

    public BigDecimal getGainedPoint() {
        return gainedPoint;
    }

    public void setGainedPoint(BigDecimal gainedPoint) {
        this.gainedPoint = gainedPoint;
    }

    public BigDecimal getUsedPoint() {
        return usedPoint;
    }

    public void setUsedPoint(BigDecimal usedPoint) {
        this.usedPoint = usedPoint;
    }

    public BigDecimal getPointDeductionTotal() {
        return pointDeductionTotal;
    }

    public void setPointDeductionTotal(BigDecimal pointDeductionTotal) {
        this.pointDeductionTotal = pointDeductionTotal;
    }

    public int getProdTotalQuantity() {
        return prodTotalQuantity;
    }

    public void setProdTotalQuantity(int prodTotalQuantity) {
        this.prodTotalQuantity = prodTotalQuantity;
    }

    public BigDecimal getProdTotalPrice() {
        return prodTotalPrice;
    }

    public void setProdTotalPrice(BigDecimal prodTotalPrice) {
        this.prodTotalPrice = prodTotalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressConsignee() {
        return addressConsignee;
    }

    public void setAddressConsignee(String addressConsignee) {
        this.addressConsignee = addressConsignee;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public String getAddressEmail() {
        return addressEmail;
    }

    public void setAddressEmail(String addressEmail) {
        this.addressEmail = addressEmail;
    }

    public String getDlyMethod() {
        return dlyMethod;
    }

    public void setDlyMethod(String dlyMethod) {
        this.dlyMethod = dlyMethod;
    }

    public int getIsCouponused() {
        return isCouponused;
    }

    public void setIsCouponused(int isCouponused) {
        this.isCouponused = isCouponused;
    }

    public int getUsedCouponId() {
        return usedCouponId;
    }

    public void setUsedCouponId(int usedCouponId) {
        this.usedCouponId = usedCouponId;
    }

    public String getUsedCouponMsg() {
        return usedCouponMsg;
    }

    public void setUsedCouponMsg(String usedCouponMsg) {
        this.usedCouponMsg = usedCouponMsg;
    }

    public BigDecimal getCouponDeductionTotal() {
        return couponDeductionTotal;
    }

    public void setCouponDeductionTotal(BigDecimal couponDeductionTotal) {
        this.couponDeductionTotal = couponDeductionTotal;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getBalanceDeductionTotal() {
        return balanceDeductionTotal;
    }

    public void setBalanceDeductionTotal(BigDecimal balanceDeductionTotal) {
        this.balanceDeductionTotal = balanceDeductionTotal;
    }

    public int getIsBalanceUsed() {
        return isBalanceUsed;
    }

    public void setIsBalanceUsed(int isBalanceUsed) {
        this.isBalanceUsed = isBalanceUsed;
    }

    public BigDecimal getUsedBalance() {
        return usedBalance;
    }

    public void setUsedBalance(BigDecimal usedBalance) {
        this.usedBalance = usedBalance;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", deleted=" + deleted +
                ", userId=" + userId +
                ", note='" + note + '\'' +
                ", isPointUsed=" + isPointUsed +
                ", gainedPoint=" + gainedPoint +
                ", usedPoint=" + usedPoint +
                ", pointDeductionTotal=" + pointDeductionTotal +
                ", prodTotalQuantity=" + prodTotalQuantity +
                ", prodTotalPrice=" + prodTotalPrice +
                ", totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                ", paymentId=" + paymentId +
                ", paymentCode='" + paymentCode + '\'' +
                ", paymentName='" + paymentName + '\'' +
                ", addressId=" + addressId +
                ", addressConsignee='" + addressConsignee + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", addressPhone='" + addressPhone + '\'' +
                ", addressEmail='" + addressEmail + '\'' +
                ", dlyMethod='" + dlyMethod + '\'' +
                ", isCouponused=" + isCouponused +
                ", usedCouponId=" + usedCouponId +
                ", usedCouponMsg='" + usedCouponMsg + '\'' +
                ", couponDeductionTotal=" + couponDeductionTotal +
                ", freight=" + freight +
                ", balanceDeductionTotal=" + balanceDeductionTotal +
                ", isBalanceUsed=" + isBalanceUsed +
                ", usedBalance=" + usedBalance +
                '}';
    }
}
