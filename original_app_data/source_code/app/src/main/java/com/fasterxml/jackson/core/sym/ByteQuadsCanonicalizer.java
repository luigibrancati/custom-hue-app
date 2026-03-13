package com.fasterxml.jackson.core.sym;

import T1.e;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class ByteQuadsCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    static final int MAX_ENTRIES_FOR_REUSE = 6000;
    private static final int MAX_T_SIZE = 65536;
    private static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 65599;
    private static final int MULT3 = 31;
    private int _count;
    private final boolean _failOnDoS;
    private int[] _hashArea;
    private boolean _hashShared;
    private int _hashSize;
    private boolean _intern;
    private int _longNameOffset;
    private String[] _names;
    private final ByteQuadsCanonicalizer _parent;
    private int _secondaryStart;
    private final int _seed;
    private int _spilloverEnd;
    private final AtomicReference<TableInfo> _tableInfo;
    private int _tertiaryShift;
    private int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i10, boolean z10, int i11, boolean z11) {
        this._parent = null;
        this._seed = i11;
        this._intern = z10;
        this._failOnDoS = z11;
        int i12 = 16;
        if (i10 < 16) {
            i10 = i12;
        } else if (((i10 - 1) & i10) != 0) {
            while (i12 < i10) {
                i12 += i12;
            }
            i10 = i12;
        }
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i10));
    }

    private int _appendLongName(int[] iArr, int i10) {
        int i11 = this._longNameOffset;
        int i12 = i11 + i10;
        int[] iArr2 = this._hashArea;
        if (i12 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, this._hashArea.length + Math.max(i12 - iArr2.length, Math.min(RecognitionOptions.AZTEC, this._hashSize)));
        }
        System.arraycopy(iArr, 0, this._hashArea, i11, i10);
        this._longNameOffset += i10;
        return i11;
    }

    private final int _calcOffset(int i10) {
        return ((this._hashSize - 1) & i10) << 2;
    }

    public static int _calcTertiaryShift(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private boolean _checkNeedForRehash() {
        if (this._count <= (this._hashSize >> 1)) {
            return false;
        }
        int i_spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
        int i10 = this._count;
        return i_spilloverStart > ((i10 + 1) >> 7) || ((double) i10) > ((double) this._hashSize) * 0.8d;
    }

    private int _findOffsetForAdd(int i10) {
        int i_calcOffset = _calcOffset(i10);
        int[] iArr = this._hashArea;
        if (iArr[i_calcOffset + 3] == 0) {
            return i_calcOffset;
        }
        if (_checkNeedForRehash()) {
            return _resizeAndFindOffsetForAdd(i10);
        }
        int i11 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i_calcOffset >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this._spilloverEnd;
        int i17 = i16 + 4;
        this._spilloverEnd = i17;
        if (i17 < (this._hashSize << 3)) {
            return i16;
        }
        if (this._failOnDoS) {
            _reportTooManyCollisions();
        }
        return _resizeAndFindOffsetForAdd(i10);
    }

    private String _findSecondary(int i10, int i11) {
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int[] iArr = this._hashArea;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i11 == iArr[i14] && 1 == i16) {
                return this._names[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i11 == iArr[i_spilloverStart] && 1 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    private int _resizeAndFindOffsetForAdd(int i10) {
        rehash();
        int i_calcOffset = _calcOffset(i10);
        int[] iArr = this._hashArea;
        if (iArr[i_calcOffset + 3] == 0) {
            return i_calcOffset;
        }
        int i11 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i_calcOffset >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this._spilloverEnd;
        this._spilloverEnd = i16 + 4;
        return i16;
    }

    private final int _spilloverStart() {
        int i10 = this._hashSize;
        return (i10 << 3) - i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean _verifyLongName(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6._hashArea
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r6._verifyLongName2(r7, r8, r9)
            return r6
        Lc:
            r6 = r7[r2]
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L15
            return r2
        L15:
            r9 = r8
            r6 = r1
            goto L19
        L18:
            r6 = r2
        L19:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L24
            return r2
        L24:
            r9 = r3
            goto L27
        L26:
            r8 = r2
        L27:
            int r6 = r8 + 1
            r8 = r7[r8]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L32
            return r2
        L32:
            r9 = r3
            goto L35
        L34:
            r6 = r2
        L35:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L40
            return r2
        L40:
            r9 = r3
            goto L43
        L42:
            r8 = r2
        L43:
            int r6 = r8 + 1
            r3 = r7[r8]
            int r4 = r9 + 1
            r5 = r0[r9]
            if (r3 == r5) goto L4e
            return r2
        L4e:
            int r3 = r8 + 2
            r6 = r7[r6]
            int r5 = r9 + 2
            r4 = r0[r4]
            if (r6 == r4) goto L59
            return r2
        L59:
            int r8 = r8 + 3
            r6 = r7[r3]
            int r9 = r9 + 3
            r3 = r0[r5]
            if (r6 == r3) goto L64
            return r2
        L64:
            r6 = r7[r8]
            r7 = r0[r9]
            if (r6 == r7) goto L6b
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            if (iArr[i12] != this._hashArea[i11]) {
                return false;
            }
            if (i13 >= i10) {
                return true;
            }
            i12 = i13;
            i11 = i14;
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i10 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i10 == tableInfo2.count) {
            return;
        }
        if (i10 > MAX_ENTRIES_FOR_REUSE) {
            tableInfo = TableInfo.createInitial(64);
        }
        e.a(this._tableInfo, tableInfo2, tableInfo);
    }

    private void nukeSymbols(boolean z10) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z10) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i10 = this._hashSize;
        int i11 = this._count;
        int i12 = i10 + i10;
        int i13 = this._spilloverEnd;
        if (i12 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i10 << 3)];
        this._hashSize = i12;
        int i14 = i12 << 2;
        this._secondaryStart = i14;
        this._tertiaryStart = i14 + (i14 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i12);
        this._names = new String[strArr.length << 1];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += 4) {
            int i17 = iArr[i16 + 3];
            if (i17 != 0) {
                i15++;
                String str = strArr[i16 >> 2];
                if (i17 == 1) {
                    iArr2[0] = iArr[i16];
                    addName(str, iArr2, 1);
                } else if (i17 == 2) {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    addName(str, iArr2, 2);
                } else if (i17 != 3) {
                    if (i17 > iArr2.length) {
                        iArr2 = new int[i17];
                    }
                    System.arraycopy(iArr, iArr[i16 + 1], iArr2, 0, i17);
                    addName(str, iArr2, i17);
                } else {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    iArr2[2] = iArr[i16 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i15 == i11) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i11 + ", copyCount=" + i15);
    }

    public void _reportTooManyCollisions() {
        if (this._hashSize <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this._count + " entries, hash area of " + this._hashSize + " slots is now full (all " + (this._hashSize >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String addName(String str, int i10) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int i_findOffsetForAdd = _findOffsetForAdd(calcHash(i10));
        int[] iArr = this._hashArea;
        iArr[i_findOffsetForAdd] = i10;
        iArr[i_findOffsetForAdd + 3] = 1;
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public int bucketCount() {
        return this._hashSize;
    }

    public int calcHash(int i10) {
        int i11 = this._seed ^ i10;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public String findName(int i10) {
        int i_calcOffset = _calcOffset(calcHash(i10));
        int[] iArr = this._hashArea;
        int i11 = iArr[i_calcOffset + 3];
        if (i11 == 1) {
            if (iArr[i_calcOffset] == i10) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this._names[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i10);
    }

    public int hashSeed() {
        return this._seed;
    }

    public ByteQuadsCanonicalizer makeChild(int i10) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i10), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i10), this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i10 = this._secondaryStart;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i10 = this._tertiaryStart;
        int i11 = 0;
        for (int i12 = this._secondaryStart + 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        return atomicReference != null ? atomicReference.get().count : this._count;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i10 = this._tertiaryStart + 3;
        int i11 = this._hashSize + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this._hashArea[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public String toString() {
        int iPrimaryCount = primaryCount();
        int iSecondaryCount = secondaryCount();
        int iTertiaryCount = tertiaryCount();
        int iSpilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(iPrimaryCount), Integer.valueOf(iSecondaryCount), Integer.valueOf(iTertiaryCount), Integer.valueOf(iSpilloverCount), Integer.valueOf(iPrimaryCount + iSecondaryCount + iTertiaryCount + iSpilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i10 = this._hashSize << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int calcHash(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = this._seed ^ ((i12 ^ (i12 >>> 9)) + (i11 * 33));
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public static ByteQuadsCanonicalizer createRoot(int i10) {
        return new ByteQuadsCanonicalizer(64, true, i10, true);
    }

    public int calcHash(int i10, int i11, int i12) {
        int i13 = this._seed ^ i10;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public int calcHash(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = this._seed ^ iArr[0];
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * MULT2;
            int i18 = i17 + (i17 >>> 19);
            return i18 ^ (i18 << 5);
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z10, int i10, boolean z11, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i10;
        this._intern = z10;
        this._failOnDoS = z11;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i11 = tableInfo.size;
        this._hashSize = i11;
        int i12 = i11 << 2;
        this._secondaryStart = i12;
        this._tertiaryStart = i12 + (i12 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._hashShared = true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.size = i10;
            this.count = i11;
            this.tertiaryShift = i12;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i13;
            this.longNameOffset = i14;
        }

        public static TableInfo createInitial(int i10) {
            int i11 = i10 << 3;
            return new TableInfo(i10, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private String _findSecondary(int i10, int i11, int i12) {
        int i13 = this._tertiaryStart;
        int i14 = this._tertiaryShift;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr = this._hashArea;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i11 == iArr[i15] && i12 == iArr[i15 + 1] && 2 == i17) {
                return this._names[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i11 == iArr[i_spilloverStart] && i12 == iArr[i_spilloverStart + 1] && 2 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int i_findOffsetForAdd = _findOffsetForAdd(i11 == 0 ? calcHash(i10) : calcHash(i10, i11));
        int[] iArr = this._hashArea;
        iArr[i_findOffsetForAdd] = i10;
        iArr[i_findOffsetForAdd + 1] = i11;
        iArr[i_findOffsetForAdd + 3] = 2;
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i10, int i11) {
        int i_calcOffset = _calcOffset(calcHash(i10, i11));
        int[] iArr = this._hashArea;
        int i12 = iArr[i_calcOffset + 3];
        if (i12 == 2) {
            if (i10 == iArr[i_calcOffset] && i11 == iArr[i_calcOffset + 1]) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this._names[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i10, i11);
    }

    private String _findSecondary(int i10, int i11, int i12, int i13) {
        int i14 = this._tertiaryStart;
        int i15 = this._tertiaryShift;
        int i16 = i14 + ((i10 >> (i15 + 2)) << i15);
        int[] iArr = this._hashArea;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i11 == iArr[i16] && i12 == iArr[i16 + 1] && i13 == iArr[i16 + 2] && 3 == i18) {
                return this._names[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i11 == iArr[i_spilloverStart] && i12 == iArr[i_spilloverStart + 1] && i13 == iArr[i_spilloverStart + 2] && 3 == iArr[i_spilloverStart + 3]) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11, int i12) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int i_findOffsetForAdd = _findOffsetForAdd(calcHash(i10, i11, i12));
        int[] iArr = this._hashArea;
        iArr[i_findOffsetForAdd] = i10;
        iArr[i_findOffsetForAdd + 1] = i11;
        iArr[i_findOffsetForAdd + 2] = i12;
        iArr[i_findOffsetForAdd + 3] = 3;
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i10, int i11, int i12) {
        int i_calcOffset = _calcOffset(calcHash(i10, i11, i12));
        int[] iArr = this._hashArea;
        int i13 = iArr[i_calcOffset + 3];
        if (i13 == 3) {
            if (i10 == iArr[i_calcOffset] && iArr[i_calcOffset + 1] == i11 && iArr[i_calcOffset + 2] == i12) {
                return this._names[i_calcOffset >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this._names[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return _findSecondary(i_calcOffset, i10, i11, i12);
    }

    private String _findSecondary(int i10, int i11, int[] iArr, int i12) {
        int i13 = this._tertiaryStart;
        int i14 = this._tertiaryShift;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr2 = this._hashArea;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr2[i15 + 3];
            if (i11 == iArr2[i15] && i12 == i17 && _verifyLongName(iArr, i12, iArr2[i15 + 1])) {
                return this._names[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int i_spilloverStart = _spilloverStart(); i_spilloverStart < this._spilloverEnd; i_spilloverStart += 4) {
            if (i11 == iArr2[i_spilloverStart] && i12 == iArr2[i_spilloverStart + 3] && _verifyLongName(iArr, i12, iArr2[i_spilloverStart + 1])) {
                return this._names[i_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int[] iArr, int i10) {
        int i_findOffsetForAdd;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i10 == 1) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[i_findOffsetForAdd] = iArr[0];
            iArr2[i_findOffsetForAdd + 3] = 1;
        } else if (i10 == 2) {
            i_findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[i_findOffsetForAdd] = iArr[0];
            iArr3[i_findOffsetForAdd + 1] = iArr[1];
            iArr3[i_findOffsetForAdd + 3] = 2;
        } else if (i10 != 3) {
            int iCalcHash = calcHash(iArr, i10);
            i_findOffsetForAdd = _findOffsetForAdd(iCalcHash);
            this._hashArea[i_findOffsetForAdd] = iCalcHash;
            int i_appendLongName = _appendLongName(iArr, i10);
            int[] iArr4 = this._hashArea;
            iArr4[i_findOffsetForAdd + 1] = i_appendLongName;
            iArr4[i_findOffsetForAdd + 3] = i10;
        } else {
            int i_findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[i_findOffsetForAdd2] = iArr[0];
            iArr5[i_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[i_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[i_findOffsetForAdd2 + 3] = 3;
            i_findOffsetForAdd = i_findOffsetForAdd2;
        }
        this._names[i_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int[] iArr, int i10) {
        if (i10 < 4) {
            if (i10 == 1) {
                return findName(iArr[0]);
            }
            if (i10 == 2) {
                return findName(iArr[0], iArr[1]);
            }
            if (i10 != 3) {
                return "";
            }
            return findName(iArr[0], iArr[1], iArr[2]);
        }
        int iCalcHash = calcHash(iArr, i10);
        int i_calcOffset = _calcOffset(iCalcHash);
        int[] iArr2 = this._hashArea;
        int i11 = iArr2[i_calcOffset + 3];
        if (iCalcHash == iArr2[i_calcOffset] && i11 == i10 && _verifyLongName(iArr, i10, iArr2[i_calcOffset + 1])) {
            return this._names[i_calcOffset >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this._secondaryStart + ((i_calcOffset >> 3) << 2);
        int i13 = iArr2[i12 + 3];
        if (iCalcHash == iArr2[i12] && i13 == i10 && _verifyLongName(iArr, i10, iArr2[i12 + 1])) {
            return this._names[i12 >> 2];
        }
        return _findSecondary(i_calcOffset, iCalcHash, iArr, i10);
    }
}
