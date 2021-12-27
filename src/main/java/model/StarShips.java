package model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class StarShips {

    @SerializedName("name")
    private String name;

    @SerializedName("pilots")
    private List<String> pilots;

    public String getName() {
        return name;
    }

    public List<String> getPilots() {
        return pilots;
    }
}
