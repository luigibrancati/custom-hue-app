package ie;

import fc.C4015H;
import gc.C4199l;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4384f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4199l f37528a = new C4199l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37529b;

    public final void a(char[] array) {
        AbstractC4862t.e(array, "array");
        synchronized (this) {
            try {
                if (this.f37529b + array.length < AbstractC4382d.f37526a) {
                    this.f37529b += array.length;
                    this.f37528a.addLast(array);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f37528a.v();
            if (cArr != null) {
                this.f37529b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
