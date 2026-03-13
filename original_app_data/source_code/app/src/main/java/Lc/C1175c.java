package Lc;

import Cd.u0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Lc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1175c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1185m f8749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8750c;

    public C1175c(f0 originalDescriptor, InterfaceC1185m declarationDescriptor, int i10) {
        AbstractC4862t.e(originalDescriptor, "originalDescriptor");
        AbstractC4862t.e(declarationDescriptor, "declarationDescriptor");
        this.f8748a = originalDescriptor;
        this.f8749b = declarationDescriptor;
        this.f8750c = i10;
    }

    @Override // Lc.f0
    public Bd.n K() {
        return this.f8748a.K();
    }

    @Override // Lc.f0
    public boolean O() {
        return true;
    }

    @Override // Lc.InterfaceC1186n, Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        return this.f8749b;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        return this.f8748a.getAnnotations();
    }

    @Override // Lc.f0
    public int getIndex() {
        return this.f8750c + this.f8748a.getIndex();
    }

    @Override // Lc.I
    public kd.f getName() {
        return this.f8748a.getName();
    }

    @Override // Lc.f0
    public List getUpperBounds() {
        return this.f8748a.getUpperBounds();
    }

    @Override // Lc.InterfaceC1188p
    public a0 j() {
        return this.f8748a.j();
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return this.f8748a.j0(interfaceC1187o, obj);
    }

    @Override // Lc.f0, Lc.InterfaceC1180h
    public Cd.e0 k() {
        return this.f8748a.k();
    }

    @Override // Lc.f0
    public u0 m() {
        return this.f8748a.m();
    }

    @Override // Lc.InterfaceC1180h
    public Cd.M p() {
        return this.f8748a.p();
    }

    public String toString() {
        return this.f8748a + "[inner-copy]";
    }

    @Override // Lc.f0
    public boolean w() {
        return this.f8748a.w();
    }

    @Override // Lc.InterfaceC1185m
    public f0 a() {
        f0 f0VarA = this.f8748a.a();
        AbstractC4862t.d(f0VarA, "originalDescriptor.original");
        return f0VarA;
    }
}
