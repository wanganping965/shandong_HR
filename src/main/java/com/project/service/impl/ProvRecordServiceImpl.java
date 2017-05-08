package com.project.service.impl;

import com.project.model.EnterpriseBasicInformation;
import com.project.service.ProvRecordService;
import org.springframework.stereotype.Service;

/**
 * Created by He Zhentang on 2017/5/8.
 */
@Service("provRecordServiceImpl")
public class ProvRecordServiceImpl implements ProvRecordService {


    //only for test
    @Override
    public boolean exportRecord(EnterpriseBasicInformation enterpriseBasicInformation){
        return true;
    }
}
