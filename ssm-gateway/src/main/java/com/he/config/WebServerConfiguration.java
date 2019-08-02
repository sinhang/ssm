//package com.he.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.catalina.connector.Connector;
//import org.apache.catalina.core.AprLifecycleListener;
//import org.apache.coyote.http11.Http11AprProtocol;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.net.Inet4Address;
//import java.net.UnknownHostException;
//import java.nio.charset.Charset;
//
//@Configuration
//@Slf4j
//public class WebServerConfiguration {
//
//    @Bean
//    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory() {
//        TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory();
//        tomcatFactory.setPort(9001);
//        tomcatFactory.setProtocol("org.apache.coyote.http11.Http11AprProtocol");
//        try {
//            tomcatFactory.setAddress(Inet4Address.getLocalHost());
//        } catch (UnknownHostException e) {
//            log.error("WebServerConfiguration",e);
//        }
//        AprLifecycleListener aprLifecycleListener = new AprLifecycleListener();
//
//        tomcatFactory.setUriEncoding(Charset.forName("UTF-8"));
//
//        tomcatFactory.addContextLifecycleListeners(aprLifecycleListener);
//
//
//        tomcatFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
//
//        return tomcatFactory;
//    }
//
//}
//
//class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer
//{
//    @Override
//    public void customize(Connector connector) {
//        connector.setEnableLookups(true);
//        Http11AprProtocol protocol = (Http11AprProtocol) connector.getProtocolHandler();
//        //设置最大连接数
//        protocol.setMaxConnections(2000);
//        //设置最大线程数
//        protocol.setMaxThreads(800);
//        protocol.setMinSpareThreads(100);
//
//        protocol.setConnectionTimeout(10000);
//        protocol.setAcceptCount(1500);
//        protocol.setCompression("on");
//        protocol.setCompressibleMimeType("text/html,text/xml,text/javascript,text/css,text/plain,application/json");
//        protocol.setCompressionMinSize(2048);
//    }
//
//}