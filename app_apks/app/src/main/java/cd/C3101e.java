package cd;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: cd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3101e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26508e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3101e f26509f = new C3101e(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3104h f26510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3102f f26511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26513d;

    /* JADX INFO: renamed from: cd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C3101e a() {
            return C3101e.f26509f;
        }

        public a() {
        }
    }

    public C3101e(EnumC3104h enumC3104h, EnumC3102f enumC3102f, boolean z10, boolean z11) {
        this.f26510a = enumC3104h;
        this.f26511b = enumC3102f;
        this.f26512c = z10;
        this.f26513d = z11;
    }

    public final boolean b() {
        return this.f26512c;
    }

    public final EnumC3102f c() {
        return this.f26511b;
    }

    public final EnumC3104h d() {
        return this.f26510a;
    }

    public final boolean e() {
        return this.f26513d;
    }

    public /* synthetic */ C3101e(EnumC3104h enumC3104h, EnumC3102f enumC3102f, boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this(enumC3104h, enumC3102f, z10, (i10 & 8) != 0 ? false : z11);
    }
}
