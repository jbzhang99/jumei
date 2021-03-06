package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 上数元数据信息同步服务
 *
 * @author auto create
 * @since 1.0, 2017-04-06 17:03:36
 */
public class SsdataDataserviceMetainfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2421967177585931394L;

	/**
	 * 元数据信息
	 */
	@ApiField("meta_info")
	private String metaInfo;

	public String getMetaInfo() {
		return this.metaInfo;
	}
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
