package model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class People {

    @SerializedName("name")
    private String name;

    @SerializedName("films")
    private List<String> filmsUrls;

    public String getName() {
        return name;
    }

    public List<String> getFilmsUrls() {
        return filmsUrls;
    }
}
