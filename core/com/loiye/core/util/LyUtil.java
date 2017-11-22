package com.loiye.core.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LyUtil {
    private static final Logger logger = LogManager.getLogger(LyUtil.class);

    public static void main(String[] args) {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
