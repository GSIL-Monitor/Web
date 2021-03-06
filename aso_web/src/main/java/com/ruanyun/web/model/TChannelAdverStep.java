package com.ruanyun.web.model;
// Generated 2016-1-16 9:56:35 by Hibernate Tools 3.2.2.GA


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TChannelAdverStep generated by hbm2java
 */
@Entity
@Table(name="t_channel_adver_step")
public class TChannelAdverStep  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;
	private Integer stepId;
     private String adverStepNum;
     private String adverStepName;
     private Integer adverStepCountNum;
     private String adverNum;
     private String stepDesc;
     private Integer conversionsRates;
     private Date effectiveTimeRates;
     private Float price;
     private Integer orderNum;
     private String effectiveSource;
     private String effectiveType;
     private Integer useTimeDay;  //单位天，几天后在使用
     private Integer effectiveMinCount;
     private Date updateTime;
     private String flag1;
     private String flag2;
     private String flag3;
     private String flag4;
     private String flag5;

    public TChannelAdverStep() {
    }

    public TChannelAdverStep(String adverStepNum, String adverStepName, Integer adverStepCountNum, String adverNum, String stepDesc, Integer conversionsRates, Date effectiveTimeRates, Float price, Integer orderNum, String effectiveSource, String effectiveType, Integer effectiveMinCount, Date updateTime, String flag1, String flag2, String flag3, String flag4, String flag5) {
       this.adverStepNum = adverStepNum;
       this.adverStepName = adverStepName;
       this.adverStepCountNum = adverStepCountNum;
       this.adverNum = adverNum;
       this.stepDesc = stepDesc;
       this.conversionsRates = conversionsRates;
       this.effectiveTimeRates = effectiveTimeRates;
       this.price = price;
       this.orderNum = orderNum;
       this.effectiveSource = effectiveSource;
       this.effectiveType = effectiveType;
       this.effectiveMinCount = effectiveMinCount;
       this.updateTime = updateTime;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.flag4 = flag4;
       this.flag5 = flag5;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="step_id", unique=true, nullable=false)
    public Integer getStepId() {
        return this.stepId;
    }
    
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }
    
    @Column(name="adver_step_num", length=100)
    public String getAdverStepNum() {
        return this.adverStepNum;
    }
    
    public void setAdverStepNum(String adverStepNum) {
        this.adverStepNum = adverStepNum;
    }
    
    @Column(name="adver_step_name", length=0)
    public String getAdverStepName() {
        return this.adverStepName;
    }
    
    public void setAdverStepName(String adverStepName) {
        this.adverStepName = adverStepName;
    }
    
    @Column(name="adver_step_count_num")
    public Integer getAdverStepCountNum() {
        return this.adverStepCountNum;
    }
    
    public void setAdverStepCountNum(Integer adverStepCountNum) {
        this.adverStepCountNum = adverStepCountNum;
    }
    
    @Column(name="adver_num", length=100)
    public String getAdverNum() {
        return this.adverNum;
    }
    
    public void setAdverNum(String adverNum) {
        this.adverNum = adverNum;
    }
    
    @Column(name="step_desc", length=500)
    public String getStepDesc() {
        return this.stepDesc;
    }
    
    public void setStepDesc(String stepDesc) {
        this.stepDesc = stepDesc;
    }
    
    @Column(name="conversions_rates")
    public Integer getConversionsRates() {
        return this.conversionsRates;
    }
    
    public void setConversionsRates(Integer conversionsRates) {
        this.conversionsRates = conversionsRates;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="effective_time_rates", length=19)
    public Date getEffectiveTimeRates() {
        return this.effectiveTimeRates;
    }
    
    public void setEffectiveTimeRates(Date effectiveTimeRates) {
        this.effectiveTimeRates = effectiveTimeRates;
    }
    
    @Column(name="price", precision=12, scale=0)
    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    
    @Column(name="order_num")
    public Integer getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
    
    @Column(name="effective_source", length=10)
    public String getEffectiveSource() {
        return this.effectiveSource;
    }
    
    public void setEffectiveSource(String effectiveSource) {
        this.effectiveSource = effectiveSource;
    }
    @Column(name="use_time_day", length=10)
    public Integer getUseTimeDay() {
		return useTimeDay;
	}

	public void setUseTimeDay(Integer useTimeDay) {
		this.useTimeDay = useTimeDay;
	}

	@Column(name="effective_type", length=10)
    public String getEffectiveType() {
        return this.effectiveType;
    }
    
    public void setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
    }
    
    @Column(name="effective_min_count")
    public Integer getEffectiveMinCount() {
        return this.effectiveMinCount;
    }
    
    public void setEffectiveMinCount(Integer effectiveMinCount) {
        this.effectiveMinCount = effectiveMinCount;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time", length=19)
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
    
    @Column(name="flag4", length=100)
    public String getFlag4() {
        return this.flag4;
    }
    
    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }
    
    @Column(name="flag5", length=100)
    public String getFlag5() {
        return this.flag5;
    }
    
    public void setFlag5(String flag5) {
        this.flag5 = flag5;
    }




}


