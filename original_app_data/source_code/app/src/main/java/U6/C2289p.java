package U6;

import android.os.RemoteException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.f f16704a;

    public C2289p(L6.f fVar) {
        this.f16704a = (L6.f) AbstractC6056k.l(fVar);
    }

    public boolean a() {
        try {
            return this.f16704a.c();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
