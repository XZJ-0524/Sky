package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AliOssProperties {  //通过配置属性类引入配置属性封装在对象中并交给IOC容器管理

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

}
