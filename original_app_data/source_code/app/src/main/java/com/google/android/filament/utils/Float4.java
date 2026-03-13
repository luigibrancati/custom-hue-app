package com.google.android.filament.utils;

import fc.C4032o;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\bH\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\r\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0016J(\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0018J0\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001cJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ(\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001eJ0\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0086\n¢\u0006\u0004\b \u0010\u001cJ \u0010\"\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010#J(\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010$J0\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010%J8\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010&J \u0010\"\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010'J(\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010(J0\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010)J8\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010*J\u0010\u0010+\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b.\u0010,J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b1\u00100J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b2\u00100J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b3\u00100J\"\u00105\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b5\u00106J\"\u00108\u001a\u0002072\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b8\u00109J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b/\u0010:J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b1\u0010:J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b2\u0010:J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b3\u0010:J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b/\u0010;J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b1\u0010;J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b2\u0010;J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b3\u0010;J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b/\u0010<J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b1\u0010<J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b2\u0010<J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b3\u0010<J\"\u00105\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u00104\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b5\u0010=J\"\u00108\u001a\u0002072\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u00104\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b8\u0010>J'\u0010A\u001a\u00020\u00002\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020?H\u0086\bø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010GJ8\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010N\u001a\u00020MHÖ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u00108\u001a\u0002072\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u0010SR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010T\u001a\u0004\bU\u0010G\"\u0004\bV\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010T\u001a\u0004\bW\u0010G\"\u0004\bX\u0010\nR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010T\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010\nR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010T\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010\nR&\u0010`\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010G\"\u0004\b_\u0010\nR&\u0010c\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010G\"\u0004\bb\u0010\nR&\u0010f\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010G\"\u0004\be\u0010\nR&\u0010i\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010G\"\u0004\bh\u0010\nR&\u0010l\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010G\"\u0004\bk\u0010\nR&\u0010o\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010G\"\u0004\bn\u0010\nR&\u0010r\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010G\"\u0004\bq\u0010\nR&\u0010u\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010G\"\u0004\bt\u0010\nR&\u0010z\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR&\u0010}\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR'\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010w\"\u0004\b\u007f\u0010yR+\u0010\u0085\u0001\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R+\u0010\u0088\u0001\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001\"\u0006\b\u0087\u0001\u0010\u0084\u0001R+\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u0082\u0001\"\u0006\b\u008a\u0001\u0010\u0084\u0001R)\u0010\u008e\u0001\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010,\"\u0005\b\u008d\u0001\u0010\u000fR)\u0010\u0091\u0001\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010,\"\u0005\b\u0090\u0001\u0010\u000fR)\u0010\u0094\u0001\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010,\"\u0005\b\u0093\u0001\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/google/android/filament/utils/Float4;", "", "", "x", "y", "z", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "<init>", "(FFFF)V", "v", "(F)V", "Lcom/google/android/filament/utils/Float2;", "(Lcom/google/android/filament/utils/Float2;FF)V", "Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Float3;F)V", "(Lcom/google/android/filament/utils/Float4;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)F", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float3;", "index4", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float4;", "", "(I)F", "(II)Lcom/google/android/filament/utils/Float2;", "(III)Lcom/google/android/filament/utils/Float3;", "(IIII)Lcom/google/android/filament/utils/Float4;", "invoke", "Lfc/H;", "set", "(IF)V", "(IIF)V", "(IIIF)V", "(IIIIF)V", "(Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "unaryMinus", "()Lcom/google/android/filament/utils/Float4;", "inc", "dec", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Float4;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Float4;", "", "equals", "(FF)Z", "(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;F)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;F)Z", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Float4;", "", "toFloatArray", "()[F", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcom/google/android/filament/utils/Float4;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "(Ljava/lang/Object;)Z", "F", "getX", "setX", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getA", "setA", "a", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getQ", "setQ", "q", "getXy", "()Lcom/google/android/filament/utils/Float2;", "setXy", "(Lcom/google/android/filament/utils/Float2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Float3;", "setRgb", "(Lcom/google/android/filament/utils/Float3;)V", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "getRgba", "setRgba", "rgba", "getXyzw", "setXyzw", "xyzw", "getStpq", "setStpq", "stpq", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Float4 {
    private float w;
    private float x;
    private float y;
    private float z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            try {
                iArr[VectorComponent.f28985X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VectorComponent.f28981R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VectorComponent.f28982S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VectorComponent.f28986Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VectorComponent.f28978G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VectorComponent.f28983T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VectorComponent.f28987Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VectorComponent.f28977B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VectorComponent.f28979P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VectorComponent.f28984W.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VectorComponent.f28976A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VectorComponent.f28980Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float4() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Float4 compareTo$default(Float4 float4, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new Float4(Math.abs(float4.getX() - f10) < f11 ? 0.0f : Float.compare(r0, f10), Math.abs(float4.getY() - f10) < f11 ? 0.0f : Float.compare(r1, f10), Math.abs(float4.getZ() - f10) < f11 ? 0.0f : Float.compare(r2, f10), Math.abs(float4.getW() - f10) >= f11 ? Float.compare(r4, f10) : 0.0f);
    }

    public static /* synthetic */ Float4 copy$default(Float4 float4, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = float4.x;
        }
        if ((i10 & 2) != 0) {
            f11 = float4.y;
        }
        if ((i10 & 4) != 0) {
            f12 = float4.z;
        }
        if ((i10 & 8) != 0) {
            f13 = float4.w;
        }
        return float4.copy(f10, f11, f12, f13);
    }

    public static /* synthetic */ boolean equals$default(Float4 float4, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(float4.getX() - f10) < f11 && Math.abs(float4.getY() - f10) < f11 && Math.abs(float4.getZ() - f10) < f11 && Math.abs(float4.getW() - f10) < f11;
    }

    public final Float4 compareTo(float v10, float delta) {
        return new Float4(Math.abs(getX() - v10) < delta ? 0.0f : Float.compare(r1, v10), Math.abs(getY() - v10) < delta ? 0.0f : Float.compare(r2, v10), Math.abs(getZ() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(getW() - v10) >= delta ? Float.compare(r6, v10) : 0.0f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getW() {
        return this.w;
    }

    public final Float4 copy(float x10, float y10, float z10, float w10) {
        return new Float4(x10, y10, z10, w10);
    }

    public final Float4 dec() {
        float f10 = this.x;
        this.x = f10 - 1.0f;
        float f11 = this.y;
        this.y = f11 - 1.0f;
        float f12 = this.z;
        this.z = f12 - 1.0f;
        float f13 = this.w;
        this.w = (-1.0f) + f13;
        return new Float4(f10, f11, f12, f13);
    }

    public final Float4 div(float v10) {
        return new Float4(getX() / v10, getY() / v10, getZ() / v10, getW() / v10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float4)) {
            return false;
        }
        Float4 float4 = (Float4) other;
        return Float.compare(this.x, float4.x) == 0 && Float.compare(this.y, float4.y) == 0 && Float.compare(this.z, float4.z) == 0 && Float.compare(this.w, float4.w) == 0;
    }

    public final float get(VectorComponent index) {
        AbstractC4862t.e(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.x;
            case 4:
            case 5:
            case 6:
                return this.y;
            case 7:
            case 8:
            case 9:
                return this.z;
            case 10:
            case 11:
            case 12:
                return this.w;
            default:
                throw new C4032o();
        }
    }

    public final float getA() {
        return getW();
    }

    public final float getB() {
        return getZ();
    }

    public final float getG() {
        return getY();
    }

    public final float getP() {
        return getZ();
    }

    public final float getQ() {
        return getW();
    }

    public final float getR() {
        return getX();
    }

    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final Float3 getRgb() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getRgba() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getS() {
        return getX();
    }

    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    public final Float3 getStp() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getStpq() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getT() {
        return getY();
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
    }

    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getXyzw() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w);
    }

    public final Float4 inc() {
        float f10 = this.x;
        this.x = f10 + 1.0f;
        float f11 = this.y;
        this.y = f11 + 1.0f;
        float f12 = this.z;
        this.z = f12 + 1.0f;
        float f13 = this.w;
        this.w = 1.0f + f13;
        return new Float4(f10, f11, f12, f13);
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    public final Float4 minus(float v10) {
        return new Float4(getX() - v10, getY() - v10, getZ() - v10, getW() - v10);
    }

    public final Float4 plus(float v10) {
        return new Float4(getX() + v10, getY() + v10, getZ() + v10, getW() + v10);
    }

    public final void set(int index, float v10) {
        if (index == 0) {
            this.x = v10;
            return;
        }
        if (index == 1) {
            this.y = v10;
        } else if (index == 2) {
            this.z = v10;
        } else {
            if (index != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.w = v10;
        }
    }

    public final void setA(float f10) {
        setW(f10);
    }

    public final void setB(float f10) {
        setZ(f10);
    }

    public final void setG(float f10) {
        setY(f10);
    }

    public final void setP(float f10) {
        setZ(f10);
    }

    public final void setQ(float f10) {
        setW(f10);
    }

    public final void setR(float f10) {
        setX(f10);
    }

    public final void setRg(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setRgba(Float4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setS(float f10) {
        setX(f10);
    }

    public final void setSt(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setStpq(Float4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(float f10) {
        setY(f10);
    }

    public final void setW(float f10) {
        this.w = f10;
    }

    public final void setX(float f10) {
        this.x = f10;
    }

    public final void setXy(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setXyzw(Float4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(float f10) {
        this.y = f10;
    }

    public final void setZ(float f10) {
        this.z = f10;
    }

    public final Float4 times(float v10) {
        return new Float4(getX() * v10, getY() * v10, getZ() * v10, getW() * v10);
    }

    public final float[] toFloatArray() {
        return new float[]{this.x, this.y, this.z, this.w};
    }

    public String toString() {
        return "Float4(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ")";
    }

    public final Float4 transform(l block) {
        AbstractC4862t.e(block, "block");
        setX(((Number) block.invoke(Float.valueOf(getX()))).floatValue());
        setY(((Number) block.invoke(Float.valueOf(getY()))).floatValue());
        setZ(((Number) block.invoke(Float.valueOf(getZ()))).floatValue());
        setW(((Number) block.invoke(Float.valueOf(getW()))).floatValue());
        return this;
    }

    public final Float4 unaryMinus() {
        return new Float4(-this.x, -this.y, -this.z, -this.w);
    }

    public Float4(float f10, float f11, float f12, float f13) {
        this.x = f10;
        this.y = f11;
        this.z = f12;
        this.w = f13;
    }

    public final Float4 div(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() / v10.getX(), getY() / v10.getY(), getZ(), getW());
    }

    public final boolean equals(float v10, float delta) {
        return Math.abs(getX() - v10) < delta && Math.abs(getY() - v10) < delta && Math.abs(getZ() - v10) < delta && Math.abs(getW() - v10) < delta;
    }

    public final Float4 minus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() - v10.getX(), getY() - v10.getY(), getZ(), getW());
    }

    public final Float4 plus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() + v10.getX(), getY() + v10.getY(), getZ(), getW());
    }

    public final Float4 times(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() * v10.getX(), getY() * v10.getY(), getZ(), getW());
    }

    public final Float4 div(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() / v10.getX(), getY() / v10.getY(), getZ() / v10.getZ(), getW());
    }

    public final Float4 minus(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() - v10.getX(), getY() - v10.getY(), getZ() - v10.getZ(), getW());
    }

    public final Float4 plus(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() + v10.getX(), getY() + v10.getY(), getZ() + v10.getZ(), getW());
    }

    public final Float4 times(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() * v10.getX(), getY() * v10.getY(), getZ() * v10.getZ(), getW());
    }

    public final Float4 div(Float4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() / v10.getX(), getY() / v10.getY(), getZ() / v10.getZ(), getW() / v10.getW());
    }

    public final Float4 minus(Float4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() - v10.getX(), getY() - v10.getY(), getZ() - v10.getZ(), getW() - v10.getW());
    }

    public final Float4 plus(Float4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() + v10.getX(), getY() + v10.getY(), getZ() + v10.getZ(), getW() + v10.getW());
    }

    public final Float4 times(Float4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4(getX() * v10.getX(), getY() * v10.getY(), getZ() * v10.getZ(), getW() * v10.getW());
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final void set(int index1, int index2, float v10) {
        set(index1, v10);
        set(index2, v10);
    }

    public /* synthetic */ Float4(float f10, float f11, float f12, float f13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    public final Float3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public Float4(float f10) {
        this(f10, f10, f10, f10);
    }

    public final Float4 get(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        return new Float4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int index1, int index2, int index3, float v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float2 v10, float f10, float f11) {
        this(v10.getX(), v10.getY(), f10, f11);
        AbstractC4862t.e(v10, "v");
    }

    public static /* synthetic */ boolean equals$default(Float4 float4, Float4 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return Math.abs(float4.getX() - v10.getX()) < f10 && Math.abs(float4.getY() - v10.getY()) < f10 && Math.abs(float4.getZ() - v10.getZ()) < f10 && Math.abs(float4.getW() - v10.getW()) < f10;
    }

    public final float get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        if (index == 2) {
            return this.z;
        }
        if (index == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public /* synthetic */ Float4(Float2 float2, float f10, float f11, int i10, AbstractC4854k abstractC4854k) {
        this(float2, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }

    public final boolean equals(Float4 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return Math.abs(getX() - v10.getX()) < delta && Math.abs(getY() - v10.getY()) < delta && Math.abs(getZ() - v10.getZ()) < delta && Math.abs(getW() - v10.getW()) < delta;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float3 v10, float f10) {
        this(v10.getX(), v10.getY(), v10.getZ(), f10);
        AbstractC4862t.e(v10, "v");
    }

    public final void set(int index1, int index2, int index3, int index4, float v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
        set(index4, v10);
    }

    public /* synthetic */ Float4(Float3 float3, float f10, int i10, AbstractC4854k abstractC4854k) {
        this(float3, (i10 & 2) != 0 ? 0.0f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(Float4 v10) {
        this(v10.x, v10.y, v10.z, v10.w);
        AbstractC4862t.e(v10, "v");
    }

    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    public static /* synthetic */ Float4 compareTo$default(Float4 float4, Float4 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return new Float4(Math.abs(float4.getX() - v10.getX()) < f10 ? 0.0f : Float.compare(r0, r1), Math.abs(float4.getY() - v10.getY()) < f10 ? 0.0f : Float.compare(r1, r2), Math.abs(float4.getZ() - v10.getZ()) < f10 ? 0.0f : Float.compare(r2, r3), Math.abs(float4.getW() - v10.getW()) >= f10 ? Float.compare(r5, r6) : 0.0f);
    }

    public final Float4 compareTo(Float4 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return new Float4(Math.abs(getX() - v10.getX()) < delta ? 0.0f : Float.compare(r1, r2), Math.abs(getY() - v10.getY()) < delta ? 0.0f : Float.compare(r2, r3), Math.abs(getZ() - v10.getZ()) < delta ? 0.0f : Float.compare(r3, r5), Math.abs(getW() - v10.getW()) >= delta ? Float.compare(r7, r8) : 0.0f);
    }

    public final Float3 get(int index1, int index2, int index3) {
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(VectorComponent index, float v10) {
        AbstractC4862t.e(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.x = v10;
                return;
            case 4:
            case 5:
            case 6:
                this.y = v10;
                return;
            case 7:
            case 8:
            case 9:
                this.z = v10;
                return;
            case 10:
            case 11:
            case 12:
                this.w = v10;
                return;
            default:
                throw new C4032o();
        }
    }

    public final Float4 get(int index1, int index2, int index3, int index4) {
        return new Float4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(VectorComponent index1, VectorComponent index2, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
        set(index4, v10);
    }
}
