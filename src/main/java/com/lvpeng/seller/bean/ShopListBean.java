/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.seller.bean;
import java.util.Date;

/**
 * Auto-generated: 2018-06-05 22:17:59
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class ShopListBean {

    private int sellerId;
    private int shopId;
    private String shopName;
    private String avatar;
    private String expiredTime;
    private Date createTime;
    private String seller;
    public void setSellerId(int sellerId) {
         this.sellerId = sellerId;
     }
     public int getSellerId() {
         return sellerId;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setShopName(String shopName) {
         this.shopName = shopName;
     }
     public String getShopName() {
         return shopName;
     }

    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

    public void setExpiredTime(String expiredTime) {
         this.expiredTime = expiredTime;
     }
     public String getExpiredTime() {
         return expiredTime;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setSeller(String seller) {
         this.seller = seller;
     }
     public String getSeller() {
         return seller;
     }

}