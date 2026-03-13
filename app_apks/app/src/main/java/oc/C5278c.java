package oc;

import gc.AbstractC4191d;
import gc.C4204q;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: oc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5278c extends AbstractC4191d implements InterfaceC5276a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f41529b;

    public C5278c(Enum[] entries) {
        AbstractC4862t.e(entries, "entries");
        this.f41529b = entries;
    }

    @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return f((Enum) obj);
        }
        return false;
    }

    @Override // gc.AbstractC4189b
    public int d() {
        return this.f41529b.length;
    }

    public boolean f(Enum element) {
        AbstractC4862t.e(element, "element");
        return ((Enum) C4204q.d0(this.f41529b, element.ordinal())) == element;
    }

    @Override // gc.AbstractC4191d, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC4191d.f35593a.b(i10, this.f41529b.length);
        return this.f41529b[i10];
    }

    @Override // gc.AbstractC4191d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }

    public int k(Enum element) {
        AbstractC4862t.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C4204q.d0(this.f41529b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int l(Enum element) {
        AbstractC4862t.e(element, "element");
        return k(element);
    }

    @Override // gc.AbstractC4191d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }
}
