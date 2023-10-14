package ru.ezuykow.eqbadminpanel.view.question;

import com.vaadin.flow.router.RouteParameters;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ezuykow.eqbadminpanel.entity.Question;

import ru.ezuykow.eqbadminpanel.entity.User;
import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

import java.beans.PropertyChangeEvent;


/**
    * @author ezuykow
    */
@Route(value = "questions/:id", layout = MainView.class)
@ViewController("Question.detail")
@ViewDescriptor("question-detail-view.xml")
@EditedEntityContainer("questionDc")
public class QuestionDetailView extends StandardDetailView<Question> {


    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private EntityPicker<User> authorField;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Question> event) {
        event.getEntity().setAuthor((User) currentAuthentication.getUser());
        authorField.setReadOnly(true);
    }
    
}