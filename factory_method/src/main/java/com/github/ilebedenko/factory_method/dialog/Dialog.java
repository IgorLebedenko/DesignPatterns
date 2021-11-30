package com.github.ilebedenko.factory_method.dialog;

import com.github.ilebedenko.factory_method.button.Button;

public abstract class Dialog {

    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    protected abstract Button createButton();
}
