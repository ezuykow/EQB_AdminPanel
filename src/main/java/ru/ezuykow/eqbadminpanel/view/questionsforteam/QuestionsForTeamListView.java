package ru.ezuykow.eqbadminpanel.view.questionsforteam;

import com.vaadin.flow.component.grid.ItemClickEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import ru.ezuykow.eqbadminpanel.entity.QuestionForTeam;

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
public class QuestionsForTeamListView extends StandardListView<QuestionForTeam> {
    @ViewComponent
    private JmixButton editBtn;

    @Subscribe("questionsForTeamsDataGrid")
    public void onQuestionsForTeamsDataGridItemClick(final ItemClickEvent<QuestionForTeam> event) {
        if (event.getItem().getTeam().getStartedAt() != null) {
            editBtn.setEnabled(false);
        }
    }
}