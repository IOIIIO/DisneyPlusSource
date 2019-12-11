package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultBaseIdentityClient_Factory implements C2111c<DefaultBaseIdentityClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<Converter> customConverterProvider;

    public DefaultBaseIdentityClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
        this.customConverterProvider = provider3;
    }

    public static DefaultBaseIdentityClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        return new DefaultBaseIdentityClient_Factory(provider, provider2, provider3);
    }

    public DefaultBaseIdentityClient get() {
        return new DefaultBaseIdentityClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (Converter) this.customConverterProvider.get());
    }
}
