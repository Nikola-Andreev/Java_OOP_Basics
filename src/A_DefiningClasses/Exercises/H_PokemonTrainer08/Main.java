package A_DefiningClasses.Exercises.H_PokemonTrainer08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        while (true){
            String[] pokemonTokens = scan.readLine().split("\\s+");
            if ("Tournament".equals(pokemonTokens[0])) break;

            String trainerName = pokemonTokens[0];
            String pokemonName = pokemonTokens[1];
            String pokemonElement = pokemonTokens[2];
            Integer pokemonHealth = Integer.valueOf(pokemonTokens[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer.adPokemon(pokemon);

            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).adPokemon(pokemon);
            } else {
                trainers.put(trainerName, trainer);
            }
        }

        while (true) {
            String element = scan.readLine();
            if ("End".equals(element)) break;
            for (String s : trainers.keySet()) {
                if (trainers.get(s).checkForElement(element)){
                    trainers.get(s).adBadge();
                } else {
                    trainers.get(s).increaseHealth();
                }
            }
        }

        trainers.entrySet().stream().sorted((t1, t2) -> {
            return Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges());
        }).forEach(trainer -> System.out.println(trainer.getValue()));
    }
}