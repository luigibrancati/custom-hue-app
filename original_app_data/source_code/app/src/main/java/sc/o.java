package sc;

import Nd.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {
    public static final long a(Reader reader, Writer out, int i10) throws IOException {
        AbstractC4862t.e(reader, "<this>");
        AbstractC4862t.e(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final Nd.h c(BufferedReader bufferedReader) {
        AbstractC4862t.e(bufferedReader, "<this>");
        return q.h(new m(bufferedReader));
    }

    public static final String d(Reader reader) {
        AbstractC4862t.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
