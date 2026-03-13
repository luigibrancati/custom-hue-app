package androidx.lifecycle;

import android.os.Bundle;
import i3.AbstractC4342c;
import i3.C4345f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import w1.C6117b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23390c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C6117b f23392b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new C();
            }
            ClassLoader classLoader = C.class.getClassLoader();
            AbstractC4862t.b(classLoader);
            bundle.setClassLoader(classLoader);
            return new C(AbstractC4342c.g(AbstractC4342c.a(bundle)));
        }

        public a() {
        }
    }

    public C(Map initialState) {
        AbstractC4862t.e(initialState, "initialState");
        this.f23391a = new LinkedHashMap();
        this.f23392b = new C6117b(initialState);
    }

    public final C4345f.b a() {
        return this.f23392b.b();
    }

    public C() {
        this.f23391a = new LinkedHashMap();
        this.f23392b = new C6117b(null, 1, 0 == true ? 1 : 0);
    }
}
