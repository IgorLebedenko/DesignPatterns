package com.github.ilebedenko.factory_method;

import com.github.ilebedenko.factory_method.dialog.Dialog;
import com.github.ilebedenko.factory_method.dialog.WebDialog;
import com.github.ilebedenko.factory_method.dialog.WindowsDialog;

public class Application {
    public static void main(String[] args) {
        System.out.println("--- CREATING WINDOWS DIALOG ---");
        Dialog dialog = new WindowsDialog();
        dialog.render();

        System.out.println("--- CREATING WEB DIALOG ---");
        dialog = new WebDialog();
        dialog.render();
    }
}
