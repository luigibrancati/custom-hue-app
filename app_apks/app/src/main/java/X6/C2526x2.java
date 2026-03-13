package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2526x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2542z2 f19304d;

    public C2526x2(C2542z2 c2542z2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c2542z2);
        this.f19304d = c2542z2;
        this.f19301a = i10;
        this.f19302b = z10;
        this.f19303c = z11;
    }

    public final void a(String str) {
        this.f19304d.y(this.f19301a, this.f19302b, this.f19303c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f19304d.y(this.f19301a, this.f19302b, this.f19303c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f19304d.y(this.f19301a, this.f19302b, this.f19303c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f19304d.y(this.f19301a, this.f19302b, this.f19303c, str, obj, obj2, obj3);
    }
}
