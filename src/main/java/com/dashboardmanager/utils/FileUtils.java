package com.dashboardmanager.utils;

import java.nio.file.Path;

public final class FileUtils {

    private static final String IMAGE_PATH = "./public/img/";
    private static final String USER_PATH = "./users/";

    private FileUtils() {
        // Utility class, no instantiation
    }

    public static String getImagePath() {
        return IMAGE_PATH;
    }

    public static String getUserImagePath(String username) {
        String decodedUsername = EncodingUtils.decodeParameter(username);
        Path basePath = Path.of(getImagePath()).normalize().toAbsolutePath();
        Path resolvedPath = basePath.resolve(decodedUsername).normalize().toAbsolutePath();
        if (!resolvedPath.startsWith(basePath)) {
            throw new IllegalArgumentException("Invalid username");
        }
        return resolvedPath.toString();
    }
}
