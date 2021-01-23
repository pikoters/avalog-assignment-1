package com.avaloq.assignment1;

import com.avaloq.assignment1.controller.ServerDetailsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = ServerDetailsController.class)
public class ServerDetailsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldRetrieveServerDetails() throws Exception {
        this.mockMvc.perform(get("/server/details"))
                .andExpect(status().isOk());
//                .andExpect()
    }


}
