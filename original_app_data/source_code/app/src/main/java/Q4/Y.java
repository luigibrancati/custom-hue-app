package Q4;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"LQ4/Y;", "", "LQ4/x;", "type", "", "httpResponseCode", "", "description", "<init>", "(LQ4/x;ILjava/lang/String;)V", "a", "LQ4/x;", "c", "()LQ4/x;", "b", "I", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final EnumC1903x type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int httpResponseCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: Q4.Y$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a0.f13831a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public Y(EnumC1903x type, int i10, String description) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(description, "description");
        this.type = type;
        this.httpResponseCode = i10;
        this.description = description;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC1903x getType() {
        return this.type;
    }

    public /* synthetic */ Y(EnumC1903x enumC1903x, int i10, String str, int i11, AbstractC4854k abstractC4854k) {
        this(enumC1903x, (i11 & 2) != 0 ? -1 : i10, (i11 & 4) != 0 ? "" : str);
    }
}
