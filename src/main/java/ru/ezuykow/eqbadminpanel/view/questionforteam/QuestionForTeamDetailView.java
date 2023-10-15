package ru.ezuykow.eqbadminpanel.view.questionforteam;

import ru.ezuykow.eqbadminpanel.entity.QuestionForTeam;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questionForTeams/:id", layout = MainView.class)
@ViewController("QuestionForTeam.detail")
@ViewDescriptor("question-for-team-detail-view.xml")
@EditedEntityContainer("questionForTeamDc")
public class QuestionForTeamDetailView extends StandardDetailView<QuestionForTeam> {
}