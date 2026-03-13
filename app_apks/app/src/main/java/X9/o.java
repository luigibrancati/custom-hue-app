package X9;

import N6.AbstractC1487t0;
import N6.Fb;
import N6.Hb;
import N6.Pb;
import N6.Rb;
import N6.Sa;
import N6.Xb;
import N6.Z7;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1487t0 f19415h = AbstractC1487t0.l("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f19419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T9.b f19420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Sa f19421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Pb f19422g;

    public o(Context context, T9.b bVar, Sa sa2) {
        this.f19419d = context;
        this.f19420e = bVar;
        this.f19421f = sa2;
    }

    public static boolean c(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // X9.m
    public final List a(Y9.a aVar) throws N9.a {
        if (this.f19422g == null) {
            b();
        }
        Pb pb2 = (Pb) AbstractC6056k.l(this.f19422g);
        if (!this.f19416a) {
            try {
                pb2.d();
                this.f19416a = true;
            } catch (RemoteException e10) {
                throw new N9.a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int iL = aVar.l();
        if (aVar.g() == 35) {
            iL = ((Image.Plane[]) AbstractC6056k.l(aVar.j()))[0].getRowStride();
        }
        try {
            List listI6 = pb2.I6(Z9.d.b().a(aVar), new Xb(aVar.g(), iL, aVar.h(), Z9.b.a(aVar.k()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listI6.iterator();
            while (it.hasNext()) {
                arrayList.add(new V9.a(new n((Fb) it.next()), aVar.f()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new N9.a("Failed to run barcode scanner.", 13, e11);
        }
    }

    @Override // X9.m
    public final boolean b() throws N9.a {
        if (this.f19422g != null) {
            return this.f19417b;
        }
        if (c(this.f19419d)) {
            this.f19417b = true;
            try {
                this.f19422g = d(DynamiteModule.f29112c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new N9.a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new N9.a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f19417b = false;
            if (!R9.l.a(this.f19419d, f19415h)) {
                if (!this.f19418c) {
                    R9.l.d(this.f19419d, AbstractC1487t0.l("barcode", "tflite_dynamite"));
                    this.f19418c = true;
                }
                b.e(this.f19421f, Z7.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new N9.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f19422g = d(DynamiteModule.f29111b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                b.e(this.f19421f, Z7.OPTIONAL_MODULE_INIT_ERROR);
                throw new N9.a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        b.e(this.f19421f, Z7.NO_ERROR);
        return this.f19417b;
    }

    public final Pb d(DynamiteModule.b bVar, String str, String str2) {
        Rb rbZza = zzyn.zza(DynamiteModule.e(this.f19419d, bVar, str).d(str2));
        T9.b bVar2 = this.f19420e;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.f19419d);
        int iA = bVar2.a();
        boolean z10 = true;
        if (!bVar2.d() && this.f19420e.b() == null) {
            z10 = false;
        }
        return rbZza.s3(iObjectWrapperWrap, new Hb(iA, z10));
    }

    @Override // X9.m
    public final void zzb() {
        Pb pb2 = this.f19422g;
        if (pb2 != null) {
            try {
                pb2.e();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f19422g = null;
            this.f19416a = false;
        }
    }
}
