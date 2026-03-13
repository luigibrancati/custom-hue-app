package qd;

import Cd.E;
import Cd.M;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import fc.AbstractC4040w;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd.b f43442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kd.f f43443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kd.b enumClassId, kd.f enumEntryName) {
        super(AbstractC4040w.a(enumClassId, enumEntryName));
        AbstractC4862t.e(enumClassId, "enumClassId");
        AbstractC4862t.e(enumEntryName, "enumEntryName");
        this.f43442b = enumClassId;
        this.f43443c = enumEntryName;
    }

    @Override // qd.g
    public E a(G module) {
        AbstractC4862t.e(module, "module");
        InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(module, this.f43442b);
        M mP = null;
        if (interfaceC1177eA != null) {
            if (!AbstractC5283e.A(interfaceC1177eA)) {
                interfaceC1177eA = null;
            }
            if (interfaceC1177eA != null) {
                mP = interfaceC1177eA.p();
            }
        }
        if (mP != null) {
            return mP;
        }
        Ed.j jVar = Ed.j.ERROR_ENUM_TYPE;
        String string = this.f43442b.toString();
        AbstractC4862t.d(string, "enumClassId.toString()");
        String string2 = this.f43443c.toString();
        AbstractC4862t.d(string2, "enumEntryName.toString()");
        return Ed.k.d(jVar, string, string2);
    }

    public final kd.f c() {
        return this.f43443c;
    }

    @Override // qd.g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43442b.j());
        sb2.append('.');
        sb2.append(this.f43443c);
        return sb2.toString();
    }
}
