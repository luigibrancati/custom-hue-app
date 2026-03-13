package Xc;

import Bd.n;
import Lc.G;
import Uc.y;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f19494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f19495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f19496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Zc.d f19497e;

    public g(b components, k typeParameterResolver, InterfaceC4028k delegateForDefaultTypeQualifiers) {
        AbstractC4862t.e(components, "components");
        AbstractC4862t.e(typeParameterResolver, "typeParameterResolver");
        AbstractC4862t.e(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f19493a = components;
        this.f19494b = typeParameterResolver;
        this.f19495c = delegateForDefaultTypeQualifiers;
        this.f19496d = delegateForDefaultTypeQualifiers;
        this.f19497e = new Zc.d(this, typeParameterResolver);
    }

    public final b a() {
        return this.f19493a;
    }

    public final y b() {
        return (y) this.f19496d.getValue();
    }

    public final InterfaceC4028k c() {
        return this.f19495c;
    }

    public final G d() {
        return this.f19493a.m();
    }

    public final n e() {
        return this.f19493a.u();
    }

    public final k f() {
        return this.f19494b;
    }

    public final Zc.d g() {
        return this.f19497e;
    }
}
