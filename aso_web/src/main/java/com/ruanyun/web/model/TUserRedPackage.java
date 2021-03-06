package com.ruanyun.web.model;
// Generated 2016-3-2 10:53:38 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TUserRedPackage generated by hbm2java
 */
@Entity
@Table(name="t_user_red_package"
)
public class TUserRedPackage  implements java.io.Serializable {


     private Integer userPackageId;
     private String userPackageNum;
     private String userNum;
     private String lotteryNum;
     private Date createDate;

    public TUserRedPackage() {
    }

    public TUserRedPackage(String userPackageNum, String userNum, String lotteryNum, Date createDate) {
       this.userPackageNum = userPackageNum;
       this.userNum = userNum;
       this.lotteryNum = lotteryNum;
       this.createDate = createDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="user_package_id", unique=true, nullable=false)
    public Integer getUserPackageId() {
        return this.userPackageId;
    }
    
    public void setUserPackageId(Integer userPackageId) {
        this.userPackageId = userPackageId;
    }
    
    @Column(name="user_package_num", length=100)
    public String getUserPackageNum() {
        return this.userPackageNum;
    }
    
    public void setUserPackageNum(String userPackageNum) {
        this.userPackageNum = userPackageNum;
    }
    
    @Column(name="user_num", length=100)
    public String getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="lottery_num", length=100)
    public String getLotteryNum() {
        return this.lotteryNum;
    }
    
    public void setLotteryNum(String lotteryNum) {
        this.lotteryNum = lotteryNum;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="create_date", length=10)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }




}


