package P;

import E.Y0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Y0 {
    public static Y0 e(float f10, float f11, float f12, float f13) {
        return new a(f10, f11, f12, f13);
    }

    public static Y0 f(Y0 y02) {
        return new a(y02.d(), y02.a(), y02.c(), y02.b());
    }

    @Override // E.Y0
    public abstract float a();

    @Override // E.Y0
    public abstract float b();

    @Override // E.Y0
    public abstract float c();

    @Override // E.Y0
    public abstract float d();
}
