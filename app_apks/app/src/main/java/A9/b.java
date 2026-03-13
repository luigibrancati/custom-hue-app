package A9;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import u9.e;
import u9.q;
import u9.w;
import u9.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f251b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f252a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {
        @Override // u9.x
        public w create(e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            a aVar2 = null;
            if (clsC == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    @Override // u9.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Time c(C9.a aVar) throws IOException {
        Time time;
        if (aVar.C() == C9.b.NULL) {
            aVar.nextNull();
            return null;
        }
        String strNextString = aVar.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f252a.getTimeZone();
            try {
                try {
                    time = new Time(this.f252a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new q("Failed parsing '" + strNextString + "' as SQL Time; at path " + aVar.h(), e10);
                }
            } finally {
                this.f252a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // u9.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.C();
            return;
        }
        synchronized (this) {
            str = this.f252a.format((Date) time);
        }
        cVar.C0(str);
    }

    private b() {
        this.f252a = new SimpleDateFormat("hh:mm:ss a");
    }
}
