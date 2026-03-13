package A7;

import java.io.File;

/* JADX INFO: renamed from: A7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0686j implements B7.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B7.N f206a;

    public C0686j(B7.N n10) {
        this.f206a = n10;
    }

    @Override // B7.N
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f206a.zza();
        if (file == null) {
            return null;
        }
        return D7.c.a(file);
    }
}
