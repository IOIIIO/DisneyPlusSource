package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.EventDispatcher.Event;

/* renamed from: com.google.android.exoplayer2.drm.f */
/* compiled from: lambda */
public final /* synthetic */ class C8701f implements Event {

    /* renamed from: a */
    public static final /* synthetic */ C8701f f18481a = new C8701f();

    private /* synthetic */ C8701f() {
    }

    /* renamed from: a */
    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmKeysRestored();
    }
}
