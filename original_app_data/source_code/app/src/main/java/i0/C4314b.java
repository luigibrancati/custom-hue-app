package i0;

import d0.AbstractC3805a;
import g0.C4054b;
import g0.C4062j;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4314b extends C4054b implements d0.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f36805g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36806h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4314b f36807i;

    /* JADX INFO: renamed from: i0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C4314b a() {
            return C4314b.f36807i;
        }

        public a() {
        }
    }

    static {
        C4062j c4062jA = C4062j.f34799e.a();
        AbstractC4862t.c(c4062jA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f36807i = new C4314b(c4062jA, 0);
    }

    public C4314b(C4062j c4062j, int i10) {
        super(c4062j, i10);
    }

    @Override // d0.c
    public Object a(AbstractC3805a abstractC3805a) {
        return d0.d.a(this, abstractC3805a);
    }

    @Override // g0.C4054b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC3805a) {
            return q((AbstractC3805a) obj);
        }
        return false;
    }

    @Override // gc.AbstractC4193f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof d0.i) {
            return r((d0.i) obj);
        }
        return false;
    }

    @Override // g0.C4054b, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC3805a) {
            return s((AbstractC3805a) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC3805a) ? obj2 : t((AbstractC3805a) obj, (d0.i) obj2);
    }

    public /* bridge */ boolean q(AbstractC3805a abstractC3805a) {
        return super.containsKey(abstractC3805a);
    }

    public /* bridge */ boolean r(d0.i iVar) {
        return super.containsValue(iVar);
    }

    public /* bridge */ d0.i s(AbstractC3805a abstractC3805a) {
        return (d0.i) super.get(abstractC3805a);
    }

    public /* bridge */ d0.i t(AbstractC3805a abstractC3805a, d0.i iVar) {
        return (d0.i) super.getOrDefault(abstractC3805a, iVar);
    }
}
