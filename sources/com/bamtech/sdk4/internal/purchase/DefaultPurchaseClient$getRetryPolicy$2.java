package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.configuration.PurchaseExtras;
import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "it", "Lcom/bamtech/sdk4/internal/configuration/PurchaseExtras;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseClient.kt */
final class DefaultPurchaseClient$getRetryPolicy$2<T, R> implements Function<T, R> {
    public static final DefaultPurchaseClient$getRetryPolicy$2 INSTANCE = new DefaultPurchaseClient$getRetryPolicy$2();

    DefaultPurchaseClient$getRetryPolicy$2() {
    }

    public final RetryPolicy apply(PurchaseExtras purchaseExtras) {
        return purchaseExtras.getRetryPolicy();
    }
}
