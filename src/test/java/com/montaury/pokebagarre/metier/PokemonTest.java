package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {

    @Test
    void premier_pokemon_devrait_gagner_gagner_avec_meilleure_attaque()
    {
        //GIVEN
        Pokemon pokemon1 =  new Pokemon("", "", new Stats(15,10));
        Pokemon pokemon2 =  new Pokemon("", "", new Stats(10,15));

        //WHEN
        boolean est_vainqueur_pokemon_1 = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(est_vainqueur_pokemon_1).isTrue();
    }

    @Test
    void deuxieme_pokemon_devrait_gagner_gagner_avec_meilleure_attaque()
    {
        //GIVEN
        Pokemon pokemon1 =  new Pokemon("", "", new Stats(15,10));
        Pokemon pokemon2 =  new Pokemon("", "", new Stats(20,10));

        //WHEN
        boolean est_vainqueur_pokemon_2 = pokemon2.estVainqueurContre(pokemon1);

        //THEN
        assertThat(est_vainqueur_pokemon_2).isTrue();
    }

    @Test
    void premier_pokemon_devrait_gagner_gagner_avec_meilleure_defense()
    {
        //GIVEN
        Pokemon pokemon1 =  new Pokemon("", "", new Stats(15,15));
        Pokemon pokemon2 =  new Pokemon("", "", new Stats(15,10));

        //WHEN
        boolean est_vainqueur_pokemon_1 = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(est_vainqueur_pokemon_1).isTrue();
    }

    @Test
    void deuxieme_pokemon_devrait_gagner_gagner_avec_meilleure_defense()
    {
        //GIVEN
        Pokemon pokemon1 =  new Pokemon("", "", new Stats(15,10));
        Pokemon pokemon2 =  new Pokemon("", "", new Stats(15,15));

        //WHEN
        boolean est_vainqueur_pokemon_2 = pokemon1.estVainqueurContre(pokemon1);

        //THEN
        assertThat(est_vainqueur_pokemon_2).isTrue();
    }

    @Test
    void egalite_defense_et_attaque_entre_premier_et_deuxieme_pokemon()
    {
        //GIVEN
        Pokemon pokemon1 =  new Pokemon("", "", new Stats(15,15));
        Pokemon pokemon2 =  new Pokemon("", "", new Stats(15,15));

        //WHEN
        boolean est_vainqueur_pokemon_1 = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(est_vainqueur_pokemon_1).isTrue();
    }
}