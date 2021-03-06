package io.github.rcarlosdasilva.weixin.model.request.common;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.common.Convention;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicRequest;

/**
 * 短连接请求模型
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
public class ShortUrlRequest extends BasicRequest {

  @SerializedName("action")
  private String action = Convention.SHROT_URL_ACTION;
  @SerializedName("long_url")
  private String url;

  public ShortUrlRequest() {
    this.path = ApiAddress.URL_COMMON_SHORT_URL;
  }

  /**
   * 要转换的连接.
   * 
   * @param url
   *          url
   */
  public void setUrl(String url) {
    this.url = url;
  }

}
