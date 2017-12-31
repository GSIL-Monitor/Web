package com.ruanyun.web.model;

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
 * TChannelInfo generated by hbm2java
 */
@Entity
@Table(name="t_channel_info")
public class TChannelInfo  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;
	private Integer channelId;
	private String channelName;
	private String channelNum;
	private String channelDesc;
	private Integer channelLevel;
	private String channelUser;
	private Date createDate;
	private String appKey;
	private String appPassword;
	private String appOther;
	private String appCallbackKey;
	private String channelImg;
	private String flag1;
	private String flag2;
	private String flag3;
	private Integer dayTotal;
	private Integer cumulativeTotal;
	private String loginName;
	private String channelType;  //渠道类型编码
	private String channelTypeName;  //渠道类型名称
	private String systemType;//系统类型
	private Integer isEnable;//是否启用

    public TChannelInfo() 
    {
    }

    public TChannelInfo(String channelName, String channelNum, String channelDesc, 
    		Integer channelLevel, String channelUser, Date createDate, String appKey, 
    		String appPassword, String appOther, String appCallbackKey, String channelImg, 
    		String flag1, String flag2, String flag3, Integer dayTotal, Integer cumulativeTotal) 
    {
       this.channelName = channelName;
       this.channelNum = channelNum;
       this.channelDesc = channelDesc;
       this.channelLevel = channelLevel;
       this.channelUser = channelUser;
       this.createDate = createDate;
       this.appKey = appKey;
       this.appPassword = appPassword;
       this.appOther = appOther;
       this.appCallbackKey = appCallbackKey;
       this.channelImg = channelImg;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.dayTotal = dayTotal;
       this.cumulativeTotal = cumulativeTotal;
    }
   
    @Id 
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="channel_id", unique=true, nullable=false)
    public Integer getChannelId()
    {
        return this.channelId;
    }
    
    public void setChannelId(Integer channelId) 
    {
        this.channelId = channelId;
    }
    
    @Column(name="channel_name", length=200)
    public String getChannelName() 
    {
        return this.channelName;
    }
    
    public void setChannelName(String channelName) 
    {
        this.channelName = channelName;
    }
    
    @Column(name="channel_num", length=100)
    public String getChannelNum() 
    {
        return this.channelNum;
    }
    
    public void setChannelNum(String channelNum) 
    {
        this.channelNum = channelNum;
    }
    
    @Column(name="channel_desc", length=100)
    public String getChannelDesc() 
    {
        return this.channelDesc;
    }
    
    public void setChannelDesc(String channelDesc) 
    {
        this.channelDesc = channelDesc;
    }
    
    @Column(name="channel_level")
    public Integer getChannelLevel() 
    {
        return this.channelLevel;
    }
    
    public void setChannelLevel(Integer channelLevel)
    {
        this.channelLevel = channelLevel;
    }
    
    @Column(name="channel_user", length=100)
    public String getChannelUser()
    {
        return this.channelUser;
    }
    
    public void setChannelUser(String channelUser)
    {
        this.channelUser = channelUser;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="create_date", length=10)
    public Date getCreateDate() 
    {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }
    
    @Column(name="app_key", length=100)
    public String getAppKey() 
    {
        return this.appKey;
    }
    
    public void setAppKey(String appKey)
    {
        this.appKey = appKey;
    }
    
    @Column(name="app_password", length=100)
    public String getAppPassword() 
    {
        return this.appPassword;
    }
    
    public void setAppPassword(String appPassword) 
    {
        this.appPassword = appPassword;
    }
    
    @Column(name="app_other", length=100)
    public String getAppOther() 
    {
        return this.appOther;
    }
    
    public void setAppOther(String appOther) 
    {
        this.appOther = appOther;
    }
    
    @Column(name="app_callback_key", length=100)
    public String getAppCallbackKey() 
    {
        return this.appCallbackKey;
    }
    
    public void setAppCallbackKey(String appCallbackKey) 
    {
        this.appCallbackKey = appCallbackKey;
    }
    
    @Column(name="channel_img", length=300)
    public String getChannelImg() 
    {
        return this.channelImg;
    }
    
    public void setChannelImg(String channelImg) 
    {
        this.channelImg = channelImg;
    }
    
    @Column(name="flag1", length=100)
    public String getFlag1()
    {
        return this.flag1;
    }
    
    public void setFlag1(String flag1)
    {
        this.flag1 = flag1;
    }
    
    @Column(name="flag2", length=100)
    public String getFlag2() 
    {
        return this.flag2;
    }
    
    public void setFlag2(String flag2) 
    {
        this.flag2 = flag2;
    }
    
    @Column(name="flag3", length=100)
    public String getFlag3()
    {
        return this.flag3;
    }
    
    public void setFlag3(String flag3)
    {
        this.flag3 = flag3;
    }
    
    @Column(name="day_total")
    public Integer getDayTotal()
    {
        return this.dayTotal;
    }
    
    public void setDayTotal(Integer dayTotal) 
    {
        this.dayTotal = dayTotal;
    }
    
    @Column(name="cumulative_total")
    public Integer getCumulativeTotal() 
    {
        return this.cumulativeTotal;
    }
    
    public void setCumulativeTotal(Integer cumulativeTotal)
    {
        this.cumulativeTotal = cumulativeTotal;
    }

    @Transient
	public String getLoginName() 
    {
		return loginName;
	}

	public void setLoginName(String loginName) 
	{
		this.loginName = loginName;
	}
	 @Column(name="channel_type", length=100)
	public String getChannelType()
	{
		return channelType;
	}

	public void setChannelType(String channelType) 
	{
		this.channelType = channelType;
	}

	 @Column(name="channel_type_name", length=100)
	public String getChannelTypeName() 
	{
		return channelTypeName;
	}

	public void setChannelTypeName(String channelTypeName) 
	{
		this.channelTypeName = channelTypeName;
	}
	
	@Column(name="system_type")
	public String getSystemType() 
	{
		return systemType;
	}
 
	public void setSystemType(String systemType) 
	{
		this.systemType = systemType;
	}
	 
	@Column(name="is_enable")
	public Integer getIsEnable() 
	{
		return isEnable;
	}

	public void setIsEnable(Integer isEnable)
	{
		this.isEnable = isEnable;
	}
}


