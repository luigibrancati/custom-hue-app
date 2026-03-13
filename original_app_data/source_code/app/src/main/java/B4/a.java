package B4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fc.C4029l;
import fc.InterfaceC4028k;
import io.sentry.ProfileChunk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import n6.C5134a;
import s6.AbstractC5787f;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f623f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f628e;

    /* JADX INFO: renamed from: B4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0020a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f631c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f634f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f635g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f636h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f637i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f638j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f640l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f641m;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f639k = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f632d = ProfileChunk.PLATFORM_ANDROID;

        public C0020a() {
            String RELEASE = Build.VERSION.RELEASE;
            AbstractC4862t.d(RELEASE, "RELEASE");
            this.f633e = RELEASE;
            String BRAND = Build.BRAND;
            AbstractC4862t.d(BRAND, "BRAND");
            this.f634f = BRAND;
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC4862t.d(MANUFACTURER, "MANUFACTURER");
            this.f635g = MANUFACTURER;
            String MODEL = Build.MODEL;
            AbstractC4862t.d(MODEL, "MODEL");
            this.f636h = MODEL;
            String language = s().getLanguage();
            AbstractC4862t.d(language, "getLanguage(...)");
            this.f638j = language;
            this.f629a = a.this.f626c ? b() : null;
            this.f631c = h();
            this.f637i = f();
            this.f630b = g();
            this.f640l = a();
            this.f641m = a.this.f627d ? e() : null;
        }

        public final boolean a() {
            try {
                int i10 = AbstractC5787f.f44159f;
                Object objInvoke = AbstractC5787f.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, a.this.f624a);
                Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                if (num != null) {
                    if (num.intValue() == 0) {
                        return true;
                    }
                }
                return false;
            } catch (ClassNotFoundException unused) {
                B4.b.f644c.a().c("Google Play Services Util not found!");
                return false;
            } catch (IllegalAccessException unused2) {
                B4.b.f644c.a().c("Google Play Services not available");
                return false;
            } catch (NoClassDefFoundError unused3) {
                B4.b.f644c.a().c("Google Play Services Util not found!");
                return false;
            } catch (NoSuchMethodException unused4) {
                B4.b.f644c.a().c("Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused5) {
                B4.b.f644c.a().c("Google Play Services not available");
                return false;
            } catch (Exception e10) {
                B4.b.f644c.a().c("Error when checking for Google Play Services: " + e10);
                return false;
            }
        }

        public final String b() {
            return AbstractC4862t.a("Amazon", this.f635g) ? c() : d();
        }

        public final String c() {
            ContentResolver contentResolver = a.this.f624a.getContentResolver();
            this.f639k = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            return Settings.Secure.getString(contentResolver, "advertising_id");
        }

        public final String d() {
            try {
                Object objInvoke = C5134a.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, a.this.f624a);
                Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                this.f639k = bool != null && bool.booleanValue();
                Object objInvoke3 = objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                AbstractC4862t.c(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                return (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                B4.b.f644c.a().c("Google Play Services SDK not found for advertising id!");
                return null;
            } catch (InvocationTargetException unused2) {
                B4.b.f644c.a().c("Google Play Services not available for advertising id");
                return null;
            } catch (Exception unused3) {
                B4.b.f644c.a().d("Encountered an error connecting to Google Play Services for advertising id");
                return null;
            }
        }

        public final String e() {
            try {
                Object objInvoke = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, a.this.f624a);
                Object objInvoke2 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke, null));
                Object objInvoke3 = objInvoke2.getClass().getMethod("getId", null).invoke(objInvoke2, null);
                AbstractC4862t.c(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                return (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                B4.b.f644c.a().c("Google Play Services SDK not found for app set id!");
                return null;
            } catch (InvocationTargetException unused2) {
                B4.b.f644c.a().c("Google Play Services not available for app set id");
                return null;
            } catch (Exception unused3) {
                B4.b.f644c.a().d("Encountered an error connecting to Google Play Services for app set id");
                return null;
            }
        }

        public final String f() {
            try {
                Object systemService = a.this.f624a.getSystemService("phone");
                AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (Exception unused) {
                return null;
            }
        }

        public final String g() {
            String strO = o();
            if (strO != null && strO.length() != 0) {
                return strO;
            }
            String strP = p();
            return (strP == null || strP.length() == 0) ? n() : strP;
        }

        public final String h() {
            try {
                PackageInfo packageInfo = a.this.f624a.getPackageManager().getPackageInfo(a.this.f624a.getPackageName(), 0);
                AbstractC4862t.d(packageInfo, "getPackageInfo(...)");
                return packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return null;
            }
        }

        public final String i() {
            return this.f629a;
        }

        public final String j() {
            return this.f641m;
        }

        public final String k() {
            return this.f634f;
        }

        public final String l() {
            return this.f637i;
        }

        public final String m() {
            return this.f630b;
        }

        public final String n() {
            String country = s().getCountry();
            AbstractC4862t.d(country, "getCountry(...)");
            return country;
        }

        public final String o() {
            Location locationP;
            List<Address> fromLocation;
            if (a.this.f625b && (locationP = a.this.p()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = a.this.l().getFromLocation(locationP.getLatitude(), locationP.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused) {
                }
            }
            return null;
        }

        public final String p() {
            String networkCountryIso;
            try {
                Object systemService = a.this.f624a.getSystemService("phone");
                AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                String upperCase = networkCountryIso.toUpperCase(US);
                AbstractC4862t.d(upperCase, "toUpperCase(...)");
                return upperCase;
            } catch (Exception unused) {
                return null;
            }
        }

        public final String q() {
            return this.f638j;
        }

        public final boolean r() {
            return this.f639k;
        }

        public final Locale s() {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            AbstractC4862t.d(locales, "getLocales(...)");
            Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
            AbstractC4862t.b(locale);
            return locale;
        }

        public final String t() {
            return this.f635g;
        }

        public final String u() {
            return this.f636h;
        }

        public final String v() {
            return this.f632d;
        }

        public final String w() {
            return this.f633e;
        }

        public final String x() {
            return this.f631c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0020a invoke() {
            return a.this.new C0020a();
        }
    }

    public a(Context context, boolean z10, boolean z11, boolean z12) {
        AbstractC4862t.e(context, "context");
        this.f624a = context;
        this.f625b = z10;
        this.f626c = z11;
        this.f627d = z12;
        this.f628e = C4029l.b(new c());
    }

    public final String f() {
        return i().i();
    }

    public final String g() {
        return i().j();
    }

    public final String h() {
        return i().k();
    }

    public final C0020a i() {
        return (C0020a) this.f628e.getValue();
    }

    public final String j() {
        return i().l();
    }

    public final String k() {
        return i().m();
    }

    public final Geocoder l() {
        return new Geocoder(this.f624a, Locale.ENGLISH);
    }

    public final String m() {
        return i().q();
    }

    public final String n() {
        return i().t();
    }

    public final String o() {
        return i().u();
    }

    public final Location p() {
        List<String> providers;
        Location lastKnownLocation;
        Location location = null;
        if (!this.f625b) {
            return null;
        }
        if (L0.a.a(this.f624a, "android.permission.ACCESS_COARSE_LOCATION") != 0 && L0.a.a(this.f624a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        Object systemService = this.f624a.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return null;
        }
        try {
            providers = locationManager.getProviders(true);
        } catch (SecurityException | Exception unused) {
            providers = null;
        }
        if (providers == null) {
            return null;
        }
        ArrayList<Location> arrayList = new ArrayList();
        for (String str : providers) {
            try {
                AbstractC4862t.b(str);
                lastKnownLocation = locationManager.getLastKnownLocation(str);
            } catch (SecurityException unused2) {
                B4.b.f644c.a().c("Failed to get most recent location");
                lastKnownLocation = null;
            } catch (Exception unused3) {
                B4.b.f644c.a().c("Failed to get most recent location");
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        long time = -1;
        for (Location location2 : arrayList) {
            if (location2.getTime() > time) {
                time = location2.getTime();
                location = location2;
            }
        }
        return location;
    }

    public final String q() {
        return i().v();
    }

    public final String r() {
        return i().w();
    }

    public final String s() {
        return i().x();
    }

    public final boolean t() {
        return i().r();
    }
}
