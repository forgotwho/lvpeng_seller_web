/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;

/**
 * Auto-generated: 2018-06-07 11:20:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MonthCountBean {

	private double income;
    private long paymentOrder;
    private long paymentGoods;
    private long visitShopLog;
    public void setIncome(double income) {
         this.income = income;
     }
     public double getIncome() {
         return income;
     }

    public void setPaymentOrder(long paymentOrder) {
         this.paymentOrder = paymentOrder;
     }
     public long getPaymentOrder() {
         return paymentOrder;
     }

    public void setPaymentGoods(long paymentGoods) {
         this.paymentGoods = paymentGoods;
     }
     public long getPaymentGoods() {
         return paymentGoods;
     }

    public void setVisitShopLog(long visitShopLog) {
         this.visitShopLog = visitShopLog;
     }
     public long getVisitShopLog() {
         return visitShopLog;
     }

}