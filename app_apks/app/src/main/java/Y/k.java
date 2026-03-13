package Y;

import L.EnumC1121s;
import L.EnumC1123t;
import L.EnumC1125u;
import L.EnumC1127v;
import L.EnumC1129w;
import L.EnumC1131x;
import L.InterfaceC1133y;
import L.k1;
import L.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k implements InterfaceC1133y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1133y f19565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f19566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19567c;

    public k(k1 k1Var, InterfaceC1133y interfaceC1133y) {
        this(interfaceC1133y, k1Var, -1L);
    }

    @Override // L.InterfaceC1133y
    public EnumC1131x b() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.b() : EnumC1131x.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public k1 c() {
        return this.f19566b;
    }

    @Override // L.InterfaceC1133y
    public EnumC1127v d() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.d() : EnumC1127v.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public r f() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.f() : r.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public EnumC1125u g() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.g() : EnumC1125u.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public long getTimestamp() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        if (interfaceC1133y != null) {
            return interfaceC1133y.getTimestamp();
        }
        long j10 = this.f19567c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // L.InterfaceC1133y
    public EnumC1129w h() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.h() : EnumC1129w.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public EnumC1123t i() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.i() : EnumC1123t.UNKNOWN;
    }

    @Override // L.InterfaceC1133y
    public EnumC1121s j() {
        InterfaceC1133y interfaceC1133y = this.f19565a;
        return interfaceC1133y != null ? interfaceC1133y.j() : EnumC1121s.UNKNOWN;
    }

    public k(k1 k1Var, long j10) {
        this(null, k1Var, j10);
    }

    public k(InterfaceC1133y interfaceC1133y, k1 k1Var, long j10) {
        this.f19565a = interfaceC1133y;
        this.f19566b = k1Var;
        this.f19567c = j10;
    }
}
