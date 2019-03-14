/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: ShopFrequencyResp
 * Author:   17061157_王薛
 * Date:     2018/7/11 20:34
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package com.suning.sntk.dto.esb;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 功能描述：店员首购复购查询响应
 *
 * @author 17061157_王薛
 * @since 2018/7/11
 */
@XStreamAlias("MbfBody")
public class ShopFrequencyResp {

    @XStreamAlias("custList")
    private List<ShopFrequencyInfo> custList;

    public List<ShopFrequencyInfo> getCustList() {
        return custList;
    }

    public void setCustList(List<ShopFrequencyInfo> custList) {
        this.custList = custList;
    }
}
