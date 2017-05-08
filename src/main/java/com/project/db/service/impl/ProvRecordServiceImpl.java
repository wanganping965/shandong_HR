package com.project.db.service.impl;

import com.project.db.model.EnterpriseBasicInformation;
import com.project.db.service.ProvRecordService;
import org.springframework.stereotype.Service;

/**
 * Created by He Zhentang on 2017/5/8.
 */
@Service("provRecordServiceImpl")
public class ProvRecordServiceImpl implements ProvRecordService {



    @Override
    public boolean exportRecord(EnterpriseBasicInformation enterpriseBasicInformation){
        return true;
    }
}
