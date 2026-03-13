package Y3;

import Y3.b;
import a4.InterfaceC2641a;
import a4.h;
import android.content.Context;
import g4.C4143e;
import g4.o;
import g4.q;
import g4.t;
import g4.x;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import n4.i;
import n4.k;
import n4.n;
import pe.InterfaceC5469e;
import pe.y;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f19723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i4.c f19724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC5469e.a f19725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b.d f19726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Y3.a f19727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public k f19728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f19729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f19730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f19731i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19733k;

        /* JADX INFO: renamed from: Y3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0249a extends v implements InterfaceC6082a {
            public C0249a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC5469e.a invoke() {
                y yVarB = new y.a().c(i.a(a.this.f19723a)).b();
                AbstractC4862t.d(yVarB, "Builder()\n              …\n                .build()");
                return yVarB;
            }
        }

        public a(Context context) {
            AbstractC4862t.e(context, "context");
            Context applicationContext = context.getApplicationContext();
            AbstractC4862t.d(applicationContext, "context.applicationContext");
            this.f19723a = applicationContext;
            this.f19724b = i4.c.f37079n;
            this.f19725c = null;
            this.f19726d = null;
            this.f19727e = null;
            this.f19728f = new k(false, false, false, 7, null);
            this.f19729g = null;
            n nVar = n.f40574a;
            this.f19730h = nVar.e(applicationContext);
            this.f19731i = nVar.f();
            this.f19732j = true;
            this.f19733k = true;
        }

        public final d b() {
            o oVarD = this.f19729g;
            if (oVarD == null) {
                oVarD = d();
            }
            o oVar = oVarD;
            Context context = this.f19723a;
            i4.c cVar = this.f19724b;
            InterfaceC2641a interfaceC2641aA = oVar.a();
            InterfaceC5469e.a aVarC = this.f19725c;
            if (aVarC == null) {
                aVarC = c();
            }
            InterfaceC5469e.a aVar = aVarC;
            b.d dVar = this.f19726d;
            if (dVar == null) {
                dVar = b.d.f19720b;
            }
            b.d dVar2 = dVar;
            Y3.a aVar2 = this.f19727e;
            if (aVar2 == null) {
                aVar2 = new Y3.a();
            }
            return new e(context, cVar, interfaceC2641aA, oVar, aVar, dVar2, aVar2, this.f19728f, null);
        }

        public final InterfaceC5469e.a c() {
            return n4.e.l(new C0249a());
        }

        public final o d() {
            long jB = n.f40574a.b(this.f19723a, this.f19730h);
            int i10 = (int) ((this.f19732j ? this.f19731i : 0.0d) * jB);
            int i11 = (int) (jB - ((long) i10));
            InterfaceC2641a dVar = i10 == 0 ? new a4.d() : new a4.f(i10, null, null, null, 6, null);
            x qVar = this.f19733k ? new q(null) : C4143e.f35444a;
            a4.c hVar = this.f19732j ? new h(qVar, dVar, null) : a4.e.f20940a;
            return new o(t.f35513a.a(qVar, hVar, i11, null), qVar, hVar, dVar);
        }

        public final a e(InterfaceC5469e.a callFactory) {
            AbstractC4862t.e(callFactory, "callFactory");
            this.f19725c = callFactory;
            return this;
        }

        public final a f(y okHttpClient) {
            AbstractC4862t.e(okHttpClient, "okHttpClient");
            return e(okHttpClient);
        }
    }

    i4.e a(i4.i iVar);
}
