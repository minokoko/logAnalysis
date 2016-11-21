package com.log.analysis.service;

import java.util.Date;

import com.log.analysis.pojo.PageVisit;

public interface PageVisitService {

	PageVisit findPageVisitByDatetime(Date datetime);

}
