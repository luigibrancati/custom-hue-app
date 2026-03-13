package N6;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W1 implements H8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10111a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10112b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H8.d f10113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1 f10114d;

    public W1(S1 s12) {
        this.f10114d = s12;
    }

    public final void a(H8.d dVar, boolean z10) {
        this.f10111a = false;
        this.f10113c = dVar;
        this.f10112b = z10;
    }

    public final void b() {
        if (this.f10111a) {
            throw new H8.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f10111a = true;
    }

    @Override // H8.h
    public final H8.h f(String str) throws IOException {
        b();
        this.f10114d.h(this.f10113c, str, this.f10112b);
        return this;
    }

    @Override // H8.h
    public final H8.h g(boolean z10) throws IOException {
        b();
        this.f10114d.i(this.f10113c, z10 ? 1 : 0, this.f10112b);
        return this;
    }
}
