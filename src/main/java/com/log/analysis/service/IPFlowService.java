package com.log.analysis.service;

import java.util.Date;

import com.log.analysis.pojo.IPFlow;



public interface IPFlowService {

	IPFlow findIPFlowByDatetime(Date datetime);

}
