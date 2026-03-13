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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bE\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B/\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u000e\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0017J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0019J0\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u001eJ(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u001fJ0\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u0014\u0010 J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001cH\u0086\n¢\u0006\u0004\b!\u0010\u001dJ \u0010&\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b$\u0010%J(\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b'\u0010(J0\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b)\u0010*J8\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b+\u0010,J \u0010&\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b$\u0010-J(\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b'\u0010.J0\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b)\u0010/J8\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b+\u00100J\u0010\u00101\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b4\u00102J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b8\u00106J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b:\u00106J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b<\u00106J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086\n¢\u0006\u0004\b7\u0010>J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086\n¢\u0006\u0004\b9\u0010>J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086\n¢\u0006\u0004\b;\u0010>J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086\n¢\u0006\u0004\b=\u0010>J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b7\u0010?J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b9\u0010?J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b;\u0010?J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b=\u0010?J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b7\u0010@J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b9\u0010@J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b;\u0010@J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b=\u0010@J'\u0010C\u001a\u00020\u00002\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050AH\u0086\bø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\r\u0010F\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\u0010\u0010J\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010L\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bK\u0010IJ\u0010\u0010N\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bM\u0010IJ\u0010\u0010P\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bO\u0010IJ8\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010U\u001a\u00020THÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u001a\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b[\u0010\\R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010]\u001a\u0004\b^\u0010I\"\u0004\b_\u0010`R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010]\u001a\u0004\ba\u0010I\"\u0004\bb\u0010`R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010]\u001a\u0004\bc\u0010I\"\u0004\bd\u0010`R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010]\u001a\u0004\be\u0010I\"\u0004\bf\u0010`R&\u0010j\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010I\"\u0004\bi\u0010`R&\u0010m\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010I\"\u0004\bl\u0010`R&\u0010p\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010I\"\u0004\bo\u0010`R&\u0010s\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010I\"\u0004\br\u0010`R&\u0010v\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010I\"\u0004\bu\u0010`R&\u0010y\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010I\"\u0004\bx\u0010`R&\u0010|\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010I\"\u0004\b{\u0010`R&\u0010\u007f\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010I\"\u0004\b~\u0010`R+\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010g\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R+\u0010\u0087\u0001\u001a\u00020\f2\u0006\u0010g\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001\"\u0006\b\u0086\u0001\u0010\u0083\u0001R+\u0010\u008a\u0001\u001a\u00020\f2\u0006\u0010g\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0081\u0001\"\u0006\b\u0089\u0001\u0010\u0083\u0001R+\u0010\u008f\u0001\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u000e8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0092\u0001\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u000e8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\"\u0006\b\u0091\u0001\u0010\u008e\u0001R+\u0010\u0095\u0001\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u000e8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001\"\u0006\b\u0094\u0001\u0010\u008e\u0001R)\u0010\u0098\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u00102\"\u0005\b\u0097\u0001\u0010\u0004R)\u0010\u009b\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u00102\"\u0005\b\u009a\u0001\u0010\u0004R)\u0010\u009e\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u00102\"\u0005\b\u009d\u0001\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/google/android/filament/utils/Half4;", "", "v", "<init>", "(Lcom/google/android/filament/utils/Half4;)V", "Lcom/google/android/filament/utils/Half;", "x", "y", "z", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "(SSSSLkotlin/jvm/internal/k;)V", "(SLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/Half2;", "(Lcom/google/android/filament/utils/Half2;SSLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/Half3;", "(Lcom/google/android/filament/utils/Half3;SLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get-YoEgL-c", "(Lcom/google/android/filament/utils/VectorComponent;)S", "get", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half3;", "index4", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half4;", "", "(I)S", "(II)Lcom/google/android/filament/utils/Half2;", "(III)Lcom/google/android/filament/utils/Half3;", "(IIII)Lcom/google/android/filament/utils/Half4;", "invoke-YoEgL-c", "invoke", "Lfc/H;", "set-2gewN4s", "(IS)V", "set", "set-Zf4qYnQ", "(IIS)V", "set-lJVBvKs", "(IIIS)V", "set-iseE3Dc", "(IIIIS)V", "(Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "unaryMinus", "()Lcom/google/android/filament/utils/Half4;", "inc", "dec", "plus-FqSqZzs", "(S)Lcom/google/android/filament/utils/Half4;", IPTC.PREFIX_PLUS, "minus-FqSqZzs", "minus", "times-FqSqZzs", "times", "div-FqSqZzs", "div", "(Lcom/google/android/filament/utils/Half2;)Lcom/google/android/filament/utils/Half4;", "(Lcom/google/android/filament/utils/Half3;)Lcom/google/android/filament/utils/Half4;", "(Lcom/google/android/filament/utils/Half4;)Lcom/google/android/filament/utils/Half4;", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Half4;", "", "toFloatArray", "()[F", "component1-SjiOe_E", "()S", "component1", "component2-SjiOe_E", "component2", "component3-SjiOe_E", "component3", "component4-SjiOe_E", "component4", "copy-hhbWti4", "(SSSS)Lcom/google/android/filament/utils/Half4;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "S", "getX-SjiOe_E", "setX-FqSqZzs", "(S)V", "getY-SjiOe_E", "setY-FqSqZzs", "getZ-SjiOe_E", "setZ-FqSqZzs", "getW-SjiOe_E", "setW-FqSqZzs", "value", "getR-SjiOe_E", "setR-FqSqZzs", "r", "getG-SjiOe_E", "setG-FqSqZzs", "g", "getB-SjiOe_E", "setB-FqSqZzs", "b", "getA-SjiOe_E", "setA-FqSqZzs", "a", "getS-SjiOe_E", "setS-FqSqZzs", "s", "getT-SjiOe_E", "setT-FqSqZzs", "t", "getP-SjiOe_E", "setP-FqSqZzs", "p", "getQ-SjiOe_E", "setQ-FqSqZzs", "q", "getXy", "()Lcom/google/android/filament/utils/Half2;", "setXy", "(Lcom/google/android/filament/utils/Half2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Half3;", "setRgb", "(Lcom/google/android/filament/utils/Half3;)V", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "getRgba", "setRgba", "rgba", "getXyzw", "setXyzw", "xyzw", "getStpq", "setStpq", "stpq", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Half4 {
    private short w;
    private short x;
    private short y;
    private short z;

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

    public /* synthetic */ Half4(Half2 half2, short s10, short s11, AbstractC4854k abstractC4854k) {
        this(half2, s10, s11);
    }

    /* JADX INFO: renamed from: copy-hhbWti4$default, reason: not valid java name */
    public static /* synthetic */ Half4 m124copyhhbWti4$default(Half4 half4, short s10, short s11, short s12, short s13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = half4.x;
        }
        if ((i10 & 2) != 0) {
            s11 = half4.y;
        }
        if ((i10 & 4) != 0) {
            s12 = half4.z;
        }
        if ((i10 & 8) != 0) {
            s13 = half4.w;
        }
        return half4.m129copyhhbWti4(s10, s11, s12, s13);
    }

    /* JADX INFO: renamed from: component1-SjiOe_E, reason: not valid java name and from getter */
    public final short getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2-SjiOe_E, reason: not valid java name and from getter */
    public final short getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3-SjiOe_E, reason: not valid java name and from getter */
    public final short getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4-SjiOe_E, reason: not valid java name and from getter */
    public final short getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: copy-hhbWti4, reason: not valid java name */
    public final Half4 m129copyhhbWti4(short x10, short y10, short z10, short w10) {
        return new Half4(x10, y10, z10, w10, (AbstractC4854k) null);
    }

    public final Half4 dec() {
        short s10 = this.x;
        this.x = Half.m12decSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m12decSjiOe_E(s11);
        short s12 = this.z;
        this.z = Half.m12decSjiOe_E(s12);
        short s13 = this.w;
        this.w = Half.m12decSjiOe_E(s13);
        return new Half4(s10, s11, s12, s13, (AbstractC4854k) null);
    }

    public final Half4 div(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m13div5SPjhV8(m142getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m13div5SPjhV8(m143getYSjiOe_E(), v10.m73getYSjiOe_E()), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: div-FqSqZzs, reason: not valid java name */
    public final Half4 m130divFqSqZzs(short v10) {
        return new Half4(Half.m13div5SPjhV8(m142getXSjiOe_E(), v10), Half.m13div5SPjhV8(m143getYSjiOe_E(), v10), Half.m13div5SPjhV8(m144getZSjiOe_E(), v10), Half.m13div5SPjhV8(m141getWSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Half4)) {
            return false;
        }
        Half4 half4 = (Half4) other;
        return Half.m15equalsimpl0(this.x, half4.x) && Half.m15equalsimpl0(this.y, half4.y) && Half.m15equalsimpl0(this.z, half4.z) && Half.m15equalsimpl0(this.w, half4.w);
    }

    public final Half2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Half2(m132getYoEgLc(index1), m132getYoEgLc(index2), null);
    }

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m132getYoEgLc(VectorComponent index) {
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

    /* JADX INFO: renamed from: getA-SjiOe_E, reason: not valid java name */
    public final short m133getASjiOe_E() {
        return m141getWSjiOe_E();
    }

    /* JADX INFO: renamed from: getB-SjiOe_E, reason: not valid java name */
    public final short m134getBSjiOe_E() {
        return m144getZSjiOe_E();
    }

    /* JADX INFO: renamed from: getG-SjiOe_E, reason: not valid java name */
    public final short m135getGSjiOe_E() {
        return m143getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getP-SjiOe_E, reason: not valid java name */
    public final short m136getPSjiOe_E() {
        return m144getZSjiOe_E();
    }

    /* JADX INFO: renamed from: getQ-SjiOe_E, reason: not valid java name */
    public final short m137getQSjiOe_E() {
        return m141getWSjiOe_E();
    }

    /* JADX INFO: renamed from: getR-SjiOe_E, reason: not valid java name */
    public final short m138getRSjiOe_E() {
        return m142getXSjiOe_E();
    }

    public final Half2 getRg() {
        return new Half2(m142getXSjiOe_E(), m143getYSjiOe_E(), null);
    }

    public final Half3 getRgb() {
        return new Half3(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half4 getRgba() {
        return new Half4(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getS-SjiOe_E, reason: not valid java name */
    public final short m139getSSjiOe_E() {
        return m142getXSjiOe_E();
    }

    public final Half2 getSt() {
        return new Half2(m142getXSjiOe_E(), m143getYSjiOe_E(), null);
    }

    public final Half3 getStp() {
        return new Half3(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half4 getStpq() {
        return new Half4(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getT-SjiOe_E, reason: not valid java name */
    public final short m140getTSjiOe_E() {
        return m143getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getW-SjiOe_E, reason: not valid java name */
    public final short m141getWSjiOe_E() {
        return this.w;
    }

    /* JADX INFO: renamed from: getX-SjiOe_E, reason: not valid java name */
    public final short m142getXSjiOe_E() {
        return this.x;
    }

    public final Half2 getXy() {
        return new Half2(m142getXSjiOe_E(), m143getYSjiOe_E(), null);
    }

    public final Half3 getXyz() {
        return new Half3(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half4 getXyzw() {
        return new Half4(m142getXSjiOe_E(), m143getYSjiOe_E(), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getY-SjiOe_E, reason: not valid java name */
    public final short m143getYSjiOe_E() {
        return this.y;
    }

    /* JADX INFO: renamed from: getZ-SjiOe_E, reason: not valid java name */
    public final short m144getZSjiOe_E() {
        return this.z;
    }

    public int hashCode() {
        return (((((Half.m21hashCodeimpl(this.x) * 31) + Half.m21hashCodeimpl(this.y)) * 31) + Half.m21hashCodeimpl(this.z)) * 31) + Half.m21hashCodeimpl(this.w);
    }

    public final Half4 inc() {
        short s10 = this.x;
        this.x = Half.m22incSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m22incSjiOe_E(s11);
        short s12 = this.z;
        this.z = Half.m22incSjiOe_E(s12);
        short s13 = this.w;
        this.w = Half.m22incSjiOe_E(s13);
        return new Half4(s10, s11, s12, s13, (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: invoke-YoEgL-c, reason: not valid java name */
    public final short m145invokeYoEgLc(int index) {
        return m131getYoEgLc(index - 1);
    }

    public final Half4 minus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m28minus5SPjhV8(m142getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m28minus5SPjhV8(m143getYSjiOe_E(), v10.m73getYSjiOe_E()), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: minus-FqSqZzs, reason: not valid java name */
    public final Half4 m146minusFqSqZzs(short v10) {
        return new Half4(Half.m28minus5SPjhV8(m142getXSjiOe_E(), v10), Half.m28minus5SPjhV8(m143getYSjiOe_E(), v10), Half.m28minus5SPjhV8(m144getZSjiOe_E(), v10), Half.m28minus5SPjhV8(m141getWSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public final Half4 plus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m32plus5SPjhV8(m142getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m32plus5SPjhV8(m143getYSjiOe_E(), v10.m73getYSjiOe_E()), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: plus-FqSqZzs, reason: not valid java name */
    public final Half4 m147plusFqSqZzs(short v10) {
        return new Half4(Half.m32plus5SPjhV8(m142getXSjiOe_E(), v10), Half.m32plus5SPjhV8(m143getYSjiOe_E(), v10), Half.m32plus5SPjhV8(m144getZSjiOe_E(), v10), Half.m32plus5SPjhV8(m141getWSjiOe_E(), v10), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m148set2gewN4s(int index, short v10) {
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

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m150setZf4qYnQ(int index1, int index2, short v10) {
        m148set2gewN4s(index1, v10);
        m148set2gewN4s(index2, v10);
    }

    /* JADX INFO: renamed from: set-iseE3Dc, reason: not valid java name */
    public final void m152setiseE3Dc(int index1, int index2, int index3, int index4, short v10) {
        m148set2gewN4s(index1, v10);
        m148set2gewN4s(index2, v10);
        m148set2gewN4s(index3, v10);
        m148set2gewN4s(index4, v10);
    }

    /* JADX INFO: renamed from: set-lJVBvKs, reason: not valid java name */
    public final void m154setlJVBvKs(int index1, int index2, int index3, short v10) {
        m148set2gewN4s(index1, v10);
        m148set2gewN4s(index2, v10);
        m148set2gewN4s(index3, v10);
    }

    /* JADX INFO: renamed from: setA-FqSqZzs, reason: not valid java name */
    public final void m156setAFqSqZzs(short s10) {
        m164setWFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setB-FqSqZzs, reason: not valid java name */
    public final void m157setBFqSqZzs(short s10) {
        m167setZFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setG-FqSqZzs, reason: not valid java name */
    public final void m158setGFqSqZzs(short s10) {
        m166setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setP-FqSqZzs, reason: not valid java name */
    public final void m159setPFqSqZzs(short s10) {
        m167setZFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setQ-FqSqZzs, reason: not valid java name */
    public final void m160setQFqSqZzs(short s10) {
        m164setWFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setR-FqSqZzs, reason: not valid java name */
    public final void m161setRFqSqZzs(short s10) {
        m165setXFqSqZzs(s10);
    }

    public final void setRg(Half2 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m72getXSjiOe_E());
        m166setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setRgb(Half3 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m102getXSjiOe_E());
        m166setYFqSqZzs(value.m103getYSjiOe_E());
        m167setZFqSqZzs(value.m104getZSjiOe_E());
    }

    public final void setRgba(Half4 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m142getXSjiOe_E());
        m166setYFqSqZzs(value.m143getYSjiOe_E());
        m167setZFqSqZzs(value.m144getZSjiOe_E());
        m164setWFqSqZzs(value.m141getWSjiOe_E());
    }

    /* JADX INFO: renamed from: setS-FqSqZzs, reason: not valid java name */
    public final void m162setSFqSqZzs(short s10) {
        m165setXFqSqZzs(s10);
    }

    public final void setSt(Half2 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m72getXSjiOe_E());
        m166setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setStp(Half3 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m102getXSjiOe_E());
        m166setYFqSqZzs(value.m103getYSjiOe_E());
        m167setZFqSqZzs(value.m104getZSjiOe_E());
    }

    public final void setStpq(Half4 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m142getXSjiOe_E());
        m166setYFqSqZzs(value.m143getYSjiOe_E());
        m167setZFqSqZzs(value.m144getZSjiOe_E());
        m164setWFqSqZzs(value.m141getWSjiOe_E());
    }

    /* JADX INFO: renamed from: setT-FqSqZzs, reason: not valid java name */
    public final void m163setTFqSqZzs(short s10) {
        m166setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setW-FqSqZzs, reason: not valid java name */
    public final void m164setWFqSqZzs(short s10) {
        this.w = s10;
    }

    /* JADX INFO: renamed from: setX-FqSqZzs, reason: not valid java name */
    public final void m165setXFqSqZzs(short s10) {
        this.x = s10;
    }

    public final void setXy(Half2 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m72getXSjiOe_E());
        m166setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setXyz(Half3 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m102getXSjiOe_E());
        m166setYFqSqZzs(value.m103getYSjiOe_E());
        m167setZFqSqZzs(value.m104getZSjiOe_E());
    }

    public final void setXyzw(Half4 value) {
        AbstractC4862t.e(value, "value");
        m165setXFqSqZzs(value.m142getXSjiOe_E());
        m166setYFqSqZzs(value.m143getYSjiOe_E());
        m167setZFqSqZzs(value.m144getZSjiOe_E());
        m164setWFqSqZzs(value.m141getWSjiOe_E());
    }

    /* JADX INFO: renamed from: setY-FqSqZzs, reason: not valid java name */
    public final void m166setYFqSqZzs(short s10) {
        this.y = s10;
    }

    /* JADX INFO: renamed from: setZ-FqSqZzs, reason: not valid java name */
    public final void m167setZFqSqZzs(short s10) {
        this.z = s10;
    }

    public final Half4 times(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m35times5SPjhV8(m142getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m35times5SPjhV8(m143getYSjiOe_E(), v10.m73getYSjiOe_E()), m144getZSjiOe_E(), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: times-FqSqZzs, reason: not valid java name */
    public final Half4 m168timesFqSqZzs(short v10) {
        return new Half4(Half.m35times5SPjhV8(m142getXSjiOe_E(), v10), Half.m35times5SPjhV8(m143getYSjiOe_E(), v10), Half.m35times5SPjhV8(m144getZSjiOe_E(), v10), Half.m35times5SPjhV8(m141getWSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public final float[] toFloatArray() {
        return new float[]{Half.m39toFloatimpl(this.x), Half.m39toFloatimpl(this.y), Half.m39toFloatimpl(this.z), Half.m39toFloatimpl(this.w)};
    }

    public String toString() {
        return "Half4(x=" + Half.m44toStringimpl(this.x) + ", y=" + Half.m44toStringimpl(this.y) + ", z=" + Half.m44toStringimpl(this.z) + ", w=" + Half.m44toStringimpl(this.w) + ")";
    }

    public final Half4 transform(l block) {
        AbstractC4862t.e(block, "block");
        m165setXFqSqZzs(((Half) block.invoke(Half.m9boximpl(m142getXSjiOe_E()))).getV());
        m166setYFqSqZzs(((Half) block.invoke(Half.m9boximpl(m143getYSjiOe_E()))).getV());
        m167setZFqSqZzs(((Half) block.invoke(Half.m9boximpl(m144getZSjiOe_E()))).getV());
        m164setWFqSqZzs(((Half) block.invoke(Half.m9boximpl(m141getWSjiOe_E()))).getV());
        return this;
    }

    public final Half4 unaryMinus() {
        return new Half4(Half.m45unaryMinusSjiOe_E(this.x), Half.m45unaryMinusSjiOe_E(this.y), Half.m45unaryMinusSjiOe_E(this.z), Half.m45unaryMinusSjiOe_E(this.w), (AbstractC4854k) null);
    }

    public /* synthetic */ Half4(Half3 half3, short s10, AbstractC4854k abstractC4854k) {
        this(half3, s10);
    }

    public final Half4 div(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m13div5SPjhV8(m142getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m13div5SPjhV8(m143getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m13div5SPjhV8(m144getZSjiOe_E(), v10.m104getZSjiOe_E()), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Half3(m132getYoEgLc(index1), m132getYoEgLc(index2), m132getYoEgLc(index3), (AbstractC4854k) null);
    }

    public final Half4 minus(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m28minus5SPjhV8(m142getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m28minus5SPjhV8(m143getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m28minus5SPjhV8(m144getZSjiOe_E(), v10.m104getZSjiOe_E()), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half4 plus(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m32plus5SPjhV8(m142getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m32plus5SPjhV8(m143getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m32plus5SPjhV8(m144getZSjiOe_E(), v10.m104getZSjiOe_E()), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    public final Half4 times(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m35times5SPjhV8(m142getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m35times5SPjhV8(m143getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m35times5SPjhV8(m144getZSjiOe_E(), v10.m104getZSjiOe_E()), m141getWSjiOe_E(), (AbstractC4854k) null);
    }

    public /* synthetic */ Half4(short s10, AbstractC4854k abstractC4854k) {
        this(s10);
    }

    public final Half4 div(Half4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m13div5SPjhV8(m142getXSjiOe_E(), v10.m142getXSjiOe_E()), Half.m13div5SPjhV8(m143getYSjiOe_E(), v10.m143getYSjiOe_E()), Half.m13div5SPjhV8(m144getZSjiOe_E(), v10.m144getZSjiOe_E()), Half.m13div5SPjhV8(m141getWSjiOe_E(), v10.m141getWSjiOe_E()), (AbstractC4854k) null);
    }

    public final Half4 get(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        return new Half4(m132getYoEgLc(index1), m132getYoEgLc(index2), m132getYoEgLc(index3), m132getYoEgLc(index4), (AbstractC4854k) null);
    }

    public final Half4 minus(Half4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m28minus5SPjhV8(m142getXSjiOe_E(), v10.m142getXSjiOe_E()), Half.m28minus5SPjhV8(m143getYSjiOe_E(), v10.m143getYSjiOe_E()), Half.m28minus5SPjhV8(m144getZSjiOe_E(), v10.m144getZSjiOe_E()), Half.m28minus5SPjhV8(m141getWSjiOe_E(), v10.m141getWSjiOe_E()), (AbstractC4854k) null);
    }

    public final Half4 plus(Half4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m32plus5SPjhV8(m142getXSjiOe_E(), v10.m142getXSjiOe_E()), Half.m32plus5SPjhV8(m143getYSjiOe_E(), v10.m143getYSjiOe_E()), Half.m32plus5SPjhV8(m144getZSjiOe_E(), v10.m144getZSjiOe_E()), Half.m32plus5SPjhV8(m141getWSjiOe_E(), v10.m141getWSjiOe_E()), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m151setZf4qYnQ(VectorComponent index1, VectorComponent index2, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        m149set2gewN4s(index1, v10);
        m149set2gewN4s(index2, v10);
    }

    public final Half4 times(Half4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half4(Half.m35times5SPjhV8(m142getXSjiOe_E(), v10.m142getXSjiOe_E()), Half.m35times5SPjhV8(m143getYSjiOe_E(), v10.m143getYSjiOe_E()), Half.m35times5SPjhV8(m144getZSjiOe_E(), v10.m144getZSjiOe_E()), Half.m35times5SPjhV8(m141getWSjiOe_E(), v10.m141getWSjiOe_E()), (AbstractC4854k) null);
    }

    public /* synthetic */ Half4(short s10, short s11, short s12, short s13, AbstractC4854k abstractC4854k) {
        this(s10, s11, s12, s13);
    }

    public final Half2 get(int index1, int index2) {
        return new Half2(m131getYoEgLc(index1), m131getYoEgLc(index2), null);
    }

    /* JADX INFO: renamed from: set-lJVBvKs, reason: not valid java name */
    public final void m155setlJVBvKs(VectorComponent index1, VectorComponent index2, VectorComponent index3, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        m149set2gewN4s(index1, v10);
        m149set2gewN4s(index2, v10);
        m149set2gewN4s(index3, v10);
    }

    private Half4(short s10, short s11, short s12, short s13) {
        this.x = s10;
        this.y = s11;
        this.z = s12;
        this.w = s13;
    }

    public final Half3 get(int index1, int index2, int index3) {
        return new Half3(m131getYoEgLc(index1), m131getYoEgLc(index2), m131getYoEgLc(index3), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: set-iseE3Dc, reason: not valid java name */
    public final void m153setiseE3Dc(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        m149set2gewN4s(index1, v10);
        m149set2gewN4s(index2, v10);
        m149set2gewN4s(index3, v10);
        m149set2gewN4s(index4, v10);
    }

    public final Half4 get(int index1, int index2, int index3, int index4) {
        return new Half4(m131getYoEgLc(index1), m131getYoEgLc(index2), m131getYoEgLc(index3), m131getYoEgLc(index4), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m131getYoEgLc(int index) {
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

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m149set2gewN4s(VectorComponent index, short v10) {
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

    public /* synthetic */ Half4(short s10, short s11, short s12, short s13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s11, (i10 & 4) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s12, (i10 & 8) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s13, (AbstractC4854k) null);
    }

    private Half4(short s10) {
        this(s10, s10, s10, s10, (AbstractC4854k) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private Half4(Half2 v10, short s10, short s11) {
        this(v10.m72getXSjiOe_E(), v10.m73getYSjiOe_E(), s10, s11, (AbstractC4854k) null);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ Half4(Half2 half2, short s10, short s11, int i10, AbstractC4854k abstractC4854k) {
        this(half2, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (i10 & 4) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s11, (AbstractC4854k) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private Half4(Half3 v10, short s10) {
        this(v10.m102getXSjiOe_E(), v10.m103getYSjiOe_E(), v10.m104getZSjiOe_E(), s10, (AbstractC4854k) null);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ Half4(Half3 half3, short s10, int i10, AbstractC4854k abstractC4854k) {
        this(half3, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (AbstractC4854k) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Half4(Half4 v10) {
        this(v10.x, v10.y, v10.z, v10.w, (AbstractC4854k) null);
        AbstractC4862t.e(v10, "v");
    }
}
