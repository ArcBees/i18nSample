package com.arcbees.i18nsample.client.gin;

import com.arcbees.i18nsample.client.application.ApplicationModule;
import com.arcbees.i18nsample.client.place.ClientPlaceManager;
import com.arcbees.i18nsample.client.place.DefaultPlace;
import com.arcbees.i18nsample.client.place.NameTokens;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(ClientPlaceManager.class));
        install(new ApplicationModule());

        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
    }
}
