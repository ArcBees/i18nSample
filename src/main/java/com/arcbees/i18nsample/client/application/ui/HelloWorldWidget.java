package com.arcbees.i18nsample.client.application.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HelloWorldWidget extends Composite {
    interface HelloWorldWidgetUiBinder extends UiBinder<Widget, HelloWorldWidget> {
    }

    private static HelloWorldWidgetUiBinder ourUiBinder = GWT.create(HelloWorldWidgetUiBinder.class);

    public HelloWorldWidget() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
