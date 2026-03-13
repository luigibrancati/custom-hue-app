package db;

import V9.a;
import android.graphics.Point;
import android.graphics.Rect;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4207u;
import io.sentry.SentryLockReason;
import io.sentry.SentryLogEvent;
import io.sentry.SentryReplayEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3860P {
    public static final Map a(a.C0222a c0222a) {
        String[] strArrA = c0222a.a();
        AbstractC4862t.d(strArrA, "getAddressLines(...)");
        ArrayList arrayList = new ArrayList(strArrA.length);
        for (String str : strArrA) {
            arrayList.add(str.toString());
        }
        return gc.Q.l(AbstractC4040w.a("addressLines", arrayList), AbstractC4040w.a("type", Integer.valueOf(c0222a.b())));
    }

    public static final Map b(a.c cVar) {
        C4034q c4034qA = AbstractC4040w.a("description", cVar.a());
        a.b bVarB = cVar.b();
        C4034q c4034qA2 = AbstractC4040w.a("end", bVarB != null ? bVarB.a() : null);
        C4034q c4034qA3 = AbstractC4040w.a("location", cVar.c());
        C4034q c4034qA4 = AbstractC4040w.a("organizer", cVar.d());
        a.b bVarE = cVar.e();
        return gc.Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, AbstractC4040w.a("start", bVarE != null ? bVarE.a() : null), AbstractC4040w.a("status", cVar.f()), AbstractC4040w.a("summary", cVar.g()));
    }

    public static final Map c(a.d dVar) {
        List<a.C0222a> listA = dVar.a();
        AbstractC4862t.d(listA, "getAddresses(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(listA, 10));
        for (a.C0222a c0222a : listA) {
            AbstractC4862t.b(c0222a);
            arrayList.add(a(c0222a));
        }
        C4034q c4034qA = AbstractC4040w.a("addresses", arrayList);
        List<a.f> listB = dVar.b();
        AbstractC4862t.d(listB, "getEmails(...)");
        ArrayList arrayList2 = new ArrayList(C4207u.v(listB, 10));
        for (a.f fVar : listB) {
            AbstractC4862t.b(fVar);
            arrayList2.add(e(fVar));
        }
        C4034q c4034qA2 = AbstractC4040w.a("emails", arrayList2);
        a.h hVarC = dVar.c();
        C4034q c4034qA3 = AbstractC4040w.a("name", hVarC != null ? g(hVarC) : null);
        C4034q c4034qA4 = AbstractC4040w.a("organization", dVar.d());
        List<a.i> listE = dVar.e();
        AbstractC4862t.d(listE, "getPhones(...)");
        ArrayList arrayList3 = new ArrayList(C4207u.v(listE, 10));
        for (a.i iVar : listE) {
            AbstractC4862t.b(iVar);
            arrayList3.add(h(iVar));
        }
        return gc.Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, AbstractC4040w.a("phones", arrayList3), AbstractC4040w.a("title", dVar.f()), AbstractC4040w.a(SentryReplayEvent.JsonKeys.URLS, dVar.g()));
    }

    public static final Map d(a.e eVar) {
        return gc.Q.l(AbstractC4040w.a("addressCity", eVar.a()), AbstractC4040w.a("addressState", eVar.b()), AbstractC4040w.a("addressStreet", eVar.c()), AbstractC4040w.a("addressZip", eVar.d()), AbstractC4040w.a("birthDate", eVar.e()), AbstractC4040w.a("documentType", eVar.f()), AbstractC4040w.a("expiryDate", eVar.g()), AbstractC4040w.a("firstName", eVar.h()), AbstractC4040w.a("gender", eVar.i()), AbstractC4040w.a("issueDate", eVar.j()), AbstractC4040w.a("issuingCountry", eVar.k()), AbstractC4040w.a("lastName", eVar.l()), AbstractC4040w.a("licenseNumber", eVar.m()), AbstractC4040w.a("middleName", eVar.n()));
    }

    public static final Map e(a.f fVar) {
        return gc.Q.l(AbstractC4040w.a(SentryLockReason.JsonKeys.ADDRESS, fVar.a()), AbstractC4040w.a(SentryLogEvent.JsonKeys.BODY, fVar.b()), AbstractC4040w.a("subject", fVar.c()), AbstractC4040w.a("type", Integer.valueOf(fVar.d())));
    }

    public static final Map f(a.g gVar) {
        return gc.Q.l(AbstractC4040w.a("latitude", Double.valueOf(gVar.a())), AbstractC4040w.a("longitude", Double.valueOf(gVar.b())));
    }

    public static final Map g(a.h hVar) {
        return gc.Q.l(AbstractC4040w.a("first", hVar.a()), AbstractC4040w.a("formattedName", hVar.b()), AbstractC4040w.a("last", hVar.c()), AbstractC4040w.a("middle", hVar.d()), AbstractC4040w.a("prefix", hVar.e()), AbstractC4040w.a("pronunciation", hVar.f()), AbstractC4040w.a("suffix", hVar.g()));
    }

    public static final Map h(a.i iVar) {
        return gc.Q.l(AbstractC4040w.a("number", iVar.a()), AbstractC4040w.a("type", Integer.valueOf(iVar.b())));
    }

    public static final Map i(a.j jVar) {
        return gc.Q.l(AbstractC4040w.a("message", jVar.a()), AbstractC4040w.a("phoneNumber", jVar.b()));
    }

    public static final Map j(a.k kVar) {
        return gc.Q.l(AbstractC4040w.a("title", kVar.a()), AbstractC4040w.a("url", kVar.b()));
    }

    public static final Map k(a.l lVar) {
        return gc.Q.l(AbstractC4040w.a("encryptionType", Integer.valueOf(lVar.a())), AbstractC4040w.a("password", lVar.b()), AbstractC4040w.a("ssid", lVar.c()));
    }

    public static final Map l(V9.a aVar) {
        ArrayList arrayList;
        AbstractC4862t.e(aVar, "<this>");
        a.c cVarB = aVar.b();
        C4034q c4034qA = AbstractC4040w.a("calendarEvent", cVarB != null ? b(cVarB) : null);
        a.d dVarC = aVar.c();
        C4034q c4034qA2 = AbstractC4040w.a("contactInfo", dVarC != null ? c(dVarC) : null);
        Point[] pointArrD = aVar.d();
        if (pointArrD != null) {
            arrayList = new ArrayList(pointArrD.length);
            for (Point point : pointArrD) {
                AbstractC4862t.b(point);
                arrayList.add(m(point));
            }
        } else {
            arrayList = null;
        }
        C4034q c4034qA3 = AbstractC4040w.a("corners", arrayList);
        C4034q c4034qA4 = AbstractC4040w.a("displayValue", aVar.e());
        a.e eVarF = aVar.f();
        C4034q c4034qA5 = AbstractC4040w.a("driverLicense", eVarF != null ? d(eVarF) : null);
        a.f fVarG = aVar.g();
        C4034q c4034qA6 = AbstractC4040w.a("email", fVarG != null ? e(fVarG) : null);
        C4034q c4034qA7 = AbstractC4040w.a("format", Integer.valueOf(aVar.h()));
        a.g gVarI = aVar.i();
        C4034q c4034qA8 = AbstractC4040w.a("geoPoint", gVarI != null ? f(gVarI) : null);
        a.i iVarJ = aVar.j();
        C4034q c4034qA9 = AbstractC4040w.a("phone", iVarJ != null ? h(iVarJ) : null);
        C4034q c4034qA10 = AbstractC4040w.a("rawBytes", aVar.k());
        C4034q c4034qA11 = AbstractC4040w.a("rawValue", aVar.l());
        Rect rectA = aVar.a();
        C4034q c4034qA12 = AbstractC4040w.a(RRWebVideoEvent.JsonKeys.SIZE, rectA != null ? n(rectA) : null);
        a.j jVarM = aVar.m();
        C4034q c4034qA13 = AbstractC4040w.a("sms", jVarM != null ? i(jVarM) : null);
        C4034q c4034qA14 = AbstractC4040w.a("type", Integer.valueOf(aVar.o()));
        a.k kVarN = aVar.n();
        C4034q c4034qA15 = AbstractC4040w.a("url", kVarN != null ? j(kVarN) : null);
        a.l lVarP = aVar.p();
        return gc.Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, c4034qA7, c4034qA8, c4034qA9, c4034qA10, c4034qA11, c4034qA12, c4034qA13, c4034qA14, c4034qA15, AbstractC4040w.a("wifi", lVarP != null ? k(lVarP) : null));
    }

    public static final Map m(Point point) {
        return gc.Q.l(AbstractC4040w.a("x", Double.valueOf(point.x)), AbstractC4040w.a("y", Double.valueOf(point.y)));
    }

    public static final Map n(Rect rect) {
        return (rect.left > rect.right || rect.top > rect.bottom) ? gc.Q.i() : gc.Q.l(AbstractC4040w.a("width", Double.valueOf(rect.width())), AbstractC4040w.a("height", Double.valueOf(rect.height())));
    }
}
