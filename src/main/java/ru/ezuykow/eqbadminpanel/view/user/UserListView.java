package ru.ezuykow.eqbadminpanel.view.user;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.ItemClickEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import ru.ezuykow.eqbadminpanel.entity.User;
import ru.ezuykow.eqbadminpanel.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "users", layout = MainView.class)
@ViewController("User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
public class UserListView extends StandardListView<User> {

    @ViewComponent
    private JmixButton removeBtn;
    @ViewComponent
    private JmixButton showRoleAssignmentsBtn;

    @Subscribe("usersDataGrid")
    public void onUsersDataGridItemClick(final ItemClickEvent<User> event) {
        if (event.getItem().getUsername().equals("owner")) {
            removeBtn.setEnabled(false);
            showRoleAssignmentsBtn.setEnabled(false);
        } else {
            removeBtn.setEnabled(true);
            showRoleAssignmentsBtn.setEnabled(true);
        }
    }

}