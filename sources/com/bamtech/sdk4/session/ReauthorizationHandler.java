package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/ReauthorizationHandler;", "", "handle", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "mode", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "sdk-session-renew"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReauthorizationHandlerRegistry.kt */
public interface ReauthorizationHandler {
    Completable handle(ServiceTransaction serviceTransaction, ReauthorizeMode reauthorizeMode);
}
