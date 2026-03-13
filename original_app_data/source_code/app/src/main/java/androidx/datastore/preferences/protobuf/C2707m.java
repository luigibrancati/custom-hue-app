package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2713t;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2707m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C2707m f22886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2707m f22887c = new C2707m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22888a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f22889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22890b;

        public a(Object obj, int i10) {
            this.f22889a = obj;
            this.f22890b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22889a == aVar.f22889a && this.f22890b == aVar.f22890b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f22889a) * 65535) + this.f22890b;
        }
    }

    public C2707m(boolean z10) {
    }

    public static C2707m b() {
        C2707m c2707mA;
        if (V.f22756d) {
            return f22887c;
        }
        C2707m c2707m = f22886b;
        if (c2707m != null) {
            return c2707m;
        }
        synchronized (C2707m.class) {
            try {
                c2707mA = f22886b;
                if (c2707mA == null) {
                    c2707mA = AbstractC2706l.a();
                    f22886b = c2707mA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2707mA;
    }

    public AbstractC2713t.d a(K k10, int i10) {
        android.support.v4.media.session.a.a(this.f22888a.get(new a(k10, i10)));
        return null;
    }
}
