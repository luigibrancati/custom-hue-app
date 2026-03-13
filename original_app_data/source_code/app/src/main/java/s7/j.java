package s7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44248a = -1.0f;

    @Override // s7.d
    public void b(m mVar, float f10, float f11, float f12) {
        mVar.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        mVar.a(0.0f, 0.0f, f13, f13, 180.0f, f10);
    }
}
