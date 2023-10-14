package ru.ezuykow.eqbadminpanel.view.hint;

import ru.ezuykow.eqbadminpanel.entity.Hint;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "hints/:id", layout = MainView.class)
@ViewController("Hint.detail")
@ViewDescriptor("hint-detail-view.xml")
@EditedEntityContainer("hintDc")
public class HintDetailView extends StandardDetailView<Hint> {


}