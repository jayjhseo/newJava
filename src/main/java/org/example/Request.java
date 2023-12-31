package org.example;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private String actionCode;
    private Map<String, String> params = new HashMap<>();
    public Request(String command) {
        String[] commandBits = command.split("\\?", 2);
        String actionCode = commandBits[0];

        String[] paramsStrBits = commandBits[1].split("&");
        for (String paramStr : paramsStrBits) {
            String[] paramStrBits = paramStr.split("=", 2);
            String key = paramStrBits[0];
            String value = paramStrBits[1];
            params.put(key, value);
        }
        System.out.println("actionCode : " + actionCode);
        System.out.println("params : " + params);
        //                String[] paramsStrBits = commandBits[1].split("=", 2);
//                params.put(paramsStrBits[0], paramsStrBits[1]);
        }
        public String getActionCode() {
            return this.actionCode;
        }
        public String getParam(String name) {
            return params.get(name);
        }
    }

