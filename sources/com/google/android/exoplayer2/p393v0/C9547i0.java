package com.google.android.exoplayer2.p393v0;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.google.android.exoplayer2.v0.i0 */
/* compiled from: TraceUtil */
public final class C9547i0 {
    /* renamed from: a */
    public static void m29359a(String str) {
        if (C9554k0.f22281a >= 18) {
            m29361b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m29361b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m29360b() {
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m29358a() {
        if (C9554k0.f22281a >= 18) {
            m29360b();
        }
    }
}
