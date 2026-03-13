package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4844a implements InterfaceC4858o, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C4844a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4844a)) {
            return false;
        }
        C4844a c4844a = (C4844a) obj;
        return this.isTopLevel == c4844a.isTopLevel && this.arity == c4844a.arity && this.flags == c4844a.flags && AbstractC4862t.a(this.receiver, c4844a.receiver) && AbstractC4862t.a(this.owner, c4844a.owner) && this.name.equals(c4844a.name) && this.signature.equals(c4844a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return M.i(this);
    }
}
