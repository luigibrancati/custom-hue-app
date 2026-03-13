package la;

import pa.AbstractC5451b;
import va.AbstractC6076a;

/* JADX INFO: renamed from: la.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4973e extends C4974f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39996b;

    @Deprecated
    public C4973e() {
        this("", -1);
    }

    public static C4973e a(String str) {
        return new C4973e(new C4969a(), str, -1);
    }

    public static String b(String str, int i10) {
        return "Disconnected from " + AbstractC5451b.d(str) + " with status " + i10 + " (" + AbstractC6076a.a(i10) + ")";
    }

    public C4973e(Throwable th, String str, int i10) {
        super(b(str, i10), th);
        this.f39995a = str;
        this.f39996b = i10;
    }

    public C4973e(String str, int i10) {
        super(b(str, i10));
        this.f39995a = str;
        this.f39996b = i10;
    }
}
