package o2;

import D1.w;
import G1.C;
import i2.O;

/* JADX INFO: renamed from: o2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5201e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f41142a;

    /* JADX INFO: renamed from: o2.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends w {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC5201e(O o10) {
        this.f41142a = o10;
    }

    public final boolean a(C c10, long j10) {
        return b(c10) && c(c10, j10);
    }

    public abstract boolean b(C c10);

    public abstract boolean c(C c10, long j10);
}
