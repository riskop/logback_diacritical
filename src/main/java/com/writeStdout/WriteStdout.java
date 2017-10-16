package com.writeStdout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteStdout {

public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(WriteStdout.class);

    logger.debug("This is a text without diacritical letters.");
    logger.debug("This is a text with diacritical letters żółć żółć.");
    logger.debug("This is a text without diacritical letters.");
    logger.debug(
            "This is a text with diacritical letters ślężańską źródłowość.");
    logger.debug("This is a text without diacritical letters.");
    }
}