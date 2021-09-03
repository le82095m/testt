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
            Context context = contextMap.get(contextName);
            Map<String,String> servletToServletClassNameMap = context.getConfig().getServletToServletClassNameMap();
            Map<String,String> urlToServletNameMap = context.getConfig().getUrlToServletNameMap();
            System.out.println(servletToServletClassNameMap);
            System.out.println(urlToServletNameMap);
        }
    }

    @org.junit.jupiter.api.Test
    void loadServletClasses() throws ClassNotFoundException {
        ServletInitialize.scanContexts();
        ServletInitialize.parseContextConf();
        ServletInitialize.loadServletClasses();
        Map<String, Context> contextMap = ServletInitialize.getContextMap();
        for(String contextName : contextMap.keySet()) {
            Map<String, Class<?>> servletClassMap = contextMap.get(contextName).servletClassMap;
            System.out.println(servletClassMap);
        }
    }

    @org.junit.jupiter.api.Test
    void instantiateServletObjects() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ServletInitialize.scanContexts();
        ServletInitialize.parseContextConf();
        ServletInitialize.loadServletClasses();
        ServletInitialize.instantiateServletObjects();
        Map<String, Context> contextMap = ServletInitialize.getContextMap();
        for(String contextName : contextMap.keySet()) {
            Map<String, Servlet> servletMap = contextMap.get(contextName).servletMap;
            System.out.println(servletMap);
        }
    }
}