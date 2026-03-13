package L;

import E.AbstractC0807p0;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: L.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1101h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f8071a = Collections.unmodifiableSet(EnumSet.of(EnumC1125u.PASSIVE_FOCUSED, EnumC1125u.PASSIVE_NOT_FOCUSED, EnumC1125u.LOCKED_FOCUSED, EnumC1125u.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f8072b = Collections.unmodifiableSet(EnumSet.of(EnumC1129w.CONVERGED, EnumC1129w.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f8073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f8074d;

    static {
        EnumC1121s enumC1121s = EnumC1121s.CONVERGED;
        EnumC1121s enumC1121s2 = EnumC1121s.FLASH_REQUIRED;
        EnumC1121s enumC1121s3 = EnumC1121s.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC1121s, enumC1121s2, enumC1121s3));
        f8073c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC1121s2);
        enumSetCopyOf.remove(enumC1121s3);
        f8074d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(InterfaceC1133y interfaceC1133y, boolean z10) {
        boolean z11 = interfaceC1133y.i() == EnumC1123t.OFF || f8071a.contains(interfaceC1133y.g());
        boolean z12 = interfaceC1133y.f() == r.OFF;
        boolean z13 = !z10 ? !(z12 || f8073c.contains(interfaceC1133y.j())) : !(z12 || f8074d.contains(interfaceC1133y.j()));
        boolean z14 = interfaceC1133y.d() == EnumC1127v.OFF || f8072b.contains(interfaceC1133y.h());
        AbstractC0807p0.a("ConvergenceUtils", "checkCaptureResult, AE=" + interfaceC1133y.j() + " AF =" + interfaceC1133y.g() + " AWB=" + interfaceC1133y.h());
        return z11 && z13 && z14;
    }
}
