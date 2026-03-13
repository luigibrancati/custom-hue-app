package Uc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.f f16880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.h f16881d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kd.c it) {
            AbstractC4862t.d(it, "it");
            return kd.e.a(it, E.this.b());
        }
    }

    public E(Map states) {
        AbstractC4862t.e(states, "states");
        this.f16879b = states;
        Bd.f fVar = new Bd.f("Java nullability annotation states");
        this.f16880c = fVar;
        Bd.h hVarB = fVar.b(new a());
        AbstractC4862t.d(hVarB, "storageManager.createMem…cificFqname(states)\n    }");
        this.f16881d = hVarB;
    }

    @Override // Uc.D
    public Object a(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return this.f16881d.invoke(fqName);
    }

    public final Map b() {
        return this.f16879b;
    }
}
