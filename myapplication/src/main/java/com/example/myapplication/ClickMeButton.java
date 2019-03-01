package com.example.myapplication;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ClickMeButton extends Button {

	public ClickMeButton(VerticalLayout layout, String lbl) {
		Button button = new Button(lbl);
		button.setDescription("El tooltip tex");
		button.addClickListener(e -> {
			layout.addComponent(new Label("Thanks, it works!"));
		});
		layout.addComponent(button);
	}

}
