package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 洗车保养门店查询
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:01
 */
public class AlipayEcoMycarMaintainShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5287721681298386627L;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
