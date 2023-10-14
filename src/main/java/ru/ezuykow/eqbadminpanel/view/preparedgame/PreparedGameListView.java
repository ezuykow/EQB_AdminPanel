package ru.ezuykow.eqbadminpanel.view.preparedgame;

import ru.ezuykow.eqbadminpanel.entity.PreparedGame;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "preparedGames", layout = MainView.class)
@ViewController("PreparedGame.list")
@ViewDescriptor("prepared-game-list-view.xml")
@LookupComponent("preparedGamesDataGrid")
@DialogMode(width = "64em")
public class PreparedGameListView extends StandardListView<PreparedGame> {
}