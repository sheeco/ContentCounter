package pers.sunyunmiao.qfc.contentcounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pers.sunyunmiao.qfc.contentcounter.entity.CountResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RecordController {

	@RequestMapping("/query")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //调用service查找数据库，查询商品列表，这里使用静态数据模拟
        List<CountResult> listCountResults = new ArrayList<CountResult>();

        //向list中填充静态数据
        CountResult countResult_1 = new CountResult();
        CountResult countResult_2 = new CountResult();

        listCountResults.add(countResult_1);
        listCountResults.add(countResult_2);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过records取数据
        modelAndView.addObject("results", listCountResults);

        //指定视图
        modelAndView.setViewName("results");

        return modelAndView;
    }
}
