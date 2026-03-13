package wd;

import Cd.M;
import Lc.InterfaceC1177e;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: wd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6193e implements InterfaceC6195g, InterfaceC6196h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1177e f46535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6193e f46536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1177e f46537c;

    public C6193e(InterfaceC1177e classDescriptor, C6193e c6193e) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        this.f46535a = classDescriptor;
        this.f46536b = c6193e == null ? this : c6193e;
        this.f46537c = classDescriptor;
    }

    @Override // wd.InterfaceC6195g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M getType() {
        M mP = this.f46535a.p();
        AbstractC4862t.d(mP, "classDescriptor.defaultType");
        return mP;
    }

    public boolean equals(Object obj) {
        InterfaceC1177e interfaceC1177e = this.f46535a;
        C6193e c6193e = obj instanceof C6193e ? (C6193e) obj : null;
        return AbstractC4862t.a(interfaceC1177e, c6193e != null ? c6193e.f46535a : null);
    }

    public int hashCode() {
        return this.f46535a.hashCode();
    }

    @Override // wd.InterfaceC6196h
    public final InterfaceC1177e s() {
        return this.f46535a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
