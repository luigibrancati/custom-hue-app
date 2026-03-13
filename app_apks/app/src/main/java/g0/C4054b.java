package g0;

import f0.InterfaceC3983a;
import f0.InterfaceC3984b;
import gc.AbstractC4193f;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4054b extends AbstractC4193f implements Map, InterfaceC6184a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f34788d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34789e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C4054b f34790f = new C4054b(C4062j.f34799e.a(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4062j f34791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34792c;

    /* JADX INFO: renamed from: g0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4054b(C4062j c4062j, int i10) {
        this.f34791b = c4062j;
        this.f34792c = i10;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f34791b.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // gc.AbstractC4193f
    public final Set d() {
        return l();
    }

    @Override // gc.AbstractC4193f
    public int f() {
        return this.f34792c;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f34791b.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final InterfaceC3984b l() {
        return new C4056d(this);
    }

    @Override // gc.AbstractC4193f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InterfaceC3984b e() {
        return new C4058f(this);
    }

    public final C4062j n() {
        return this.f34791b;
    }

    @Override // gc.AbstractC4193f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceC3983a g() {
        return new C4060h(this);
    }
}
