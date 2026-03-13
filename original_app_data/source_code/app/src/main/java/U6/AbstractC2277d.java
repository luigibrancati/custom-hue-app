package U6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2277d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static L6.u f16668a;

    public static C2276c a() {
        try {
            return new C2276c(g().c());
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public static C2276c b(float f10) {
        try {
            return new C2276c(g().J0(f10));
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public static C2276c c(String str) {
        AbstractC6056k.m(str, "assetName must not be null");
        try {
            return new C2276c(g().P5(str));
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public static C2276c d(Bitmap bitmap) {
        AbstractC6056k.m(bitmap, "image must not be null");
        try {
            return new C2276c(g().f1(bitmap));
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public static C2276c e(C2293u c2293u) {
        try {
            return new C2276c(g().C3(c2293u));
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public static void f(L6.u uVar) {
        if (f16668a != null) {
            return;
        }
        f16668a = (L6.u) AbstractC6056k.m(uVar, "delegate must not be null");
    }

    public static L6.u g() {
        return (L6.u) AbstractC6056k.m(f16668a, "IBitmapDescriptorFactory is not initialized");
    }
}
