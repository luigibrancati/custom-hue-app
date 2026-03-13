package x0;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.v;
import vc.p;

/* JADX INFO: renamed from: x0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6288h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47331e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f47333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f47335d;

    /* JADX INFO: renamed from: x0.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47336a = new a();

        public a() {
            super(2);
        }

        @Override // vc.p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public C6288h(String str, p pVar) {
        this.f47332a = str;
        this.f47333b = pVar;
    }

    public final String a() {
        return this.f47335d;
    }

    public final String b() {
        return this.f47332a;
    }

    public String toString() {
        return "AccessibilityKey: " + this.f47332a;
    }

    public /* synthetic */ C6288h(String str, p pVar, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? a.f47336a : pVar);
    }

    public C6288h(String str, boolean z10) {
        this(str, (p) null, 2, (AbstractC4854k) (0 == true ? 1 : 0));
        this.f47334c = z10;
    }

    public /* synthetic */ C6288h(String str, boolean z10, p pVar, String str2, int i10, AbstractC4854k abstractC4854k) {
        this(str, z10, pVar, (i10 & 8) != 0 ? null : str2);
    }

    public C6288h(String str, boolean z10, p pVar, String str2) {
        this(str, pVar);
        this.f47334c = z10;
        this.f47335d = str2;
    }
}
