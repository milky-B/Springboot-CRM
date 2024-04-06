package com.gdut.crm.controller.workbeanch;

import com.alibaba.fastjson.JSONObject;
import com.gdut.crm.commons.constants.ConstantsMessage;
import com.gdut.crm.pojo.Menu;
import com.gdut.crm.pojo.MenuVo;
import com.gdut.crm.service.user.impl.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class WorkbenchController {
    @Autowired
    private UserService userService;

    @RequestMapping("/workbench/index.do")
    public String index(HttpServletRequest request) {
        List<MenuVo> menus = userService.menuList();
        request.setAttribute("menus", menus);
//        log.info(JSONObject.toJSONString(menus));
        return "workbench/index";
    }


    @RequestMapping("workbench/main/index.do")
    public String mainIndex() {
        return "workbench/main/index";
    }
}
