package com.arcbees.i18nsample.client.application;

import com.arcbees.i18nsample.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class ApplicationPresenter extends
        Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> {
    public interface MyView extends View {
    }

    @NameToken(NameTokens.home)
    @ProxyStandard
    public interface MyProxy extends ProxyPlace<ApplicationPresenter> {
    }

    @Inject
    public ApplicationPresenter(EventBus eventBus,
                                MyView view,
                                MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
    }
}
