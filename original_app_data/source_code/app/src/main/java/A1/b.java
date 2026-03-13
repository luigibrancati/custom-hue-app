package A1;

import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b0.K;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b extends A1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2758n f3a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends N {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final O.c f5d = new C0000a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public K f6b = new K();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7c = false;

        /* JADX INFO: renamed from: A1.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0000a implements O.c {
            @Override // androidx.lifecycle.O.c
            public N c(Class cls) {
                return new a();
            }
        }

        public static a f(P p10) {
            return (a) new O(p10, f5d).b(a.class);
        }

        @Override // androidx.lifecycle.N
        public void d() {
            super.d();
            if (this.f6b.q() <= 0) {
                this.f6b.e();
            } else {
                android.support.v4.media.session.a.a(this.f6b.r(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f6b.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("    ");
                if (this.f6b.q() <= 0) {
                    return;
                }
                android.support.v4.media.session.a.a(this.f6b.r(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f6b.m(0));
                printWriter.print(": ");
                throw null;
            }
        }

        public void g() {
            if (this.f6b.q() <= 0) {
                return;
            }
            android.support.v4.media.session.a.a(this.f6b.r(0));
            throw null;
        }
    }

    public b(InterfaceC2758n interfaceC2758n, P p10) {
        this.f3a = interfaceC2758n;
        this.f4b = a.f(p10);
    }

    @Override // A1.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // A1.a
    public void c() {
        this.f4b.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        X0.b.a(this.f3a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
