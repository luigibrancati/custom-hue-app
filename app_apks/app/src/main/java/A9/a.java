package A9;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import u9.e;
import u9.q;
import u9.w;
import u9.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f249b = new C0005a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f250a;

    /* JADX INFO: renamed from: A9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0005a implements x {
        @Override // u9.x
        public w create(e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            C0005a c0005a = null;
            if (clsC == Date.class) {
                return new a(c0005a);
            }
            return null;
        }
    }

    public /* synthetic */ a(C0005a c0005a) {
        this();
    }

    @Override // u9.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date c(C9.a aVar) throws IOException {
        Date date;
        if (aVar.C() == C9.b.NULL) {
            aVar.nextNull();
            return null;
        }
        String strNextString = aVar.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f250a.getTimeZone();
            try {
                try {
                    date = new Date(this.f250a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new q("Failed parsing '" + strNextString + "' as SQL Date; at path " + aVar.h(), e10);
                }
            } finally {
                this.f250a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // u9.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.C();
            return;
        }
        synchronized (this) {
            str = this.f250a.format((java.util.Date) date);
        }
        cVar.C0(str);
    }

    private a() {
        this.f250a = new SimpleDateFormat("MMM d, yyyy");
    }
}
