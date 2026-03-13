package R1;

import D1.C;
import D1.o;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f14399n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f14402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f14403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f14404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f14405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f14406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f14407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f14408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f14409m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f14410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f14411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14413d;

        public a(Uri uri, o oVar, String str, String str2) {
            this.f14410a = uri;
            this.f14411b = oVar;
            this.f14412c = str;
            this.f14413d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f14414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f14415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f14419f;

        public b(Uri uri, o oVar, String str, String str2, String str3, String str4) {
            this.f14414a = uri;
            this.f14415b = oVar;
            this.f14416c = str;
            this.f14417d = str2;
            this.f14418e = str3;
            this.f14419f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new o.b().j0(WebrtcBuildVersion.maint_version).W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(o oVar) {
            return new b(this.f14414a, oVar, this.f14416c, this.f14417d, this.f14418e, this.f14419f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f14399n = new h("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public h(String str, List list, List list2, List list3, List list4, List list5, List list6, o oVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f14400d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f14401e = Collections.unmodifiableList(list2);
        this.f14402f = Collections.unmodifiableList(list3);
        this.f14403g = Collections.unmodifiableList(list4);
        this.f14404h = Collections.unmodifiableList(list5);
        this.f14405i = Collections.unmodifiableList(list6);
        this.f14406j = oVar;
        this.f14407k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f14408l = Collections.unmodifiableMap(map);
        this.f14409m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f14410a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static List d(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    C c10 = (C) list2.get(i12);
                    if (c10.f1439b == i10 && c10.f1440c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new h("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f14414a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // V1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h a(List list) {
        String str = this.f14420a;
        List list2 = this.f14421b;
        List listD = d(this.f14401e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new h(str, list2, listD, list3, d(this.f14403g, 1, list), d(this.f14404h, 2, list), list3, this.f14406j, this.f14407k, this.f14422c, this.f14408l, this.f14409m);
    }
}
