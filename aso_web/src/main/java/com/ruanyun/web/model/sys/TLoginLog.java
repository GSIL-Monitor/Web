package com.ruanyun.web.model.sys;
// Generated 2013-11-22 9:55:13 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * TLoginLog generated by hbm2java
 */
@Entity
@Table(name="t_login_log"
)
public class TLoginLog  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer logId;
     private String logIp;
     private Integer logUserId;
     private String loginName;
     private Date loginTime;
     /**
      * 结束时间---用于查询
      */
     private Date endDate;

    public TLoginLog() {
    }

    public TLoginLog(String logIp, Integer logUserId, String loginName, Date loginTime) {
       this.logIp = logIp;
       this.logUserId = logUserId;
       this.loginName = loginName;
       this.loginTime = loginTime;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="log_id", unique=true, nullable=false)
    public Integer getLogId() {
        return this.logId;
    }
    
    public void setLogId(Integer logId) {
        this.logId = logId;
    }
    
    @Column(name="log_ip", length=100)
    public String getLogIp() {
        return this.logIp;
    }
    
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }
    
    @Column(name="log_user_id")
    public Integer getLogUserId() {
        return this.logUserId;
    }
    
    public void setLogUserId(Integer logUserId) {
        this.logUserId = logUserId;
    }
    
    @Column(name="login_name", length=500)
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="login_time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    @Transient
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}




}


