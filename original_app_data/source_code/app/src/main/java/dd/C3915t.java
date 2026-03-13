package dd;

import Lc.b0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3915t implements Ad.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3913r f33457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd.t f33458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ad.e f33460e;

    public C3915t(InterfaceC3913r binaryClass, yd.t tVar, boolean z10, Ad.e abiStability) {
        AbstractC4862t.e(binaryClass, "binaryClass");
        AbstractC4862t.e(abiStability, "abiStability");
        this.f33457b = binaryClass;
        this.f33458c = tVar;
        this.f33459d = z10;
        this.f33460e = abiStability;
    }

    @Override // Ad.f
    public String a() {
        return "Class '" + this.f33457b.c().b().b() + '\'';
    }

    @Override // Lc.a0
    public b0 b() {
        b0 NO_SOURCE_FILE = b0.f8747a;
        AbstractC4862t.d(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final InterfaceC3913r d() {
        return this.f33457b;
    }

    public String toString() {
        return C3915t.class.getSimpleName() + ": " + this.f33457b;
    }
}
