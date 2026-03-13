package X6;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V2 implements com.google.android.gms.internal.measurement.Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2344a3 f18615b;

    public V2(C2344a3 c2344a3, String str) {
        this.f18614a = str;
        Objects.requireNonNull(c2344a3);
        this.f18615b = c2344a3;
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final String a(String str) {
        Map map = (Map) this.f18615b.p().get(this.f18614a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
