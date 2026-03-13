package X9;

import N6.Ba;
import N6.C1262b8;
import N6.C1449q0;
import N6.C1457q8;
import N6.C1575za;
import N6.EnumC1249a8;
import N6.EnumC1392l8;
import N6.EnumC1405m8;
import N6.EnumC1562ya;
import N6.Ha;
import N6.Ra;
import N6.Sa;
import N6.Va;
import N6.Y7;
import N6.Z7;
import R9.C2111i;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f19382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f19383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f19384d;

    static {
        SparseArray sparseArray = new SparseArray();
        f19381a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f19382b = sparseArray2;
        f19383c = new AtomicReference();
        sparseArray.put(-1, EnumC1392l8.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC1392l8.FORMAT_CODE_128);
        sparseArray.put(2, EnumC1392l8.FORMAT_CODE_39);
        sparseArray.put(4, EnumC1392l8.FORMAT_CODE_93);
        sparseArray.put(8, EnumC1392l8.FORMAT_CODABAR);
        sparseArray.put(16, EnumC1392l8.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC1392l8.FORMAT_EAN_13);
        sparseArray.put(64, EnumC1392l8.FORMAT_EAN_8);
        sparseArray.put(128, EnumC1392l8.FORMAT_ITF);
        sparseArray.put(256, EnumC1392l8.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC1392l8.FORMAT_UPC_A);
        sparseArray.put(RecognitionOptions.UPC_E, EnumC1392l8.FORMAT_UPC_E);
        sparseArray.put(RecognitionOptions.PDF417, EnumC1392l8.FORMAT_PDF417);
        sparseArray.put(RecognitionOptions.AZTEC, EnumC1392l8.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC1405m8.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC1405m8.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC1405m8.TYPE_EMAIL);
        sparseArray2.put(3, EnumC1405m8.TYPE_ISBN);
        sparseArray2.put(4, EnumC1405m8.TYPE_PHONE);
        sparseArray2.put(5, EnumC1405m8.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC1405m8.TYPE_SMS);
        sparseArray2.put(7, EnumC1405m8.TYPE_TEXT);
        sparseArray2.put(8, EnumC1405m8.TYPE_URL);
        sparseArray2.put(9, EnumC1405m8.TYPE_WIFI);
        sparseArray2.put(10, EnumC1405m8.TYPE_GEO);
        sparseArray2.put(11, EnumC1405m8.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC1405m8.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f19384d = map;
        map.put(1, EnumC1562ya.CODE_128);
        map.put(2, EnumC1562ya.CODE_39);
        map.put(4, EnumC1562ya.CODE_93);
        map.put(8, EnumC1562ya.CODABAR);
        map.put(16, EnumC1562ya.DATA_MATRIX);
        map.put(32, EnumC1562ya.EAN_13);
        map.put(64, EnumC1562ya.EAN_8);
        map.put(128, EnumC1562ya.ITF);
        map.put(256, EnumC1562ya.QR_CODE);
        map.put(512, EnumC1562ya.UPC_A);
        map.put(Integer.valueOf(RecognitionOptions.UPC_E), EnumC1562ya.UPC_E);
        map.put(Integer.valueOf(RecognitionOptions.PDF417), EnumC1562ya.PDF417);
        map.put(Integer.valueOf(RecognitionOptions.AZTEC), EnumC1562ya.AZTEC);
    }

    public static EnumC1392l8 a(int i10) {
        EnumC1392l8 enumC1392l8 = (EnumC1392l8) f19381a.get(i10);
        return enumC1392l8 == null ? EnumC1392l8.FORMAT_UNKNOWN : enumC1392l8;
    }

    public static EnumC1405m8 b(int i10) {
        EnumC1405m8 enumC1405m8 = (EnumC1405m8) f19382b.get(i10);
        return enumC1405m8 == null ? EnumC1405m8.TYPE_UNKNOWN : enumC1405m8;
    }

    public static Ba c(T9.b bVar) {
        int iA = bVar.a();
        C1449q0 c1449q0 = new C1449q0();
        if (iA == 0) {
            c1449q0.f(f19384d.values());
        } else {
            for (Map.Entry entry : f19384d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c1449q0.e((EnumC1562ya) entry.getValue());
                }
            }
        }
        C1575za c1575za = new C1575za();
        c1575za.b(c1449q0.g());
        return c1575za.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void e(Sa sa2, final Z7 z72) {
        sa2.f(new Ra() { // from class: X9.a
            @Override // N6.Ra
            public final Ha zza() {
                C1262b8 c1262b8 = new C1262b8();
                Y7 y72 = b.f() ? Y7.TYPE_THICK : Y7.TYPE_THIN;
                Z7 z73 = z72;
                c1262b8.e(y72);
                C1457q8 c1457q8 = new C1457q8();
                c1457q8.b(z73);
                c1262b8.h(c1457q8.c());
                return Va.e(c1262b8);
            }
        }, EnumC1249a8.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean f() {
        AtomicReference atomicReference = f19383c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zC = o.c(C2111i.c().b());
        atomicReference.set(Boolean.valueOf(zC));
        return zC;
    }
}
