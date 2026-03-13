package j1;

import androidx.datastore.preferences.protobuf.C2715v;
import g1.C4094d;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: j1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4674f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38932a = new a(null);

    /* JADX INFO: renamed from: j1.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C4676h a(InputStream input) throws C4094d {
            AbstractC4862t.e(input, "input");
            try {
                C4676h c4676hR = C4676h.R(input);
                AbstractC4862t.b(c4676hR);
                return c4676hR;
            } catch (C2715v e10) {
                throw new C4094d("Unable to parse preferences proto.", e10);
            }
        }

        public a() {
        }
    }
}
