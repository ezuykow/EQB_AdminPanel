package ru.ezuykow.eqbadminpanel.view.question;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.ItemClickEvent;
import io.jmix.flowui.action.list.RemoveAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.DataContext;
import ru.ezuykow.eqbadminpanel.entity.Question;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questions", layout = MainView.class)
@ViewController("Question.list")
@ViewDescriptor("question-list-view.xml")
@LookupComponent("questionsDataGrid")
@DialogMode(width = "64em")
public class QuestionListView extends StandardListView<Question> {

}