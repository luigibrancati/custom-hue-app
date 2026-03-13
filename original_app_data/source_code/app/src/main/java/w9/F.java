package w9;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import x9.AbstractC6344p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F {
    public static u9.j a(C9.a aVar) {
        boolean z10;
        try {
            try {
                aVar.C();
                z10 = false;
                try {
                    return (u9.j) AbstractC6344p.f48046V.c(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return u9.l.f45471a;
                    }
                    throw new u9.q(e);
                }
            } catch (C9.d e11) {
                throw new u9.q(e11);
            } catch (IOException e12) {
                throw new u9.k(e12);
            } catch (NumberFormatException e13) {
                throw new u9.q(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void b(u9.j jVar, C9.c cVar) {
        AbstractC6344p.f48046V.e(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f46396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f46397b = new a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public char[] f46398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f46399b;

            public a() {
            }

            public void a(char[] cArr) {
                this.f46398a = cArr;
                this.f46399b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f46398a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f46398a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f46398a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f46399b == null) {
                    this.f46399b = new String(this.f46398a);
                }
                return this.f46399b;
            }
        }

        public b(Appendable appendable) {
            this.f46396a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f46397b.a(cArr);
            this.f46396a.append(this.f46397b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f46396a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f46396a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f46396a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f46396a.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
