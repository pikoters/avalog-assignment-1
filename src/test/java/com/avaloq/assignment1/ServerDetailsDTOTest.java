package com.avaloq.assignment1;

import com.avaloq.assignment1.controller.dto.ServerDetails;
import org.hamcrest.core.AllOf;
import org.junit.Before;
import org.junit.Test;


import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ServerDetailsDTOTest {

    @Before
    public void setUp() throws Exception {}

    @Test
    public void testServerDetails() throws Exception {
        assertNotNull(new ServerDetails());
        assertThat(ServerDetails.class, AllOf.allOf(
                hasValidBeanConstructor(),
                hasValidBeanEquals(),
                hasValidBeanToString(),
                hasValidGettersAndSetters()));
    }
}
