package com.ruanyun.web.model;
// Generated 2016-1-5 21:43:29 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserLogin generated by hbm2java
 */
@Entity
@Table(name="t_user_login")
public class TUserLogin  implements java.io.Serializable 
{
	private static final long serialVersionUID = -4885008184525442115L;
	private Integer userLoginId;
     private String userNum;
     private String loginName;
     private String password;
     private Integer loginType;
     private String flag1;
     private String flag2;
     private String flag3;

    public TUserLogin() {
    }

    public TUserLogin(String userNum, String loginName, String password, Integer loginType) {
       this.userNum = userNum;
       this.loginName = loginName;
       this.password = password;
       this.loginType = loginType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="user_login_id", unique=true, nullable=false)
    public Integer getUserLoginId() {
        return this.userLoginId;
    }
    
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }
    
    @Column(name="user_num", length=100)
    public String getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="login_name", length=100)
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    @Column(name="password", length=100)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="login_type")
    public Integer getLoginType() {
        return this.loginType;
    }
    
    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }
    
    @Column(name="flag1", length=100)
    public String getFlag1() {
        return this.flag1;
    }
    
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }
    
    @Column(name="flag2", length=100)
    public String getFlag2() {
        return this.flag2;
    }
    
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }
    
    @Column(name="flag3", length=100)
    public String getFlag3() {
        return this.flag3;
    }
    
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

}


