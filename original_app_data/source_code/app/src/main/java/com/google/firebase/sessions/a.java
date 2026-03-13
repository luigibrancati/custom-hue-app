package com.google.firebase.sessions;

import P8.h;
import android.content.Context;
import com.google.firebase.sessions.b;
import h8.C4288f;
import lc.InterfaceC4992i;
import p9.B;
import p9.C5433i;
import p9.C5436l;
import p9.C5442s;
import p9.G;
import p9.M;
import p9.O;
import p9.S;
import p9.T;
import p9.V;
import r9.AbstractC5681d;
import r9.C5678a;
import r9.C5680c;
import r9.InterfaceC5679b;
import r9.InterfaceC5682e;
import s9.k;
import s9.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f31983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC4992i f31984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC4992i f31985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C4288f f31986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h f31987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public O8.b f31988f;

        public b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            AbstractC5681d.a(this.f31983a, Context.class);
            AbstractC5681d.a(this.f31984b, InterfaceC4992i.class);
            AbstractC5681d.a(this.f31985c, InterfaceC4992i.class);
            AbstractC5681d.a(this.f31986d, C4288f.class);
            AbstractC5681d.a(this.f31987e, h.class);
            AbstractC5681d.a(this.f31988f, O8.b.class);
            return new c(this.f31983a, this.f31984b, this.f31985c, this.f31986d, this.f31987e, this.f31988f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b f(Context context) {
            this.f31983a = (Context) AbstractC5681d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b b(InterfaceC4992i interfaceC4992i) {
            this.f31984b = (InterfaceC4992i) AbstractC5681d.b(interfaceC4992i);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC4992i interfaceC4992i) {
            this.f31985c = (InterfaceC4992i) AbstractC5681d.b(interfaceC4992i);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b d(C4288f c4288f) {
            this.f31986d = (C4288f) AbstractC5681d.b(c4288f);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b c(h hVar) {
            this.f31987e = (h) AbstractC5681d.b(hVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e(O8.b bVar) {
            this.f31988f = (O8.b) AbstractC5681d.b(bVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements com.google.firebase.sessions.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f31989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC5682e f31990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC5682e f31991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC5682e f31992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC5682e f31993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC5682e f31994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC5682e f31995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC5682e f31996h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC5682e f31997i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InterfaceC5682e f31998j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public InterfaceC5682e f31999k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public InterfaceC5682e f32000l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC5682e f32001m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public InterfaceC5682e f32002n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public InterfaceC5682e f32003o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public InterfaceC5682e f32004p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public InterfaceC5682e f32005q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public InterfaceC5682e f32006r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public InterfaceC5682e f32007s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public InterfaceC5682e f32008t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public InterfaceC5682e f32009u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public InterfaceC5682e f32010v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public InterfaceC5682e f32011w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public InterfaceC5682e f32012x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public InterfaceC5682e f32013y;

        @Override // com.google.firebase.sessions.b
        public T a() {
            return (T) this.f32011w.get();
        }

        @Override // com.google.firebase.sessions.b
        public C5436l b() {
            return (C5436l) this.f32013y.get();
        }

        public final void c(Context context, InterfaceC4992i interfaceC4992i, InterfaceC4992i interfaceC4992i2, C4288f c4288f, h hVar, O8.b bVar) {
            this.f31990b = C5680c.a(c4288f);
            InterfaceC5679b interfaceC5679bA = C5680c.a(context);
            this.f31991c = interfaceC5679bA;
            this.f31992d = C5678a.a(s9.c.a(interfaceC5679bA));
            this.f31993e = C5678a.a(f.a());
            this.f31994f = C5680c.a(hVar);
            this.f31995g = C5678a.a(com.google.firebase.sessions.c.b(this.f31990b));
            InterfaceC5679b interfaceC5679bA2 = C5680c.a(interfaceC4992i2);
            this.f31996h = interfaceC5679bA2;
            this.f31997i = C5678a.a(s9.f.a(this.f31995g, interfaceC5679bA2));
            this.f31998j = C5680c.a(interfaceC4992i);
            InterfaceC5682e interfaceC5682eA = C5678a.a(d.a(this.f31991c, this.f31996h));
            this.f31999k = interfaceC5682eA;
            InterfaceC5682e interfaceC5682eA2 = C5678a.a(n.a(this.f31998j, this.f31993e, interfaceC5682eA));
            this.f32000l = interfaceC5682eA2;
            InterfaceC5682e interfaceC5682eA3 = C5678a.a(s9.g.a(this.f31993e, this.f31994f, this.f31995g, this.f31997i, interfaceC5682eA2));
            this.f32001m = interfaceC5682eA3;
            this.f32002n = C5678a.a(k.a(this.f31992d, interfaceC5682eA3));
            InterfaceC5682e interfaceC5682eA4 = C5678a.a(g.a());
            this.f32003o = interfaceC5682eA4;
            this.f32004p = C5678a.a(O.a(this.f31993e, interfaceC5682eA4));
            InterfaceC5679b interfaceC5679bA3 = C5680c.a(bVar);
            this.f32005q = interfaceC5679bA3;
            InterfaceC5682e interfaceC5682eA5 = C5678a.a(C5433i.a(interfaceC5679bA3));
            this.f32006r = interfaceC5682eA5;
            this.f32007s = C5678a.a(M.a(this.f31990b, this.f31994f, this.f32002n, interfaceC5682eA5, this.f31998j));
            InterfaceC5682e interfaceC5682eA6 = C5678a.a(G.a(this.f32004p));
            this.f32008t = interfaceC5682eA6;
            this.f32009u = C5678a.a(e.a(this.f31991c, this.f31996h, interfaceC5682eA6));
            InterfaceC5682e interfaceC5682eA7 = C5678a.a(B.a(this.f31991c, this.f32003o));
            this.f32010v = interfaceC5682eA7;
            InterfaceC5682e interfaceC5682eA8 = C5678a.a(V.a(this.f32002n, this.f32004p, this.f32007s, this.f31993e, this.f32009u, interfaceC5682eA7, this.f31998j));
            this.f32011w = interfaceC5682eA8;
            InterfaceC5682e interfaceC5682eA9 = C5678a.a(S.a(interfaceC5682eA8));
            this.f32012x = interfaceC5682eA9;
            this.f32013y = C5678a.a(C5442s.a(this.f31990b, this.f32002n, this.f31998j, interfaceC5682eA9));
        }

        public c(Context context, InterfaceC4992i interfaceC4992i, InterfaceC4992i interfaceC4992i2, C4288f c4288f, h hVar, O8.b bVar) {
            this.f31989a = this;
            c(context, interfaceC4992i, interfaceC4992i2, c4288f, hVar, bVar);
        }
    }

    public static b.a a() {
        return new b();
    }
}
