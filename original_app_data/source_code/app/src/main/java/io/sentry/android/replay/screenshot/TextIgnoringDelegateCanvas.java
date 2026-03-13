package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.text.MeasuredText;
import fc.C4034q;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.Font;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\u001fJ\u0015\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b'\u0010)J+\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b,\u0010-J#\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b,\u0010.JA\u0010,\u001a\u00020\n2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b,\u00103J9\u0010,\u001a\u00020\n2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b,\u00104J)\u00106\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00105\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00108J?\u00106\u001a\u00020\n2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00105\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b6\u00109J7\u00106\u001a\u00020\n2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010\u001fJ\u0017\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010$J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010BJ\u0017\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\rH\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bI\u0010BJ\u0019\u0010L\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bN\u0010MJ\u0017\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020JH\u0017¢\u0006\u0004\bP\u0010MJ\u001f\u0010T\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010T\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\b2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010VJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*H\u0016¢\u0006\u0004\bT\u0010WJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010XJ7\u0010T\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010YJ/\u0010T\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\bT\u0010ZJ/\u0010T\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*H\u0017¢\u0006\u0004\b\\\u0010WJ\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\bH\u0017¢\u0006\u0004\b\\\u0010XJ/\u0010\\\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0017¢\u0006\u0004\b\\\u0010ZJ/\u0010\\\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0017¢\u0006\u0004\b\\\u0010[J\u001f\u0010_\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\b_\u0010`J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010aJ\u0017\u0010b\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0017¢\u0006\u0004\bb\u0010aJ\u0011\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bd\u0010eJ\u0019\u0010g\u001a\u00020\u00102\b\u0010f\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010lJ\u0017\u0010k\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020*H\u0017¢\u0006\u0004\bk\u0010WJ\u001f\u0010k\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010mJ\u0017\u0010k\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0017¢\u0006\u0004\bk\u0010aJ7\u0010k\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010nJ/\u0010k\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0017¢\u0006\u0004\bk\u0010ZJ\u0017\u0010o\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\bo\u0010XJ\u0017\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u001f\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020p2\u0006\u0010t\u001a\u00020*H\u0016¢\u0006\u0004\br\u0010uJ\u001f\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020p2\u0006\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\br\u0010vJ7\u0010{\u001a\u00020\u00102\u0006\u0010w\u001a\u00020*2\u0006\u0010x\u001a\u00020\r2\u0006\u0010y\u001a\u00020\r2\u0006\u0010z\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b{\u0010|JO\u0010{\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r2\u0006\u0010y\u001a\u00020\r2\u0006\u0010z\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b{\u0010}J4\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\nH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J4\u0010\u0084\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J6\u0010\u0084\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010t\u001a\u00020*2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001J6\u0010\u0084\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001Jc\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u008e\u0001\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u008f\u0001Jc\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u008e\u0001\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0090\u0001J,\u0010\u0084\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020J2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0091\u0001J^\u0010\u0098\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010\u0092\u0001\u001a\u00020\n2\u0007\u0010\u0093\u0001\u001a\u00020\n2\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0096\u0001\u001a\u00020\n2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010\u0097\u0001\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J5\u0010\u009d\u0001\u001a\u00020\u00102\u0007\u0010\u009a\u0001\u001a\u00020\r2\u0007\u0010\u009b\u0001\u001a\u00020\r2\u0007\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010 \u0001\u001a\u00020\u00102\u0007\u0010\u009f\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b \u0001\u0010$J\u001c\u0010 \u0001\u001a\u00020\u00102\b\u0010\u009f\u0001\u001a\u00030¡\u0001H\u0017¢\u0006\u0006\b \u0001\u0010¢\u0001J%\u0010 \u0001\u001a\u00020\u00102\u0007\u0010\u009f\u0001\u001a\u00020\n2\b\u0010¤\u0001\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b \u0001\u0010¥\u0001J%\u0010 \u0001\u001a\u00020\u00102\u0007\u0010\u009f\u0001\u001a\u00020\n2\b\u0010¤\u0001\u001a\u00030¦\u0001H\u0017¢\u0006\u0006\b \u0001\u0010§\u0001J&\u0010 \u0001\u001a\u00020\u00102\b\u0010\u009f\u0001\u001a\u00030¡\u00012\b\u0010¤\u0001\u001a\u00030¦\u0001H\u0017¢\u0006\u0006\b \u0001\u0010¨\u0001J>\u0010\u00ad\u0001\u001a\u00020\u00102\u0007\u0010©\u0001\u001a\u00020\r2\u0007\u0010ª\u0001\u001a\u00020\r2\u0007\u0010«\u0001\u001a\u00020\r2\u0007\u0010¬\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J6\u0010±\u0001\u001a\u00020\u00102\b\u0010¯\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J$\u0010±\u0001\u001a\u00020\u00102\b\u0010¯\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b±\u0001\u0010³\u0001J\"\u0010´\u0001\u001a\u00020\u00102\u0006\u0010w\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J:\u0010´\u0001\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b´\u0001\u0010®\u0001J\u001a\u0010¶\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J.\u0010º\u0001\u001a\u00020\u00102\b\u0010¹\u0001\u001a\u00030¸\u00012\u0006\u0010t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\bº\u0001\u0010»\u0001J.\u0010º\u0001\u001a\u00020\u00102\b\u0010¹\u0001\u001a\u00030¸\u00012\u0006\u0010t\u001a\u00020*2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0006\bº\u0001\u0010¼\u0001J\"\u0010½\u0001\u001a\u00020\u00102\u0006\u0010^\u001a\u00020]2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J*\u0010¿\u0001\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J8\u0010Á\u0001\u001a\u00020\u00102\n\u0010¯\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÁ\u0001\u0010²\u0001J$\u0010Á\u0001\u001a\u00020\u00102\b\u0010¯\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÁ\u0001\u0010³\u0001J\"\u0010Â\u0001\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÂ\u0001\u0010µ\u0001J\"\u0010Â\u0001\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J:\u0010Â\u0001\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÂ\u0001\u0010®\u0001J,\u0010Ä\u0001\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020\nH\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J4\u0010È\u0001\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020*2\u0007\u0010Æ\u0001\u001a\u00020\r2\u0007\u0010Ç\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001JL\u0010È\u0001\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0007\u0010Æ\u0001\u001a\u00020\r2\u0007\u0010Ç\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÈ\u0001\u0010Ê\u0001JP\u0010Ñ\u0001\u001a\u00020\u00102\u0007\u0010Ë\u0001\u001a\u00020*2\u0007\u0010Ì\u0001\u001a\u00020\r2\u0007\u0010Í\u0001\u001a\u00020\r2\u0007\u0010Î\u0001\u001a\u00020*2\u0007\u0010Ï\u0001\u001a\u00020\r2\u0007\u0010Ð\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J@\u0010Ñ\u0001\u001a\u00020\u00102\u0007\u0010Ë\u0001\u001a\u00020*2\b\u0010Ó\u0001\u001a\u00030\u0094\u00012\u0007\u0010Î\u0001\u001a\u00020*2\b\u0010Ô\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bÑ\u0001\u0010Õ\u0001JS\u0010Ý\u0001\u001a\u00020\u00102\b\u0010Ö\u0001\u001a\u00030\u0088\u00012\u0007\u0010×\u0001\u001a\u00020\n2\b\u0010Ø\u0001\u001a\u00030\u0094\u00012\u0007\u0010Ù\u0001\u001a\u00020\n2\u0007\u0010Ú\u0001\u001a\u00020\n2\b\u0010Ü\u0001\u001a\u00030Û\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u0088\u0001\u0010ç\u0001\u001a\u00020\u00102\b\u0010¤\u0001\u001a\u00030ß\u00012\u0007\u0010à\u0001\u001a\u00020\n2\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0096\u0001\u001a\u00020\n2\n\u0010á\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010â\u0001\u001a\u00020\n2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010\u0097\u0001\u001a\u00020\n2\n\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00012\u0007\u0010å\u0001\u001a\u00020\n2\u0007\u0010æ\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001c\u0010ë\u0001\u001a\u00020\u00102\b\u0010ê\u0001\u001a\u00030é\u0001H\u0016¢\u0006\u0006\bë\u0001\u0010ì\u0001J0\u0010ð\u0001\u001a\u00020\u00102\b\u0010î\u0001\u001a\u00030í\u00012\n\u0010ï\u0001\u001a\u0005\u0018\u00010¦\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bð\u0001\u0010ñ\u0001J@\u0010ö\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ò\u00012\u0007\u0010ô\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\b\u0010õ\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bö\u0001\u0010÷\u0001J.\u0010ö\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ø\u00012\b\u0010õ\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0006\bö\u0001\u0010ù\u0001JF\u0010ú\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ò\u00012\u0007\u0010ô\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bú\u0001\u0010û\u0001J4\u0010ú\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ø\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bú\u0001\u0010ü\u0001JF\u0010ú\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ø\u00012\u0007\u0010ý\u0001\u001a\u00020\n2\u0007\u0010þ\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bú\u0001\u0010ÿ\u0001JF\u0010ú\u0001\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030\u0080\u00022\u0007\u0010ý\u0001\u001a\u00020\n2\u0007\u0010þ\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\bú\u0001\u0010\u0081\u0002JP\u0010\u0084\u0002\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ò\u00012\u0007\u0010ô\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\u0006\u0010^\u001a\u00020]2\u0007\u0010\u0082\u0002\u001a\u00020\r2\u0007\u0010\u0083\u0002\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J>\u0010\u0084\u0002\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ø\u00012\u0006\u0010^\u001a\u00020]2\u0007\u0010\u0082\u0002\u001a\u00020\r2\u0007\u0010\u0083\u0002\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0084\u0002\u0010\u0086\u0002Ja\u0010\u008a\u0002\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030ò\u00012\u0007\u0010ô\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020\n2\u0007\u0010\u0087\u0002\u001a\u00020\n2\u0007\u0010\u0088\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0089\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002Ja\u0010\u008a\u0002\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030\u0080\u00022\u0007\u0010ý\u0001\u001a\u00020\n2\u0007\u0010þ\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0002\u001a\u00020\n2\u0007\u0010\u008d\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0089\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u008a\u0002\u0010\u008e\u0002Ja\u0010\u008a\u0002\u001a\u00020\u00102\b\u0010ó\u0001\u001a\u00030\u008f\u00022\u0007\u0010ý\u0001\u001a\u00020\n2\u0007\u0010þ\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0002\u001a\u00020\n2\u0007\u0010\u008d\u0002\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0007\u0010\u0089\u0002\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u008a\u0002\u0010\u0090\u0002R)\u0010\u0091\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0017\u0010\u0097\u0002\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0017\u0010\u0099\u0002\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u0098\u0002R\u0017\u0010\u009a\u0002\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001c\u0010\u009c\u0002\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001c\u0010 \u0002\u001a\u00020\u00018\u0006¢\u0006\u0010\n\u0006\b \u0002\u0010\u0092\u0002\u001a\u0006\b¡\u0002\u0010\u0094\u0002R\u001c\u0010¢\u0002\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u009b\u0002\u001a\u0006\b£\u0002\u0010¤\u0002R1\u0010§\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0¦\u00020¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002¨\u0006©\u0002"}, d2 = {"Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "Landroid/graphics/Canvas;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "src", "", "sampleBitmapColor", "(Landroid/graphics/Bitmap;Landroid/graphics/Paint;Landroid/graphics/Rect;)I", "", "x", "y", "Lfc/H;", "drawMaskedText", "(Landroid/graphics/Paint;FF)V", "Landroid/graphics/BitmapShader;", "removeBitmapShader", "(Landroid/graphics/Paint;)Landroid/graphics/BitmapShader;", "", "isHardwareAccelerated", "()Z", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "saveFlags", "(I)I", "Landroid/graphics/RectF;", "bounds", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", RRWebVideoEvent.JsonKeys.LEFT, RRWebVideoEvent.JsonKeys.TOP, "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", ViewHierarchyNode.JsonKeys.ALPHA, "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(Landroid/graphics/Rect;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "getClipBounds", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "a", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "stride", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", RRWebInteractionMoveEvent.JsonKeys.POSITIONS, "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", Font.PREFIX_FONT_META, "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "Landroid/graphics/Mesh;", "mesh", "blendMode", "drawMesh", "(Landroid/graphics/Mesh;Landroid/graphics/BlendMode;Landroid/graphics/Paint;)V", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "delegate", "Landroid/graphics/Canvas;", "getDelegate", "()Landroid/graphics/Canvas;", "setDelegate", "(Landroid/graphics/Canvas;)V", "solidPaint", "Landroid/graphics/Paint;", "textPaint", "tmpRect", "Landroid/graphics/Rect;", "singlePixelBitmap", "Landroid/graphics/Bitmap;", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelCanvas", "getSinglePixelCanvas", "singlePixelBitmapBounds", "getSinglePixelBitmapBounds", "()Landroid/graphics/Rect;", "Ljava/util/WeakHashMap;", "Lfc/q;", "bitmapColorCache", "Ljava/util/WeakHashMap;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
final class TextIgnoringDelegateCanvas extends Canvas {
    private final WeakHashMap<Bitmap, C4034q> bitmapColorCache;
    public Canvas delegate;
    private final Bitmap singlePixelBitmap;
    private final Rect singlePixelBitmapBounds;
    private final Canvas singlePixelCanvas;
    private final Paint solidPaint = new Paint();
    private final Paint textPaint = new Paint();
    private final Rect tmpRect = new Rect();

