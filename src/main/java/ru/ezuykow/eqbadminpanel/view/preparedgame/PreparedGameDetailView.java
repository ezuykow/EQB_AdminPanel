package ru.ezuykow.eqbadminpanel.view.preparedgame;

import io.jmix.core.DataManager;
import io.jmix.core.FluentLoader;
import io.jmix.core.querycondition.LogicalCondition;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionPropertyContainer;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ezuykow.eqbadminpanel.entity.PreparedGame;

import ru.ezuykow.eqbadminpanel.entity.Question;
import ru.ezuykow.eqbadminpanel.entity.QuestionsGroup;
import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

import java.util.ArrayList;
import java.util.List;


/**
    * @author ezuykow
    */
@Route(value = "preparedGames/:id", layout = MainView.class)
@ViewController("PreparedGame.detail")
@ViewDescriptor("prepared-game-detail-view.xml")
@EditedEntityContainer("preparedGameDc")
public class PreparedGameDetailView extends StandardDetailView<PreparedGame> {

    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private CollectionPropertyContainer<QuestionsGroup> questionGroupsDc;
    @ViewComponent
    private CollectionPropertyContainer<Question> questionsDc;

    @Subscribe("questionsDataGrid.add")
    public void onQuestionsDataGridAdd(final ActionPerformedEvent event) {
        List<QuestionsGroup> groups = questionGroupsDc.getItems();

        List<Question> questions = new ArrayList<>();
            List<Question> q = dataManager.load(Question.class)
                            .all().list();
            q = q.stream().filter(question -> groups.contains(question.getQuestionGroup())).toList();
            questions.addAll(q);

        questionsDc.setItems(questions);
    }

}