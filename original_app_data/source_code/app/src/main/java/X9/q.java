package X9;

import N6.A9;
import N6.C1344i;
import N6.C1370k;
import N6.C1409n;
import N6.Sa;
import N6.Z7;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import java.util.ArrayList;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1344i f19426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sa f19427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1370k f19428e;

    public q(Context context, T9.b bVar, Sa sa2) {
        C1344i c1344i = new C1344i();
        this.f19426c = c1344i;
        this.f19425b = context;
        c1344i.f10303a = bVar.a();
        this.f19427d = sa2;
    }

    @Override // X9.m
    public final List a(Y9.a aVar) throws N9.a {
        A9[] a9ArrJ6;
        if (this.f19428e == null) {
            b();
        }
        C1370k c1370k = this.f19428e;
        if (c1370k == null) {
            throw new N9.a("Error initializing the legacy barcode scanner.", 14);
        }
        C1370k c1370k2 = (C1370k) AbstractC6056k.l(c1370k);
        C1409n c1409n = new C1409n(aVar.l(), aVar.h(), 0, 0L, Z9.b.a(aVar.k()));
        try {
            int iG = aVar.g();
            if (iG == -1) {
                a9ArrJ6 = c1370k2.J6(ObjectWrapper.wrap(aVar.d()), c1409n);
            } else if (iG == 17) {
                a9ArrJ6 = c1370k2.I6(ObjectWrapper.wrap(aVar.e()), c1409n);
            } else if (iG == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) AbstractC6056k.l(aVar.j());
                c1409n.f10372a = planeArr[0].getRowStride();
                a9ArrJ6 = c1370k2.I6(ObjectWrapper.wrap(planeArr[0].getBuffer()), c1409n);
            } else {
                if (iG != 842094169) {
                    throw new N9.a("Unsupported image format: " + aVar.g(), 3);
                }
                a9ArrJ6 = c1370k2.I6(ObjectWrapper.wrap(Z9.c.d().c(aVar, false)), c1409n);
            }
            ArrayList arrayList = new ArrayList();
            for (A9 a92 : a9ArrJ6) {
                arrayList.add(new V9.a(new p(a92), aVar.f()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new N9.a("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // X9.m
    public final boolean b() throws N9.a {
        if (this.f19428e != null) {
            return false;
        }
        try {
            C1370k c1370kV0 = zzal.zza(DynamiteModule.e(this.f19425b, DynamiteModule.f29111b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).v0(ObjectWrapper.wrap(this.f19425b), this.f19426c);
            this.f19428e = c1370kV0;
            if (c1370kV0 == null && !this.f19424a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                R9.l.c(this.f19425b, "barcode");
                this.f19424a = true;
                b.e(this.f19427d, Z7.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new N9.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f19427d, Z7.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new N9.a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new N9.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // X9.m
    public final void zzb() {
        C1370k c1370k = this.f19428e;
        if (c1370k != null) {
            try {
                c1370k.c();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f19428e = null;
        }
    }
}
