package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import java.util.List;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiListField;

/**
 * 仪表盘授权
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:26
 */
public class AlipayMarketingDataDashboardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6774998787256685135L;

	/**
	 * 仪表盘ID列表
	 */
	@ApiListField("dashboard_ids")
	@ApiField("string")
	private List<String> dashboardIds;

	public List<String> getDashboardIds() {
		return this.dashboardIds;
	}
	public void setDashboardIds(List<String> dashboardIds) {
		this.dashboardIds = dashboardIds;
	}

}
