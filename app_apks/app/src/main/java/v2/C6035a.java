package v2;

import D1.u;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6035a extends r2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f45745c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f45746a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f45747b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // r2.c
    public u b(r2.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new u(new c(bArr, null, null));
        }
        Matcher matcher = f45745c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = J7.c.e(strGroup);
                strE.getClass();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new u(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.f45746a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f45747b.decode(byteBuffer).toString();
                this.f45747b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f45747b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f45747b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f45746a.reset();
            byteBuffer.rewind();
        }
    }
}
