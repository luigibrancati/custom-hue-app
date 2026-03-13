package b3;

import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25249c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f25250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25251b;

        public a(boolean z10, String str) {
            this.f25250a = z10;
            this.f25251b = str;
        }
    }

    public x(int i10, String identityHash, String legacyIdentityHash) {
        AbstractC4862t.e(identityHash, "identityHash");
        AbstractC4862t.e(legacyIdentityHash, "legacyIdentityHash");
        this.f25247a = i10;
        this.f25248b = identityHash;
        this.f25249c = legacyIdentityHash;
    }

    public abstract void a(InterfaceC4792b interfaceC4792b);

    public abstract void b(InterfaceC4792b interfaceC4792b);

    public final String c() {
        return this.f25248b;
    }

    public final String d() {
        return this.f25249c;
    }

    public final int e() {
        return this.f25247a;
    }

    public abstract void f(InterfaceC4792b interfaceC4792b);

    public abstract void g(InterfaceC4792b interfaceC4792b);

    public abstract void h(InterfaceC4792b interfaceC4792b);

    public abstract void i(InterfaceC4792b interfaceC4792b);

    public abstract a j(InterfaceC4792b interfaceC4792b);
}
