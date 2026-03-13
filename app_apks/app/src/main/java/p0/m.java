package p0;

import b0.AbstractC2787k;
import kotlin.jvm.internal.AbstractC4854k;
import p0.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.w f42115a;

    static {
        k kVar = k.f42078a;
        int iB = kVar.p().b();
        int iB2 = kVar.p().b();
        r.a aVar = r.f42134a;
        AbstractC4854k abstractC4854k = null;
        f42115a = AbstractC2787k.a(iB | (iB2 << 6) | (aVar.b() << 12), l.f42104g.c(kVar.p()), kVar.p().b() | (kVar.o().b() << 6) | (aVar.b() << 12), new l(kVar.p(), kVar.o(), aVar.b(), abstractC4854k), kVar.o().b() | (kVar.p().b() << 6) | (aVar.b() << 12), new l(kVar.o(), kVar.p(), aVar.b(), abstractC4854k));
    }

    public static final b0.w a() {
        return f42115a;
    }
}
