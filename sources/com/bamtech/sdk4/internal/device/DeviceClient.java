package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.token.Grant;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/device/DeviceClient;", "", "register", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/token/Grant;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/device/Device;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceClient.kt */
public interface DeviceClient {
    Single<? extends Grant> register(ServiceTransaction serviceTransaction, Device device, Map<String, String> map);
}
