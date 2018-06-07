/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;
import java.util.Date;

import com.lvpeng.seller.mongo.model.Customer;
import com.lvpeng.seller.mongo.model.Member;

/**
 * Auto-generated: 2018-06-07 14:4:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderCustomerCountBean {

    private Date countValue;
    private Customer customer;
    private Member member;
    public void setCountValue(Date countValue) {
         this.countValue = countValue;
     }
     public Date getCountValue() {
         return countValue;
     }

    public void setCustomer(Customer customer) {
         this.customer = customer;
     }
     public Customer getCustomer() {
         return customer;
     }

    public void setMember(Member member) {
         this.member = member;
     }
     public Member getMember() {
         return member;
     }

}