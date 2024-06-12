package com.streaming.Streaming;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class JUnit5Tests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreatePlaylist() throws Exception {
        String playlistJson = "{\"userId\":\"user1\",\"name\":\"Favorites\",\"items\":[\"movie1\",\"movie2\"]}";
        mockMvc.perform(post("/api/playlists")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(playlistJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Favorites"));
    }

    @Test
    void shouldReturnPlaylistsForUser() throws Exception {
        mockMvc.perform(get("/api/playlists/user/user1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());
    }
}
