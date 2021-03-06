package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.configuration.AccountServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/Account;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: GetAccountClient.kt */
final class DefaultGetAccountClient$getAccount$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Class $type;
    final /* synthetic */ DefaultGetAccountClient this$0;

    DefaultGetAccountClient$getAccount$2(DefaultGetAccountClient defaultGetAccountClient, Map map, ServiceTransaction serviceTransaction, Class cls) {
        this.this$0 = defaultGetAccountClient;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$type = cls;
    }

    public final Single<Account> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        DefaultGetAccountClient defaultGetAccountClient = this.this$0;
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7798a(updateTemplates$default, client, defaultGetAccountClient.accountResponseTransformer(serviceTransaction, defaultGetAccountClient.accountResponseHandler(serviceTransaction, defaultGetAccountClient.converter, this.$type)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String account_current_account = AccountServiceConfigurationKt.getACCOUNT_CURRENT_ACCOUNT(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1782xc7ea50dc(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<Account> g = b.mo30222c((Consumer<? super Disposable>) new C1783xc7ea50dd<Object>(serviceTransaction2, account_current_account)).mo30218b((Consumer<? super Throwable>) new C1784xc7ea50de<Object>(a, serviceTransaction2, account_current_account)).mo30233g(new C1785xc7ea50df(serviceTransaction2, account_current_account));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
