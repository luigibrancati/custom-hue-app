package W2;

import O7.e;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import Rd.N;
import X2.i;
import X2.j;
import X2.k;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17798a = new b(null);

    /* JADX INFO: renamed from: W2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0237a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final X2.b f17799b;

        /* JADX INFO: renamed from: W2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0238a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17800j;

            public C0238a(X2.a aVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new C0238a(null, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0238a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17800j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    this.f17800j = 1;
                    if (bVar.a(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17802j;

            public b(InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new b(interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17802j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    return obj;
                }
                AbstractC4036s.b(obj);
                X2.b bVar = C0237a.this.f17799b;
                this.f17802j = 1;
                Object objB = bVar.b(this);
                return objB == objF ? objF : objB;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17804j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Uri f17806l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ InputEvent f17807m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f17806l = uri;
                this.f17807m = inputEvent;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new c(this.f17806l, this.f17807m, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17804j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    Uri uri = this.f17806l;
                    InputEvent inputEvent = this.f17807m;
                    this.f17804j = 1;
                    if (bVar.d(uri, inputEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17808j;

            public d(i iVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new d(null, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17808j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    this.f17808j = 1;
                    if (bVar.c(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17810j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Uri f17812l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f17812l = uri;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new e(this.f17812l, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17810j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    Uri uri = this.f17812l;
                    this.f17810j = 1;
                    if (bVar.e(uri, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$f */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class f extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17813j;

            public f(j jVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new f(null, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17813j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    this.f17813j = 1;
                    if (bVar.f(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: W2.a$a$g */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class g extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17815j;

            public g(k kVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return C0237a.this.new g(null, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f17815j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    X2.b bVar = C0237a.this.f17799b;
                    this.f17815j = 1;
                    if (bVar.g(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        public C0237a(X2.b mMeasurementManager) {
            AbstractC4862t.e(mMeasurementManager, "mMeasurementManager");
            this.f17799b = mMeasurementManager;
        }

        @Override // W2.a
        public O7.e b() {
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // W2.a
        public O7.e c(Uri trigger) {
            AbstractC4862t.e(trigger, "trigger");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public O7.e e(X2.a deletionRequest) {
            AbstractC4862t.e(deletionRequest, "deletionRequest");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new C0238a(deletionRequest, null), 3, null), null, 1, null);
        }

        public O7.e f(i request) {
            AbstractC4862t.e(request, "request");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public O7.e g(Uri attributionSource, InputEvent inputEvent) {
            AbstractC4862t.e(attributionSource, "attributionSource");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        public O7.e h(j request) {
            AbstractC4862t.e(request, "request");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public O7.e i(k request) {
            AbstractC4862t.e(request, "request");
            return V2.b.c(AbstractC2132i.b(N.a(C2123d0.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final a a(Context context) {
            AbstractC4862t.e(context, "context");
            X2.b bVarA = X2.b.f18097a.a(context);
            if (bVarA != null) {
                return new C0237a(bVarA);
            }
            return null;
        }

        public b() {
        }
    }

    public static final a a(Context context) {
        return f17798a.a(context);
    }

    public abstract e b();

    public abstract e c(Uri uri);
}
