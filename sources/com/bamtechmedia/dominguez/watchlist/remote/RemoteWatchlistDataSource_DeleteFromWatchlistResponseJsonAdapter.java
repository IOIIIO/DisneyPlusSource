package com.bamtechmedia.dominguez.watchlist.remote;

import com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.DeleteFromWatchlistResponse;
import com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource.WatchlistUpdateResponse;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource_DeleteFromWatchlistResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$DeleteFromWatchlistResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "watchlistUpdateResponseAdapter", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource$WatchlistUpdateResponse;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoteWatchlistDataSource_DeleteFromWatchlistResponseJsonAdapter.kt */
public final class RemoteWatchlistDataSource_DeleteFromWatchlistResponseJsonAdapter extends C11725h<DeleteFromWatchlistResponse> {
    private final C11739b options;
    private final C11725h<WatchlistUpdateResponse> watchlistUpdateResponseAdapter;

    public RemoteWatchlistDataSource_DeleteFromWatchlistResponseJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("DeleteFromWatchlist");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"DeleteFromWatchlist\")");
        this.options = a;
        C11725h<WatchlistUpdateResponse> a2 = vVar.mo29869a((Type) WatchlistUpdateResponse.class, C13188p0.m40531a(), "updated");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<RemoteWatc…ns.emptySet(), \"updated\")");
        this.watchlistUpdateResponseAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DeleteFromWatchlistResponse deleteFromWatchlistResponse) {
        if (deleteFromWatchlistResponse != null) {
            sVar.mo29791b();
            sVar.mo29796e("DeleteFromWatchlist");
            this.watchlistUpdateResponseAdapter.toJson(sVar, deleteFromWatchlistResponse.mo21115a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(RemoteWatchlistDataSource.DeleteFromWatchlistResponse)";
    }

    public DeleteFromWatchlistResponse fromJson(C11737m mVar) {
        mVar.mo29763b();
        WatchlistUpdateResponse watchlistUpdateResponse = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a != 0) {
                continue;
            } else {
                watchlistUpdateResponse = (WatchlistUpdateResponse) this.watchlistUpdateResponseAdapter.fromJson(mVar);
                if (watchlistUpdateResponse == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'updated' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            }
        }
        mVar.mo29767d();
        if (watchlistUpdateResponse != null) {
            return new DeleteFromWatchlistResponse(watchlistUpdateResponse);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'updated' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
