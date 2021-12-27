package model;

import java.util.ArrayList;
import lombok.Data;

@Data
public class SWModelList<T> {

    private int count;
    private String next;
    private String previous;
    private ArrayList<T> results;

    public boolean hasMore() {
        return (next != null && next.length() != 0);
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public ArrayList<T> getResults() {
        return results;
    }
}
