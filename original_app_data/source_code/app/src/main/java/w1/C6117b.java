package w1;

import U0.c;
import Ud.w;
import android.os.Bundle;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.Q;
import i3.AbstractC4349j;
import i3.C4345f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6117b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f46089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f46090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f46091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4345f.b f46092e;

    public C6117b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final Bundle c(C6117b c6117b) {
        C4034q[] c4034qArr;
        for (Map.Entry entry : Q.u(c6117b.f46091d).entrySet()) {
            c6117b.d((String) entry.getKey(), ((w) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : Q.u(c6117b.f46089b).entrySet()) {
            c6117b.d((String) entry2.getKey(), ((C4345f.b) entry2.getValue()).a());
        }
        Map map = c6117b.f46088a;
        if (map.isEmpty()) {
            c4034qArr = new C4034q[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(AbstractC4040w.a((String) entry3.getKey(), entry3.getValue()));
            }
            c4034qArr = (C4034q[]) arrayList.toArray(new C4034q[0]);
        }
        Bundle bundleA = c.a((C4034q[]) Arrays.copyOf(c4034qArr, c4034qArr.length));
        AbstractC4349j.a(bundleA);
        return bundleA;
    }

    public final C4345f.b b() {
        return this.f46092e;
    }

    public final void d(String key, Object obj) {
        AbstractC4862t.e(key, "key");
        this.f46088a.put(key, obj);
        w wVar = (w) this.f46090c.get(key);
        if (wVar != null) {
            wVar.setValue(obj);
        }
        w wVar2 = (w) this.f46091d.get(key);
        if (wVar2 != null) {
            wVar2.setValue(obj);
        }
    }

    public C6117b(Map initialState) {
        AbstractC4862t.e(initialState, "initialState");
        this.f46088a = Q.w(initialState);
        this.f46089b = new LinkedHashMap();
        this.f46090c = new LinkedHashMap();
        this.f46091d = new LinkedHashMap();
        this.f46092e = new C4345f.b() { // from class: w1.a
            @Override // i3.C4345f.b
            public final Bundle a() {
                return C6117b.c(this.f46087a);
            }
        };
    }

    public /* synthetic */ C6117b(Map map, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? Q.i() : map);
    }
}
