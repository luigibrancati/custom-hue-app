package db;

import E.C0812s0;
import E.C0817v;
import E.C0822x0;
import E.G;
import E.I0;
import E.InterfaceC0800m;
import E.InterfaceC0802n;
import E.InterfaceC0815u;
import E.L;
import E.S;
import E.V0;
import E.Y0;
import E.z0;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import X.c;
import a0.k;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.media.Image;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.Camera2Config;
import androidx.lifecycle.AbstractC2763t;
import androidx.lifecycle.InterfaceC2758n;
import b7.InterfaceC2872f;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import com.google.android.gms.tasks.Task;
import eb.C3977c;
import eb.EnumC3976b;
import fb.AbstractC4007a;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.InterfaceC4023f;
import gc.C4179C;
import gc.C4207u;
import io.flutter.view.TextureRegistry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4857n;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import xc.C6361d;

/* JADX INFO: renamed from: db.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3887x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f33278x = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f33279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureRegistry f33280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.r f33281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f33282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3872i f33283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vc.l f33284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0.k f33285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0800m f33286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0817v f33287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0822x0 f33288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextureRegistry.SurfaceProducer f33289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T9.a f33290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f33291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f33292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DisplayManager.DisplayListener f33293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ExecutorService f33294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f33295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f33296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EnumC3976b f33297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f33298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f33299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S.a f33301w;

    /* JADX INFO: renamed from: db.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements vc.l {
        public a(Object obj) {
            super(1, obj, b.class, "defaultBarcodeScannerFactory", "defaultBarcodeScannerFactory(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;", 0);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final T9.a invoke(T9.b bVar) {
            return ((b) this.receiver).c(bVar);
        }
    }

    /* JADX INFO: renamed from: db.x$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void b() {
            try {
                G.a aVarB = G.a.b(Camera2Config.c());
                aVarB.g(6);
                AbstractC4862t.d(aVarB, "apply(...)");
                k.a aVar = a0.k.f20498b;
                E.G gA = aVarB.a();
                AbstractC4862t.d(gA, "build(...)");
                aVar.c(gA);
            } catch (IllegalStateException unused) {
            }
        }

        public final T9.a c(T9.b bVar) {
            T9.a aVarA = bVar == null ? T9.c.a() : T9.c.b(bVar);
            AbstractC4862t.d(aVarA, "getClient(...)");
            return aVarA;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: db.x$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.L f33303k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f33304l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C3887x f33305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f33306n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.L l10, androidx.camera.core.d dVar, C3887x c3887x, List list, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f33303k = l10;
            this.f33304l = dVar;
            this.f33305m = c3887x;
            this.f33306n = list;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f33303k, this.f33304l, this.f33305m, this.f33306n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC0815u interfaceC0815uB;
            C5046c.f();
            if (this.f33302j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Bitmap bitmapN0 = (Bitmap) this.f33303k.f39776a;
            if (bitmapN0 == null) {
                bitmapN0 = this.f33304l.N0();
                AbstractC4862t.d(bitmapN0, "toBitmap(...)");
            }
            InterfaceC0800m interfaceC0800m = this.f33305m.f33286h;
            Bitmap bitmapB = AbstractC4007a.b(bitmapN0, (interfaceC0800m == null || (interfaceC0815uB = interfaceC0800m.b()) == null) ? 90 : interfaceC0815uB.c());
            if (this.f33305m.f33296r) {
                Bitmap bitmapA = AbstractC4007a.a(bitmapB);
                bitmapB.recycle();
                bitmapB = bitmapA;
            }
            if (!AbstractC4862t.a(bitmapN0, bitmapB)) {
                bitmapN0.recycle();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapB.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            this.f33305m.f33281c.invoke(this.f33306n, byteArrayOutputStream.toByteArray(), AbstractC5158b.c(bitmapB.getWidth()), AbstractC5158b.c(bitmapB.getHeight()));
            bitmapB.recycle();
            this.f33304l.close();
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: db.x$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements androidx.lifecycle.x, InterfaceC4857n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.l f33308a;

        public e(vc.l function) {
            AbstractC4862t.e(function, "function");
            this.f33308a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC4857n
        public final InterfaceC4023f a() {
            return this.f33308a;
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void b(Object obj) {
            this.f33308a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof InterfaceC4857n)) {
                return AbstractC4862t.a(a(), ((InterfaceC4857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public C3887x(Activity activity, TextureRegistry textureRegistry, vc.r mobileScannerCallback, vc.l mobileScannerErrorCallback, C3872i deviceOrientationListener, vc.l barcodeScannerFactory) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(textureRegistry, "textureRegistry");
        AbstractC4862t.e(mobileScannerCallback, "mobileScannerCallback");
        AbstractC4862t.e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        AbstractC4862t.e(deviceOrientationListener, "deviceOrientationListener");
        AbstractC4862t.e(barcodeScannerFactory, "barcodeScannerFactory");
        this.f33279a = activity;
        this.f33280b = textureRegistry;
        this.f33281c = mobileScannerCallback;
        this.f33282d = mobileScannerErrorCallback;
        this.f33283e = deviceOrientationListener;
        this.f33284f = barcodeScannerFactory;
        f33278x.b();
        this.f33294p = Executors.newSingleThreadExecutor();
        this.f33297s = EnumC3976b.NO_DUPLICATES;
        this.f33298t = 250L;
        this.f33301w = new S.a() { // from class: db.s
            @Override // E.S.a
            public final void b(androidx.camera.core.d dVar) {
                C3887x.w(this.f33273a, dVar);
            }
        };
    }

    public static final void A(C3887x c3887x) {
        c3887x.f33292n = false;
    }

    public static final void C(C3887x c3887x, TextureRegistry.SurfaceProducer surfaceProducer, V0 request) {
        AbstractC4862t.e(request, "request");
        surfaceProducer.setCallback(new d(request));
        surfaceProducer.setSize(request.n().getWidth(), request.n().getHeight());
        final Surface surface = surfaceProducer.getSurface();
        AbstractC4862t.d(surface, "getSurface(...)");
        request.r(surface, Executors.newSingleThreadExecutor(), new X0.a() { // from class: db.n
            @Override // X0.a
            public final void accept(Object obj) {
                C3887x.D(surface, (V0.g) obj);
            }
        });
    }

    public static final void D(Surface surface, V0.g gVar) {
        surface.release();
        gVar.a();
    }

    public static final void R(C3887x c3887x, O7.e eVar, vc.l lVar, Size size, C0817v c0817v, vc.l lVar2, boolean z10, Double d10, final vc.l lVar3, final vc.l lVar4) {
        InterfaceC0815u interfaceC0815uB;
        Integer num;
        InterfaceC0815u interfaceC0815uB2;
        List listF;
        a0.k kVar = (a0.k) eVar.get();
        c3887x.f33285g = kVar;
        InterfaceC0800m interfaceC0800mD = null;
        Integer numValueOf = (kVar == null || (listF = kVar.f()) == null) ? null : Integer.valueOf(listF.size());
        a0.k kVar2 = c3887x.f33285g;
        if (kVar2 == null) {
            lVar.invoke(new C3870g());
            return;
        }
        if (kVar2 != null) {
            kVar2.h();
        }
        TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = c3887x.f33289k;
        if (surfaceProducerCreateSurfaceProducer == null) {
            surfaceProducerCreateSurfaceProducer = c3887x.f33280b.createSurfaceProducer();
            AbstractC4862t.d(surfaceProducerCreateSurfaceProducer, "createSurfaceProducer(...)");
        }
        c3887x.f33289k = surfaceProducerCreateSurfaceProducer;
        AbstractC4862t.b(surfaceProducerCreateSurfaceProducer);
        C0822x0.c cVarB = c3887x.B(surfaceProducerCreateSurfaceProducer);
        C0822x0 c0822x0C = new C0822x0.a().c();
        c0822x0C.m0(cVarB);
        c3887x.f33288j = c0822x0C;
        S.c cVarJ = new S.c().f(0).j(1);
        AbstractC4862t.d(cVarJ, "setOutputImageFormat(...)");
        Object systemService = c3887x.f33279a.getApplicationContext().getSystemService("display");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        Size size2 = size == null ? new Size(1920, 1080) : size;
        c.a aVar = new c.a();
        aVar.f(new X.d(size2, 1));
        cVarJ.k(aVar.a()).c();
        if (c3887x.f33293o == null) {
            f fVar = new f(size2, cVarJ);
            c3887x.f33293o = fVar;
            displayManager.registerDisplayListener(fVar, null);
        }
        E.S sC = cVarJ.c();
        sC.s0(c3887x.f33294p, c3887x.f33301w);
        AbstractC4862t.d(sC, "apply(...)");
        try {
            a0.k kVar3 = c3887x.f33285g;
            if (kVar3 != null) {
                ComponentCallbacks2 componentCallbacks2 = c3887x.f33279a;
                AbstractC4862t.c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                interfaceC0800mD = kVar3.d((InterfaceC2758n) componentCallbacks2, c0817v, c3887x.f33288j, sC);
            }
            c3887x.f33286h = interfaceC0800mD;
            c3887x.f33287i = c0817v;
            if (interfaceC0800mD != null) {
                AbstractC2763t abstractC2763tN = interfaceC0800mD.b().n();
                ComponentCallbacks2 componentCallbacks22 = c3887x.f33279a;
                AbstractC4862t.c(componentCallbacks22, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                abstractC2763tN.observe((InterfaceC2758n) componentCallbacks22, new e(new vc.l() { // from class: db.k
                    @Override // vc.l
                    public final Object invoke(Object obj) {
                        return C3887x.S(lVar3, (Integer) obj);
                    }
                }));
                interfaceC0800mD.b().q().observe((InterfaceC2758n) c3887x.f33279a, new e(new vc.l() { // from class: db.l
                    @Override // vc.l
                    public final Object invoke(Object obj) {
                        return C3887x.T(lVar4, (Y0) obj);
                    }
                }));
                if (interfaceC0800mD.b().i()) {
                    interfaceC0800mD.a().h(z10);
                }
                if (d10 != null) {
                    try {
                        if (Bc.j.b(0.0d, 1.0d).a(d10)) {
                            interfaceC0800mD.a().c((float) d10.doubleValue());
                        } else {
                            interfaceC0800mD.a().e((float) d10.doubleValue());
                        }
                    } catch (Exception unused) {
                        lVar.invoke(new C3862S());
                        return;
                    }
                }
            }
            z0 z0VarO0 = sC.o0();
            AbstractC4862t.b(z0VarO0);
            Size sizeA = z0VarO0.a();
            AbstractC4862t.d(sizeA, "getResolution(...)");
            double width = sizeA.getWidth();
            double height = sizeA.getHeight();
            InterfaceC0800m interfaceC0800m = c3887x.f33286h;
            int iC = (interfaceC0800m == null || (interfaceC0815uB2 = interfaceC0800m.b()) == null) ? 0 : interfaceC0815uB2.c();
            boolean z11 = iC % 180 == 0;
            Integer numF = c3887x.F(c3887x.f33286h);
            InterfaceC0800m interfaceC0800m2 = c3887x.f33286h;
            int iIntValue = -1;
            if (interfaceC0800m2 != null && (interfaceC0815uB = interfaceC0800m2.b()) != null && interfaceC0815uB.i() && (num = (Integer) interfaceC0815uB.n().getValue()) != null) {
                iIntValue = num.intValue();
            }
            int i10 = iIntValue;
            c3887x.f33283e.d();
            double d11 = z11 ? width : height;
            double d12 = z11 ? height : width;
            String strA = fb.b.a(c3887x.f33283e.b());
            TextureRegistry.SurfaceProducer surfaceProducer = c3887x.f33289k;
            AbstractC4862t.b(surfaceProducer);
            boolean zHandlesCropAndRotation = surfaceProducer.handlesCropAndRotation();
            TextureRegistry.SurfaceProducer surfaceProducer2 = c3887x.f33289k;
            AbstractC4862t.b(surfaceProducer2);
            lVar2.invoke(new C3977c(d11, d12, strA, iC, zHandlesCropAndRotation, i10, surfaceProducer2.id(), numValueOf != null ? numValueOf.intValue() : 0, numF));
        } catch (Exception unused2) {
            lVar.invoke(new C3861Q());
        }
    }

    public static final C4015H S(vc.l lVar, Integer num) {
        AbstractC4862t.b(num);
        lVar.invoke(num);
        return C4015H.f34254a;
    }

    public static final C4015H T(vc.l lVar, Y0 y02) {
        lVar.invoke(Double.valueOf(y02.b()));
        return C4015H.f34254a;
    }

    public static /* synthetic */ void V(C3887x c3887x, boolean z10, int i10, Object obj) throws C3866c {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c3887x.U(z10);
    }

    public static final C4015H s(vc.l lVar, List list) {
        AbstractC4862t.b(list);
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            V9.a aVar = (V9.a) it.next();
            AbstractC4862t.b(aVar);
            arrayList.add(AbstractC3860P.l(aVar));
        }
        lVar.invoke(arrayList);
        return C4015H.f34254a;
    }

    public static final void t(vc.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void u(vc.l lVar, Exception e10) {
        AbstractC4862t.e(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        lVar.invoke(localizedMessage);
    }

    public static final void v(T9.a aVar, Task it) {
        AbstractC4862t.e(it, "it");
        aVar.close();
    }

    public static final void w(final C3887x c3887x, final androidx.camera.core.d imageProxy) {
        final Y9.a aVarC;
        AbstractC4862t.e(imageProxy, "imageProxy");
        Image imageS0 = imageProxy.S0();
        if (imageS0 == null) {
            return;
        }
        EnumC3976b enumC3976b = c3887x.f33297s;
        EnumC3976b enumC3976b2 = EnumC3976b.NORMAL;
        if (enumC3976b == enumC3976b2 && c3887x.f33292n) {
            imageProxy.close();
            return;
        }
        if (enumC3976b == enumC3976b2) {
            c3887x.f33292n = true;
        }
        final kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        if (c3887x.f33296r) {
            Bitmap bitmapN0 = imageProxy.N0();
            AbstractC4862t.d(bitmapN0, "toBitmap(...)");
            l10.f39776a = AbstractC4007a.a(bitmapN0);
            bitmapN0.recycle();
            aVarC = Y9.a.a((Bitmap) l10.f39776a, imageProxy.L0().d());
        } else {
            aVarC = Y9.a.c(imageS0, imageProxy.L0().d());
        }
        AbstractC4862t.b(aVarC);
        T9.a aVar = c3887x.f33290l;
        if (aVar != null) {
            Task taskC0 = aVar.c0(aVarC);
            final vc.l lVar = new vc.l() { // from class: db.j
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C3887x.x(this.f33251a, imageProxy, aVarC, l10, (List) obj);
                }
            };
            taskC0.h(new InterfaceC2874h() { // from class: db.o
                @Override // b7.InterfaceC2874h
                public final void onSuccess(Object obj) {
                    C3887x.y(lVar, obj);
                }
            }).e(new InterfaceC2873g() { // from class: db.p
                @Override // b7.InterfaceC2873g
                public final void c(Exception exc) {
                    C3887x.z(this.f33261a, exc);
                }
            });
        }
        if (c3887x.f33297s == enumC3976b2) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: db.q
                @Override // java.lang.Runnable
                public final void run() {
                    C3887x.A(this.f33262a);
                }
            }, c3887x.f33298t);
        }
    }

    public static final C4015H x(C3887x c3887x, androidx.camera.core.d dVar, Y9.a aVar, kotlin.jvm.internal.L l10, List list) {
        InterfaceC0815u interfaceC0815uB;
        if (c3887x.f33297s == EnumC3976b.NO_DUPLICATES) {
            AbstractC4862t.b(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strL = ((V9.a) it.next()).l();
                if (strL != null) {
                    arrayList.add(strL);
                }
            }
            List listI0 = C4179C.I0(arrayList);
            if (AbstractC4862t.a(listI0, c3887x.f33291m)) {
                dVar.close();
                return C4015H.f34254a;
            }
            if (!listI0.isEmpty()) {
                c3887x.f33291m = listI0;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            V9.a aVar2 = (V9.a) it2.next();
            List list2 = c3887x.f33295q;
            if (list2 == null) {
                AbstractC4862t.b(aVar2);
                arrayList2.add(AbstractC3860P.l(aVar2));
            } else {
                AbstractC4862t.b(list2);
                AbstractC4862t.b(aVar2);
                AbstractC4862t.b(dVar);
                if (c3887x.G(list2, aVar2, dVar)) {
                    arrayList2.add(AbstractC3860P.l(aVar2));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            dVar.close();
            return C4015H.f34254a;
        }
        InterfaceC0800m interfaceC0800m = c3887x.f33286h;
        boolean z10 = ((interfaceC0800m == null || (interfaceC0815uB = interfaceC0800m.b()) == null) ? 0 : interfaceC0815uB.c()) % 180 == 0;
        if (c3887x.f33299u) {
            AbstractC2132i.d(Rd.N.a(C2123d0.b()), null, null, new c(l10, dVar, c3887x, arrayList2, null), 3, null);
            return C4015H.f34254a;
        }
        c3887x.f33281c.invoke(arrayList2, null, Integer.valueOf(z10 ? aVar.l() : aVar.h()), Integer.valueOf(z10 ? aVar.h() : aVar.l()));
        Bitmap bitmap = (Bitmap) l10.f39776a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        dVar.close();
        return C4015H.f34254a;
    }

    public static final void y(vc.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void z(C3887x c3887x, Exception e10) {
        AbstractC4862t.e(e10, "e");
        vc.l lVar = c3887x.f33282d;
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = e10.toString();
        }
        lVar.invoke(localizedMessage);
    }

    public final C0822x0.c B(final TextureRegistry.SurfaceProducer surfaceProducer) {
        AbstractC4862t.e(surfaceProducer, "surfaceProducer");
        return new C0822x0.c() { // from class: db.m
            @Override // E.C0822x0.c
            public final void a(V0 v02) {
                C3887x.C(this.f33257a, surfaceProducer, v02);
            }
        };
    }

    public final void E() throws C3866c {
        if (H()) {
            return;
        }
        V(this, false, 1, null);
    }

    public final Integer F(InterfaceC0800m interfaceC0800m) {
        InterfaceC0815u interfaceC0815uB;
        Integer numValueOf = (interfaceC0800m == null || (interfaceC0815uB = interfaceC0800m.b()) == null) ? null : Integer.valueOf(interfaceC0815uB.f());
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return 0;
        }
        return (numValueOf != null && numValueOf.intValue() == 2) ? 2 : null;
    }

    public final boolean G(List scanWindow, V9.a barcode, androidx.camera.core.d inputImage) {
        AbstractC4862t.e(scanWindow, "scanWindow");
        AbstractC4862t.e(barcode, "barcode");
        AbstractC4862t.e(inputImage, "inputImage");
        Rect rectA = barcode.a();
        if (rectA == null) {
            return false;
        }
        try {
            float height = inputImage.getHeight();
            float width = inputImage.getWidth();
            return new Rect(C6361d.c(((Number) scanWindow.get(0)).floatValue() * height), C6361d.c(((Number) scanWindow.get(1)).floatValue() * width), C6361d.c(((Number) scanWindow.get(2)).floatValue() * height), C6361d.c(((Number) scanWindow.get(3)).floatValue() * width)).contains(rectA);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final boolean H() {
        return this.f33286h == null && this.f33288j == null;
    }

    public final void I(boolean z10) throws C3866c, C3864a {
        if (!z10) {
            if (this.f33300v) {
                throw new C3864a();
            }
            if (H()) {
                throw new C3866c();
            }
        }
        this.f33283e.e();
        J();
    }

    public final void J() {
        a0.k kVar = this.f33285g;
        if (kVar != null) {
            kVar.h();
        }
        this.f33300v = true;
    }

    public final void K() {
        InterfaceC0815u interfaceC0815uB;
        if (this.f33293o != null) {
            Object systemService = this.f33279a.getApplicationContext().getSystemService("display");
            AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            ((DisplayManager) systemService).unregisterDisplayListener(this.f33293o);
            this.f33293o = null;
        }
        ComponentCallbacks2 componentCallbacks2 = this.f33279a;
        AbstractC4862t.c(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        InterfaceC2758n interfaceC2758n = (InterfaceC2758n) componentCallbacks2;
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m != null && (interfaceC0815uB = interfaceC0800m.b()) != null) {
            interfaceC0815uB.n().removeObservers(interfaceC2758n);
            interfaceC0815uB.q().removeObservers(interfaceC2758n);
            interfaceC0815uB.o().removeObservers(interfaceC2758n);
        }
        a0.k kVar = this.f33285g;
        if (kVar != null) {
            kVar.h();
        }
        TextureRegistry.SurfaceProducer surfaceProducer = this.f33289k;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f33289k = null;
        T9.a aVar = this.f33290l;
        if (aVar != null) {
            aVar.close();
        }
        this.f33290l = null;
        this.f33291m = null;
        this.f33294p.shutdown();
        this.f33294p = Executors.newSingleThreadExecutor();
    }

    public final void L() throws C3863T {
        InterfaceC0802n interfaceC0802nA;
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m == null) {
            throw new C3863T();
        }
        if (interfaceC0800m == null || (interfaceC0802nA = interfaceC0800m.a()) == null) {
            return;
        }
        interfaceC0802nA.e(1.0f);
    }

    public final void M(float f10, float f11) throws C3863T {
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m == null) {
            throw new C3863T();
        }
        if (0.0f > f10 || f10 > 1.0f || 0.0f > f11 || f11 > 1.0f) {
            throw new IllegalArgumentException("Focus coordinates must be between 0.0 and 1.0");
        }
        C0812s0 c0812s0B = new I0(1.0f, 1.0f).b(f10, f11);
        AbstractC4862t.d(c0812s0B, "createPoint(...)");
        E.L lB = new L.a(c0812s0B, 1).b();
        AbstractC4862t.d(lB, "build(...)");
        interfaceC0800m.a().k(lB);
    }

    public final void N(double d10) throws C3863T, C3862S {
        InterfaceC0802n interfaceC0802nA;
        if (d10 > 1.0d || d10 < 0.0d) {
            throw new C3862S();
        }
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m == null) {
            throw new C3863T();
        }
        if (interfaceC0800m == null || (interfaceC0802nA = interfaceC0800m.a()) == null) {
            return;
        }
        interfaceC0802nA.c((float) d10);
    }

    public final void O(List list) {
        this.f33295q = list;
    }

    public final void P(double d10) throws C3863T {
        InterfaceC0802n interfaceC0802nA;
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m == null) {
            throw new C3863T();
        }
        if (interfaceC0800m == null || (interfaceC0802nA = interfaceC0800m.a()) == null) {
            return;
        }
        interfaceC0802nA.e((float) d10);
    }

    public final void Q(T9.b bVar, boolean z10, final C0817v cameraPosition, final boolean z11, EnumC3976b detectionSpeed, final vc.l torchStateCallback, final vc.l zoomScaleStateCallback, final vc.l mobileScannerStartedCallback, final vc.l mobileScannerErrorCallback, long j10, final Size size, boolean z12, final Double d10) {
        AbstractC4862t.e(cameraPosition, "cameraPosition");
        AbstractC4862t.e(detectionSpeed, "detectionSpeed");
        AbstractC4862t.e(torchStateCallback, "torchStateCallback");
        AbstractC4862t.e(zoomScaleStateCallback, "zoomScaleStateCallback");
        AbstractC4862t.e(mobileScannerStartedCallback, "mobileScannerStartedCallback");
        AbstractC4862t.e(mobileScannerErrorCallback, "mobileScannerErrorCallback");
        this.f33297s = detectionSpeed;
        this.f33298t = j10;
        this.f33299u = z10;
        this.f33296r = z12;
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if ((interfaceC0800m != null ? interfaceC0800m.b() : null) != null && this.f33288j != null && this.f33289k != null && !this.f33300v) {
            mobileScannerErrorCallback.invoke(new C3865b());
            return;
        }
        this.f33291m = null;
        this.f33290l = (T9.a) this.f33284f.invoke(bVar);
        final O7.e eVarD = a0.k.f20498b.d(this.f33279a);
        Executor executorI = L0.a.i(this.f33279a);
        AbstractC4862t.d(executorI, "getMainExecutor(...)");
        eVarD.b(new Runnable() { // from class: db.r
            @Override // java.lang.Runnable
            public final void run() {
                C3887x.R(this.f33263a, eVarD, mobileScannerErrorCallback, size, cameraPosition, mobileScannerStartedCallback, z11, d10, torchStateCallback, zoomScaleStateCallback);
            }
        }, executorI);
    }

    public final void U(boolean z10) throws C3866c {
        if (!z10 && !this.f33300v && H()) {
            throw new C3866c();
        }
        this.f33283e.e();
        K();
    }

    public final void W() {
        InterfaceC0800m interfaceC0800m = this.f33286h;
        if (interfaceC0800m == null || !interfaceC0800m.b().i()) {
            return;
        }
        Integer num = (Integer) interfaceC0800m.b().n().getValue();
        if (num != null && num.intValue() == 0) {
            interfaceC0800m.a().h(true);
        } else if (num != null && num.intValue() == 1) {
            interfaceC0800m.a().h(false);
        }
    }

    public final void r(Uri image, T9.b bVar, final vc.l onSuccess, final vc.l onError) {
        AbstractC4862t.e(image, "image");
        AbstractC4862t.e(onSuccess, "onSuccess");
        AbstractC4862t.e(onError, "onError");
        try {
            Y9.a aVarB = Y9.a.b(this.f33279a, image);
            AbstractC4862t.d(aVarB, "fromFilePath(...)");
            final T9.a aVar = (T9.a) this.f33284f.invoke(bVar);
            Task taskC0 = aVar.c0(aVarB);
            final vc.l lVar = new vc.l() { // from class: db.t
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C3887x.s(onSuccess, (List) obj);
                }
            };
            taskC0.h(new InterfaceC2874h() { // from class: db.u
                @Override // b7.InterfaceC2874h
                public final void onSuccess(Object obj) {
                    C3887x.t(lVar, obj);
                }
            }).e(new InterfaceC2873g() { // from class: db.v
                @Override // b7.InterfaceC2873g
                public final void c(Exception exc) {
                    C3887x.u(onError, exc);
                }
            }).b(new InterfaceC2872f() { // from class: db.w
                @Override // b7.InterfaceC2872f
                public final void a(Task task) {
                    C3887x.v(aVar, task);
                }
            });
        } catch (IOException unused) {
            onError.invoke("The provided file is not an image.");
        }
    }

    public /* synthetic */ C3887x(Activity activity, TextureRegistry textureRegistry, vc.r rVar, vc.l lVar, C3872i c3872i, vc.l lVar2, int i10, AbstractC4854k abstractC4854k) {
        this(activity, textureRegistry, rVar, lVar, c3872i, (i10 & 32) != 0 ? new a(f33278x) : lVar2);
    }

    /* JADX INFO: renamed from: db.x$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements TextureRegistry.SurfaceProducer.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V0 f33307a;

        public d(V0 v02) {
            this.f33307a = v02;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
        public void onSurfaceCleanup() {
            this.f33307a.p();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
        public void onSurfaceAvailable() {
        }
    }

    /* JADX INFO: renamed from: db.x$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Size f33309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ S.c f33310b;

        public f(Size size, S.c cVar) {
            this.f33309a = size;
            this.f33310b = cVar;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            c.a aVarF = new c.a().f(new X.d(this.f33309a, 1));
            AbstractC4862t.d(aVarF, "setResolutionStrategy(...)");
            this.f33310b.k(aVarF.a()).c();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
