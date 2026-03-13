package ee;

import gc.C4206t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ee.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3981a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f33934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f33935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f33936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f33938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f33939g;

    public C3981a(String serialName) {
        AbstractC4862t.e(serialName, "serialName");
        this.f33933a = serialName;
        this.f33934b = C4206t.k();
        this.f33935c = new ArrayList();
        this.f33936d = new HashSet();
        this.f33937e = new ArrayList();
        this.f33938f = new ArrayList();
        this.f33939g = new ArrayList();
    }

    public static /* synthetic */ void b(C3981a c3981a, String str, e eVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C4206t.k();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c3981a.a(str, eVar, list, z10);
    }

    public final void a(String elementName, e descriptor, List annotations, boolean z10) {
        AbstractC4862t.e(elementName, "elementName");
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(annotations, "annotations");
        if (this.f33936d.add(elementName)) {
            this.f33935c.add(elementName);
            this.f33937e.add(descriptor);
            this.f33938f.add(annotations);
            this.f33939g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f33933a).toString());
    }

    public final List c() {
        return this.f33934b;
    }

    public final List d() {
        return this.f33938f;
    }

    public final List e() {
        return this.f33937e;
    }

    public final List f() {
        return this.f33935c;
    }

    public final List g() {
        return this.f33939g;
    }

    public final void h(List list) {
        AbstractC4862t.e(list, "<set-?>");
        this.f33934b = list;
    }
}
