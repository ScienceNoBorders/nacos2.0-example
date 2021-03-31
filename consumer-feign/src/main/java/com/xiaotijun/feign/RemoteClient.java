package com.xiaotijun.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author XiaoTiJun
 * @date 2021-03-31 11:32
 */

@Service
@FeignClient(name = "service-provider", fallback = RemoteHystrix.class)
public interface RemoteClient {

    @GetMapping("/remoteFeign")
    String remoteFeign();
}
