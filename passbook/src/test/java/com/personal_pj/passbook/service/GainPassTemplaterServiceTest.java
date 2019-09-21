package com.personal_pj.passbook.service;

import com.alibaba.fastjson.JSON;
import com.personal_pj.passbook.vo.GainPassTemplateRequest;
import com.personal_pj.passbook.vo.PassTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <h1>用户领取优惠券功能测试</h1>
 * Created by Shawn Yang.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GainPassTemplaterServiceTest extends AbstractServiceTest {

    @Autowired
    private IGainPassTemplateService gainPassTemplateService;

    @Test
    public void testGainPassTemplate() throws Exception {

        PassTemplate target = new PassTemplate();
        target.setId(9);
        target.setTitle("personal_pj-2");
        target.setHasToken(true);

        System.out.println(JSON.toJSONString(
                gainPassTemplateService.gainPassTemplate(
                        new GainPassTemplateRequest(userId, target)
                )
        ));
    }
}
