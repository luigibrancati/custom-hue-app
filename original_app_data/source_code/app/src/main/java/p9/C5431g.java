package p9;

import Od.C1823c;
import android.util.Log;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5431g implements InterfaceC5432h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f42474b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.b f42475a;

    /* JADX INFO: renamed from: p9.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C5431g(O8.b transportFactoryProvider) {
        AbstractC4862t.e(transportFactoryProvider, "transportFactoryProvider");
        this.f42475a = transportFactoryProvider;
    }

    @Override // p9.InterfaceC5432h
    public void a(I sessionEvent) {
        AbstractC4862t.e(sessionEvent, "sessionEvent");
        ((Y5.j) this.f42475a.get()).a("FIREBASE_APPQUALITY_SESSION", I.class, Y5.c.b("json"), new Y5.h() { // from class: p9.f
            @Override // Y5.h
            public final Object apply(Object obj) {
                return this.f42473a.c((I) obj);
            }
        }).a(Y5.d.f(sessionEvent));
    }

    public final byte[] c(I i10) {
        String strB = J.f42331a.c().b(i10);
        AbstractC4862t.d(strB, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + i10.b().name());
        byte[] bytes = strB.getBytes(C1823c.f12394b);
        AbstractC4862t.d(bytes, "getBytes(...)");
        return bytes;
    }
}
