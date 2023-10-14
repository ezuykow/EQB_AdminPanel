package ru.ezuykow.eqbadminpanel.view.preparedgame;

import ru.ezuykow.eqbadminpanel.entity.PreparedGame;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "preparedGames/:id", layout = MainView.class)
@ViewController("PreparedGame.detail")
@ViewDescriptor("prepared-game-detail-view.xml")
@EditedEntityContainer("preparedGameDc")
public class PreparedGameDetailView extends StandardDetailView<PreparedGame> {
}