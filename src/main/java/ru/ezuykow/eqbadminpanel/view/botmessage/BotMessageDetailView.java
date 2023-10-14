package ru.ezuykow.eqbadminpanel.view.botmessage;

import io.jmix.flowui.component.textfield.TypedTextField;
import ru.ezuykow.eqbadminpanel.entity.BotMessage;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "botMessages/:id", layout = MainView.class)
@ViewController("BotMessage.detail")
@ViewDescriptor("bot-message-detail-view.xml")
@EditedEntityContainer("botMessageDc")
public class BotMessageDetailView extends StandardDetailView<BotMessage> {
    @ViewComponent
    private TypedTextField<String> defaultMessageField;
    @ViewComponent
    private TypedTextField<String> keyField;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        if (!defaultMessageField.getValue().isBlank()) {
            defaultMessageField.setReadOnly(true);
        }
        if (!keyField.getValue().isBlank()) {
            keyField.setReadOnly(true);
        }
    }
}