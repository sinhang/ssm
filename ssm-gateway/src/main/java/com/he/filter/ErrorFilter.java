package com.he.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ErrorFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "error";
    }


    @Override
    public int filterOrder() {
        return 0;
    }


    @Override
    public boolean shouldFilter() {
        //  是否执行该过滤器，true代表需要过滤
        return true;
    }

    @Override
    public Object run() {

        RequestContext requestContext = RequestContext.getCurrentContext();

        String requestUri = (String) requestContext.get("requestURI");

        log.error("request uri error: {}", requestUri);

        return null;
    }
}
