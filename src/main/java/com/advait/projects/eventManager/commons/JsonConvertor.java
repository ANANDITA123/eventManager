package com.advait.projects.eventManager.commons;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class JsonConvertor {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private JsonConvertor(){

    }

    public static <T> String convertObjectToJson(T object) throws IOException {
        ObjectWriter write = OBJECT_MAPPER.writer();
        return write.writeValueAsString(object);
    }

    public static <T> T convertJsonToObject(String json, Class<T> type) throws IOException{
        if(json != null && !"".equals(json)){
            return OBJECT_MAPPER.readValue(json, type);
        }
        return null;
    }
}
