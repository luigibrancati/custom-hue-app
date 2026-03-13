package z;

import L.InterfaceC1099g0;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import kotlin.jvm.internal.AbstractC4862t;
import w.C6107a;

/* JADX INFO: renamed from: z.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6482b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6482b f48663a = new C6482b();

    public static final void a(C6107a.C0631a options, InterfaceC1099g0.c priority) {
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
