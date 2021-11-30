package com.github.ilebedenko.abstract_factory;

import com.github.ilebedenko.abstract_factory.button.Button;
import com.github.ilebedenko.abstract_factory.checkbox.Checkbox;
import com.github.ilebedenko.abstract_factory.factory.GUIFactory;

public class GUIApplication {
    private final GUIFactory factory;
    private final Button button;
    private final Checkbox checkbox;

    public GUIApplication(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void createUI() {
        button.paint();
        checkbox.paint();
    }
}
