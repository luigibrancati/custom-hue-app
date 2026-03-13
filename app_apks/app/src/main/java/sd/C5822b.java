package sd;

import Lc.InterfaceC1174b;
import Md.b;

/* JADX INFO: renamed from: sd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5822b implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44464a;

    public C5822b(boolean z10) {
        this.f44464a = z10;
    }

    @Override // Md.b.c
    public Iterable a(Object obj) {
        return AbstractC5823c.g(this.f44464a, (InterfaceC1174b) obj);
    }
}
