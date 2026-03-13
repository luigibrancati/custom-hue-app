package Wd;

import c.C2925a;
import fc.AbstractC4036s;
import fc.C4035r;
import nc.AbstractC5157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f17898a = new C2925a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17900c;

    static {
        Object objB;
        Object objB2;
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(AbstractC5157a.class.getCanonicalName());
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        if (C4035r.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f17899b = (String) objB;
        try {
            objB2 = C4035r.b(D.class.getCanonicalName());
        } catch (Throwable th2) {
            C4035r.a aVar3 = C4035r.f34274b;
            objB2 = C4035r.b(AbstractC4036s.a(th2));
        }
        if (C4035r.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f17900c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
