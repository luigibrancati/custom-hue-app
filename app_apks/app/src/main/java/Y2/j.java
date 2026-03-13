package Y2;

import java.util.Arrays;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19697a = {48, 49, 53, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19698b = {48, 49, 48, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f19699c = {48, 48, 57, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f19700d = {48, 48, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f19701e = {48, 48, 49, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f19702f = {48, 48, 49, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f19703g = {48, 48, 50, 0};

    public static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f19701e) || Arrays.equals(bArr, f19700d)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!";
    }
}
