package K8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i implements H8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7772a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7773b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H8.d f7774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f7775d;

    public i(f fVar) {
        this.f7775d = fVar;
    }

    public final void a() {
        if (this.f7772a) {
            throw new H8.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f7772a = true;
    }

    public void b(H8.d dVar, boolean z10) {
        this.f7772a = false;
        this.f7774c = dVar;
        this.f7773b = z10;
    }

    @Override // H8.h
    public H8.h f(String str) {
        a();
        this.f7775d.i(this.f7774c, str, this.f7773b);
        return this;
    }

    @Override // H8.h
    public H8.h g(boolean z10) {
        a();
        this.f7775d.o(this.f7774c, z10, this.f7773b);
        return this;
    }
}
