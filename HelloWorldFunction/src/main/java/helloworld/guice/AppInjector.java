package helloworld.guice;

import com.google.inject.AbstractModule;
import helloworld.DatabaseApi;

public class AppInjector extends AbstractModule {

    @Override
    protected void configure() {

        bind(DatabaseApi.class).toInstance(new DatabaseApi());

    }
}
