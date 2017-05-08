package com.project.controller;

import com.project.service.impl.ProvRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by He Zhentang on 2017/5/7.
 */
@Controller
//拦截http://localhost/province
@RequestMapping("/province")
public class ProvinceController {
    private ProvRecordServiceImpl provRecordServiceImpl;
    @Autowired
    public void setProvRecordServiceImpl(@Qualifier("provRecordServiceImpl") ProvRecordServiceImpl provRecordServiceImpl) {
        this.provRecordServiceImpl = provRecordServiceImpl;
    }

    //http://localhost/province/overview
    @RequestMapping("overview")
    public String gotoLogin() {
        //if successful, turn to page prov_record_overview with matching records
        //otherwise return failed and stay still
        return "prov_record_overview";
    }

}
