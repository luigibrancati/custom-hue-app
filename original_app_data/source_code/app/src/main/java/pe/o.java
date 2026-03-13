package pe;

import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42846a = a.f42848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f42847b = new a.C0570a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f42848a = new a();

        /* JADX INFO: renamed from: pe.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0570a implements o {
            @Override // pe.o
            public List a(v url) {
                AbstractC4862t.e(url, "url");
                return C4206t.k();
            }

            @Override // pe.o
            public void b(v url, List cookies) {
                AbstractC4862t.e(url, "url");
                AbstractC4862t.e(cookies, "cookies");
            }
        }
    }

    List a(v vVar);

    void b(v vVar, List list);
}
