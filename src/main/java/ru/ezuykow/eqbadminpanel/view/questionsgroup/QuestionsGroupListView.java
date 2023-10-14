package ru.ezuykow.eqbadminpanel.view.questionsgroup;

import ru.ezuykow.eqbadminpanel.entity.QuestionsGroup;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "questionsGroups", layout = MainView.class)
@ViewController("QuestionsGroup.list")
@ViewDescriptor("questions-group-list-view.xml")
@LookupComponent("questionsGroupsDataGrid")
@DialogMode(width = "64em")
public class QuestionsGroupListView extends StandardListView<QuestionsGroup> {
}