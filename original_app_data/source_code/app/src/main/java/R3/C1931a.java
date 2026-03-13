package R3;

import android.app.Application;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: R3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1931a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1931a f14518a = new C1931a();

    public final String a() {
        String processName = Application.getProcessName();
        AbstractC4862t.d(processName, "getProcessName(...)");
        return processName;
    }
}
