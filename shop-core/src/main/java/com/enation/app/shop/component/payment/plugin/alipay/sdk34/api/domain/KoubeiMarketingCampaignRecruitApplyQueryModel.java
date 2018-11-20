package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 招商商家报名分页查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-20 13:51:20
 */
public class KoubeiMarketingCampaignRecruitApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4239453998826776498L;

	/**
	 * 运营活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 分页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小,最大值200
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
