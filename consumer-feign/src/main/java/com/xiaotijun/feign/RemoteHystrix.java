package com.xiaotijun.feign;

import org.springframework.stereotype.Component;

/**
 * @author XiaoTiJun
 * @date 2021-03-31 11:34
 */
@Component
public class RemoteHystrix implements RemoteClient{

    @Override
    public String remoteFeign() {
        return "请求超时！！！！";
    }
}
