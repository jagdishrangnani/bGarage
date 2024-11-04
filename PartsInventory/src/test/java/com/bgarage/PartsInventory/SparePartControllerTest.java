package com.bgarage.PartsInventory;

import com.bgarage.PartsInventory.dto.SparePartRequest;
import com.bgarage.PartsInventory.enums.SparePartsType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SparePartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void test_shouldCreateSparePart() throws Exception {
       SparePartRequest sparePartRequest= createSparePartRequest();
       String strSparePartRequest=objectMapper.writeValueAsString(sparePartRequest);
        mockMvc.perform(MockMvcRequestBuilders.post("/v1/api/sparepart")
                .contentType(MediaType.APPLICATION_JSON)
                .content(strSparePartRequest))
                .andExpect(status().isCreated());
    }

    private SparePartRequest createSparePartRequest(){
        return new SparePartRequest(1L,"a1","abc","sdfa", "TWO_WHEELER",10,13.1,"xyz",new Date());
    }

}
