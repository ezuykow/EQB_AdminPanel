package ru.ezuykow.eqbadminpanel.view.questionsgroup;

import ru.ezuykow.eqbadminpanel.entity.QuestionsGroup;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questionsGroups/:id", layout = MainView.class)
@ViewController("QuestionsGroup.detail")
@ViewDescriptor("questions-group-detail-view.xml")
@EditedEntityContainer("questionsGroupDc")
public class QuestionsGroupDetailView extends StandardDetailView<QuestionsGroup> {
}