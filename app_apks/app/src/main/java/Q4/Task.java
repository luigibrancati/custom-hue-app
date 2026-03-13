package Q4;

import Q4.d0;
import android.content.Context;
import android.net.Uri;
import ce.InterfaceC3118a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import de.AbstractC3918a;
import fc.C4029l;
import fc.C4039v;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4206t;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4231e;
import ge.C4237h;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import he.AbstractC4304b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.SentryReplayEvent;
import io.sentry.protocol.Request;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import vc.InterfaceC6082a;
import zc.AbstractC6558c;

/* JADX INFO: renamed from: Q4.X, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bC\b\u0007\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002TWB\u0095\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B¥\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010+J'\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J×\u0002\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0017¢\u0006\u0004\b6\u0010+J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010+J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u0010+J\r\u00109\u001a\u00020\u0017¢\u0006\u0004\b9\u0010+J\r\u0010:\u001a\u00020\u0017¢\u0006\u0004\b:\u0010+J\r\u0010;\u001a\u00020\u0017¢\u0006\u0004\b;\u0010+J!\u0010?\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b?\u0010@J9\u0010E\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020B0A2\b\b\u0002\u0010D\u001a\u00020\u0017¢\u0006\u0004\bE\u0010FJ-\u0010H\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020G0\u00052\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\n J*\u0004\u0018\u00010\u00020\u0002¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0017¢\u0006\u0004\bM\u0010+J\u000f\u0010N\u001a\u00020\u0002H\u0016¢\u0006\u0004\bN\u0010LJ\u001a\u0010P\u001a\u00020\u00172\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010LR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\bX\u0010LR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010U\u001a\u0004\b^\u0010LR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bd\u0010LR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010SR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010U\u001a\u0004\bi\u0010LR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010U\u001a\u0004\bk\u0010LR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010U\u001a\u0004\bm\u0010LR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\bn\u0010`\u001a\u0004\bo\u0010bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010U\u001a\u0004\bp\u0010LR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010U\u001a\u0004\bu\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010+R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b|\u0010f\u001a\u0004\b}\u0010SR\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010f\u001a\u0004\bf\u0010S\"\u0004\b~\u0010\u007fR\u0018\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010z\u001a\u0004\b|\u0010+R\u0018\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\r\n\u0004\bp\u0010f\u001a\u0005\b\u0081\u0001\u0010SR\u0019\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010U\u001a\u0005\b\u0083\u0001\u0010LR\u0018\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bo\u0010U\u001a\u0005\b\u0082\u0001\u0010LR\u0019\u0010 \u001a\u00020\u001f8\u0006¢\u0006\u000e\n\u0004\bk\u0010V\u001a\u0006\b\u0080\u0001\u0010\u0084\u0001R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000f\n\u0005\b^\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010#\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bu\u0010U\u001a\u0005\b\u0088\u0001\u0010L¨\u0006\u008a\u0001"}, d2 = {"LQ4/X;", "", "", "taskId", "url", "", SentryReplayEvent.JsonKeys.URLS, "filename", "", "headers", "httpRequestMethod", "", "chunks", "post", "fileField", "mimeType", "fields", "directory", "LQ4/i;", "baseDirectory", "group", "LQ4/o0;", "updates", "", "requiresWiFi", "retries", "retriesRemaining", "allowPause", "priority", "metaData", "displayName", "", "creationTime", "LQ4/d0;", RRWebOptionsEvent.EVENT_TAG, "taskType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LQ4/i;Ljava/lang/String;LQ4/o0;ZIIZILjava/lang/String;Ljava/lang/String;JLQ4/d0;Ljava/lang/String;)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LQ4/i;Ljava/lang/String;LQ4/o0;ZIIZILjava/lang/String;Ljava/lang/String;JLQ4/d0;Ljava/lang/String;Lge/s0;)V", "S", "()Z", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "b0", "(LQ4/X;Lfe/d;Lee/e;)V", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LQ4/i;Ljava/lang/String;LQ4/o0;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;LQ4/d0;Ljava/lang/String;)LQ4/X;", "V", "W", "R", "U", "T", "Q", "Landroid/content/Context;", "context", "withFilename", "o", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "", "", "responseHeaders", "unique", "Y", "(Landroid/content/Context;Ljava/util/Map;Z)LQ4/X;", "Lfc/v;", "n", "(Landroid/content/Context;)Ljava/util/List;", "kotlin.jvm.PlatformType", "P", "()Ljava/lang/String;", "O", "toString", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "J", "b", "M", "c", "Ljava/util/List;", "N", "()Ljava/util/List;", "d", "x", "e", "Ljava/util/Map;", "z", "()Ljava/util/Map;", "f", "A", "g", "I", "r", "h", "E", "i", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "j", "C", "k", "v", "t", "m", "LQ4/i;", "getBaseDirectory", "()LQ4/i;", "y", "LQ4/o0;", "L", "()LQ4/o0;", "p", "Z", "G", "q", "H", "X", "(I)V", "s", "F", "u", "B", "()J", "LQ4/d0;", "D", "()LQ4/d0;", "K", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Task {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final InterfaceC4028k[] f13801z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String taskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List urls;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String filename;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map headers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String httpRequestMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int chunks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String post;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final String fileField;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final String mimeType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map fields;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final String directory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public final EnumC1889i baseDirectory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final String group;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public final o0 updates;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean requiresWiFi;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    public final int retries;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    public int retriesRemaining;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowPause;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    public final String metaData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final String displayName;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    public final long creationTime;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final d0 options;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    public final String taskType;

    /* JADX INFO: renamed from: Q4.X$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13827a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13827a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.Task", aVar, 25);
            c4240i0.o("taskId", true);
            c4240i0.o("url", false);
            c4240i0.o(SentryReplayEvent.JsonKeys.URLS, true);
            c4240i0.o("filename", false);
            c4240i0.o("headers", false);
            c4240i0.o("httpRequestMethod", true);
            c4240i0.o("chunks", true);
            c4240i0.o("post", true);
            c4240i0.o("fileField", true);
            c4240i0.o("mimeType", true);
            c4240i0.o("fields", true);
            c4240i0.o("directory", true);
            c4240i0.o("baseDirectory", false);
            c4240i0.o("group", false);
            c4240i0.o("updates", false);
            c4240i0.o("requiresWiFi", true);
            c4240i0.o("retries", true);
            c4240i0.o("retriesRemaining", true);
            c4240i0.o("allowPause", true);
            c4240i0.o("priority", true);
            c4240i0.o("metaData", true);
            c4240i0.o("displayName", true);
            c4240i0.o("creationTime", true);
            c4240i0.o(RRWebOptionsEvent.EVENT_TAG, true);
            c4240i0.o("taskType", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Task deserialize(InterfaceC4049e decoder) {
            String strV;
            int i10;
            int i11;
            Map map;
            boolean z10;
            Map map2;
            List list;
            int i12;
            d0 d0Var;
            o0 o0Var;
            EnumC1889i enumC1889i;
            String str;
            boolean z11;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            int i13;
            String str9;
            String str10;
            String strV2;
            int i14;
            long j10;
            int i15;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = Task.f13801z;
            int i16 = 9;
            int i17 = 10;
            if (interfaceC4047cA.q()) {
                String strV3 = interfaceC4047cA.v(eVar, 0);
                String strV4 = interfaceC4047cA.v(eVar, 1);
                List list2 = (List) interfaceC4047cA.H(eVar, 2, (InterfaceC3118a) interfaceC4028kArr[2].getValue(), null);
                String strV5 = interfaceC4047cA.v(eVar, 3);
                Map map3 = (Map) interfaceC4047cA.H(eVar, 4, (InterfaceC3118a) interfaceC4028kArr[4].getValue(), null);
                String strV6 = interfaceC4047cA.v(eVar, 5);
                int I10 = interfaceC4047cA.I(eVar, 6);
                String str11 = (String) interfaceC4047cA.A(eVar, 7, w0.f35762a, null);
                String strV7 = interfaceC4047cA.v(eVar, 8);
                String strV8 = interfaceC4047cA.v(eVar, 9);
                Map map4 = (Map) interfaceC4047cA.H(eVar, 10, (InterfaceC3118a) interfaceC4028kArr[10].getValue(), null);
                String strV9 = interfaceC4047cA.v(eVar, 11);
                EnumC1889i enumC1889i2 = (EnumC1889i) interfaceC4047cA.H(eVar, 12, (InterfaceC3118a) interfaceC4028kArr[12].getValue(), null);
                String strV10 = interfaceC4047cA.v(eVar, 13);
                o0 o0Var2 = (o0) interfaceC4047cA.H(eVar, 14, (InterfaceC3118a) interfaceC4028kArr[14].getValue(), null);
                boolean zL = interfaceC4047cA.l(eVar, 15);
                int I11 = interfaceC4047cA.I(eVar, 16);
                int I12 = interfaceC4047cA.I(eVar, 17);
                boolean zL2 = interfaceC4047cA.l(eVar, 18);
                int I13 = interfaceC4047cA.I(eVar, 19);
                String strV11 = interfaceC4047cA.v(eVar, 20);
                String strV12 = interfaceC4047cA.v(eVar, 21);
                long jE = interfaceC4047cA.e(eVar, 22);
                strV = strV4;
                str9 = strV11;
                i12 = I13;
                d0Var = (d0) interfaceC4047cA.A(eVar, 23, d0.a.f13841a, null);
                strV2 = interfaceC4047cA.v(eVar, 24);
                map2 = map4;
                str5 = strV7;
                list = list2;
                i10 = 33554431;
                map = map3;
                str3 = strV5;
                i13 = I11;
                str6 = strV8;
                str = str11;
                i14 = I10;
                str4 = strV6;
                str7 = strV9;
                z10 = zL2;
                i11 = I12;
                o0Var = o0Var2;
                str10 = strV12;
                z11 = zL;
                str8 = strV10;
                enumC1889i = enumC1889i2;
                str2 = strV3;
                j10 = jE;
            } else {
                int i18 = 0;
                int I14 = 0;
                int I15 = 0;
                int I16 = 0;
                int I17 = 0;
                Map map5 = null;
                d0 d0Var2 = null;
                o0 o0Var3 = null;
                EnumC1889i enumC1889i3 = null;
                String str12 = null;
                String strV13 = null;
                strV = null;
                String strV14 = null;
                String strV15 = null;
                String strV16 = null;
                String strV17 = null;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                String strV22 = null;
                int i19 = 4;
                boolean z12 = true;
                long jE2 = 0;
                boolean zL3 = false;
                boolean zL4 = false;
                Map map6 = null;
                List list3 = null;
                while (z12) {
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z12 = false;
                            i17 = 10;
                            i16 = 9;
                            i19 = 4;
                            break;
                        case 0:
                            strV13 = interfaceC4047cA.v(eVar, 0);
                            i18 |= 1;
                            i17 = 10;
                            i16 = 9;
                            i19 = 4;
                            break;
                        case 1:
                            strV = interfaceC4047cA.v(eVar, 1);
                            i18 |= 2;
                            i17 = 10;
                            i16 = 9;
                            i19 = 4;
                            break;
                        case 2:
                            list3 = (List) interfaceC4047cA.H(eVar, 2, (InterfaceC3118a) interfaceC4028kArr[2].getValue(), list3);
                            i18 |= 4;
                            i17 = 10;
                            i16 = 9;
                            i19 = 4;
                            break;
                        case 3:
                            strV14 = interfaceC4047cA.v(eVar, 3);
                            i18 |= 8;
                            i17 = 10;
                            i16 = 9;
                            break;
                        case 4:
                            map5 = (Map) interfaceC4047cA.H(eVar, i19, (InterfaceC3118a) interfaceC4028kArr[i19].getValue(), map5);
                            i18 |= 16;
                            i17 = 10;
                            i16 = 9;
                            break;
                        case 5:
                            strV15 = interfaceC4047cA.v(eVar, 5);
                            i18 |= 32;
                            i17 = 10;
                            i16 = 9;
                            break;
                        case 6:
                            I17 = interfaceC4047cA.I(eVar, 6);
                            i18 |= 64;
                            i17 = 10;
                            i16 = 9;
                            break;
                        case 7:
                            str12 = (String) interfaceC4047cA.A(eVar, 7, w0.f35762a, str12);
                            i18 |= 128;
                            i17 = 10;
                            i16 = 9;
                            break;
                        case 8:
                            strV16 = interfaceC4047cA.v(eVar, 8);
                            i18 |= 256;
                            i16 = i16;
                            i17 = 10;
                            break;
                        case 9:
                            int i20 = i16;
                            strV17 = interfaceC4047cA.v(eVar, i20);
                            i18 |= 512;
                            i16 = i20;
                            break;
                        case 10:
                            map6 = (Map) interfaceC4047cA.H(eVar, i17, (InterfaceC3118a) interfaceC4028kArr[i17].getValue(), map6);
                            i18 |= RecognitionOptions.UPC_E;
                            i16 = 9;
                            break;
                        case 11:
                            strV18 = interfaceC4047cA.v(eVar, 11);
                            i18 |= RecognitionOptions.PDF417;
                            i16 = 9;
                            break;
                        case 12:
                            enumC1889i3 = (EnumC1889i) interfaceC4047cA.H(eVar, 12, (InterfaceC3118a) interfaceC4028kArr[12].getValue(), enumC1889i3);
                            i18 |= RecognitionOptions.AZTEC;
                            i16 = 9;
                            break;
                        case 13:
                            strV19 = interfaceC4047cA.v(eVar, 13);
                            i18 |= 8192;
                            i16 = 9;
                            break;
                        case 14:
                            o0Var3 = (o0) interfaceC4047cA.H(eVar, 14, (InterfaceC3118a) interfaceC4028kArr[14].getValue(), o0Var3);
                            i18 |= 16384;
                            i16 = 9;
                            break;
                        case 15:
                            zL4 = interfaceC4047cA.l(eVar, 15);
                            i18 |= 32768;
                            i16 = 9;
                            break;
                        case 16:
                            I16 = interfaceC4047cA.I(eVar, 16);
                            i18 |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            i16 = 9;
                            break;
                        case 17:
                            i18 |= 131072;
                            I14 = interfaceC4047cA.I(eVar, 17);
                            i16 = 9;
                            break;
                        case 18:
                            i18 |= 262144;
                            zL3 = interfaceC4047cA.l(eVar, 18);
                            i16 = 9;
                            break;
                        case 19:
                            I15 = interfaceC4047cA.I(eVar, 19);
                            i18 |= ImageMetadata.LENS_APERTURE;
                            i16 = 9;
                            break;
                        case 20:
                            strV20 = interfaceC4047cA.v(eVar, 20);
                            i18 |= ImageMetadata.SHADING_MODE;
                            i16 = 9;
                            break;
                        case 21:
                            strV21 = interfaceC4047cA.v(eVar, 21);
                            i15 = 2097152;
                            i18 |= i15;
                            i16 = 9;
                            break;
                        case 22:
                            jE2 = interfaceC4047cA.e(eVar, 22);
                            i15 = 4194304;
                            i18 |= i15;
                            i16 = 9;
                            break;
                        case 23:
                            d0Var2 = (d0) interfaceC4047cA.A(eVar, 23, d0.a.f13841a, d0Var2);
                            i15 = 8388608;
                            i18 |= i15;
                            i16 = 9;
                            break;
                        case 24:
                            strV22 = interfaceC4047cA.v(eVar, 24);
                            i18 |= 16777216;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                i10 = i18;
                i11 = I14;
                map = map5;
                z10 = zL3;
                map2 = map6;
                list = list3;
                i12 = I15;
                d0Var = d0Var2;
                o0Var = o0Var3;
                enumC1889i = enumC1889i3;
                str = str12;
                z11 = zL4;
                str2 = strV13;
                str3 = strV14;
                str4 = strV15;
                str5 = strV16;
                str6 = strV17;
                str7 = strV18;
                str8 = strV19;
                i13 = I16;
                str9 = strV20;
                str10 = strV21;
                strV2 = strV22;
                i14 = I17;
                j10 = jE2;
            }
            String str13 = strV;
            interfaceC4047cA.c(eVar);
            return new Task(i10, str2, str13, list, str3, map, str4, i14, str, str5, str6, map2, str7, enumC1889i, str8, o0Var, z11, i13, i11, z10, i12, str9, str10, j10, d0Var, strV2, (ge.s0) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            InterfaceC4028k[] interfaceC4028kArr = Task.f13801z;
            w0 w0Var = w0.f35762a;
            C4221J c4221j = C4221J.f35658a;
            C4237h c4237h = C4237h.f35705a;
            return new ce.b[]{w0Var, w0Var, interfaceC4028kArr[2].getValue(), w0Var, interfaceC4028kArr[4].getValue(), w0Var, c4221j, AbstractC3918a.p(w0Var), w0Var, w0Var, interfaceC4028kArr[10].getValue(), w0Var, interfaceC4028kArr[12].getValue(), w0Var, interfaceC4028kArr[14].getValue(), c4237h, c4221j, c4221j, c4237h, c4221j, w0Var, w0Var, ge.Q.f35675a, AbstractC3918a.p(d0.a.f13841a), w0Var};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, Task value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            Task.b0(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.X$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13827a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        EnumC4031n enumC4031n = EnumC4031n.PUBLICATION;
        f13801z = new InterfaceC4028k[]{null, null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.S
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Task.f();
            }
        }), null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.T
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Task.g();
            }
        }), null, null, null, null, null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.U
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Task.h();
            }
        }), null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.V
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Task.i();
            }
        }), null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.W
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Task.j();
            }
        }), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Task(int i10, String str, String str2, List list, String str3, Map map, String str4, int i11, String str5, String str6, String str7, Map map2, String str8, EnumC1889i enumC1889i, String str9, o0 o0Var, boolean z10, int i12, int i13, boolean z11, int i14, String str10, String str11, long j10, d0 d0Var, String str12, ge.s0 s0Var) {
        if (16805914 != (i10 & 16805914)) {
            AbstractC4232e0.a(i10, 16805914, a.f13827a.getDescriptor());
        }
        this.taskId = (i10 & 1) == 0 ? String.valueOf(Math.abs(AbstractC6558c.f48885a.c())) : str;
        this.url = str2;
        if ((i10 & 4) == 0) {
            this.urls = C4206t.k();
        } else {
            this.urls = list;
        }
        this.filename = str3;
        this.headers = map;
        if ((i10 & 32) == 0) {
            this.httpRequestMethod = "GET";
        } else {
            this.httpRequestMethod = str4;
        }
        if ((i10 & 64) == 0) {
            this.chunks = 1;
        } else {
            this.chunks = i11;
        }
        if ((i10 & 128) == 0) {
            this.post = null;
        } else {
            this.post = str5;
        }
        if ((i10 & 256) == 0) {
            this.fileField = "";
        } else {
            this.fileField = str6;
        }
        if ((i10 & 512) == 0) {
            this.mimeType = "";
        } else {
            this.mimeType = str7;
        }
        if ((i10 & RecognitionOptions.UPC_E) == 0) {
            this.fields = gc.Q.i();
        } else {
            this.fields = map2;
        }
        if ((i10 & RecognitionOptions.PDF417) == 0) {
            this.directory = "";
        } else {
            this.directory = str8;
        }
        this.baseDirectory = enumC1889i;
        this.group = str9;
        this.updates = o0Var;
        if ((32768 & i10) == 0) {
            this.requiresWiFi = false;
        } else {
            this.requiresWiFi = z10;
        }
        if ((65536 & i10) == 0) {
            this.retries = 0;
        } else {
            this.retries = i12;
        }
        if ((131072 & i10) == 0) {
            this.retriesRemaining = 0;
        } else {
            this.retriesRemaining = i13;
        }
        if ((262144 & i10) == 0) {
            this.allowPause = false;
        } else {
            this.allowPause = z11;
        }
        this.priority = (524288 & i10) == 0 ? 5 : i14;
        if ((1048576 & i10) == 0) {
            this.metaData = "";
        } else {
            this.metaData = str10;
        }
        if ((2097152 & i10) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str11;
        }
        this.creationTime = (4194304 & i10) == 0 ? System.currentTimeMillis() : j10;
        if ((i10 & 8388608) == 0) {
            this.options = null;
        } else {
            this.options = d0Var;
        }
        this.taskType = str12;
    }

    public static /* synthetic */ Task Z(Task task, Context context, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return task.Y(context, map, z10);
    }

    public static final Task a0(Context context, Task task, boolean z10) {
        String value;
        String str;
        List listB;
        String str2;
        Integer numU;
        if (!z10) {
            return task;
        }
        Od.o oVar = new Od.o("\\((\\d+)\\)\\.?[^.]*$");
        Od.o oVar2 = new Od.o("\\.[^.]*$");
        boolean zExists = new File(p(task, context, null, 2, null)).exists();
        Task taskM = task;
        while (zExists) {
            Od.k kVarD = Od.o.d(oVar2, taskM.filename, 0, 2, null);
            if (kVarD == null || (value = kVarD.getValue()) == null) {
                value = "";
            }
            Od.k kVarD2 = Od.o.d(oVar, taskM.filename, 0, 2, null);
            int iIntValue = ((kVarD2 == null || (listB = kVarD2.b()) == null || (str2 = (String) listB.get(1)) == null || (numU = Od.B.u(str2)) == null) ? 0 : numU.intValue()) + 1;
            if (kVarD2 == null) {
                str = com.bbflight.background_downloader.e.d(new File(taskM.filename)) + " (" + iIntValue + ")" + value;
            } else {
                String strSubstring = taskM.filename.substring(0, kVarD2.c().c() - 1);
                AbstractC4862t.d(strSubstring, "substring(...)");
                str = strSubstring + " (" + iIntValue + ")" + value;
            }
            taskM = m(taskM, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423, null);
            zExists = new File(p(taskM, context, null, 2, null)).exists();
        }
        return taskM;
    }

    public static final /* synthetic */ void b0(Task self, InterfaceC4048d output, ee.e serialDesc) {
        InterfaceC4028k[] interfaceC4028kArr = f13801z;
        if (output.i(serialDesc, 0) || !AbstractC4862t.a(self.taskId, String.valueOf(Math.abs(AbstractC6558c.f48885a.c())))) {
            output.e(serialDesc, 0, self.taskId);
        }
        output.e(serialDesc, 1, self.url);
        if (output.i(serialDesc, 2) || !AbstractC4862t.a(self.urls, C4206t.k())) {
            output.E(serialDesc, 2, (ce.g) interfaceC4028kArr[2].getValue(), self.urls);
        }
        output.e(serialDesc, 3, self.filename);
        output.E(serialDesc, 4, (ce.g) interfaceC4028kArr[4].getValue(), self.headers);
        if (output.i(serialDesc, 5) || !AbstractC4862t.a(self.httpRequestMethod, "GET")) {
            output.e(serialDesc, 5, self.httpRequestMethod);
        }
        if (output.i(serialDesc, 6) || self.chunks != 1) {
            output.F(serialDesc, 6, self.chunks);
        }
        if (output.i(serialDesc, 7) || self.post != null) {
            output.l(serialDesc, 7, w0.f35762a, self.post);
        }
        if (output.i(serialDesc, 8) || !AbstractC4862t.a(self.fileField, "")) {
            output.e(serialDesc, 8, self.fileField);
        }
        if (output.i(serialDesc, 9) || !AbstractC4862t.a(self.mimeType, "")) {
            output.e(serialDesc, 9, self.mimeType);
        }
        if (output.i(serialDesc, 10) || !AbstractC4862t.a(self.fields, gc.Q.i())) {
            output.E(serialDesc, 10, (ce.g) interfaceC4028kArr[10].getValue(), self.fields);
        }
        if (output.i(serialDesc, 11) || !AbstractC4862t.a(self.directory, "")) {
            output.e(serialDesc, 11, self.directory);
        }
        output.E(serialDesc, 12, (ce.g) interfaceC4028kArr[12].getValue(), self.baseDirectory);
        output.e(serialDesc, 13, self.group);
        output.E(serialDesc, 14, (ce.g) interfaceC4028kArr[14].getValue(), self.updates);
        if (output.i(serialDesc, 15) || self.requiresWiFi) {
            output.n(serialDesc, 15, self.requiresWiFi);
        }
        if (output.i(serialDesc, 16) || self.retries != 0) {
            output.F(serialDesc, 16, self.retries);
        }
        if (output.i(serialDesc, 17) || self.retriesRemaining != 0) {
            output.F(serialDesc, 17, self.retriesRemaining);
        }
        if (output.i(serialDesc, 18) || self.allowPause) {
            output.n(serialDesc, 18, self.allowPause);
        }
        if (output.i(serialDesc, 19) || self.priority != 5) {
            output.F(serialDesc, 19, self.priority);
        }
        if (output.i(serialDesc, 20) || !AbstractC4862t.a(self.metaData, "")) {
            output.e(serialDesc, 20, self.metaData);
        }
        if (output.i(serialDesc, 21) || !AbstractC4862t.a(self.displayName, "")) {
            output.e(serialDesc, 21, self.displayName);
        }
        if (output.i(serialDesc, 22) || self.creationTime != System.currentTimeMillis()) {
            output.t(serialDesc, 22, self.creationTime);
        }
        if (output.i(serialDesc, 23) || self.options != null) {
            output.l(serialDesc, 23, d0.a.f13841a, self.options);
        }
        output.e(serialDesc, 24, self.taskType);
    }

    public static final /* synthetic */ ce.b f() {
        return new C4231e(w0.f35762a);
    }

    public static final /* synthetic */ ce.b g() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ ce.b h() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ ce.b i() {
        return EnumC1889i.INSTANCE.serializer();
    }

    public static final /* synthetic */ ce.b j() {
        return o0.INSTANCE.serializer();
    }

    public static /* synthetic */ Task m(Task task, String str, String str2, List list, String str3, Map map, String str4, Integer num, String str5, String str6, String str7, Map map2, String str8, EnumC1889i enumC1889i, String str9, o0 o0Var, Boolean bool, Integer num2, Integer num3, Boolean bool2, Integer num4, String str10, String str11, Long l10, d0 d0Var, String str12, int i10, Object obj) {
        return task.l((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & RecognitionOptions.UPC_E) != 0 ? null : map2, (i10 & RecognitionOptions.PDF417) != 0 ? null : str8, (i10 & RecognitionOptions.AZTEC) != 0 ? null : enumC1889i, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : o0Var, (i10 & 32768) != 0 ? null : bool, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? null : num2, (i10 & 131072) != 0 ? null : num3, (i10 & 262144) != 0 ? null : bool2, (i10 & ImageMetadata.LENS_APERTURE) != 0 ? null : num4, (i10 & ImageMetadata.SHADING_MODE) != 0 ? null : str10, (i10 & 2097152) != 0 ? null : str11, (i10 & 4194304) != 0 ? null : l10, (i10 & 8388608) != 0 ? null : d0Var, (i10 & 16777216) != 0 ? null : str12);
    }

    public static /* synthetic */ String p(Task task, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return task.o(context, str);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getHttpRequestMethod() {
        return this.httpRequestMethod;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getMetaData() {
        return this.metaData;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final d0 getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getPost() {
        return this.post;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getRequiresWiFi() {
        return this.requiresWiFi;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getRetries() {
        return this.retries;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getRetriesRemaining() {
        return this.retriesRemaining;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final o0 getUpdates() {
        return this.updates;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final List getUrls() {
        return this.urls;
    }

    public final boolean O() {
        String str = (String) s0.f13895a.b(this.filename).e();
        return (str == null || AbstractC4862t.a(str, "?")) ? false : true;
    }

    public final String P() {
        try {
            return new URL(this.url).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final boolean Q() {
        return AbstractC4862t.a(this.taskType, "DataTask");
    }

    public final boolean R() {
        return AbstractC4862t.a(this.taskType, "DownloadTask") || AbstractC4862t.a(this.taskType, "UriDownloadTask") || AbstractC4862t.a(this.taskType, "ParallelDownloadTask");
    }

    public final boolean S() {
        return AbstractC4862t.a(this.taskType, "MultiUploadTask");
    }

    public final boolean T() {
        return AbstractC4862t.a(this.taskType, "ParallelDownloadTask");
    }

    public final boolean U() {
        return AbstractC4862t.a(this.taskType, "UploadTask") || AbstractC4862t.a(this.taskType, "UriUploadTask") || AbstractC4862t.a(this.taskType, "MultiUploadTask");
    }

    public final boolean V() {
        o0 o0Var = this.updates;
        return o0Var == o0.progress || o0Var == o0.statusAndProgress;
    }

    public final boolean W() {
        o0 o0Var = this.updates;
        return o0Var == o0.status || o0Var == o0.statusAndProgress;
    }

    public final void X(int i10) {
        this.retriesRemaining = i10;
    }

    public final Task Y(Context context, Map responseHeaders, boolean unique) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(responseHeaders, "responseHeaders");
        String strI = com.bbflight.background_downloader.e.i(responseHeaders, this.url);
        if (strI.length() <= 0) {
            strI = this.filename;
        }
        return a0(context, m(this, null, null, null, strI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423, null), unique);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbstractC4862t.a(Task.class, other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(other, "null cannot be cast to non-null type com.bbflight.background_downloader.Task");
        return AbstractC4862t.a(this.taskId, ((Task) other).taskId);
    }

    public int hashCode() {
        return this.taskId.hashCode();
    }

    public final Task l(String taskId, String url, List urls, String filename, Map headers, String httpRequestMethod, Integer chunks, String post, String fileField, String mimeType, Map fields, String directory, EnumC1889i baseDirectory, String group, o0 updates, Boolean requiresWiFi, Integer retries, Integer retriesRemaining, Boolean allowPause, Integer priority, String metaData, String displayName, Long creationTime, d0 options, String taskType) {
        o0 o0Var;
        boolean zBooleanValue;
        int i10;
        int iIntValue;
        String str;
        long jLongValue;
        String str2 = taskId == null ? this.taskId : taskId;
        String str3 = url == null ? this.url : url;
        List list = urls == null ? this.urls : urls;
        String str4 = filename == null ? this.filename : filename;
        Map map = headers == null ? this.headers : headers;
        String str5 = httpRequestMethod == null ? this.httpRequestMethod : httpRequestMethod;
        int iIntValue2 = chunks != null ? chunks.intValue() : this.chunks;
        String str6 = post == null ? this.post : post;
        String str7 = fileField == null ? this.fileField : fileField;
        String str8 = mimeType == null ? this.mimeType : mimeType;
        Map map2 = fields == null ? this.fields : fields;
        String str9 = directory == null ? this.directory : directory;
        EnumC1889i enumC1889i = baseDirectory == null ? this.baseDirectory : baseDirectory;
        String str10 = group == null ? this.group : group;
        o0 o0Var2 = updates == null ? this.updates : updates;
        if (requiresWiFi != null) {
            zBooleanValue = requiresWiFi.booleanValue();
            o0Var = o0Var2;
        } else {
            o0Var = o0Var2;
            zBooleanValue = this.requiresWiFi;
        }
        int iIntValue3 = retries != null ? retries.intValue() : this.retries;
        if (retriesRemaining != null) {
            iIntValue = retriesRemaining.intValue();
            i10 = iIntValue3;
        } else {
            i10 = iIntValue3;
            iIntValue = this.retriesRemaining;
        }
        boolean zBooleanValue2 = allowPause != null ? allowPause.booleanValue() : this.allowPause;
        int iIntValue4 = priority != null ? priority.intValue() : this.priority;
        String str11 = metaData == null ? this.metaData : metaData;
        String str12 = displayName == null ? this.displayName : displayName;
        if (creationTime != null) {
            str = str2;
            jLongValue = creationTime.longValue();
        } else {
            str = str2;
            jLongValue = this.creationTime;
        }
        return new Task(str, str3, list, str4, map, str5, iIntValue2, str6, str7, str8, map2, str9, enumC1889i, str10, o0Var, zBooleanValue, i10, iIntValue, zBooleanValue2, iIntValue4, str11, str12, jLongValue, options == null ? this.options : options, taskType == null ? this.taskType : taskType);
    }

    public final List n(Context context) {
        AbstractC4862t.e(context, "context");
        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
        String str = this.fileField;
        aVar.d();
        w0 w0Var = w0.f35762a;
        List list = (List) aVar.a(new C4231e(w0Var), str);
        String str2 = this.filename;
        aVar.d();
        List list2 = (List) aVar.a(new C4231e(w0Var), str2);
        String str3 = this.mimeType;
        aVar.d();
        List list3 = (List) aVar.a(new C4231e(w0Var), str3);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str4 = (String) list2.get(i10);
            Uri uri = Uri.parse(str4);
            if (AbstractC4862t.a(uri.getScheme(), "content") || AbstractC4862t.a(uri.getScheme(), Constants.FILE)) {
                arrayList.add(new C4039v(list.get(i10), str4, list3.get(i10)));
            } else if (new File(str4).exists()) {
                arrayList.add(new C4039v(list.get(i10), str4, list3.get(i10)));
            } else {
                arrayList.add(new C4039v(list.get(i10), o(context, str4), list3.get(i10)));
            }
        }
        return arrayList;
    }

    public final String o(Context context, String withFilename) {
        AbstractC4862t.e(context, "context");
        if (S() && withFilename == null) {
            return "";
        }
        if (withFilename == null) {
            withFilename = this.filename;
        }
        String strB = com.bbflight.background_downloader.e.b(context, this.baseDirectory);
        if (strB == null) {
            throw new IllegalStateException("External storage is requested but not available");
        }
        if (this.directory.length() == 0) {
            return strB + "/" + withFilename;
        }
        return strB + "/" + this.directory + "/" + withFilename;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getAllowPause() {
        return this.allowPause;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getChunks() {
        return this.chunks;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getDirectory() {
        return this.directory;
    }

    public String toString() {
        return "Task(taskId='" + this.taskId + "', url='" + this.url + "', filename='" + this.filename + "', headers=" + this.headers + ", httpRequestMethod=" + this.httpRequestMethod + ", post=" + this.post + ", fileField='" + this.fileField + "', mimeType='" + this.mimeType + "', fields=" + this.fields + ", directory='" + this.directory + "', baseDirectory=" + this.baseDirectory + ", group='" + this.group + "', updates=" + this.updates + ", requiresWiFi=" + this.requiresWiFi + ", retries=" + this.retries + ", retriesRemaining=" + this.retriesRemaining + ", allowPause=" + this.allowPause + ", metaData='" + this.metaData + "', creationTime=" + this.creationTime + ", taskType='" + this.taskType + "')";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Map getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getFileField() {
        return this.fileField;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Map getHeaders() {
        return this.headers;
    }

    public Task(String taskId, String url, List urls, String filename, Map headers, String httpRequestMethod, int i10, String str, String fileField, String mimeType, Map fields, String directory, EnumC1889i baseDirectory, String group, o0 updates, boolean z10, int i11, int i12, boolean z11, int i13, String metaData, String displayName, long j10, d0 d0Var, String taskType) {
        AbstractC4862t.e(taskId, "taskId");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(urls, "urls");
        AbstractC4862t.e(filename, "filename");
        AbstractC4862t.e(headers, "headers");
        AbstractC4862t.e(httpRequestMethod, "httpRequestMethod");
        AbstractC4862t.e(fileField, "fileField");
        AbstractC4862t.e(mimeType, "mimeType");
        AbstractC4862t.e(fields, "fields");
        AbstractC4862t.e(directory, "directory");
        AbstractC4862t.e(baseDirectory, "baseDirectory");
        AbstractC4862t.e(group, "group");
        AbstractC4862t.e(updates, "updates");
        AbstractC4862t.e(metaData, "metaData");
        AbstractC4862t.e(displayName, "displayName");
        AbstractC4862t.e(taskType, "taskType");
        this.taskId = taskId;
        this.url = url;
        this.urls = urls;
        this.filename = filename;
        this.headers = headers;
        this.httpRequestMethod = httpRequestMethod;
        this.chunks = i10;
        this.post = str;
        this.fileField = fileField;
        this.mimeType = mimeType;
        this.fields = fields;
        this.directory = directory;
        this.baseDirectory = baseDirectory;
        this.group = group;
        this.updates = updates;
        this.requiresWiFi = z10;
        this.retries = i11;
        this.retriesRemaining = i12;
        this.allowPause = z11;
        this.priority = i13;
        this.metaData = metaData;
        this.displayName = displayName;
        this.creationTime = j10;
        this.options = d0Var;
        this.taskType = taskType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Task(java.lang.String r30, java.lang.String r31, java.util.List r32, java.lang.String r33, java.util.Map r34, java.lang.String r35, int r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.Map r40, java.lang.String r41, Q4.EnumC1889i r42, java.lang.String r43, Q4.o0 r44, boolean r45, int r46, int r47, boolean r48, int r49, java.lang.String r50, java.lang.String r51, long r52, Q4.d0 r54, java.lang.String r55, int r56, kotlin.jvm.internal.AbstractC4854k r57) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.Task.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.Map, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, Q4.i, java.lang.String, Q4.o0, boolean, int, int, boolean, int, java.lang.String, java.lang.String, long, Q4.d0, java.lang.String, int, kotlin.jvm.internal.k):void");
    }
}
