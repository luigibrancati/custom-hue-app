package v6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: v6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6053h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C6051f f45852b = new C6051f("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6053h f45853c = new C6053h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f45854a = new ConcurrentHashMap();

    public static C6053h a() {
        return f45853c;
    }

    public String b(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        AbstractC6056k.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f45854a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = C6053h.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        C6051f c6051f = f45852b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        c6051f.f("LibraryVersion", sb2.toString());
                    } else {
                        C6051f c6051f2 = f45852b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        c6051f2.g("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    C6051f c6051f3 = f45852b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    c6051f3.d("LibraryVersion", sb4.toString(), e);
                    resourceAsStream = inputStream;
                    property = str2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        B6.k.a(inputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
            str2 = null;
        }
        if (resourceAsStream != null) {
            B6.k.a(resourceAsStream);
        }
        if (property == null) {
            f45852b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.f45854a.put(str, property);
        return property;
    }
}
