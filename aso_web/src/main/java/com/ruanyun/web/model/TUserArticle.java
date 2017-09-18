package com.ruanyun.web.model;
// Generated 2016-4-16 11:38:59 by Hibernate Tools 3.2.2.GA


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
 * TUserArticle generated by hbm2java
 */
@Entity
@Table(name="t_user_article"
)
public class TUserArticle  implements java.io.Serializable {


     private Integer userTaskId;
     private String userNum;
     private Date createTime;
     private Float rewardQuantity;
     private String articleNum;

    public TUserArticle() {
    }

	
    public TUserArticle(Date createTime) {
        this.createTime = createTime;
    }
    public TUserArticle(String userNum, Date createTime, Float rewardQuantity, String articleNum) {
       this.userNum = userNum;
       this.createTime = createTime;
       this.rewardQuantity = rewardQuantity;
       this.articleNum = articleNum;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="user_task_id", unique=true, nullable=false)
    public Integer getUserTaskId() {
        return this.userTaskId;
    }
    
    public void setUserTaskId(Integer userTaskId) {
        this.userTaskId = userTaskId;
    }
    
    @Column(name="user_num", length=100)
    public String getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", nullable=false, length=19)
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="reward_quantity", precision=12, scale=0)
    public Float getRewardQuantity() {
        return this.rewardQuantity;
    }
    
    public void setRewardQuantity(Float rewardQuantity) {
        this.rewardQuantity = rewardQuantity;
    }
    
    @Column(name="article_num")
    public String getArticleNum() {
        return this.articleNum;
    }
    
    public void setArticleNum(String articleNum) {
        this.articleNum = articleNum;
    }




}


