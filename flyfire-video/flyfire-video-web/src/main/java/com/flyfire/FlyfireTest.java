package com.flyfire;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;


/**
 * @author : lidong.zhang ; Email : zhangld@roiwoods.com.
 * @version : 1.0
 * @Date : 17/8/1
 * @Description : class annotation
 */
@Slf4j
public class FlyfireTest {

    @Test
    public  void main(String[] args) {
        log.info("info....");
        log.error("error....");
        log.debug("error....");
        log.warn("warn...");

        /*log.log(Level.FINE,"FINE....");
        log.log(Level.CONFIG,"CONFIG....");
        log.log(Level.OFF,"OFF....");
        log.log(Level.FINEST,"FINEST....");
        log.warning("warning....");*/
        System.err.println("------");
    }
}
