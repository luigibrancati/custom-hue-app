package sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Nd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f44459a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44461b;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f44460a;
            this.f44460a = null;
            AbstractC4862t.b(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f44460a == null && !this.f44461b) {
                String line = m.this.f44459a.readLine();
                this.f44460a = line;
                if (line == null) {
                    this.f44461b = true;
                }
            }
            return this.f44460a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(BufferedReader reader) {
        AbstractC4862t.e(reader, "reader");
        this.f44459a = reader;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
