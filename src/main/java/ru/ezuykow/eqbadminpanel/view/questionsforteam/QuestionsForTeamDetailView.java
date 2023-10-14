package ru.ezuykow.eqbadminpanel.view.questionsforteam;

import ru.ezuykow.eqbadminpanel.entity.QuestionsForTeam;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questionsForTeams/:id", layout = MainView.class)
@ViewController("QuestionsForTeam.detail")
@ViewDescriptor("questions-for-team-detail-view.xml")
@EditedEntityContainer("questionsForTeamDc")
public class QuestionsForTeamDetailView extends StandardDetailView<QuestionsForTeam> {
}