package Zc;

import Cd.AbstractC0739w;
import Cd.M;
import Cd.p0;
import Lc.f0;
import gc.T;
import gc.V;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC0739w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f20430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f20431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f20434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f20435i;

    public /* synthetic */ a(p0 p0Var, c cVar, boolean z10, boolean z11, Set set, M m10, int i10, AbstractC4854k abstractC4854k) {
        this(p0Var, (i10 & 2) != 0 ? c.INFLEXIBLE : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : m10);
    }

    public static /* synthetic */ a f(a aVar, p0 p0Var, c cVar, boolean z10, boolean z11, Set set, M m10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p0Var = aVar.b();
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f20431e;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f20432f;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f20433g;
        }
        if ((i10 & 16) != 0) {
            set = aVar.c();
        }
        if ((i10 & 32) != 0) {
            m10 = aVar.a();
        }
        Set set2 = set;
        M m11 = m10;
        return aVar.e(p0Var, cVar, z10, z11, set2, m11);
    }

    @Override // Cd.AbstractC0739w
    public M a() {
        return this.f20435i;
    }

    @Override // Cd.AbstractC0739w
    public p0 b() {
        return this.f20430d;
    }

    @Override // Cd.AbstractC0739w
    public Set c() {
        return this.f20434h;
    }

    public final a e(p0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, M m10) {
        AbstractC4862t.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC4862t.e(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, m10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(aVar.a(), a()) && aVar.b() == b() && aVar.f20431e == this.f20431e && aVar.f20432f == this.f20432f && aVar.f20433g == this.f20433g;
    }

    public final c g() {
        return this.f20431e;
    }

    public final boolean h() {
        return this.f20433g;
    }

    @Override // Cd.AbstractC0739w
    public int hashCode() {
        M mA = a();
        int iHashCode = mA != null ? mA.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f20431e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f20432f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f20433g ? 1 : 0);
    }

    public final boolean i() {
        return this.f20432f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(M m10) {
        return f(this, null, null, false, false, null, m10, 31, null);
    }

    public final a l(c flexibility) {
        AbstractC4862t.e(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // Cd.AbstractC0739w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(f0 typeParameter) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? V.l(c(), typeParameter) : T.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + b() + ", flexibility=" + this.f20431e + ", isRaw=" + this.f20432f + ", isForAnnotationParameter=" + this.f20433g + ", visitedTypeParameters=" + c() + ", defaultType=" + a() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, M m10) {
        super(howThisTypeIsUsed, set, m10);
        AbstractC4862t.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC4862t.e(flexibility, "flexibility");
        this.f20430d = howThisTypeIsUsed;
        this.f20431e = flexibility;
        this.f20432f = z10;
        this.f20433g = z11;
        this.f20434h = set;
        this.f20435i = m10;
    }
}
