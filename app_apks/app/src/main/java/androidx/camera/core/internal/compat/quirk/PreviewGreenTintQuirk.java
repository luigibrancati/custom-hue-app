package androidx.camera.core.internal.compat.quirk;

import L.T0;
import Od.C;
import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "LL/T0;", "<init>", "()V", "", "e", "()Z", "", "cameraId", "", "LE/W0;", "appUseCases", "f", "(Ljava/lang/String;Ljava/util/Collection;)Z", "g", "d", "isMotoE20", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewGreenTintQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewGreenTintQuirk f22022a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    public static final boolean e() {
        return f22022a.d();
    }

    public static final boolean f(String cameraId, Collection appUseCases) {
        AbstractC4862t.e(cameraId, "cameraId");
        AbstractC4862t.e(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f22022a;
        if (previewGreenTintQuirk.d()) {
            return previewGreenTintQuirk.g(cameraId, appUseCases);
        }
        return false;
    }

    public final boolean d() {
        return C.E("motorola", Build.BRAND, true) && C.E("moto e20", Build.MODEL, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.String r5, java.util.Collection r6) {
        /*
            r4 = this;
            java.lang.String r4 = "0"
            boolean r4 = kotlin.jvm.internal.AbstractC4862t.a(r5, r4)
            r5 = 0
            if (r4 == 0) goto L65
            int r4 = r6.size()
            r0 = 2
            if (r4 == r0) goto L11
            goto L65
        L11:
            boolean r4 = r6.isEmpty()
            r0 = 1
            if (r4 == 0) goto L1a
        L18:
            r4 = r5
            goto L2f
        L1a:
            java.util.Iterator r4 = r6.iterator()
        L1e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r4.next()
            E.W0 r1 = (E.W0) r1
            boolean r1 = r1 instanceof E.C0822x0
            if (r1 == 0) goto L1e
            r4 = r0
        L2f:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L37
        L35:
            r6 = r5
            goto L60
        L37:
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r6.next()
            E.W0 r1 = (E.W0) r1
            L.s1 r2 = r1.l()
            L.g0$a r3 = L.s1.f8181G
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L3b
            L.s1 r1 = r1.l()
            L.t1$b r1 = r1.S()
            L.t1$b r2 = L.t1.b.VIDEO_CAPTURE
            if (r1 != r2) goto L3b
            r6 = r0
        L60:
            if (r4 == 0) goto L65
            if (r6 == 0) goto L65
            return r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.g(java.lang.String, java.util.Collection):boolean");
    }
}
