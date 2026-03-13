package q4;

import gc.C4205s;
import gc.C4206t;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import q4.AbstractC5493i;

/* JADX INFO: renamed from: q4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5487c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43125f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f43130e;

    /* JADX INFO: renamed from: q4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C5487c a(Set autocapture, C5494j interactionsOptions) {
            AbstractC4862t.e(autocapture, "autocapture");
            AbstractC4862t.e(interactionsOptions, "interactionsOptions");
            List listC = C4205s.c();
            if (autocapture.contains(EnumC5486b.ELEMENT_INTERACTIONS)) {
                listC.add(AbstractC5493i.b.f43223a);
            }
            if (autocapture.contains(EnumC5486b.FRUSTRATION_INTERACTIONS)) {
                if (interactionsOptions.b().a()) {
                    listC.add(AbstractC5493i.c.f43224a);
                }
                if (interactionsOptions.a().a()) {
                    listC.add(AbstractC5493i.a.f43222a);
                }
            }
            return new C5487c(autocapture.contains(EnumC5486b.SESSIONS), autocapture.contains(EnumC5486b.APP_LIFECYCLES), autocapture.contains(EnumC5486b.SCREEN_VIEWS), autocapture.contains(EnumC5486b.DEEP_LINKS), C4205s.a(listC));
        }

        public a() {
        }
    }

    public C5487c() {
        this(false, false, false, false, null, 31, null);
    }

    public final boolean a() {
        return this.f43127b;
    }

    public final boolean b() {
        return this.f43129d;
    }

    public final List c() {
        return this.f43130e;
    }

    public final boolean d() {
        return this.f43128c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5487c)) {
            return false;
        }
        C5487c c5487c = (C5487c) obj;
        return this.f43126a == c5487c.f43126a && this.f43127b == c5487c.f43127b && this.f43128c == c5487c.f43128c && this.f43129d == c5487c.f43129d && AbstractC4862t.a(this.f43130e, c5487c.f43130e);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f43126a) * 31) + Boolean.hashCode(this.f43127b)) * 31) + Boolean.hashCode(this.f43128c)) * 31) + Boolean.hashCode(this.f43129d)) * 31) + this.f43130e.hashCode();
    }

    public String toString() {
        return "AutocaptureState(sessions=" + this.f43126a + ", appLifecycles=" + this.f43127b + ", screenViews=" + this.f43128c + ", deepLinks=" + this.f43129d + ", interactions=" + this.f43130e + ')';
    }

    public C5487c(boolean z10, boolean z11, boolean z12, boolean z13, List interactions) {
        AbstractC4862t.e(interactions, "interactions");
        this.f43126a = z10;
        this.f43127b = z11;
        this.f43128c = z12;
        this.f43129d = z13;
        this.f43130e = interactions;
    }

    public /* synthetic */ C5487c(boolean z10, boolean z11, boolean z12, boolean z13, List list, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? C4206t.k() : list);
    }
}
