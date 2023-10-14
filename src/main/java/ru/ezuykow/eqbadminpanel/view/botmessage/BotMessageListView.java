package ru.ezuykow.eqbadminpanel.view.botmessage;

import ru.ezuykow.eqbadminpanel.entity.BotMessage;

import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "botMessages", layout = MainView.class)
@ViewController("BotMessage.list")
@ViewDescriptor("bot-message-list-view.xml")
@LookupComponent("botMessagesDataGrid")
@DialogMode(width = "64em")
public class BotMessageListView extends StandardListView<BotMessage> {
}