package com.dashboardmanager.utils;

import org.apache.tomcat.util.buf.UDecoder;

import java.nio.charset.StandardCharsets;

public class EncodingUtils {

    private EncodingUtils() {
    }

    public static String decodeParameter(String param) {
        return UDecoder.URLDecode(param, StandardCharsets.UTF_8);
    }
}
