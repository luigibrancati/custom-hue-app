package x9;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import u9.q;
import u9.w;
import u9.x;
import w9.C;
import y9.AbstractC6455a;

/* JADX INFO: renamed from: x9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6331c extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f47943c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f47944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f47945b;

    /* JADX INFO: renamed from: x9.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {
        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            a aVar2 = null;
            if (clsC != Date.class) {
                return null;
            }
            int i10 = 2;
            return new C6331c(b.f47946b, i10, i10, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public /* synthetic */ C6331c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    public final Date f(C9.a aVar) throws IOException {
        String strNextString = aVar.nextString();
        synchronized (this.f47945b) {
            try {
                Iterator it = this.f47945b.iterator();
                while (it.hasNext()) {
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(strNextString);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return AbstractC6455a.c(strNextString, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new q("Failed parsing '" + strNextString + "' as Date; at path " + aVar.h(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u9.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Date c(C9.a aVar) throws IOException {
        if (aVar.C() == C9.b.NULL) {
            aVar.nextNull();
            return null;
        }
        return this.f47944a.d(f(aVar));
    }

    @Override // u9.w
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.C();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f47945b.get(0);
        synchronized (this.f47945b) {
            str = dateFormat.format(date);
        }
        cVar.C0(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f47945b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public /* synthetic */ C6331c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    public C6331c(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f47945b = arrayList;
        Objects.requireNonNull(bVar);
        this.f47944a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public C6331c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f47945b = arrayList;
        Objects.requireNonNull(bVar);
        this.f47944a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (w9.w.c()) {
            arrayList.add(C.c(i10, i11));
        }
    }

    /* JADX INFO: renamed from: x9.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f47946b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f47947a;

        public b(Class cls) {
            this.f47947a = cls;
        }

        public final x a(int i10, int i11) {
            return c(new C6331c(this, i10, i11, null));
        }

        public final x b(String str) {
            return c(new C6331c(this, str, (a) null));
        }

        public final x c(C6331c c6331c) {
            return AbstractC6344p.c(this.f47947a, c6331c);
        }

        public abstract Date d(Date date);

        /* JADX INFO: renamed from: x9.c$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends b {
            public a(Class cls) {
                super(cls);
            }

            @Override // x9.C6331c.b
            public Date d(Date date) {
                return date;
            }
        }
    }
}
