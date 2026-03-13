package u9;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import w9.AbstractC6172a;
import x9.AbstractC6344p;
import x9.C6331c;
import x9.C6342n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w9.v f45450a = w9.v.f46425g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f45451b = r.DEFAULT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f45452c = b.IDENTITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f45453d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45454e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f45455f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45456g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45457h = e.f45415B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45458i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45459j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45460k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45461l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45462m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f45463n = e.f45414A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45464o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f45465p = e.f45419z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45466q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f45467r = e.f45417D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f45468s = e.f45418E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque f45469t = new ArrayDeque();

    public static void a(String str, int i10, int i11, List list) {
        x xVarB;
        x xVarB2;
        boolean z10 = A9.d.f255a;
        x xVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            xVarB = C6331c.b.f47946b.b(str);
            if (z10) {
                xVarA = A9.d.f257c.b(str);
                xVarB2 = A9.d.f256b.b(str);
            } else {
                xVarB2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            x xVarA2 = C6331c.b.f47946b.a(i10, i11);
            if (z10) {
                xVarA = A9.d.f257c.a(i10, i11);
                x xVarA3 = A9.d.f256b.a(i10, i11);
                xVarB = xVarA2;
                xVarB2 = xVarA3;
            } else {
                xVarB = xVarA2;
                xVarB2 = null;
            }
        }
        list.add(xVarB);
        if (z10) {
            list.add(xVarA);
            list.add(xVarB2);
        }
    }

    public static boolean c(Type type) {
        return type == Object.class;
    }

    public e b() {
        ArrayList arrayList = new ArrayList(this.f45454e.size() + this.f45455f.size() + 3);
        arrayList.addAll(this.f45454e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f45455f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f45457h, this.f45458i, this.f45459j, arrayList);
        return new e(this.f45450a, this.f45452c, new HashMap(this.f45453d), this.f45456g, this.f45460k, this.f45464o, this.f45462m, this.f45463n, this.f45465p, this.f45461l, this.f45466q, this.f45451b, this.f45457h, this.f45458i, this.f45459j, new ArrayList(this.f45454e), new ArrayList(this.f45455f), arrayList, this.f45467r, this.f45468s, new ArrayList(this.f45469t));
    }

    public f d(Type type, Object obj) {
        Objects.requireNonNull(type);
        AbstractC6172a.a((obj instanceof i) || (obj instanceof w));
        if (c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof i) {
            this.f45454e.add(C6342n.h(B9.a.b(type), obj));
        }
        if (obj instanceof w) {
            this.f45454e.add(AbstractC6344p.a(B9.a.b(type), (w) obj));
        }
        return this;
    }

    public f e(x xVar) {
        Objects.requireNonNull(xVar);
        this.f45454e.add(xVar);
        return this;
    }
}
