package Z7;

import U7.b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Z7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2596f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f20356c = Logger.getLogger(C2596f.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2596f f20357d = new C2596f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap f20358a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentMap f20359b = new ConcurrentHashMap();

    public static C2596f d() {
        return f20357d;
    }

    public P7.h a(String str, Class cls) throws GeneralSecurityException {
        P7.h hVarB = b(str);
        if (hVarB.a().equals(cls)) {
            return hVarB;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + hVarB.getClass() + ", which only supports: " + hVarB.a());
    }

    public final synchronized P7.h b(String str) {
        if (!this.f20358a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (P7.h) this.f20358a.get(str);
    }

    public P7.h c(String str) {
        return b(str);
    }

    public final synchronized void e(P7.h hVar, boolean z10, boolean z11) {
        try {
            String strC = hVar.c();
            if (z11 && this.f20359b.containsKey(strC) && !((Boolean) this.f20359b.get(strC)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strC);
            }
            P7.h hVar2 = (P7.h) this.f20358a.get(strC);
            if (hVar2 != null && !hVar2.getClass().equals(hVar.getClass())) {
                f20356c.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, hVar2.getClass().getName(), hVar.getClass().getName()));
            }
            if (z10) {
                this.f20358a.put(strC, hVar);
            } else {
                this.f20358a.putIfAbsent(strC, hVar);
            }
            this.f20359b.put(strC, Boolean.valueOf(z11));
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean f(String str) {
        return ((Boolean) this.f20359b.get(str)).booleanValue();
    }

    public synchronized void g(P7.h hVar, boolean z10) {
        h(hVar, b.EnumC0207b.ALGORITHM_NOT_FIPS, z10);
    }

    public synchronized void h(P7.h hVar, b.EnumC0207b enumC0207b, boolean z10) {
        if (!enumC0207b.b()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(hVar, false, z10);
    }
}
