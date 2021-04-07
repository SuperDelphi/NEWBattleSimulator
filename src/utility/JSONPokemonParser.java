package utility;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import immutable.entity.Pokemon;
import immutable.type.TypeSet;
import stattled.Types;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class JSONPokemonParser {
    public List<Pokemon> getPokemonsFrom(String path) {
        List<Pokemon> pokemons;
        GsonBuilder gsonBuilder = new GsonBuilder();

        String jsonData = readFile(path);

        // Permet d'associer Species à un désérialiseur customisé
        gsonBuilder.registerTypeAdapter(Pokemon.class, getDeserializer());

        // Permet d'enregistrer le type List<Species> comme valide
        Type speciesListType = new TypeToken<List<Pokemon>>() {
        }.getType();

        Gson gson = gsonBuilder.create();

        pokemons = gson.fromJson(jsonData, speciesListType);

        return pokemons;
    }

    //    Lit le fichier dont le chemin "path" est spécifié en paramètre.
    private String readFile(String path) {
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

        return rawData.toString();
    }

    private JsonDeserializer getDeserializer() {
        return new JsonDeserializer() {
            @Override
            public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                TypeSet typeSet;

                try {
                    if (jsonObject.getAsJsonObject("typeSet").has("secondType")) {
                        typeSet = new TypeSet(
                                jsonObject.getAsJsonObject("typeSet").get("firstType").getAsString(),
                                jsonObject.getAsJsonObject("typeSet").get("secondType").getAsString()
                        );
                    } else {
                        typeSet = new TypeSet(
                                jsonObject.getAsJsonObject("typeSet").get("firstType").getAsString()
                        );
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();

                    typeSet = new TypeSet(
                            Types.NORMAL
                    );
                }

                return new Pokemon(
                        jsonObject.get("id").getAsInt(),
                        jsonObject.get("name").getAsString(),
                        typeSet,
                        jsonObject.get("HP").getAsInt(),
                        jsonObject.get("ATK").getAsInt(),
                        jsonObject.get("DEF").getAsInt(),
                        jsonObject.get("SPA").getAsInt(),
                        jsonObject.get("SPD").getAsInt(),
                        jsonObject.get("SPE").getAsInt()
                );
            }
        };
    }
}
