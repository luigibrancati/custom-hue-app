package pe;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42804a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f42805b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends k {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final k a() {
            return k.f42805b;
        }

        public b() {
        }
    }

    public void b(j connection, E route, InterfaceC5469e call) {
        AbstractC4862t.e(connection, "connection");
        AbstractC4862t.e(route, "route");
        AbstractC4862t.e(call, "call");
    }

    public void c(E route, InterfaceC5469e call, IOException failure) {
        AbstractC4862t.e(route, "route");
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(failure, "failure");
    }

    public void d(E route, InterfaceC5469e call) {
        AbstractC4862t.e(route, "route");
        AbstractC4862t.e(call, "call");
    }

    public void e(j connection, InterfaceC5469e call) {
        AbstractC4862t.e(connection, "connection");
        AbstractC4862t.e(call, "call");
    }

    public void f(j connection) {
        AbstractC4862t.e(connection, "connection");
    }

    public void g(j connection, InterfaceC5469e call) {
        AbstractC4862t.e(connection, "connection");
        AbstractC4862t.e(call, "call");
    }

    public void h(j connection) {
        AbstractC4862t.e(connection, "connection");
    }
}
