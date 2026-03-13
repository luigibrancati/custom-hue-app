package Ib;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f5676c;

    /* JADX INFO: renamed from: Ib.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0095a extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public abstract void a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f5677a;

        public c(PrintStream printStream) {
            this.f5677a = printStream;
        }

        @Override // Ib.a.b
        public void a(Object obj) {
            this.f5677a.println(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f5678a;

        public d(PrintWriter printWriter) {
            this.f5678a = printWriter;
        }

        @Override // Ib.a.b
        public void a(Object obj) {
            this.f5678a.println(obj);
        }
    }

    public a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public final void a(StringBuilder sb2, Throwable th, String str) {
        sb2.append(str);
        sb2.append(th);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th.getCause(), "");
        }
    }

    public List b() {
        return this.f5674a;
    }

    public final List c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    public Throwable d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public final void e(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f5674a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f5676c == null) {
                C0095a c0095a = new C0095a();
                HashSet hashSet = new HashSet();
                Throwable thD = c0095a;
                for (Throwable runtimeException : this.f5674a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        for (Throwable th : c(runtimeException)) {
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            thD.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        thD = d(thD);
                    }
                }
                this.f5676c = c0095a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f5676c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f5675b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new d(printWriter));
    }

    public a(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f5674a = listUnmodifiableList;
            this.f5675b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
