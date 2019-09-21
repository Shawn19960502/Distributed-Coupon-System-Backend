package com.personal_pj.passbook.service;

import com.personal_pj.passbook.vo.PassTemplate;

/**
 * <h1>Pass Hbase 服务</h1>
 * Created by Shawn Yang.
 */
public interface IHBasePassService {

    /**
     * <h2>将 PassTemplate 写入 HBase</h2>
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     * */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
