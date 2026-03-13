package O6;

import java.io.IOException;

/* JADX INFO: renamed from: O6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1733p implements H8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11794a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11795b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H8.d f11796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1705l f11797d;

    public C1733p(C1705l c1705l) {
        this.f11797d = c1705l;
    }

    private final void b() {
        if (this.f11794a) {
            throw new H8.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f11794a = true;
    }

    public final void a(H8.d dVar, boolean z10) {
        this.f11794a = false;
        this.f11796c = dVar;
        this.f11795b = z10;
    }

    @Override // H8.h
    public final H8.h f(String str) throws IOException {
        b();
        this.f11797d.h(this.f11796c, str, this.f11795b);
        return this;
    }

    @Override // H8.h
    public final H8.h g(boolean z10) throws IOException {
        b();
        this.f11797d.i(this.f11796c, z10 ? 1 : 0, this.f11795b);
        return this;
    }
}
