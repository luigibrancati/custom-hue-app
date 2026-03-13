package Y3;

import Y3.b;
import android.graphics.Bitmap;
import d4.AbstractC3823f;
import d4.InterfaceC3824g;
import i4.i;
import i4.j;
import j4.AbstractC4689h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface b extends i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0248b f19716a = C0248b.f19718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f19717b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b {
        @Override // Y3.b, i4.i.b
        public void a(i iVar) {
            c.i(this, iVar);
        }

        @Override // Y3.b, i4.i.b
        public void b(i iVar, Throwable th) {
            c.h(this, iVar, th);
        }

        @Override // Y3.b, i4.i.b
        public void c(i iVar) {
            c.g(this, iVar);
        }

        @Override // Y3.b, i4.i.b
        public void d(i iVar, j.a aVar) {
            c.j(this, iVar, aVar);
        }

        @Override // Y3.b
        public void e(i iVar, InterfaceC3824g interfaceC3824g, c4.i iVar2) {
            c.d(this, iVar, interfaceC3824g, iVar2);
        }

        @Override // Y3.b
        public void f(i iVar) {
            c.l(this, iVar);
        }

        @Override // Y3.b
        public void g(i iVar, InterfaceC3824g interfaceC3824g, c4.i iVar2, AbstractC3823f abstractC3823f) {
            c.c(this, iVar, interfaceC3824g, iVar2, abstractC3823f);
        }

        @Override // Y3.b
        public void h(i iVar, c4.e eVar, c4.i iVar2, c4.c cVar) {
            c.a(this, iVar, eVar, iVar2, cVar);
        }

        @Override // Y3.b
        public void i(i iVar) {
            c.o(this, iVar);
        }

        @Override // Y3.b
        public void j(i iVar, AbstractC4689h abstractC4689h) {
            c.k(this, iVar, abstractC4689h);
        }

        @Override // Y3.b
        public void k(i iVar, Object obj) {
            c.f(this, iVar, obj);
        }

        @Override // Y3.b
        public void l(i iVar) {
            c.p(this, iVar);
        }

        @Override // Y3.b
        public void m(i iVar, c4.e eVar, c4.i iVar2) {
            c.b(this, iVar, eVar, iVar2);
        }

        @Override // Y3.b
        public void n(i iVar, Object obj) {
            c.e(this, iVar, obj);
        }

        @Override // Y3.b
        public void o(i iVar, Bitmap bitmap) {
            c.n(this, iVar, bitmap);
        }

        @Override // Y3.b
        public void p(i iVar, Bitmap bitmap) {
            c.m(this, iVar, bitmap);
        }
    }

    /* JADX INFO: renamed from: Y3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0248b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0248b f19718a = new C0248b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static void a(b bVar, i request, c4.e decoder, c4.i options, c4.c result) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(decoder, "decoder");
            AbstractC4862t.e(options, "options");
            AbstractC4862t.e(result, "result");
        }

        public static void b(b bVar, i request, c4.e decoder, c4.i options) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(decoder, "decoder");
            AbstractC4862t.e(options, "options");
        }

        public static void c(b bVar, i request, InterfaceC3824g fetcher, c4.i options, AbstractC3823f result) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(fetcher, "fetcher");
            AbstractC4862t.e(options, "options");
            AbstractC4862t.e(result, "result");
        }

        public static void d(b bVar, i request, InterfaceC3824g fetcher, c4.i options) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(fetcher, "fetcher");
            AbstractC4862t.e(options, "options");
        }

        public static void e(b bVar, i request, Object output) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(output, "output");
        }

        public static void f(b bVar, i request, Object input) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(input, "input");
        }

        public static void g(b bVar, i request) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
        }

        public static void h(b bVar, i request, Throwable throwable) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(throwable, "throwable");
        }

        public static void i(b bVar, i request) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
        }

        public static void j(b bVar, i request, j.a metadata) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(metadata, "metadata");
        }

        public static void k(b bVar, i request, AbstractC4689h size) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(size, "size");
        }

        public static void l(b bVar, i request) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
        }

        public static void m(b bVar, i request, Bitmap output) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(output, "output");
        }

        public static void n(b bVar, i request, Bitmap input) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(input, "input");
        }

        public static void o(b bVar, i request) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
        }

        public static void p(b bVar, i request) {
            AbstractC4862t.e(bVar, "this");
            AbstractC4862t.e(request, "request");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f19720b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f19721a = new a();

            public static final b c(b listener, i it) {
                AbstractC4862t.e(listener, "$listener");
                AbstractC4862t.e(it, "it");
                return listener;
            }

            public final d b(final b listener) {
                AbstractC4862t.e(listener, "listener");
                return new d() { // from class: Y3.c
                    @Override // Y3.b.d
                    public final b a(i iVar) {
                        return b.d.a.c(listener, iVar);
                    }
                };
            }
        }

        static {
            a aVar = a.f19721a;
            f19719a = aVar;
            f19720b = aVar.b(b.f19717b);
        }

        b a(i iVar);
    }

    @Override // i4.i.b
    void a(i iVar);

    @Override // i4.i.b
    void b(i iVar, Throwable th);

    @Override // i4.i.b
    void c(i iVar);

    @Override // i4.i.b
    void d(i iVar, j.a aVar);

    void e(i iVar, InterfaceC3824g interfaceC3824g, c4.i iVar2);

    void f(i iVar);

    void g(i iVar, InterfaceC3824g interfaceC3824g, c4.i iVar2, AbstractC3823f abstractC3823f);

    void h(i iVar, c4.e eVar, c4.i iVar2, c4.c cVar);

    void i(i iVar);

    void j(i iVar, AbstractC4689h abstractC4689h);

    void k(i iVar, Object obj);

    void l(i iVar);

    void m(i iVar, c4.e eVar, c4.i iVar2);

    void n(i iVar, Object obj);

    void o(i iVar, Bitmap bitmap);

    void p(i iVar, Bitmap bitmap);
}
