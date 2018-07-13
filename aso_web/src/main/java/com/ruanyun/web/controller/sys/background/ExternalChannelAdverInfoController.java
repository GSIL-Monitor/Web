package com.ruanyun.web.controller.sys.background;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruanyun.common.controller.BaseController;
import com.ruanyun.common.model.Page;
import com.ruanyun.common.utils.EmptyUtils;
import com.ruanyun.web.model.TExternalChannelAdverInfo;
import com.ruanyun.web.model.TExternalChannelInfo;
import com.ruanyun.web.service.background.ExternalChannelAdverInfoService;
import com.ruanyun.web.service.background.ExternalChannelInfoService;
import com.ruanyun.web.util.CallbackAjaxDone;
import com.ruanyun.web.util.Constants;

@Controller
@RequestMapping("externalChannelAdverInfo")
public class ExternalChannelAdverInfoController extends BaseController
{
	@Autowired
	private ExternalChannelAdverInfoService externalChannelAdverInfoService;
	@Autowired
	private ExternalChannelInfoService externalChannelInfoService;
	
	@RequestMapping("list")
	public String getChannelAdverInfoList(Page<TExternalChannelAdverInfo> page,TExternalChannelAdverInfo info,Model model)
	{
		addModel(model, "pageList", externalChannelAdverInfoService.queryPageList(page, info));
		addModel(model, "bean", info);
		
		return "pc/externalChannelAdverInfo/list";
	}
	
	/**
	 * 
	 * 功能描述：跳转到增加或者修改
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	@RequestMapping("toedit")
	public String toedit(Integer id, Model model,Integer type,String externalChannelNum) throws Exception
	{
		if(EmptyUtils.isNotEmpty(id))
		{	
			TExternalChannelAdverInfo bean = externalChannelAdverInfoService.getInfoById(id);
			addModel(model, "bean", bean);
			addModel(model, "externalChannelNum", externalChannelNum);
			return "pc/externalChannelAdverInfo/edit";
		}
		else
		{
			addModel(model, "type", type);
			addModel(model, "externalChannelNum", externalChannelNum);
			return "pc/externalChannelAdverInfo/edit";
		}
	}

	/**
	 * 
	 * 功能描述：增加
	 */
	@RequestMapping("saveOrUpdate")
	public void save(TExternalChannelAdverInfo info, Model model, HttpServletResponse response)
	{
		try 
		{
			TExternalChannelInfo tExternalChannelInfo = externalChannelInfoService.getInfoByChannelNum(info.getExternalChannelNum());
			externalChannelAdverInfoService.saveOrupdate(info, tExternalChannelInfo);
			
			super.writeJsonData(response, CallbackAjaxDone.AjaxDone(Constants.STATUS_SUCCESS_CODE, Constants.MESSAGE_SUCCESS, "main_index2", "externalChannelAdverInfo/list", "closeCurrent"));
		}
		catch (Exception e) 
		{
			super.writeJsonData(response, CallbackAjaxDone.AjaxDone(Constants.STATUS_FAILD_CODE, Constants.MESSAGE_FAILED, "", "", ""));
		}
	}
}