package p163g.p201e.p203b.p312q;

import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.Map;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* renamed from: g.e.b.q.b */
/* compiled from: GlobalNavAccessibilityClass.kt */
public final class C7654b {
    /* renamed from: a */
    public final String mo20580a(Integer num, Integer num2, Map<String, String> map) {
        String str = "null cannot be cast to non-null type java.lang.String";
        String str2 = "(this as java.lang.String).toLowerCase()";
        if (num2 != null) {
            String a = C5880u.m18937a(num2.intValue(), map);
            if (a != null) {
                String lowerCase = a.toLowerCase();
                C12880j.m40222a((Object) lowerCase, str2);
                return C12832w.m40125f(lowerCase);
            }
            throw new C13142s(str);
        } else if (num == null) {
            return "";
        } else {
            String a2 = C5880u.m18937a(num.intValue(), map);
            if (a2 != null) {
                String lowerCase2 = a2.toLowerCase();
                C12880j.m40222a((Object) lowerCase2, str2);
                return C12832w.m40125f(lowerCase2);
            }
            throw new C13142s(str);
        }
    }
}
