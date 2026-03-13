package K4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SimpleDateFormat f7449f;

    public a(String apiKey, String events, Integer num, String str, long j10) {
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(events, "events");
        this.f7444a = apiKey;
        this.f7445b = events;
        this.f7446c = num;
        this.f7447d = str;
        this.f7448e = j10;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f7449f = simpleDateFormat;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"api_key\":\"" + this.f7444a + "\",\"client_upload_time\":\"" + b() + "\",\"events\":" + this.f7445b);
        if (this.f7446c != null) {
            sb2.append(",\"options\":{\"min_id_length\":" + this.f7446c + '}');
        }
        if (this.f7447d != null) {
            sb2.append(",\"request_metadata\":{\"sdk\":" + this.f7447d + '}');
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final String b() {
        String str = this.f7449f.format(new Date(this.f7448e));
        AbstractC4862t.d(str, "format(...)");
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(this.f7444a, aVar.f7444a) && AbstractC4862t.a(this.f7445b, aVar.f7445b) && AbstractC4862t.a(this.f7446c, aVar.f7446c) && AbstractC4862t.a(this.f7447d, aVar.f7447d) && this.f7448e == aVar.f7448e;
    }

    public int hashCode() {
        int iHashCode = ((this.f7444a.hashCode() * 31) + this.f7445b.hashCode()) * 31;
        Integer num = this.f7446c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f7447d;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.f7448e);
    }

    public String toString() {
        return "AnalyticsRequest(apiKey=" + this.f7444a + ", events=" + this.f7445b + ", minIdLength=" + this.f7446c + ", diagnostics=" + this.f7447d + ", clientUploadTime=" + this.f7448e + ')';
    }

    public /* synthetic */ a(String str, String str2, Integer num, String str3, long j10, int i10, AbstractC4854k abstractC4854k) {
        this(str, str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? System.currentTimeMillis() : j10);
    }
}
