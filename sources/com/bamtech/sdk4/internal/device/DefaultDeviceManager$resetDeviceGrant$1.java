package com.bamtech.sdk4.internal.device;

import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
final class DefaultDeviceManager$resetDeviceGrant$1 implements C11945a {
    final /* synthetic */ DefaultDeviceManager this$0;

    DefaultDeviceManager$resetDeviceGrant$1(DefaultDeviceManager defaultDeviceManager) {
        this.this$0 = defaultDeviceManager;
    }

    public final void run() {
        DeviceGrantKt.clearDeviceGrant(this.this$0.storage);
    }
}
