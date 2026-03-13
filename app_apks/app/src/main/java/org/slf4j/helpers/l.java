package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f41621a = {"System.out", "stdout", "sysout"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41622b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41623c = g();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);

        int levelInt;

        a(int i10) {
            this.levelInt = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        Stderr,
        Stdout
    }

    public static void a(String str) {
        if (h(a.DEBUG)) {
            d().println("SLF4J(D): " + str);
        }
    }

    public static final void b(String str) {
        d().println("SLF4J(E): " + str);
    }

    public static final void c(String str, Throwable th) {
        d().println("SLF4J(E): " + str);
        d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(d());
    }

    public static PrintStream d() {
        return f41622b.ordinal() != 1 ? System.err : System.out;
    }

    public static b e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : f41621a) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    public static void f(String str) {
        if (h(a.INFO)) {
            d().println("SLF4J(I): " + str);
        }
    }

    public static a g() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? a.INFO : property.equalsIgnoreCase("DEBUG") ? a.DEBUG : property.equalsIgnoreCase("ERROR") ? a.ERROR : property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    public static boolean h(a aVar) {
        return aVar.levelInt >= f41623c.levelInt;
    }

    public static final void i(String str) {
        if (h(a.WARN)) {
            d().println("SLF4J(W): " + str);
        }
    }
}
