package x4;

import F4.f;
import fc.C4015H;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import p4.AbstractC5388b;
import p4.C5387a;
import vc.l;

/* JADX INFO: renamed from: x4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6297b implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47439d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f47440a = f.a.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f47441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5387a f47442c;

    /* JADX INFO: renamed from: x4.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: x4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0644b extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D4.a f47443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0644b(D4.a aVar) {
            super(1);
            this.f47443a = aVar;
        }

        public final void a(AbstractC5388b abstractC5388b) {
            AbstractC4862t.e(abstractC5388b, "<name for destructuring parameter 0>");
            throw null;
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.a.a(obj);
            a(null);
            return C4015H.f34254a;
        }
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f47441b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        C5387a c5387aA = C5387a.f42183c.a(amplitude.l().l());
        this.f47442c = c5387aA;
        if (c5387aA == null) {
            AbstractC4862t.p("connector");
            c5387aA = null;
        }
        c5387aA.c().a(new C0644b(amplitude));
    }

    @Override // F4.f
    public E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        Map mapI0 = event.I0();
        if (mapI0 != null && !mapI0.isEmpty() && !AbstractC4862t.a(event.F0(), "$exposure")) {
            HashMap map = new HashMap();
            for (Map.Entry entry : mapI0.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    try {
                        map.put(str, (Map) value);
                    } catch (ClassCastException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            C5387a c5387a = this.f47442c;
            if (c5387a == null) {
                AbstractC4862t.p("connector");
                c5387a = null;
            }
            c5387a.d().a().c(map).commit();
        }
        return event;
    }

    @Override // F4.f
    public f.a getType() {
        return this.f47440a;
    }
}
