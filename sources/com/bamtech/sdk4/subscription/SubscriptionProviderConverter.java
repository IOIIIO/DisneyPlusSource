package com.bamtech.sdk4.subscription;

import com.bamtech.sdk4.subscription.SubscriptionProvider.Companion;
import com.bamtech.shadow.gson.C2132h;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonDeserializationContext;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProviderConverter;", "Lcom/bamtech/shadow/gson/JsonDeserializer;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "Lcom/bamtech/shadow/gson/JsonSerializer;", "()V", "deserialize", "element", "Lcom/bamtech/shadow/gson/JsonElement;", "p1", "Ljava/lang/reflect/Type;", "p2", "Lcom/bamtech/shadow/gson/JsonDeserializationContext;", "serialize", "item", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class SubscriptionProviderConverter implements C2132h<SubscriptionProvider>, C2236m<SubscriptionProvider> {
    public SubscriptionProvider deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Companion companion = SubscriptionProvider.Companion;
        String e = jsonElement.mo11074e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "element.asString");
        return companion.toType(e);
    }

    public JsonElement serialize(SubscriptionProvider subscriptionProvider, Type type, JsonSerializationContext jsonSerializationContext) {
        return new C2235l(SubscriptionProvider.Companion.toString(subscriptionProvider));
    }
}
