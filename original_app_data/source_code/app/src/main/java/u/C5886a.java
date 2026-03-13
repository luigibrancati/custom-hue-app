package u;

import android.os.Bundle;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5886a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f44953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f44954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f44955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f44956d;

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0611a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f44957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f44958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f44959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f44960d;

        public C5886a a() {
            return new C5886a(this.f44957a, this.f44958b, this.f44959c, this.f44960d);
        }
    }

    public C5886a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f44953a = num;
        this.f44954b = num2;
        this.f44955c = num3;
        this.f44956d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f44953a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f44954b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f44955c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f44956d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
