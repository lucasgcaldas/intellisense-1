package sw;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SWApi {

    private SW mSwApi;
    private static SWApi sInstance;

    private SWApi() {

        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(APIConstants.BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mSwApi = restAdapter.create(SW.class);
    }

    public static void init() {
        sInstance = new SWApi();
    }

    public static SW getApi() {
        return sInstance.mSwApi;
    }

    public void setApi(SW starWarsApi) {
        sInstance.mSwApi = starWarsApi;
    }
}
