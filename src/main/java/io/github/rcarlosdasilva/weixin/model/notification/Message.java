package io.github.rcarlosdasilva.weixin.model.notification;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 微信通知消息中，消息相关内容.
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
@XStreamAlias("message")
public class Message {

  @XStreamAlias("MsgId")
  private long messageId;
  @XStreamAlias("Content")
  private String content;
  @XStreamAlias("MediaId")
  private String mediaId;
  @XStreamAlias("ThumbMediaId")
  private String mediaThumbId;
  @XStreamAlias("PicUrl")
  private String picUrl;
  @XStreamAlias("Format")
  private String format;
  @XStreamAlias("Recognition")
  private String recognition;
  @XStreamAlias("Title")
  private String title;
  @XStreamAlias("Description")
  private String description;
  @XStreamAlias("Url")
  private String url;
  @XStreamAlias("Location_X")
  private double locationX;
  @XStreamAlias("Location_Y")
  private double locationY;
  @XStreamAlias("Scale")
  private int scale;
  @XStreamAlias("Label")
  private String address;

  /**
   * 消息id，64位整型 (MsgId).
   */
  public long getMessageId() {
    return messageId;
  }

  /**
   * 消息媒体id，可以调用多媒体文件下载接口拉取该媒体 (MediaID).
   */
  public String getMediaId() {
    return mediaId;
  }

  /**
   * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据 (ThumbMediaId).
   */
  public String getMediaThumbId() {
    return mediaThumbId;
  }

  /**
   * 文本消息内容 (Content).
   */
  public String getContent() {
    return content;
  }

  /**
   * 图片链接（由系统生成） (PicUrl).
   */
  public String getPicUrl() {
    return picUrl;
  }

  /**
   * 语音格式，如amr，speex等 (Format).
   */
  public String getFormat() {
    return format;
  }

  /**
   * 语音识别结果，UTF8编码 (recognition).
   */
  public String getRecognition() {
    return recognition;
  }

  /**
   * 消息标题 (Title).
   */
  public String getTitle() {
    return title;
  }

  /**
   * 消息描述 (Description).
   */
  public String getDescription() {
    return description;
  }

  /**
   * 消息链接 (Url).
   */
  public String getUrl() {
    return url;
  }

  /**
   * 地理位置维度.
   */
  public double getLocationX() {
    return locationX;
  }

  /**
   * 地理位置经度.
   */
  public double getLocationY() {
    return locationY;
  }

  /**
   * 地图缩放大小.
   */
  public int getScale() {
    return scale;
  }

  /**
   * 地理位置信息.
   */
  public String getAddress() {
    return address;
  }

}