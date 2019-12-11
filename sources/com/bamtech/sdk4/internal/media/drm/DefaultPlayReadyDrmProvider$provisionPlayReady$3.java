package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.QOSTransformerKt$qosTransformer$1;
import com.bamtech.sdk4.internal.QOSTransformerKt$qosTransformer$2;
import com.bamtech.sdk4.internal.configuration.DrmServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0004H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "kotlin.jvm.PlatformType", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlayReadyDrmProvider.kt */
final class DefaultPlayReadyDrmProvider$provisionPlayReady$3<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ boolean $isOffline;
    final /* synthetic */ String $playbackSessionId;
    final /* synthetic */ byte[] $requestData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultPlayReadyDrmProvider this$0;

    DefaultPlayReadyDrmProvider$provisionPlayReady$3(DefaultPlayReadyDrmProvider defaultPlayReadyDrmProvider, String str, ServiceTransaction serviceTransaction, boolean z, byte[] bArr) {
        this.this$0 = defaultPlayReadyDrmProvider;
        this.$playbackSessionId = str;
        this.$transaction = serviceTransaction;
        this.$isOffline = z;
        this.$requestData = bArr;
    }

    public final Single<byte[]> apply(Pair<Link, TelemetryServiceConfiguration> pair) {
        Link link = (Link) pair.mo31013a();
        TelemetryServiceConfiguration telemetryServiceConfiguration = (TelemetryServiceConfiguration) pair.mo31014b();
        DefaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1 defaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1 = new DefaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1(this);
        C12880j.m40222a((Object) link, "link");
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultResponseTransformer defaultResponseTransformer = new DefaultResponseTransformer(new QOSTransformerKt$qosTransformer$1(new ResponseHandler[]{new C1944x7bd0618f(this.this$0.converters.getByte())}, serviceTransaction, defaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1), new QOSTransformerKt$qosTransformer$2(serviceTransaction, defaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1));
        C14262x a = C14262x.m45502a(C14258u.m45482b("application/octet-stream"), this.$requestData);
        C12880j.m40222a((Object) a, "RequestBody.create(\n    …                        )");
        C12880j.m40222a((Object) telemetryServiceConfiguration, "config");
        Request a2 = C1691e.m7797a(link, client, (ResponseTransformer<? extends OUT>) defaultResponseTransformer, a, TelemetryServiceConfigurationKt.toDustConfigSettings(telemetryServiceConfiguration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String play_ready_provision = DrmServiceConfigurationKt.getPLAY_READY_PROVISION(Dust$Events.INSTANCE);
        Call a3 = C1691e.m7799a(a2);
        Single b = C1681c.m7780a(a2, a3).mo30223c((C11945a) new C1946xe772f917(a3)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<byte[]> g = b.mo30222c((Consumer<? super Disposable>) new C1947xe772f918<Object>(serviceTransaction2, play_ready_provision)).mo30218b((Consumer<? super Throwable>) new C1948xe772f919<Object>(a2, serviceTransaction2, play_ready_provision)).mo30233g(new C1949xe772f91a(serviceTransaction2, play_ready_provision));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
