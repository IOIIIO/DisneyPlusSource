package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C12880j;

/* compiled from: exceptionUtils.kt */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(Throwable th) {
        Class cls = th.getClass();
        while (!C12880j.m40224a((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException rethrow(Throwable th) {
        throw th;
    }
}
