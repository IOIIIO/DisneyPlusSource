package com.bamtechmedia.dominguez.core.utils;

import android.view.LayoutInflater;
import kotlin.jvm.internal.C12880j;
import p096e.p097a.p104o.C3892d;

/* renamed from: com.bamtechmedia.dominguez.core.utils.m */
/* compiled from: LayoutInflaterExt.kt */
public final class C5845m {
    /* renamed from: a */
    public static final LayoutInflater m18866a(LayoutInflater layoutInflater, int i) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new C3892d(layoutInflater.getContext(), i));
        C12880j.m40222a((Object) cloneInContext, "cloneInContext(ContextTh…eWrapper(context, theme))");
        return cloneInContext;
    }
}
