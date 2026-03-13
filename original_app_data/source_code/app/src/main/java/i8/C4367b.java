package i8;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import l8.InterfaceC4964a;

/* JADX INFO: renamed from: i8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4367b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f37310g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateFormat f37311h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f37315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37317f;

    public C4367b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f37312a = str;
        this.f37313b = str2;
        this.f37314c = str3;
        this.f37315d = date;
        this.f37316e = j10;
        this.f37317f = j11;
    }

    public static C4367b a(InterfaceC4964a.c cVar) {
        String str = cVar.f39908d;
        if (str == null) {
            str = "";
        }
        return new C4367b(cVar.f39906b, String.valueOf(cVar.f39907c), str, new Date(cVar.f39917m), cVar.f39909e, cVar.f39914j);
    }

    public static C4367b b(Map map) throws C4366a {
        g(map);
        try {
            return new C4367b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f37311h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new C4366a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new C4366a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    public static void g(Map map) throws C4366a {
        ArrayList arrayList = new ArrayList();
        for (String str : f37310g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C4366a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public String c() {
        return this.f37312a;
    }

    public long d() {
        return this.f37315d.getTime();
    }

    public String e() {
        return this.f37313b;
    }

    public InterfaceC4964a.c f(String str) {
        InterfaceC4964a.c cVar = new InterfaceC4964a.c();
        cVar.f39905a = str;
        cVar.f39917m = d();
        cVar.f39906b = this.f37312a;
        cVar.f39907c = this.f37313b;
        cVar.f39908d = TextUtils.isEmpty(this.f37314c) ? null : this.f37314c;
        cVar.f39909e = this.f37316e;
        cVar.f39914j = this.f37317f;
        return cVar;
    }
}
