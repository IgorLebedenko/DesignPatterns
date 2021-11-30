package com.github.ilebedenko.factory_method.dialog;

import com.github.ilebedenko.factory_method.button.Button;
import com.github.ilebedenko.factory_method.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
