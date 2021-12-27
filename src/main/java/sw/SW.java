package sw;

import model.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SW {

    @GET("")
    public void getRootUrls(Callback<Root> callback);

    @GET("people/")
    public Call<SWModelList<People>> getAllPeople(@Query("page") int page);

    @GET("people/{id}/")
    public void getPeople(@Path("id") int peopleId,
                          Callback<People> callback);

    @GET("films/")
    public Call<SWModelList<Film>> getAllFilms(@Query("page") int page);

    @GET("films/{id}/")
    public void getFilm(@Path("id") int filmId,
                        Callback<Film> callback);

    @GET("starships")
    public Call<SWModelList<StarShips>> getAllStarships(@Query("page") int page);

    @GET("starships/{id}/")
    public void getStarship(@Path("id") int starshipId,
                            Callback<StarShips> callback);
}
