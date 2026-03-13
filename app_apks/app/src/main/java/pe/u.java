package pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f42870b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f42871a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f42872a = new ArrayList(20);

        public final a a(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.e.b(this, name, value);
        }

        public final a b(String line) {
            AbstractC4862t.e(line, "line");
            int iH0 = Od.F.h0(line, ':', 1, false, 4, null);
            if (iH0 != -1) {
                String strSubstring = line.substring(0, iH0);
                AbstractC4862t.d(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iH0 + 1);
                AbstractC4862t.d(strSubstring2, "substring(...)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC4862t.d(strSubstring3, "substring(...)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.e.c(this, name, value);
        }

        public final u d() {
            return qe.e.d(this);
        }

        public final String e(String name) {
            AbstractC4862t.e(name, "name");
            return qe.e.f(this, name);
        }

        public final List f() {
            return this.f42872a;
        }

        public final a g(String name) {
            AbstractC4862t.e(name, "name");
            return qe.e.m(this, name);
        }

        public final a h(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.e.n(this, name, value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final u a(String... namesAndValues) {
            AbstractC4862t.e(namesAndValues, "namesAndValues");
            return qe.e.i((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public b() {
        }
    }

    public u(String[] namesAndValues) {
        AbstractC4862t.e(namesAndValues, "namesAndValues");
        this.f42871a = namesAndValues;
    }

    public final String c(String name) {
        AbstractC4862t.e(name, "name");
        return qe.e.h(this.f42871a, name);
    }

    public final String[] d() {
        return this.f42871a;
    }

    public final String e(int i10) {
        return qe.e.k(this, i10);
    }

    public boolean equals(Object obj) {
        return qe.e.e(this, obj);
    }

    public final a f() {
        return qe.e.l(this);
    }

    public final String h(int i10) {
        return qe.e.p(this, i10);
    }

    public int hashCode() {
        return qe.e.g(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return qe.e.j(this);
    }

    public final List k(String name) {
        AbstractC4862t.e(name, "name");
        return qe.e.q(this, name);
    }

    public final int size() {
        return this.f42871a.length / 2;
    }

    public String toString() {
        return qe.e.o(this);
    }
}
