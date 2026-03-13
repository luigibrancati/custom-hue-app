package Hc;

import Lc.a0;
import Uc.A;
import Uc.B;
import dd.InterfaceC3913r;
import gc.C4206t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kd.b;
import kd.c;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5349a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5351c;

    static {
        List listN = C4206t.n(B.f16839a, B.f16849k, B.f16850l, B.f16842d, B.f16844f, B.f16847i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.m((c) it.next()));
        }
        f5350b = linkedHashSet;
        b bVarM = b.m(B.f16848j);
        AbstractC4862t.d(bVarM, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f5351c = bVarM;
    }

    public final b a() {
        return f5351c;
    }

    public final Set b() {
        return f5350b;
    }

    public final boolean c(InterfaceC3913r klass) {
        AbstractC4862t.e(klass, "klass");
        I i10 = new I();
        klass.d(new C0088a(i10), null);
        return i10.f39773a;
    }

    /* JADX INFO: renamed from: Hc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0088a implements InterfaceC3913r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f5352a;

        public C0088a(I i10) {
            this.f5352a = i10;
        }

        @Override // dd.InterfaceC3913r.c
        public InterfaceC3913r.a c(b classId, a0 source) {
            AbstractC4862t.e(classId, "classId");
            AbstractC4862t.e(source, "source");
            if (!AbstractC4862t.a(classId, A.f16834a.a())) {
                return null;
            }
            this.f5352a.f39773a = true;
            return null;
        }

        @Override // dd.InterfaceC3913r.c
        public void a() {
        }
    }
}
