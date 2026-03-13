package Fe;

import gc.C4179C;
import gc.Q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0848j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f4131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f4132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f4133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f4134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f4135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f4136h;

    public C0848j() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ C0848j b(C0848j c0848j, boolean z10, boolean z11, A a10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c0848j.f4129a;
        }
        if ((i10 & 2) != 0) {
            z11 = c0848j.f4130b;
        }
        if ((i10 & 4) != 0) {
            a10 = c0848j.f4131c;
        }
        if ((i10 & 8) != 0) {
            l10 = c0848j.f4132d;
        }
        if ((i10 & 16) != 0) {
            l11 = c0848j.f4133e;
        }
        if ((i10 & 32) != 0) {
            l12 = c0848j.f4134f;
        }
        if ((i10 & 64) != 0) {
            l13 = c0848j.f4135g;
        }
        if ((i10 & 128) != 0) {
            map = c0848j.f4136h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c0848j.a(z10, z11, a10, l10, l15, l16, l14, map2);
    }

    public final C0848j a(boolean z10, boolean z11, A a10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        AbstractC4862t.e(extras, "extras");
        return new C0848j(z10, z11, a10, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f4132d;
    }

    public final A d() {
        return this.f4131c;
    }

    public final boolean e() {
        return this.f4130b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f4129a) {
            arrayList.add("isRegularFile");
        }
        if (this.f4130b) {
            arrayList.add("isDirectory");
        }
        if (this.f4132d != null) {
            arrayList.add("byteCount=" + this.f4132d);
        }
        if (this.f4133e != null) {
            arrayList.add("createdAt=" + this.f4133e);
        }
        if (this.f4134f != null) {
            arrayList.add("lastModifiedAt=" + this.f4134f);
        }
        if (this.f4135g != null) {
            arrayList.add("lastAccessedAt=" + this.f4135g);
        }
        if (!this.f4136h.isEmpty()) {
            arrayList.add("extras=" + this.f4136h);
        }
        return C4179C.q0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public C0848j(boolean z10, boolean z11, A a10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        AbstractC4862t.e(extras, "extras");
        this.f4129a = z10;
        this.f4130b = z11;
        this.f4131c = a10;
        this.f4132d = l10;
        this.f4133e = l11;
        this.f4134f = l12;
        this.f4135g = l13;
        this.f4136h = Q.u(extras);
    }

    public /* synthetic */ C0848j(boolean z10, boolean z11, A a10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : a10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? Q.i() : map);
    }
}
