package com.log.analysis.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.log.analysis.pojo.DateProfile;
import com.log.analysis.pojo.IPFlow;
import com.log.analysis.pojo.PageVisit;
import com.log.analysis.service.DateProfileService;
import com.log.analysis.service.IPFlowService;
import com.log.analysis.service.PageVisitService;
import com.log.analysis.utils.JsonUtils;

@Controller
@RequestMapping("/log")
public class PageController {

	@Autowired
	private DateProfileService dateProfileService;
	
	@Autowired
	private IPFlowService ipFlowService;
	
	@Autowired
	private PageVisitService pageVisitService;
	
	// 数据总览
	@RequestMapping("/dataProfile/{datetime}")
	@ResponseBody
	public String getDataProfileByDatetime(@PathVariable Date datetime){
		
		DateProfile dataProfile = dateProfileService.findByDatetime(datetime);
		String dataProfileJson = JsonUtils.objectToJson(dataProfile);
		return dataProfileJson;
		
	}
	
	//IP流量分析
	@RequestMapping("/IPFlowAnalysis/{datetime}")
	@ResponseBody
	public String getIPFlowByDatetime(@PathVariable Date datetime){
		
		IPFlow ipFlow = ipFlowService.findIPFlowByDatetime(datetime);
		String ipFlowJson = JsonUtils.objectToJson(ipFlow);
		return ipFlowJson;
	}
	
	//页面访问分析
	@RequestMapping("/pageVisitAnalysis/{datetime}")
	@ResponseBody
	public String getPageVisitResultByDateTime(@PathVariable Date datetime)
	{
		PageVisit pageVisit = pageVisitService.findPageVisitByDatetime(datetime);
		String pageVisitJson = JsonUtils.objectToJson(pageVisit);
		return pageVisitJson;
	}
}
