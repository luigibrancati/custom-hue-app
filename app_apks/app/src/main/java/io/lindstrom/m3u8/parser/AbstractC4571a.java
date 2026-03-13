package io.lindstrom.m3u8.parser;

import Db.InterfaceC0775w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4571a {

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0504a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38387a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BufferedReader f38388b;

        public C0504a(BufferedReader bufferedReader) {
            this.f38388b = bufferedReader;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (this.f38387a == null && !hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f38387a;
            this.f38387a = null;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38387a != null) {
                return true;
            }
            try {
                String line = this.f38388b.readLine();
                this.f38387a = line;
                return line != null;
            } catch (IOException e10) {
                throw new UncheckedIOException(e10);
            }
        }
    }

    public abstract InterfaceC0775w a(Object obj);

    public abstract Object b();

    public abstract void c(Object obj, String str);

    public abstract void d(Object obj, String str, String str2, Iterator it);

    public void e(Object obj, String str) throws y {
        throw new y("Unexpected URI in playlist: " + str);
    }

    public InterfaceC0775w f(BufferedReader bufferedReader) {
        return h(new C0504a(bufferedReader));
    }

    public InterfaceC0775w g(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            InterfaceC0775w interfaceC0775wF = f(bufferedReader);
            bufferedReader.close();
            return interfaceC0775wF;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public InterfaceC0775w h(Iterator it) throws y {
        boolean z10 = false;
        while (it.hasNext() && !z10) {
            String str = (String) it.next();
            if ("#EXTM3U".equals(str)) {
                z10 = true;
            } else if (!str.isEmpty()) {
                break;
            }
        }
        if (!z10) {
            throw new y("Invalid playlist. Expected #EXTM3U.");
        }
        Object objB = b();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("#EXT")) {
                int iIndexOf = str2.indexOf(58);
                d(objB, iIndexOf > 0 ? str2.substring(1, iIndexOf) : str2.substring(1), iIndexOf > 0 ? str2.substring(iIndexOf + 1) : "", it);
            } else if (!str2.isEmpty()) {
                if (str2.startsWith("#")) {
                    c(objB, str2.substring(1));
                } else {
                    e(objB, str2);
                }
            }
        }
        return a(objB);
    }
}
