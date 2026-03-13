package q4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: q4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5490f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43171f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5490f f43172g = new C5490f(true, true, true, true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5490f f43173h = new C5490f(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f43178e;

    /* JADX INFO: renamed from: q4.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C5490f() {
        this(false, false, false, false, 15, null);
    }

    public final void a(vc.l listener) {
        AbstractC4862t.e(listener, "listener");
        this.f43178e.add(listener);
    }

    public final boolean b() {
        return this.f43175b;
    }

    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.f43174a) {
            linkedHashSet.add(EnumC5486b.SESSIONS);
        }
        if (this.f43175b) {
            linkedHashSet.add(EnumC5486b.APP_LIFECYCLES);
        }
        if (this.f43176c) {
            linkedHashSet.add(EnumC5486b.DEEP_LINKS);
        }
        if (this.f43177d) {
            linkedHashSet.add(EnumC5486b.SCREEN_VIEWS);
        }
        return linkedHashSet;
    }

    public final boolean d() {
        return this.f43176c;
    }

    public C5490f(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f43174a = z10;
        this.f43175b = z11;
        this.f43176c = z12;
        this.f43177d = z13;
        this.f43178e = new ArrayList();
    }

    public /* synthetic */ C5490f(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5490f(vc.l listener) {
        this(false, false, false, false, 15, null);
        AbstractC4862t.e(listener, "listener");
        this.f43178e.add(listener);
    }
}
