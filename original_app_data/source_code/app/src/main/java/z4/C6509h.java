package z4;

/* JADX INFO: renamed from: z4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6509h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6509h f48763a = new C6509h();

    public static /* synthetic */ boolean b(C6509h c6509h, A4.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return c6509h.a(aVar);
    }

    public final boolean a(A4.a aVar) {
        C6512k c6512k = C6512k.f48773a;
        return c6512k.a("androidx.compose.ui.node.Owner", aVar) && c6512k.a("com.amplitude.android.internal.locators.ComposeViewTargetLocator", aVar);
    }
}