    public TextIgnoringDelegateCanvas() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
        this.singlePixelBitmap = bitmapCreateBitmap;
        this.singlePixelCanvas = new Canvas(bitmapCreateBitmap);
        this.singlePixelBitmapBounds = new Rect(0, 0, 1, 1);
        this.bitmapColorCache = new WeakHashMap<>();
    }

    private final void drawMaskedText(Paint paint, float x10, float y10) {
        this.textPaint.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.textPaint.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.tmpRect;
        drawRoundRect(rect.left + x10, rect.top + y10, rect.right + x10, rect.bottom + y10, 10.0f, 10.0f, this.textPaint);
    }

    private final BitmapShader removeBitmapShader(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }

    private final int sampleBitmapColor(Bitmap bitmap, Paint paint, Rect src) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        C4034q c4034q = this.bitmapColorCache.get(bitmap);
        if (c4034q != null && ((Number) c4034q.e()).intValue() == bitmap.getGenerationId()) {
            return ((Number) c4034q.f()).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (config == config2) {
            BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap.asShared(), src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderRemoveBitmapShader2 = removeBitmapShader(paint);
            this.singlePixelCanvas.drawBitmap(bitmap, src, this.singlePixelBitmapBounds, paint);
            if (bitmapShaderRemoveBitmapShader2 != null && paint != null) {
                paint.setShader(bitmapShaderRemoveBitmapShader2);
            }
            pixel = this.singlePixelBitmap.getPixel(0, 0);
        }
        this.bitmapColorCache.put(bitmap, new C4034q(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        AbstractC4862t.e(path, "path");
        return getDelegate().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        AbstractC4862t.e(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(op, "op");
        return getDelegate().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect, Region.Op op) {
        AbstractC4862t.e(rect, "rect");
        AbstractC4862t.e(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        getDelegate().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        getDelegate().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a10, int r10, int g10, int b10) {
        getDelegate().drawARGB(a10, r10, g10, b10);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        AbstractC4862t.e(oval, "oval");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] colors, int offset, int stride, float x10, float y10, int width, int height, boolean hasAlpha, Paint paint) {
        AbstractC4862t.e(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        AbstractC4862t.e(bitmap, "bitmap");
        AbstractC4862t.e(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawCircle(cx, cy, radius, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        AbstractC4862t.e(outer, "outer");
        AbstractC4862t.e(inner, "inner");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, android.graphics.fonts.Font font, Paint paint) {
        AbstractC4862t.e(glyphIds, "glyphIds");
        AbstractC4862t.e(positions, "positions");
        AbstractC4862t.e(font, "font");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLine(startX, startY, stopX, stopY, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        AbstractC4862t.e(pts, "pts");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, offset, count, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        AbstractC4862t.e(mesh, "mesh");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        AbstractC4862t.e(oval, "oval");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(oval, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPaint(paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        AbstractC4862t.e(patch, "patch");
        AbstractC4862t.e(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPath(path, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        AbstractC4862t.e(picture, "picture");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x10, float y10, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoint(x10, y10, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, offset, count, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String text, float[] pos, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(pos, "pos");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r10, int g10, int b10) {
        getDelegate().drawRGB(r10, g10, b10);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        AbstractC4862t.e(rect, "rect");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(rect, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        AbstractC4862t.e(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) {
        AbstractC4862t.e(rect, "rect");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(rect, rx, ry, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int index, int count, float x10, float y10, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text, index, count, this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x10, float y10, boolean isRtl, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text, 0, index + count, this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) {
        AbstractC4862t.e(mode, "mode");
        AbstractC4862t.e(verts, "verts");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        getDelegate().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        AbstractC4862t.e(bounds, "bounds");
        return getDelegate().getClipBounds(bounds);
    }

    public final Canvas getDelegate() {
        Canvas canvas = this.delegate;
        if (canvas != null) {
            return canvas;
        }
        AbstractC4862t.p("delegate");
        return null;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getDelegate().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return getDelegate().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getDelegate().getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix ctm) {
        AbstractC4862t.e(ctm, "ctm");
        getDelegate().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getDelegate().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getDelegate().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getDelegate().getSaveCount();
    }

    public final Bitmap getSinglePixelBitmap() {
        return this.singlePixelBitmap;
    }

    public final Rect getSinglePixelBitmapBounds() {
        return this.singlePixelBitmapBounds;
    }

    public final Canvas getSinglePixelCanvas() {
        return this.singlePixelCanvas;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getDelegate().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getDelegate().isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        AbstractC4862t.e(rect, "rect");
        AbstractC4862t.e(type, "type");
        return getDelegate().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getDelegate().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        getDelegate().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        getDelegate().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getDelegate().save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(bounds, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        getDelegate().scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        getDelegate().setBitmap(bitmap);
    }

    public final void setDelegate(Canvas canvas) {
        AbstractC4862t.e(canvas, "<set-?>");
        this.delegate = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        getDelegate().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        getDelegate().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        getDelegate().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        getDelegate().skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        getDelegate().translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        AbstractC4862t.e(rect, "rect");
        return getDelegate().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        AbstractC4862t.e(path, "path");
        return getDelegate().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        AbstractC4862t.e(rect, "rect");
        AbstractC4862t.e(op, "op");
        return getDelegate().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] colors, int offset, int stride, int x10, int y10, int width, int height, boolean hasAlpha, Paint paint) {
        AbstractC4862t.e(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        getDelegate().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(pos, "pos");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        AbstractC4862t.e(rect, "rect");
        return getDelegate().quickReject(rect);
    }

    public final int save(int saveFlags) {
        return save();
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return getDelegate().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        return getDelegate().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        AbstractC4862t.e(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        AbstractC4862t.e(bitmap, "bitmap");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(left, top, left + bitmap.getWidth(), top + bitmap.getHeight(), this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, PorterDuff.Mode mode) {
        AbstractC4862t.e(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float x10, float y10, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x10, float y10, boolean isRtl, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(type, "type");
        return getDelegate().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        return getDelegate().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        AbstractC4862t.e(rect, "rect");
        return getDelegate().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, BlendMode mode) {
        AbstractC4862t.e(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        AbstractC4862t.e(outer, "outer");
        AbstractC4862t.e(outerRadii, "outerRadii");
        AbstractC4862t.e(inner, "inner");
        AbstractC4862t.e(innerRadii, "innerRadii");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        AbstractC4862t.e(pts, "pts");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawLines(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawOval(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        AbstractC4862t.e(patch, "patch");
        AbstractC4862t.e(dst, "dst");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        AbstractC4862t.e(picture, "picture");
        AbstractC4862t.e(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        AbstractC4862t.e(pts, "pts");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawPoints(pts, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r10, Paint paint) {
        AbstractC4862t.e(r10, "r");
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(r10, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRoundRect(left, top, right, bottom, rx, ry, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        AbstractC4862t.e(path, "path");
        return getDelegate().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(bounds, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return getDelegate().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        AbstractC4862t.e(op, "op");
        return getDelegate().clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, BlendMode mode) {
        AbstractC4862t.e(mode, "mode");
        getDelegate().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int start, int end, float x10, float y10, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text, start, end, this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int start, int end, int contextStart, int contextEnd, float x10, float y10, boolean isRtl, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text.toString(), start, end, this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        AbstractC4862t.e(type, "type");
        return getDelegate().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        return getDelegate().quickReject(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return getDelegate().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        AbstractC4862t.e(bitmap, "bitmap");
        AbstractC4862t.e(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        AbstractC4862t.e(picture, "picture");
        AbstractC4862t.e(dst, "dst");
        this.solidPaint.setColorFilter(null);
        this.solidPaint.setColor(-16777216);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        AbstractC4862t.e(paint, "paint");
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        getDelegate().drawRect(left, top, right, bottom, paint);
        paint.setShader(bitmapShaderRemoveBitmapShader);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int start, int end, float x10, float y10, Paint paint) {
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.tmpRect);
        drawMaskedText(paint, x10, y10);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(left, top, right, bottom, paint, saveFlags);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        BitmapShader bitmapShaderRemoveBitmapShader = removeBitmapShader(paint);
        int iSaveLayer = getDelegate().saveLayer(left, top, right, bottom, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderRemoveBitmapShader);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        AbstractC4862t.e(bitmap, "bitmap");
        AbstractC4862t.e(dst, "dst");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, src));
        this.solidPaint.setColorFilter(null);
        getDelegate().drawRect(dst, this.solidPaint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        AbstractC4862t.e(bitmap, "bitmap");
        AbstractC4862t.e(matrix, "matrix");
        this.solidPaint.setColor(sampleBitmapColor(bitmap, paint, null));
        this.solidPaint.setColorFilter(null);
        int iSave = getDelegate().save();
        getDelegate().setMatrix(matrix);
        getDelegate().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.solidPaint);
        getDelegate().restoreToCount(iSave);
    }
}
