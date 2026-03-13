package i2;

import F2.s;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f37047a = new u() { // from class: i2.t
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return u.e();
        }
    };

    static /* synthetic */ InterfaceC4336p[] e() {
        return new InterfaceC4336p[0];
    }

    default InterfaceC4336p[] d(Uri uri, Map map) {
        return f();
    }

    InterfaceC4336p[] f();

    default u a(s.a aVar) {
        return this;
    }

    default u b(boolean z10) {
        return this;
    }

    default u c(int i10) {
        return this;
    }
}
