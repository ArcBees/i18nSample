package com.arcbees.i18nsample.client.gin;

import com.arcbees.i18nsample.client.application.ApplicationModule;
import com.arcbees.i18nsample.client.place.NameTokens;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(DefaultPlaceManager.class));
        install(new ApplicationModule());

        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.home);
    }
}
