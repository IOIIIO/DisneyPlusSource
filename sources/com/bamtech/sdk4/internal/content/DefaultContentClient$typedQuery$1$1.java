package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.internal.configuration.ContentServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.Services;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "T", "Lcom/bamtech/sdk4/internal/configuration/Services;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
final class DefaultContentClient$typedQuery$1$1 extends C12881k implements Function1<Services, ContentServiceConfiguration> {
    public static final DefaultContentClient$typedQuery$1$1 INSTANCE = new DefaultContentClient$typedQuery$1$1();

    DefaultContentClient$typedQuery$1$1() {
        super(1);
    }

    public final ContentServiceConfiguration invoke(Services services) {
        return services.getContent();
    }
}
