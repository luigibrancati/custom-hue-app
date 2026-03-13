package K;

import E.InterfaceC0797k0;
import K.C0977t;
import U.C2272u;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: K.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0960b extends C0977t.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f6580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f6584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2272u f6585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2272u f6586l;

    public C0960b(Size size, int i10, List list, boolean z10, InterfaceC0797k0 interfaceC0797k0, F f10, C2272u c2272u, C2272u c2272u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f6580f = size;
        this.f6581g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f6582h = list;
        this.f6583i = z10;
        this.f6584j = f10;
        if (c2272u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f6585k = c2272u;
        if (c2272u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f6586l = c2272u2;
    }

    @Override // K.C0977t.c
    public C2272u b() {
        return this.f6586l;
    }

    @Override // K.C0977t.c
    public InterfaceC0797k0 c() {
        return null;
    }

    @Override // K.C0977t.c
    public int d() {
        return this.f6581g;
    }

    @Override // K.C0977t.c
    public List e() {
        return this.f6582h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0977t.c) {
            C0977t.c cVar = (C0977t.c) obj;
            if (this.f6580f.equals(cVar.k()) && this.f6581g == cVar.d() && this.f6582h.equals(cVar.e()) && this.f6583i == cVar.m()) {
                cVar.c();
                F f10 = this.f6584j;
                if (f10 != null ? f10.equals(cVar.f()) : cVar.f() == null) {
                    if (this.f6585k.equals(cVar.h()) && this.f6586l.equals(cVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // K.C0977t.c
    public F f() {
        return this.f6584j;
    }

    @Override // K.C0977t.c
    public C2272u h() {
        return this.f6585k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f6580f.hashCode() ^ 1000003) * 1000003) ^ this.f6581g) * 1000003) ^ this.f6582h.hashCode()) * 1000003) ^ (this.f6583i ? 1231 : 1237)) * (-721379959);
        F f10 = this.f6584j;
        return this.f6586l.hashCode() ^ ((((iHashCode ^ (f10 == null ? 0 : f10.hashCode())) * 1000003) ^ this.f6585k.hashCode()) * 1000003);
    }

    @Override // K.C0977t.c
    public Size k() {
        return this.f6580f;
    }

    @Override // K.C0977t.c
    public boolean m() {
        return this.f6583i;
    }

    public String toString() {
        return "In{size=" + this.f6580f + ", inputFormat=" + this.f6581g + ", outputFormats=" + this.f6582h + ", virtualCamera=" + this.f6583i + ", imageReaderProxyProvider=" + ((Object) null) + ", postviewSettings=" + this.f6584j + ", requestEdge=" + this.f6585k + ", errorEdge=" + this.f6586l + "}";
    }
}
