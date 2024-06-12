package com.streaming.Streaming;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "playlists")
public class Playlist {
    @Id
    private String id;

    @NotEmpty(message = "User ID cannot be empty")
    private String userId;

    @NotEmpty(message = "Playlist name cannot be empty")
    private String name;

    @NotNull(message = "Playlist items cannot be null")
    private List<String> items; // List of movie or series IDs
}
