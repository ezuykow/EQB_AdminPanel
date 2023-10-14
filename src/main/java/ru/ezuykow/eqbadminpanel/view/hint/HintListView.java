package ru.ezuykow.eqbadminpanel.view.hint;

import ru.ezuykow.eqbadminpanel.entity.Hint;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "hints", layout = MainView.class)
@ViewController("Hint.list")
@ViewDescriptor("hint-list-view.xml")
@LookupComponent("hintsDataGrid")
@DialogMode(width = "64em")
public class HintListView extends StandardListView<Hint> {
}