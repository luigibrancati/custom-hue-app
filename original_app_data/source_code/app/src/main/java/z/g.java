package z;

import E.J;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import z.C6485e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g implements C6485e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6485e f48668a = new C6485e(new g());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f48669b = Collections.singleton(J.f2794d);

    @Override // z.C6485e.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // z.C6485e.a
    public Set b() {
        return f48669b;
    }

    @Override // z.C6485e.a
    public Set c(J j10) {
        X0.h.b(J.f2794d.equals(j10), "DynamicRange is not supported: " + j10);
        return f48669b;
    }
}
