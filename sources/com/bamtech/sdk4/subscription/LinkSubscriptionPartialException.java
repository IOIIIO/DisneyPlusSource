package com.bamtech.sdk4.subscription;

import com.bamtech.sdk4.service.ServiceException;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/LinkSubscriptionPartialException;", "Lcom/bamtech/sdk4/service/ServiceException;", "transactionId", "Ljava/util/UUID;", "errors", "", "Lcom/bamtech/sdk4/subscription/CopyPartialError;", "(Ljava/util/UUID;Ljava/util/List;)V", "LinkSubscriptionPartialErrorResult", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class LinkSubscriptionPartialException extends ServiceException {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/LinkSubscriptionPartialException$LinkSubscriptionPartialErrorResult;", "", "errors", "", "Lcom/bamtech/sdk4/subscription/CopyPartialError;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class LinkSubscriptionPartialErrorResult {
        private final List<CopyPartialError> errors;

        public final List<CopyPartialError> getErrors() {
            return this.errors;
        }
    }

    public LinkSubscriptionPartialException(UUID uuid, List<CopyPartialError> list) {
        super(uuid, list, null, 4, null);
    }
}
