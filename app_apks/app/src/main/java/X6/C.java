package X6;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends M3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18174d;

    public C(C2416j3 c2416j3) {
        super(c2416j3);
    }

    @Override // X6.M3
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f18173c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f18174d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f18173c;
    }

    public final String p() {
        l();
        return this.f18174d;
    }
}
