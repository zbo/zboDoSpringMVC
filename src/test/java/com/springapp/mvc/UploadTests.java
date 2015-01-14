package com.springapp.mvc;

import com.springapp.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class UploadTests {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void upload() throws Exception {
        mockMvc.perform(get("/upload"))
                .andExpect(status().isOk())
                .andExpect(view().name("upload/upload"));
    }

    @Test
    public void receive_file() throws Exception {
        User user = new User("bob", "zbo", "123", "456");
        MockMultipartFile file = new MockMultipartFile("file", "original_filename.ext", null, "data".getBytes());
        mockMvc.perform(fileUpload("/receive", user).file(file))
                .andExpect(status().isOk())
                .andExpect(view().name("upload/receive"));
    }

    @Test
    public void receive_file_and_user() throws Exception {
        MockMultipartFile file = new MockMultipartFile("file", "original_filename.ext", "multipart/form-data", "data".getBytes());
        mockMvc.perform(fileUpload("/receive").file(file)
                .param("username", "zbo")
                .param("nickname", "bob")
                .param("password", "123")
                .param("email", "zbo2@qq.com"))
                .andExpect(status().isOk())
                .andExpect(view().name("upload/receive"));
    }
}