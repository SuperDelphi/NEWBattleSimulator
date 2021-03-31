package utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import immutable.entity.Species;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class JSONPokemonParser {
    public List<Species> getPokemonsFrom(String path) {
        List<Species> pokemons;
        Gson gson = new Gson();
        StringBuilder rawData = new StringBuilder();

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                rawData.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        Type speciesListType = new TypeToken<List<Species>>(){}.getType();

        pokemons = gson.fromJson(rawData.toString(), speciesListType);
//        System.out.println(rawData);
        return pokemons;
    }
}
