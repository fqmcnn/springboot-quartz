package com.panion.space.service;

import com.github.pagehelper.PageInfo;
import com.panion.space.entity.JobAndTrigger;

public interface IJobAndTriggerService {
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
