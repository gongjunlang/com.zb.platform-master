/*
 * Copyright 2011-2016 ZuoBian.com All right reserved. This software is the confidential and proprietary information of
 * ZuoBian.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with ZuoBian.com.
 */
package com.zb.app.web.vo;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.zb.app.common.core.CustomToStringStyle;

/**
 * @author zxc Jul 18, 2014 2:08:35 PM
 */
public class SiteCoreVO {

    // 站点信息
    private Long              sId;      // 站点ID
    private String            sName;    // 站点名称
    private String            sProvince; // 站点省
    private String            sCity;    // 站点市
    private Integer           sSort;    // 排序

    private List<ChufaCoreVO> chufaList;

    public SiteCoreVO() {

    }

    public SiteCoreVO(Long sId, String sName, String sProvince, String sCity, Integer sSort, List<ChufaCoreVO> chufaList) {
        setsId(sId);
        setsName(sName);
        setsProvince(sProvince);
        setsSort(sSort);
        setChufaList(chufaList);
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsProvince() {
        return sProvince;
    }

    public void setsProvince(String sProvince) {
        this.sProvince = sProvince;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public Integer getsSort() {
        return sSort;
    }

    public void setsSort(Integer sSort) {
        this.sSort = sSort;
    }

    public List<ChufaCoreVO> getChufaList() {
        return chufaList;
    }

    public void setChufaList(List<ChufaCoreVO> chufaList) {
        this.chufaList = chufaList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomToStringStyle());
    }
}
