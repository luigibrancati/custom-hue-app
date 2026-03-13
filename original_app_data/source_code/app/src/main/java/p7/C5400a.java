package p7;

import android.graphics.Typeface;

/* JADX INFO: renamed from: p7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5400a extends AbstractC5405f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f42217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0561a f42218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42219c;

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0561a {
        void a(Typeface typeface);
    }

    public C5400a(InterfaceC0561a interfaceC0561a, Typeface typeface) {
        this.f42217a = typeface;
        this.f42218b = interfaceC0561a;
    }

    @Override // p7.AbstractC5405f
    public void a(int i10) {
        d(this.f42217a);
    }

    @Override // p7.AbstractC5405f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f42219c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f42219c) {
            return;
        }
        this.f42218b.a(typeface);
    }
}
