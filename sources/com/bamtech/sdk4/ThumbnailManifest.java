package com.bamtech.sdk4;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/ThumbnailManifest;", "", "bifs", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "(Ljava/util/List;)V", "getBifs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public final class ThumbnailManifest {
    private final List<BifThumbnailSet> bifs;

    public ThumbnailManifest(List<BifThumbnailSet> list) {
        this.bifs = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.BifThumbnailSet>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.ThumbnailManifest copy$default(com.bamtech.sdk4.ThumbnailManifest r0, java.util.List<com.bamtech.sdk4.BifThumbnailSet> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.bamtech.sdk4.BifThumbnailSet> r1 = r0.bifs
        L_0x0006:
            com.bamtech.sdk4.ThumbnailManifest r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.ThumbnailManifest.copy$default(com.bamtech.sdk4.ThumbnailManifest, java.util.List, int, java.lang.Object):com.bamtech.sdk4.ThumbnailManifest");
    }

    public final List<BifThumbnailSet> component1() {
        return this.bifs;
    }

    public final ThumbnailManifest copy(List<BifThumbnailSet> list) {
        return new ThumbnailManifest(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.bifs, (java.lang.Object) ((com.bamtech.sdk4.ThumbnailManifest) r2).bifs) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.ThumbnailManifest
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.ThumbnailManifest r2 = (com.bamtech.sdk4.ThumbnailManifest) r2
            java.util.List<com.bamtech.sdk4.BifThumbnailSet> r0 = r1.bifs
            java.util.List<com.bamtech.sdk4.BifThumbnailSet> r2 = r2.bifs
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.ThumbnailManifest.equals(java.lang.Object):boolean");
    }

    public final List<BifThumbnailSet> getBifs() {
        return this.bifs;
    }

    public int hashCode() {
        List<BifThumbnailSet> list = this.bifs;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailManifest(bifs=");
        sb.append(this.bifs);
        sb.append(")");
        return sb.toString();
    }
}
