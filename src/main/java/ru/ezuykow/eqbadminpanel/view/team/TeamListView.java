package ru.ezuykow.eqbadminpanel.view.team;

import ru.ezuykow.eqbadminpanel.entity.Team;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "teams", layout = MainView.class)
@ViewController("Team.list")
@ViewDescriptor("team-list-view.xml")
@LookupComponent("teamsDataGrid")
@DialogMode(width = "64em")
public class TeamListView extends StandardListView<Team> {
}