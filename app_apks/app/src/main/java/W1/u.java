package W1;

import G1.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f17763c = new u(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17764d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17766b;

    public u(long j10, long j11) {
        this.f17765a = j10;
        this.f17766b = j11;
    }

    public static String b(long j10) {
        return M.G("npt=%.3f-", Double.valueOf(j10 / 1000.0d));
    }

    public static u d(String str) throws D1.w {
        long j10;
        Matcher matcher = f17764d.matcher(str);
        androidx.media3.exoplayer.rtsp.h.a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        androidx.media3.exoplayer.rtsp.h.a(strGroup != null, str);
        long j11 = ((String) M.i(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                androidx.media3.exoplayer.rtsp.h.a(j10 >= j11, str);
            } catch (NumberFormatException e10) {
                throw D1.w.c(strGroup2, e10);
            }
        } else {
            j10 = -9223372036854775807L;
        }
        return new u(j11, j10);
    }

    public long a() {
        return this.f17766b - this.f17765a;
    }

    public boolean c() {
        return this.f17766b == -9223372036854775807L;
    }
}
