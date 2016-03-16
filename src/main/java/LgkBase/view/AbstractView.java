package LgkBase.view;

import com.vaadin.ui.CustomComponent;

/**
 * Created by user on 16.03.2016.
 */
public abstract class AbstractView<Model> extends CustomComponent {
    protected final Model model;

    public AbstractView(Model model) {
        this.model = model;
    }
}
