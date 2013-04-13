package com.arcbees.i18nsample.client.application;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @Inject
    public ApplicationView(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
