package ru.ezuykow.eqbadminpanel.view.game;

import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ezuykow.eqbadminpanel.entity.Game;

import ru.ezuykow.eqbadminpanel.entity.User;
import ru.ezuykow.eqbadminpanel.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


/**
    * @author ezuykow
    */
@Route(value = "games/:id", layout = MainView.class)
@ViewController("Game.detail")
@ViewDescriptor("game-detail-view.xml")
@EditedEntityContainer("gameDc")
public class GameDetailView extends StandardDetailView<Game> {

    @ViewComponent
    private EntityPicker<User> authorField;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Game> event) {
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setAuthor(user);
        authorField.setReadOnly(true);
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        authorField.setReadOnly(true);
    }
    
    
}