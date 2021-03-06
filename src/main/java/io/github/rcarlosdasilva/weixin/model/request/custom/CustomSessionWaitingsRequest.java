package io.github.rcarlosdasilva.weixin.model.request.custom;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicRequest;

/**
 * 获取未接入会话列表请求模型
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
public class CustomSessionWaitingsRequest extends BasicRequest {

  public CustomSessionWaitingsRequest() {
    this.path = ApiAddress.URL_CUSTOM_SESSION_WAITINGS;
  }

}
