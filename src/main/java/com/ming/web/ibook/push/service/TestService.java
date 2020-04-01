package com.ming.web.ibook.push.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Hortons
 * on 2020/3/22
 */

@Path("/test")
public class TestService extends BaseService {

    @GET
    @Path("/path")
    public String test() {
        return "测试成功";
    }
}
