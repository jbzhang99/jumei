package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:46:36
 */
public class Product extends AlipayObject {

	private static final long serialVersionUID = 3473827561229219153L;

	/**
	 * 油品编号。（可设置的油品编号名称：89#，92#，95#，98#，101#，10#，5#，0#，-10#，-20#，-35#，-50#）。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 油品价格（元/升），加油站列表页展示给用户。保留小数点后两位，单位元
	 */
	@ApiField("price")
	private String price;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
