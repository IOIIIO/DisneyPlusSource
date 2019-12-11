package com.bamtech.sdk4.session;

import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionExtensionModule;", "", "()V", "sessionExtension", "Lcom/bamtech/sdk4/session/SessionExtension;", "Lcom/bamtech/sdk4/session/DefaultSessionExtension;", "reauthorizationHandlerRegistry", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionExtensionModule.kt */
public final class SessionExtensionModule {
    public final SessionExtension sessionExtension(DefaultSessionExtension defaultSessionExtension, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry) {
        reauthorizationHandlerRegistry.register(C12895y.m40230a(GrantRenewal.class), defaultSessionExtension);
        return defaultSessionExtension;
    }
}
