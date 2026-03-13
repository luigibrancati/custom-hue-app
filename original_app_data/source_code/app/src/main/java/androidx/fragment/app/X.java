package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class X extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f23188b = new StringBuilder(128);

    public X(String str) {
        this.f23187a = str;
    }

    public final void a() {
        if (this.f23188b.length() > 0) {
            Log.d(this.f23187a, this.f23188b.toString());
            StringBuilder sb2 = this.f23188b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f23188b.append(c10);
            }
        }
    }
}
