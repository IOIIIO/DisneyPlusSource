package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.DrmSession.C8694a;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.drm.m */
/* compiled from: ErrorStateDrmSession */
public final class C8711m<T extends ExoMediaCrypto> implements DrmSession<T> {

    /* renamed from: a */
    private final C8694a f18505a;

    public C8711m(C8694a aVar) {
        Assertions.checkNotNull(aVar);
        this.f18505a = aVar;
    }

    /* renamed from: a */
    public Map<String, String> mo22770a() {
        return null;
    }

    /* renamed from: b */
    public T mo22771b() {
        return null;
    }

    /* renamed from: c */
    public byte[] mo22772c() {
        return null;
    }

    /* renamed from: d */
    public int mo22773d() {
        return 1;
    }

    public C8694a getError() {
        return this.f18505a;
    }
}
