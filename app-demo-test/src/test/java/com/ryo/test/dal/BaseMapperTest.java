package com.ryo.test.dal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author houbinbin
 * @on 16/12/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-dal.xml"})
public class BaseMapperTest {
    protected final Logger LOGGER = LogManager.getLogger(this.getClass());
}
