package com.le.tomcat;

import com.le.standard.Servlet;

import java.util.Map;

class ServletInitializeTest {

    @org.junit.jupiter.api.Test
    void scanContexts() {
        ServletInitialize.scanContexts();
        Map<String, Context> contextMap = ServletInitialize.getContextMap();
        System.out.println(contextMap);
    }

    @org.junit.jupiter.api.Test
    void parseContextConf(){
        ServletInitialize.scanContexts();
        ServletInitialize.parseContextConf();
        Map<String, Context> contextMap = ServletInitialize.getContextMap();
        for(String contextName : contextMap.keySet()){
            System.out.println("{");
            System.out.println(contextName);
            Context context = contextMap.get(contextName);
            Map<String, Servlet> servletMap = context.servletMap;
            Map<String, Class<?>> servletClassMap = context.servletClassMap;
            System.out.println(servletMap);
            System.out.println(servletClassMap);
            System.out.println("}");
        }
    }

    @org.junit.jupiter.api.Test
    void loadServletClasses() {
    }

    @org.junit.jupiter.api.Test
    void instantiateServletObjects() {
    }

    @org.junit.jupiter.api.Test
    void initializeServletObjects() {
    }

    @org.junit.jupiter.api.Test
    void getDefaultContext() {
    }

    @org.junit.jupiter.api.Test
    void getDefaultServlet() {
    }

    @org.junit.jupiter.api.Test
    void getContextMap() {
    }
}