package g1;

import fc.AbstractC4036s;
import fc.C4015H;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: renamed from: g1.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4066A extends C4111u implements i0 {

    /* JADX INFO: renamed from: g1.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34809j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f34810k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f34811l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f34813n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, InterfaceC4988e interfaceC4988e) {
            super(1, interfaceC4988e);
            this.f34813n = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
            return C4066A.this.new a(this.f34813n, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Exception {
            Closeable closeable;
            Throwable th;
            FileOutputStream fileOutputStream;
            Object objF = C5046c.f();
            int i10 = this.f34811l;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(C4066A.this.g());
                    C4066A c4066a = C4066A.this;
                    Object obj2 = this.f34813n;
                    try {
                        InterfaceC4087W interfaceC4087WH = c4066a.h();
                        g0 g0Var = new g0(fileOutputStream2);
                        this.f34809j = fileOutputStream2;
                        this.f34810k = fileOutputStream2;
                        this.f34811l = 1;
                        if (interfaceC4087WH.c(obj2, g0Var, this) == objF) {
                            return objF;
                        }
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        closeable = fileOutputStream2;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) this.f34810k;
                    closeable = (Closeable) this.f34809j;
                    try {
                        AbstractC4036s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            sc.c.a(closeable, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(closeable, null);
                return C4015H.f34254a;
            } catch (Exception e10) {
                if (e10 instanceof FileNotFoundException) {
                    throw AbstractC4107q.c(C4066A.this.g().getParent(), e10);
                }
                throw e10;
            }
        }

        @Override // vc.l
        public final Object invoke(InterfaceC4988e interfaceC4988e) {
            return ((a) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4066A(File file, InterfaceC4087W serializer) {
        super(file, serializer);
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(serializer, "serializer");
    }

    @Override // g1.i0
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) throws Throwable {
        f();
        Object objB = AbstractC4116z.b(g(), new a(obj, null), interfaceC4988e);
        return objB == C5046c.f() ? objB : C4015H.f34254a;
    }
}
