package com.jeecg.p3.system.entity;

import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>JwSystemActTxt:系统文本表<br>
 * @author junfeng.zhou
 * @since：2015年11月11日 11时11分51秒 星期三 
 * @version:1.0
 */
public class JwSystemActTxt implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	
	public String getDiscribe() {
		return discribe;
	}
	public void setDiscribe(String discribe) {
		this.discribe = discribe;
	}
	//update-begin--Author:huangqingquan  Date:2016-7-22 15:00:22 for：添加文本类型
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "JwSystemActTxt [id=" + id + ", code=" + code + ", content="
				+ content + ", discribe=" + discribe + ", actCode=" + actCode
				+ ", creatName=" + creatName + ", creatTime=" + creatTime
				+ ", updateName=" + updateName + ", updateTime=" + updateTime
				+ ", type=" + type + "]";
	}
	//update-end--Author:huangqingquan  Date:2016-7-22 15:00:22 for：添加文本类型
}
