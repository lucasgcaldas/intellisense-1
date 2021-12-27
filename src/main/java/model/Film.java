package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import lombok.Data;

@Data
public class Film {

    @SerializedName("title")
    private String title;

    @SerializedName("characters")
    private List<String> charactersUrls;

    public String getTitle() {
        return title;
    }

    public List<String> getCharactersUrls() {
        return charactersUrls;
    }
}
