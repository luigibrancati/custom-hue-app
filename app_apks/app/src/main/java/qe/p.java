package qe;

import Fe.C0843e;
import Fe.InterfaceC0845g;
import Fe.J;
import Od.F;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.M;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.TikaCoreProperties;
import pe.B;
import pe.C;
import pe.D;
import pe.InterfaceC5469e;
import pe.s;
import pe.u;
import pe.v;
import pe.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f43478a = m.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f43479b = m.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f43480c = m.o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f43481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f43482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43483f;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC4862t.b(timeZone);
        f43481d = timeZone;
        f43482e = false;
        String name = y.class.getName();
        AbstractC4862t.d(name, "getName(...)");
        f43483f = F.C0(F.B0(name, "okhttp3."), "Client");
    }

    public static final s.c c(final s sVar) {
        AbstractC4862t.e(sVar, "<this>");
        return new s.c() { // from class: qe.n
            @Override // pe.s.c
            public final s a(InterfaceC5469e interfaceC5469e) {
                return p.d(sVar, interfaceC5469e);
            }
        };
    }

    public static final s d(s this_asFactory, InterfaceC5469e it) {
        AbstractC4862t.e(this_asFactory, "$this_asFactory");
        AbstractC4862t.e(it, "it");
        return this_asFactory;
    }

    public static final boolean e(v vVar, v other) {
        AbstractC4862t.e(vVar, "<this>");
        AbstractC4862t.e(other, "other");
        return AbstractC4862t.a(vVar.h(), other.h()) && vVar.m() == other.m() && AbstractC4862t.a(vVar.q(), other.q());
    }

    public static final void f(Socket socket) {
        AbstractC4862t.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC4862t.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean g(J j10, int i10, TimeUnit timeUnit) {
        AbstractC4862t.e(j10, "<this>");
        AbstractC4862t.e(timeUnit, "timeUnit");
        try {
            return l(j10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... args) {
        AbstractC4862t.e(format, "format");
        AbstractC4862t.e(args, "args");
        S s10 = S.f39781a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC4862t.d(str, "format(...)");
        return str;
    }

    public static final long i(C c10) {
        AbstractC4862t.e(c10, "<this>");
        String strC = c10.o().c(HttpHeaders.CONTENT_LENGTH);
        if (strC != null) {
            return m.F(strC, -1L);
        }
        return -1L;
    }

    public static final List j(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(C4206t.n(Arrays.copyOf(objArr, objArr.length)));
        AbstractC4862t.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final boolean k(Socket socket, InterfaceC0845g source) {
        AbstractC4862t.e(socket, "<this>");
        AbstractC4862t.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.z0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean l(J j10, int i10, TimeUnit timeUnit) {
        AbstractC4862t.e(j10, "<this>");
        AbstractC4862t.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = j10.n().e() ? j10.n().c() - jNanoTime : Long.MAX_VALUE;
        j10.n().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C0843e c0843e = new C0843e();
            while (j10.V0(c0843e, 8192L) != -1) {
                c0843e.a();
            }
            if (jC == Long.MAX_VALUE) {
                j10.n().a();
                return true;
            }
            j10.n().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                j10.n().a();
                return false;
            }
            j10.n().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                j10.n().a();
            } else {
                j10.n().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory m(final String name, final boolean z10) {
        AbstractC4862t.e(name, "name");
        return new ThreadFactory() { // from class: qe.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return p.n(name, z10, runnable);
            }
        };
    }

    public static final Thread n(String name, boolean z10, Runnable runnable) {
        AbstractC4862t.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List o(u uVar) {
        AbstractC4862t.e(uVar, "<this>");
        Bc.f fVarP = Bc.k.p(0, uVar.size());
        ArrayList arrayList = new ArrayList(C4207u.v(fVarP, 10));
        Iterator it = fVarP.iterator();
        while (it.hasNext()) {
            int iNextInt = ((M) it).nextInt();
            arrayList.add(new xe.d(uVar.e(iNextInt), uVar.h(iNextInt)));
        }
        return arrayList;
    }

    public static final u p(List list) {
        AbstractC4862t.e(list, "<this>");
        u.a aVar = new u.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xe.d dVar = (xe.d) it.next();
            aVar.c(dVar.a().R(), dVar.b().R());
        }
        return aVar.d();
    }

    public static final String q(v vVar, boolean z10) {
        String strH;
        AbstractC4862t.e(vVar, "<this>");
        if (F.V(vVar.h(), TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, false, 2, null)) {
            strH = '[' + vVar.h() + ']';
        } else {
            strH = vVar.h();
        }
        if (!z10 && vVar.m() == v.f42873j.b(vVar.q())) {
            return strH;
        }
        return strH + ':' + vVar.m();
    }

    public static /* synthetic */ String r(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return q(vVar, z10);
    }

    public static final List s(List list) {
        AbstractC4862t.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(C4179C.X0(list));
        AbstractC4862t.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
