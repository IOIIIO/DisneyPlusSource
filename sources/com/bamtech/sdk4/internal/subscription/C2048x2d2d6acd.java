package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.subscription.Subscription.Collection;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b¸\u0006\u0000"}, mo31007d2 = {"com/bamtech/sdk4/internal/service/ResponseHandlersKt$responseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "(Lokhttp3/Response;)Ljava/lang/Object;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient$getSubscriptions$2$$special$$inlined$responseHandler$1 */
/* compiled from: ResponseHandlers.kt */
public final class C2048x2d2d6acd implements ResponseHandler<Collection> {
    final /* synthetic */ Converter $converter;

    public C2048x2d2d6acd(Converter converter) {
        this.$converter = converter;
    }

    public boolean canHandle(Response response) {
        return response.mo35863f();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.bamtech.sdk4.subscription.Subscription$Collection, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [com.bamtech.sdk4.subscription.Subscription$Collection, java.lang.Object]
      assigns: [java.lang.Object]
      uses: [com.bamtech.sdk4.subscription.Subscription$Collection]
      mth insns count: 4
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.subscription.Subscription.Collection handle(okhttp3.Response r3) {
        /*
            r2 = this;
            com.bamtech.core.networking.converters.Converter r0 = r2.$converter
            com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient$getSubscriptions$2$$special$$inlined$responseHandler$1$1 r1 = new com.bamtech.sdk4.internal.subscription.DefaultSubscriptionClient$getSubscriptions$2$$special$$inlined$responseHandler$1$1
            r1.<init>(r0)
            java.lang.Object r3 = r1.invoke(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.subscription.C2048x2d2d6acd.handle(okhttp3.Response):java.lang.Object");
    }
}
