package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 券可用时间
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class UseTime extends AlipayObject {

	private static final long serialVersionUID = 5812392999788259115L;

	/**
	 * 券可用时段时间维度，目前支持周(W)
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 券可用时间段
可用时间段起止时间用逗号分隔，多个时间段之间用^分隔
如, "16:00:00,20:00:00^21:00:00,22:00:00"表示16点至20点，21点至22点可用
时间段不可重叠
	 */
	@ApiField("times")
	private String times;

	/**
	 * 券可用时间维度值
周维度的取值范围1-7(周一至周日)，多个可用时段用逗号分隔
如"1,3,5"，对应周一，周三，周五可用
	 */
	@ApiField("values")
	private String values;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
