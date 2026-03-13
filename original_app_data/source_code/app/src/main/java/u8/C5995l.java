package u8;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: u8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5995l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FilenameFilter f45339d = new FilenameFilter() { // from class: u8.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f45340e = new Comparator() { // from class: u8.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.g f45341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45342b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45343c = null;

    public C5995l(A8.g gVar) {
        this.f45341a = gVar;
    }

    public static void d(A8.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            r8.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    public static String e(A8.g gVar, String str) {
        List listR = gVar.r(str, f45339d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f45340e)).getName().substring(4);
        }
        r8.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f45342b, str)) {
            return this.f45343c;
        }
        return e(this.f45341a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f45343c, str)) {
            d(this.f45341a, this.f45342b, str);
            this.f45343c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f45342b, str)) {
            d(this.f45341a, str, this.f45343c);
            this.f45342b = str;
        }
    }
}
