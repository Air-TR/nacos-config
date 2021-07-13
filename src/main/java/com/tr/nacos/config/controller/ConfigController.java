package com.tr.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtao
 * @date 2021/6/30 18:00
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.value}")
    private String configValue;

    @GetMapping("/config/get")
    public String get() {
        return configValue;
    }

    @Value("${basket.info}")
    private String basketInfo;

    @GetMapping("/config/getInfo")
    public String getInfo() {
        return basketInfo;
    }

}
