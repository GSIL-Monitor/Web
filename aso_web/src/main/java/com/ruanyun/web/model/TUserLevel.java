package com.ruanyun.web.model;
// Generated 2016-1-5 21:43:29 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserLevel generated by hbm2java
 */
@Entity
@Table(name="t_user_level"
)
public class TUserLevel  implements java.io.Serializable {


     private Integer levelId;
     private String levelNum;
     private String levelName;
     private String levelDesc;
     private Integer proportionStart;
     private Integer proportionEnd;
     private Integer scoreStart;
     private Integer scoreEnd;
     private String flag1;
     private String flag2;
     private String flag3;
     private String flag4;
     private String flag5;
     private Integer levelRate;//徒弟得分比例
     
     
    public TUserLevel() {
    }

    public TUserLevel(String levelNum, String levelName, String levelDesc, Integer proportionStart, Integer proportionEnd, Integer scoreStart, Integer scoreEnd, String flag1, String flag2, String flag3, String flag4, String flag5) {
       this.levelNum = levelNum;
       this.levelName = levelName;
       this.levelDesc = levelDesc;
       this.proportionStart = proportionStart;
       this.proportionEnd = proportionEnd;
       this.scoreStart = scoreStart;
       this.scoreEnd = scoreEnd;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.flag4 = flag4;
       this.flag5 = flag5;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="level_id", unique=true, nullable=false)
    public Integer getLevelId() {
        return this.levelId;
    }
    
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }
    
    @Column(name="level_num", length=100)
    public String getLevelNum() {
        return this.levelNum;
    }
    
    public void setLevelNum(String levelNum) {
        this.levelNum = levelNum;
    }
    
    @Column(name="level_name", length=100)
    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
    
    @Column(name="level_desc", length=100)
    public String getLevelDesc() {
        return this.levelDesc;
    }
    
    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }
    
    @Column(name="proportion_start")
    public Integer getProportionStart() {
        return this.proportionStart;
    }
    
    public void setProportionStart(Integer proportionStart) {
        this.proportionStart = proportionStart;
    }
    
    @Column(name="proportion_end")
    public Integer getProportionEnd() {
        return this.proportionEnd;
    }
    
    public void setProportionEnd(Integer proportionEnd) {
        this.proportionEnd = proportionEnd;
    }
    
    @Column(name="score_start")
    public Integer getScoreStart() {
        return this.scoreStart;
    }
    
    public void setScoreStart(Integer scoreStart) {
        this.scoreStart = scoreStart;
    }
    
    @Column(name="score_end")
    public Integer getScoreEnd() {
        return this.scoreEnd;
    }
    
    public void setScoreEnd(Integer scoreEnd) {
        this.scoreEnd = scoreEnd;
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
    @Transient
	public Integer getLevelRate() {
		return levelRate;
	}

	public void setLevelRate(Integer levelRate) {
		this.levelRate = levelRate;
	}




}


