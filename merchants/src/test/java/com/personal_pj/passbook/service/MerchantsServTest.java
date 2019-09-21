package com.personal_pj.passbook.service;

import com.alibaba.fastjson.JSON;
import com.personal_pj.passbook.vo.CreateMerchantsRequest;
import com.personal_pj.passbook.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <h1>商户服务测试类</h1>
 * Created by Shawn Yang.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ merchantsServ;

    /**
     * {"data":{"id":7},"errorCode":0,"errorMsg":""}
     * {"data":{"id":8},"errorCode":0,"errorMsg":""}
     * */
    @Test
//    @Transactional
    public void testCreateMerchantServ() {

        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("personal_pj");
        request.setLogoUrl("www.personal_pj.com");
        request.setBusinessLicenseUrl("www.personal_pj.com");
        request.setPhone("1234567890");
        request.setAddress("北京市");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

    /**
     * {"data":{"address":"北京市",
     * "businessLicenseUrl":"www.personal_pj.com","id":9,"isAudit":false,
     * "logoUrl":"www.personal_pj.com",
     * "name":"personal_pj","phone":"1234567890"},"errorCode":0,"errorMsg":""}
     * */
    @Test
    public void testBuildMerchantsInfoById() {

        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(9)));
    }

    /**
     * DropPassTemplates: {"background":2,"desc":"详情: personal_pj",
     * "end":1528202373202,"hasToken":false,"id":9,"limit":10000,
     * "start":1527338373202,"summary":"简介: personal_pj","title":"title: personal_pj"}
     * */
    @Test
    public void testDropPassTemplate() {

        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(9);
        passTemplate.setTitle("personal_pj-1");
        passTemplate.setSummary("简介: personal_pj");
        passTemplate.setDesc("详情: personal_pj");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(DateUtils.addDays(new Date(), -10));
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));

        System.out.println(JSON.toJSONString(
                merchantsServ.dropPassTemplate(passTemplate)
        ));
    }
}
