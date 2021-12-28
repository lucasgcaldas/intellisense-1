package application;

import model.Film;
import model.People;
import model.SWModelList;
import model.StarShips;
import retrofit2.Call;
import retrofit2.Response;
import sw.SW;
import sw.SWApi;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<List<String>> stringList = new ArrayList<>();

        SWApi.init();
        SW api = SWApi.getApi();

        for (int i = 1; i <= 6; i++) {
            Call<SWModelList<Film>> film = api.getAllFilms(i);

            Response<SWModelList<Film>> response = film.execute();

            SWModelList<Film> body = response.body();

            if (body != null) {
                ArrayList<Film> results = body.getResults();

                for (Film f : results) {
                    stringList.add(f.getCharactersUrls());
                }
            }
        }

        isEqual(stringList);
        System.out.println();
        System.out.println(" ------------------- ");
        System.out.println();
        pilots();
    }

    public static void isEqual(List<List<String>> stringList) throws IOException {
        List<String> allStrings = new ArrayList<>();
        List<String> repeated;

        for (List<String> sL : stringList) {
            allStrings.addAll(sL);
        }

        repeated = allStrings.stream()
                .filter(e -> Collections.frequency(allStrings, e) > 5)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Appear six times: " + repeated.size() + " characters");
        System.out.println(repeated);

        names();
    }

    public static void names() throws IOException {
        SWApi.init();
        SW api = SWApi.getApi();

        Call<SWModelList<People>> people = api.getAllPeople(1);

        Response<SWModelList<People>> response = people.execute();

        SWModelList<People> body = response.body();

        if (body != null) {
            ArrayList<People> results = body.getResults();
            System.out.println("Who appear the most in the SW are: " + results.get(1).getName() + ", " +
                    results.get(2).getName() + ", " + results.get(9).getName());
        }
    }

    public static void pilots() throws IOException {
        List<List<String>> stringList = new ArrayList<>();

        SWApi.init();
        SW api = SWApi.getApi();

        Call<SWModelList<StarShips>> starship = api.getAllStarships(1);

        Response<SWModelList<StarShips>> response = starship.execute();

        SWModelList<StarShips> body = response.body();

        if (body != null) {
            ArrayList<StarShips> results = body.getResults();

            for (StarShips s : results) {
                if (s.getName().equals("Millennium Falcon")){
                    stringList.add(s.getPilots());
                }
            }
        }

        System.out.println(stringList);
        System.out.println("The pilots name are: " + people(stringList));
    }

    public static List<String> people(List<List<String>> stringList) throws IOException {
        List<String> names = new ArrayList<>();

        SWApi.init();
        SW api = SWApi.getApi();

        for (int i = 1; i <= 10; i++) {
            Call<SWModelList<People>> people = api.getAllPeople(i);

            Response<SWModelList<People>> response = people.execute();

            SWModelList<People> body = response.body();

            if (body != null) {
                ArrayList<People> results = body.getResults();
                if (i == 2){
                    names.add(results.get(2).getName());
                    names.add(results.get(3).getName());
                } else if(i == 3){
                    names.add(results.get(3).getName()); //25 - 12
                    names.add(results.get(9).getName()); //31 - 22
                }
            }
        }

        return names;
    }
}
