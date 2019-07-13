package com.njit.springboot.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 晓东 on 2019/7/12.
 * QQ:2774398338
 */
@Controller
public class PageController {
    @Autowired
    @Qualifier(value = "demo")
    private DamoBean damoBean;

    @Autowired(required = false)
    @Qualifier("windows")
    private DamoBean damoBean2;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        return "index:"+damoBean.toString();
    }

    @RequestMapping(value = "/condition")
    @ResponseBody
    public String condition(){
        return damoBean2==null?"DamoBean{name='damo'}注入失败":damoBean2.toString();
    }
}
