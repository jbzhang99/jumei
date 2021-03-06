package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import java.util.List;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiListField;

/**
 * 个性化菜单创建
 *
 * @author auto create
 * @since 1.0, 2017-05-25 11:40:27
 */
public class AlipayOpenPublicPersonalizedMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8178837935629975432L;

	/**
	 * 一级菜单列表。最多有4个一级菜单，若开发者在后台打开了"咨询反馈"的开关，则只能有3个一级菜单。
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	/**
	 * 菜单类型，支持值为icon：icon型菜单，text：文本型菜单，不传时默认为"text"，当传值为"icon"时，菜单节点的icon字段必传。
	 */
	@ApiField("type")
	private String type;

	public List<ButtonObject> getButton() {
		return this.button;
	}
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

	public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
