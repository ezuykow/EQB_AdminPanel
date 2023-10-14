package ru.ezuykow.eqbadminpanel.view.game;

import ru.ezuykow.eqbadminpanel.entity.Game;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "games", layout = MainView.class)
@ViewController("Game.list")
@ViewDescriptor("game-list-view.xml")
@LookupComponent("gamesDataGrid")
@DialogMode(width = "64em")
public class GameListView extends StandardListView<Game> {
}