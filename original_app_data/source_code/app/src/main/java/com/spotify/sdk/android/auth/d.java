package com.spotify.sdk.android.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f32699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32704f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f32705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f32707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f32709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f32710f;

        public d a() {
            return new d(this.f32705a, this.f32706b, this.f32707c, this.f32708d, this.f32709e, this.f32710f, null);
        }

        public b b(String str) {
            this.f32707c = str;
            return this;
        }

        public b c(String str) {
            this.f32706b = str;
            return this;
        }

        public b d(String str) {
            this.f32709e = str;
            return this;
        }

        public b e(int i10) {
            this.f32710f = i10;
            return this;
        }

        public b f(String str) {
            this.f32708d = str;
            return this;
        }

        public b g(c cVar) {
            this.f32705a = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        CODE("code"),
        TOKEN("token"),
        ERROR("error"),
        EMPTY("empty"),
        UNKNOWN("unknown");

        private final String mType;

        c(String str) {
            this.mType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mType;
        }
    }

    public /* synthetic */ d(c cVar, String str, String str2, String str3, String str4, int i10, a aVar) {
        this(cVar, str, str2, str3, str4, i10);
    }

    public static d a(Uri uri) {
        b bVar = new b();
        if (uri == null) {
            bVar.g(c.EMPTY);
            return bVar.a();
        }
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(SentryThread.JsonKeys.STATE);
            bVar.d(queryParameter);
            bVar.f(queryParameter2);
            bVar.g(c.ERROR);
            return bVar.a();
        }
        String queryParameter3 = uri.getQueryParameter("code");
        if (queryParameter3 != null) {
            String queryParameter4 = uri.getQueryParameter(SentryThread.JsonKeys.STATE);
            bVar.c(queryParameter3);
            bVar.f(queryParameter4);
            bVar.g(c.CODE);
            return bVar.a();
        }
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment == null || encodedFragment.length() <= 0) {
            bVar.g(c.UNKNOWN);
            return bVar.a();
        }
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        for (String str : encodedFragment.split("&")) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length == 2) {
                if (strArrSplit[0].startsWith("access_token")) {
                    strDecode = Uri.decode(strArrSplit[1]);
                }
                if (strArrSplit[0].startsWith(SentryThread.JsonKeys.STATE)) {
                    strDecode2 = Uri.decode(strArrSplit[1]);
                }
                if (strArrSplit[0].startsWith("expires_in")) {
                    strDecode3 = Uri.decode(strArrSplit[1]);
                }
            }
        }
        bVar.b(strDecode);
        bVar.f(strDecode2);
        if (strDecode3 != null) {
            try {
                bVar.e(Integer.parseInt(strDecode3));
            } catch (NumberFormatException unused) {
            }
        }
        bVar.g(c.TOKEN);
        return bVar.a();
    }

    public String b() {
        return this.f32700b;
    }

    public String c() {
        return this.f32703e;
    }

    public c d() {
        return this.f32699a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32704f);
        parcel.writeString(this.f32703e);
        parcel.writeString(this.f32702d);
        parcel.writeString(this.f32701c);
        parcel.writeString(this.f32700b);
        parcel.writeInt(this.f32699a.ordinal());
    }

    public d(c cVar, String str, String str2, String str3, String str4, int i10) {
        this.f32699a = cVar == null ? c.UNKNOWN : cVar;
        this.f32700b = str;
        this.f32701c = str2;
        this.f32702d = str3;
        this.f32703e = str4;
        this.f32704f = i10;
    }

    public d(Parcel parcel) {
        this.f32704f = parcel.readInt();
        this.f32703e = parcel.readString();
        this.f32702d = parcel.readString();
        this.f32701c = parcel.readString();
        this.f32700b = parcel.readString();
        this.f32699a = c.values()[parcel.readInt()];
    }
}
