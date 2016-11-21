package com.log.analysis.service;

import java.util.Date;

import com.log.analysis.pojo.DateProfile;

public interface DateProfileService {

	DateProfile findByDatetime(Date datetime);

}
