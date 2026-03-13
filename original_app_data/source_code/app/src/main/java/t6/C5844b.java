package t6;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: t6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5844b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f44754a;

    public C5844b(Status status) {
        int iE = status.e();
        String strF = status.f() != null ? status.f() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 2 + String.valueOf(strF).length());
        sb2.append(iE);
        sb2.append(": ");
        sb2.append(strF);
        super(sb2.toString());
        this.f44754a = status;
    }

    public Status a() {
        return this.f44754a;
    }

    public int b() {
        return this.f44754a.e();
    }
}
