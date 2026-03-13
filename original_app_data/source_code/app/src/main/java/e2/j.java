package e2;

import D1.w;
import I1.s;
import e2.k;
import e2.m;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33621a;

    public j() {
        this(-1);
    }

    @Override // e2.k
    public long a(k.c cVar) {
        IOException iOException = cVar.f33630c;
        if ((iOException instanceof w) || (iOException instanceof FileNotFoundException) || (iOException instanceof I1.p) || (iOException instanceof m.h) || I1.g.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f33631d - 1) * 1000, 5000);
    }

    @Override // e2.k
    public int b(int i10) {
        int i11 = this.f33621a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // e2.k
    public k.b c(k.a aVar, k.c cVar) {
        if (!e(cVar.f33630c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof s)) {
            return false;
        }
        int i10 = ((s) iOException).f5505d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public j(int i10) {
        this.f33621a = i10;
    }
}
