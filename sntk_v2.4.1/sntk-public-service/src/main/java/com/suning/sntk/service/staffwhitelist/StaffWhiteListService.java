/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: StaffWhiteListService
 * Author:   88402362 欧小冬
 * Date:
 * Description: //模块目的、功能描述
 * History: //修改记录
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * 修改人姓名             修改时间            版本号                  描述
 */

package com.suning.sntk.service.staffwhitelist;

import com.suning.sntk.entity.staffwhitelist.Staff;
import com.suning.store.dal.service.DalService;

/**
 * 功能描述：
 *
 * @author 88402362_欧小冬
 * @since 2018/7/11
 */
public interface StaffWhiteListService extends DalService<Staff,Long> {

    /**
     * 功能描述：根据店员工号和门店编号查询店员白名单数据
     *
     * @author 88402362 欧小冬
     * @since 2018/7/11
     */
    Staff queryByStaffIdWithStore(String staffId ,String storeCode);
}
