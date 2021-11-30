package com.github.ilebedenko.factory_method.dialog;

import com.github.ilebedenko.factory_method.button.Button;
import com.github.ilebedenko.factory_method.button.HtmlButton;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
