package com.nicebin.user.feign_client;

import com.nicebin.common.entity.ResultJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author DiaoJianBin
 * @Description 访问BusinessService服务的接口
 * @Date 2021/3/11 11:23
 */
@FeignClient(value = "business-service",path = "/test",decode404 = true)
public interface BusinessServiceTestClient {

    @RequestMapping(value = "/testFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ResultJson testFile(@RequestPart(value = "files") MultipartFile[] files,@RequestParam(value = "msg") String msg);
}