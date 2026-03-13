package b6;

import android.content.Context;
import b6.v;
import d6.AbstractC3833d;
import d6.C3830a;
import d6.C3832c;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import h6.C4279d;
import j6.C4715N;
import j6.C4728g;
import j6.C4729h;
import j6.C4730i;
import j6.C4731j;
import j6.InterfaceC4725d;
import j6.X;
import l6.C4959c;
import l6.C4960d;

/* JADX INFO: renamed from: b6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2836e {

    /* JADX INFO: renamed from: b6.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f25344a;

        public b() {
        }

        @Override // b6.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f25344a = (Context) AbstractC3833d.b(context);
            return this;
        }

        @Override // b6.v.a
        public v build() {
            AbstractC3833d.a(this.f25344a, Context.class);
            return new c(this.f25344a);
        }
    }

    /* JADX INFO: renamed from: b6.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f25345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC3978a f25346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC3978a f25347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC3978a f25348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC3978a f25349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC3978a f25350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC3978a f25351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC3978a f25352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC3978a f25353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InterfaceC3978a f25354j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public InterfaceC3978a f25355k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public InterfaceC3978a f25356l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC3978a f25357m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public InterfaceC3978a f25358n;

        @Override // b6.v
        public InterfaceC4725d a() {
            return (InterfaceC4725d) this.f25352h.get();
        }

        @Override // b6.v
        public u b() {
            return (u) this.f25358n.get();
        }

        public final void c(Context context) {
            this.f25346b = C3830a.a(C2842k.a());
            InterfaceC3831b interfaceC3831bA = C3832c.a(context);
            this.f25347c = interfaceC3831bA;
            c6.j jVarA = c6.j.a(interfaceC3831bA, C4959c.a(), C4960d.a());
            this.f25348d = jVarA;
            this.f25349e = C3830a.a(c6.l.a(this.f25347c, jVarA));
            this.f25350f = X.a(this.f25347c, C4728g.a(), C4730i.a());
            this.f25351g = C3830a.a(C4729h.a(this.f25347c));
            this.f25352h = C3830a.a(C4715N.a(C4959c.a(), C4960d.a(), C4731j.a(), this.f25350f, this.f25351g));
            h6.g gVarB = h6.g.b(C4959c.a());
            this.f25353i = gVarB;
            h6.i iVarA = h6.i.a(this.f25347c, this.f25352h, gVarB, C4960d.a());
            this.f25354j = iVarA;
            InterfaceC3978a interfaceC3978a = this.f25346b;
            InterfaceC3978a interfaceC3978a2 = this.f25349e;
            InterfaceC3978a interfaceC3978a3 = this.f25352h;
            this.f25355k = C4279d.a(interfaceC3978a, interfaceC3978a2, iVarA, interfaceC3978a3, interfaceC3978a3);
            InterfaceC3978a interfaceC3978a4 = this.f25347c;
            InterfaceC3978a interfaceC3978a5 = this.f25349e;
            InterfaceC3978a interfaceC3978a6 = this.f25352h;
            this.f25356l = i6.s.a(interfaceC3978a4, interfaceC3978a5, interfaceC3978a6, this.f25354j, this.f25346b, interfaceC3978a6, C4959c.a(), C4960d.a(), this.f25352h);
            InterfaceC3978a interfaceC3978a7 = this.f25346b;
            InterfaceC3978a interfaceC3978a8 = this.f25352h;
            this.f25357m = i6.w.a(interfaceC3978a7, interfaceC3978a8, this.f25354j, interfaceC3978a8);
            this.f25358n = C3830a.a(w.a(C4959c.a(), C4960d.a(), this.f25355k, this.f25356l, this.f25357m));
        }

        public c(Context context) {
            this.f25345a = this;
            c(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
