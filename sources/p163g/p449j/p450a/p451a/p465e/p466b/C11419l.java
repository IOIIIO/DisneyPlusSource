package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.internal.C9912w;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: g.j.a.a.e.b.l */
public final class C11419l implements Creator<C11418k> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        C9820b bVar = null;
        int i = 0;
        C9912w wVar = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                bVar = (C9820b) C9919b.m30891a(parcel, a, C9820b.CREATOR);
            } else if (a2 != 3) {
                C9919b.m30910o(parcel, a);
            } else {
                wVar = (C9912w) C9919b.m30891a(parcel, a, C9912w.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C11418k(i, bVar, wVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11418k[i];
    }
}
