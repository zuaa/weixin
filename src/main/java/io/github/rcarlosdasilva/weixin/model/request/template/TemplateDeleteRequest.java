package io.github.rcarlosdasilva.weixin.model.request.template;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicRequest;

/**
 * 删除模板请求模型
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
public class TemplateDeleteRequest extends BasicRequest {

  @SerializedName("template_id")
  private String id;

  public TemplateDeleteRequest() {
    this.path = ApiAddress.URL_TEMPLATE_DELETE;
  }

  public void setId(String id) {
    this.id = id;
  }

}
