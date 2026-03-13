package X6;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: renamed from: X6.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2518w2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2542z2 f19282f;

    public RunnableC2518w2(C2542z2 c2542z2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f19277a = i10;
        this.f19278b = str;
        this.f19279c = obj;
        this.f19280d = obj2;
        this.f19281e = obj3;
        Objects.requireNonNull(c2542z2);
        this.f19282f = c2542z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2542z2 c2542z2 = this.f19282f;
        N2 n2X = c2542z2.f18400a.x();
        if (!n2X.k()) {
            Log.println(6, c2542z2.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c2542z2.D() == 0) {
            C2416j3 c2416j3 = c2542z2.f18400a;
            if (c2416j3.w().B()) {
                c2416j3.c();
                c2542z2.E('C');
            } else {
                c2416j3.c();
                c2542z2.E('c');
            }
        }
        if (c2542z2.F() < 0) {
            c2542z2.f18400a.w().A();
            c2542z2.G(133005L);
        }
        int i10 = this.f19277a;
        char cD = c2542z2.D();
        long jF = c2542z2.F();
        String str = this.f19278b;
        Object obj = this.f19279c;
        Object obj2 = this.f19280d;
        Object obj3 = this.f19281e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strA = C2542z2.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cD).length() + String.valueOf(jF).length() + 1 + strA.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cD);
        sb2.append(jF);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(strA);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, RecognitionOptions.UPC_E);
        }
        L2 l22 = n2X.f18424e;
        if (l22 != null) {
            l22.a(string, 1L);
        }
    }
}
