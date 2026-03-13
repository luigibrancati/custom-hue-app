package R9;

import M6.AbstractC1215f;
import M6.AbstractC1218i;
import M6.C1217h;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import b7.InterfaceC2873g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import s6.C5785d;
import t6.InterfaceC5848f;
import v6.AbstractC6056k;
import y6.AbstractC6441c;
import y6.C6440b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AbstractC1218i f14966A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC1218i f14967B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5785d[] f14968a = new C5785d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5785d f14969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5785d f14970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5785d f14971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5785d f14972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5785d f14973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5785d f14974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5785d f14975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5785d f14976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5785d f14977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5785d f14978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5785d f14979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5785d f14980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5785d f14981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5785d f14982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5785d f14983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5785d f14984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5785d f14985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5785d f14986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5785d f14987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5785d f14988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5785d f14989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5785d f14990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5785d f14991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C5785d f14992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C5785d f14993z;

    static {
        C5785d c5785d = new C5785d("vision.barcode", 1L);
        f14969b = c5785d;
        C5785d c5785d2 = new C5785d("vision.custom.ica", 1L);
        f14970c = c5785d2;
        C5785d c5785d3 = new C5785d("vision.face", 1L);
        f14971d = c5785d3;
        C5785d c5785d4 = new C5785d("vision.ica", 1L);
        f14972e = c5785d4;
        C5785d c5785d5 = new C5785d("vision.ocr", 1L);
        f14973f = c5785d5;
        f14974g = new C5785d("mlkit.ocr.chinese", 1L);
        f14975h = new C5785d("mlkit.ocr.common", 1L);
        f14976i = new C5785d("mlkit.ocr.devanagari", 1L);
        f14977j = new C5785d("mlkit.ocr.japanese", 1L);
        f14978k = new C5785d("mlkit.ocr.korean", 1L);
        C5785d c5785d6 = new C5785d("mlkit.langid", 1L);
        f14979l = c5785d6;
        C5785d c5785d7 = new C5785d("mlkit.nlclassifier", 1L);
        f14980m = c5785d7;
        C5785d c5785d8 = new C5785d("tflite_dynamite", 1L);
        f14981n = c5785d8;
        C5785d c5785d9 = new C5785d("mlkit.barcode.ui", 1L);
        f14982o = c5785d9;
        C5785d c5785d10 = new C5785d("mlkit.smartreply", 1L);
        f14983p = c5785d10;
        f14984q = new C5785d("mlkit.image.caption", 1L);
        f14985r = new C5785d("mlkit.docscan.detect", 1L);
        f14986s = new C5785d("mlkit.docscan.crop", 1L);
        f14987t = new C5785d("mlkit.docscan.enhance", 1L);
        f14988u = new C5785d("mlkit.docscan.ui", 1L);
        f14989v = new C5785d("mlkit.docscan.stain", 1L);
        f14990w = new C5785d("mlkit.docscan.shadow", 1L);
        f14991x = new C5785d("mlkit.quality.aesthetic", 1L);
        f14992y = new C5785d("mlkit.quality.technical", 1L);
        f14993z = new C5785d("mlkit.segmentation.subject", 1L);
        C1217h c1217h = new C1217h();
        c1217h.a("barcode", c5785d);
        c1217h.a("custom_ica", c5785d2);
        c1217h.a("face", c5785d3);
        c1217h.a("ica", c5785d4);
        c1217h.a("ocr", c5785d5);
        c1217h.a("langid", c5785d6);
        c1217h.a("nlclassifier", c5785d7);
        c1217h.a("tflite_dynamite", c5785d8);
        c1217h.a("barcode_ui", c5785d9);
        c1217h.a("smart_reply", c5785d10);
        f14966A = c1217h.b();
        C1217h c1217h2 = new C1217h();
        c1217h2.a("com.google.android.gms.vision.barcode", c5785d);
        c1217h2.a("com.google.android.gms.vision.custom.ica", c5785d2);
        c1217h2.a("com.google.android.gms.vision.face", c5785d3);
        c1217h2.a("com.google.android.gms.vision.ica", c5785d4);
        c1217h2.a("com.google.android.gms.vision.ocr", c5785d5);
        c1217h2.a("com.google.android.gms.mlkit.langid", c5785d6);
        c1217h2.a("com.google.android.gms.mlkit.nlclassifier", c5785d7);
        c1217h2.a("com.google.android.gms.tflite_dynamite", c5785d8);
        c1217h2.a("com.google.android.gms.mlkit_smartreply", c5785d10);
        f14967B = c1217h2.b();
    }

    public static boolean a(Context context, List list) {
        if (com.google.android.gms.common.a.f().a(context) >= 221500000) {
            return b(context, f(f14967B, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f29111b, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final C5785d[] c5785dArr) {
        try {
            return ((C6440b) Tasks.await(AbstractC6441c.a(context).c(new InterfaceC5848f() { // from class: R9.C
                @Override // t6.InterfaceC5848f
                public final C5785d[] a() {
                    C5785d[] c5785dArr2 = l.f14968a;
                    return c5785dArr;
                }
            }).e(new InterfaceC2873g() { // from class: R9.D
                @Override // b7.InterfaceC2873g
                public final void c(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).d();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void c(Context context, String str) {
        d(context, AbstractC1215f.l(str));
    }

    public static void d(Context context, List list) {
        if (com.google.android.gms.common.a.f().a(context) >= 221500000) {
            e(context, f(f14966A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final C5785d[] c5785dArr) {
        AbstractC6441c.a(context).b(y6.f.d().a(new InterfaceC5848f() { // from class: R9.A
            @Override // t6.InterfaceC5848f
            public final C5785d[] a() {
                C5785d[] c5785dArr2 = l.f14968a;
                return c5785dArr;
            }
        }).b()).e(new InterfaceC2873g() { // from class: R9.B
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    public static C5785d[] f(Map map, List list) {
        C5785d[] c5785dArr = new C5785d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c5785dArr[i10] = (C5785d) AbstractC6056k.l((C5785d) map.get(list.get(i10)));
        }
        return c5785dArr;
    }
}
