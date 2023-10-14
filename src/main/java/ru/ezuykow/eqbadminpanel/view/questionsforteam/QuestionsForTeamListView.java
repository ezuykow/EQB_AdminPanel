package ru.ezuykow.eqbadminpanel.view.questionsforteam;

import ru.ezuykow.eqbadminpanel.entity.QuestionsForTeam;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questionsForTeams", layout = MainView.class)
@ViewController("QuestionsForTeam.list")
@ViewDescriptor("questions-for-team-list-view.xml")
@LookupComponent("questionsForTeamsDataGrid")
@DialogMode(width = "64em")
public class QuestionsForTeamListView extends StandardListView<QuestionsForTeam> {
}