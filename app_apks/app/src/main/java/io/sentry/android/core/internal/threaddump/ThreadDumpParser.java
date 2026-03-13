package io.sentry.android.core.internal.threaddump;

import io.sentry.SentryLevel;
import io.sentry.SentryLockReason;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.android.core.internal.util.NativeEventUtils;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ThreadDumpParser {
    private final boolean isBackground;
    private final SentryOptions options;
    private final SentryStackTraceFactory stackTraceFactory;
    private static final Pattern BEGIN_MANAGED_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    private static final Pattern BEGIN_UNMANAGED_NATIVE_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    private static final Pattern NATIVE_RE = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    private static final Pattern JAVA_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    private static final Pattern JNI_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    private static final Pattern LOCKED_RE = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern SLEEPING_ON_RE = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_ON_RE = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_HELD_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    private static final Pattern WAITING_TO_LOCK_UNKNOWN_RE = Pattern.compile(" *- waiting to lock an unknown object");
    private static final Pattern BLANK_RE = Pattern.compile("\\s+");
    private final Map<String, DebugImage> debugImages = new HashMap();
    private final List<SentryThread> threads = new ArrayList();

    public ThreadDumpParser(SentryOptions sentryOptions, boolean z10) {
        this.options = sentryOptions;
        this.isBackground = z10;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
    }

    private void combineThreadLocks(SentryThread sentryThread, SentryLockReason sentryLockReason) {
        Map<String, SentryLockReason> heldLocks = sentryThread.getHeldLocks();
        if (heldLocks == null) {
            heldLocks = new HashMap<>();
        }
        SentryLockReason sentryLockReason2 = heldLocks.get(sentryLockReason.getAddress());
        if (sentryLockReason2 != null) {
            sentryLockReason2.setType(Math.max(sentryLockReason2.getType(), sentryLockReason.getType()));
        } else {
            heldLocks.put(sentryLockReason.getAddress(), new SentryLockReason(sentryLockReason));
        }
        sentryThread.setHeldLocks(heldLocks);
    }

    private Integer getInteger(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long getLong(Matcher matcher, int i10, Long l10) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? l10 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer getUInteger(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        if (strGroup != null && strGroup.length() != 0) {
            int i11 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean matches(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private SentryStackTrace parseStacktrace(Lines lines, SentryThread sentryThread) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = NATIVE_RE.matcher("");
        Matcher matcher3 = JAVA_RE.matcher("");
        Matcher matcher4 = JNI_RE.matcher("");
        Matcher matcher5 = LOCKED_RE.matcher("");
        Matcher matcher6 = WAITING_ON_RE.matcher("");
        Matcher matcher7 = SLEEPING_ON_RE.matcher("");
        Matcher matcher8 = WAITING_TO_LOCK_HELD_RE.matcher("");
        Matcher matcher9 = WAITING_TO_LOCK_RE.matcher("");
        Matcher matcher10 = WAITING_TO_LOCK_UNKNOWN_RE.matcher("");
        Matcher matcher11 = BLANK_RE.matcher("");
        SentryStackFrame sentryStackFrame = null;
        while (true) {
            if (!lines.hasNext()) {
                break;
            }
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = next.text;
            Matcher matcher12 = matcher11;
            if (matches(matcher3, str)) {
                sentryStackFrame = new SentryStackFrame();
                String str2 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                sentryStackFrame.setModule(str2);
                sentryStackFrame.setFunction(matcher3.group(3));
                sentryStackFrame.setFilename(matcher3.group(4));
                sentryStackFrame.setLineno(getUInteger(matcher3, 5, null));
                sentryStackFrame.setInApp(this.stackTraceFactory.isInApp(str2));
                arrayList.add(sentryStackFrame);
                matcher = matcher3;
            } else if (matches(matcher2, str)) {
                SentryStackFrame sentryStackFrame2 = new SentryStackFrame();
                sentryStackFrame2.setPackage(matcher2.group(3));
                sentryStackFrame2.setFunction(matcher2.group(6));
                sentryStackFrame2.setLineno(getInteger(matcher2, 7, null));
                sentryStackFrame2.setInstructionAddr("0x" + matcher2.group(2));
                sentryStackFrame2.setPlatform(SentryStackFrame.JsonKeys.NATIVE);
                String strGroup = matcher2.group(8);
                String strBuildIdToDebugId = strGroup == null ? null : NativeEventUtils.buildIdToDebugId(strGroup);
                if (strBuildIdToDebugId != null) {
                    if (this.debugImages.containsKey(strBuildIdToDebugId)) {
                        matcher = matcher3;
                    } else {
                        DebugImage debugImage = new DebugImage();
                        debugImage.setDebugId(strBuildIdToDebugId);
                        matcher = matcher3;
                        debugImage.setType("elf");
                        debugImage.setCodeFile(matcher2.group(4));
                        debugImage.setCodeId(strGroup);
                        this.debugImages.put(strBuildIdToDebugId, debugImage);
                    }
                    sentryStackFrame2.setAddrMode("rel:" + strBuildIdToDebugId);
                } else {
                    matcher = matcher3;
                }
                arrayList.add(sentryStackFrame2);
                matcher11 = matcher12;
                sentryStackFrame = null;
                matcher3 = matcher;
            } else {
                matcher = matcher3;
                if (matches(matcher4, str)) {
                    sentryStackFrame = new SentryStackFrame();
                    String str3 = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    sentryStackFrame.setModule(str3);
                    sentryStackFrame.setFunction(matcher4.group(3));
                    sentryStackFrame.setInApp(this.stackTraceFactory.isInApp(str3));
                    sentryStackFrame.setNative(Boolean.TRUE);
                    arrayList.add(sentryStackFrame);
                } else if (matches(matcher5, str)) {
                    if (sentryStackFrame != null) {
                        SentryLockReason sentryLockReason = new SentryLockReason();
                        sentryLockReason.setType(1);
                        sentryLockReason.setAddress(matcher5.group(1));
                        sentryLockReason.setPackageName(matcher5.group(2));
                        sentryLockReason.setClassName(matcher5.group(3));
                        sentryStackFrame.setLock(sentryLockReason);
                        combineThreadLocks(sentryThread, sentryLockReason);
                    }
                } else if (matches(matcher6, str)) {
                    if (sentryStackFrame != null) {
                        SentryLockReason sentryLockReason2 = new SentryLockReason();
                        sentryLockReason2.setType(2);
                        sentryLockReason2.setAddress(matcher6.group(1));
                        sentryLockReason2.setPackageName(matcher6.group(2));
                        sentryLockReason2.setClassName(matcher6.group(3));
                        sentryStackFrame.setLock(sentryLockReason2);
                        combineThreadLocks(sentryThread, sentryLockReason2);
                    }
                } else if (!matches(matcher7, str)) {
                    if (!matches(matcher8, str)) {
                        if (!matches(matcher9, str)) {
                            if (!matches(matcher10, str)) {
                                if (str.length() == 0) {
                                    break;
                                }
                                matcher11 = matcher12;
                                if (matches(matcher11, str)) {
                                    break;
                                }
                                matcher3 = matcher;
                            } else if (sentryStackFrame != null) {
                                SentryLockReason sentryLockReason3 = new SentryLockReason();
                                sentryLockReason3.setType(8);
                                sentryStackFrame.setLock(sentryLockReason3);
                                combineThreadLocks(sentryThread, sentryLockReason3);
                            }
                        } else if (sentryStackFrame != null) {
                            SentryLockReason sentryLockReason4 = new SentryLockReason();
                            sentryLockReason4.setType(8);
                            sentryLockReason4.setAddress(matcher9.group(1));
                            sentryLockReason4.setPackageName(matcher9.group(2));
                            sentryLockReason4.setClassName(matcher9.group(3));
                            sentryStackFrame.setLock(sentryLockReason4);
                            combineThreadLocks(sentryThread, sentryLockReason4);
                        }
                    } else if (sentryStackFrame != null) {
                        SentryLockReason sentryLockReason5 = new SentryLockReason();
                        sentryLockReason5.setType(8);
                        sentryLockReason5.setAddress(matcher8.group(1));
                        sentryLockReason5.setPackageName(matcher8.group(2));
                        sentryLockReason5.setClassName(matcher8.group(3));
                        sentryLockReason5.setThreadId(getLong(matcher8, 4, null));
                        sentryStackFrame.setLock(sentryLockReason5);
                        combineThreadLocks(sentryThread, sentryLockReason5);
                    }
                    matcher11 = matcher12;
                    matcher3 = matcher;
                } else if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason6 = new SentryLockReason();
                    sentryLockReason6.setType(4);
                    sentryLockReason6.setAddress(matcher7.group(1));
                    sentryLockReason6.setPackageName(matcher7.group(2));
                    sentryLockReason6.setClassName(matcher7.group(3));
                    sentryStackFrame.setLock(sentryLockReason6);
                    combineThreadLocks(sentryThread, sentryLockReason6);
                }
            }
            matcher11 = matcher12;
            matcher3 = matcher;
        }
        Collections.reverse(arrayList);
        SentryStackTrace sentryStackTrace = new SentryStackTrace(arrayList);
        sentryStackTrace.setSnapshot(Boolean.TRUE);
        return sentryStackTrace;
    }

    private SentryThread parseThread(Lines lines) {
        SentryThread sentryThread = new SentryThread();
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        if (!lines.hasNext()) {
            return null;
        }
        Line next = lines.next();
        boolean z10 = false;
        if (next == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (matches(matcher, next.text)) {
            Long l10 = getLong(matcher, 4, null);
            if (l10 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l10);
            sentryThread.setName(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(StringUtils.SPACE)) {
                    sentryThread.setState(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    sentryThread.setState(strGroup);
                }
            }
        } else if (matches(matcher2, next.text)) {
            Long l11 = getLong(matcher2, 3, null);
            if (l11 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l11);
            sentryThread.setName(matcher2.group(1));
        }
        String name = sentryThread.getName();
        if (name != null) {
            boolean zEquals = name.equals(SentryThread.JsonKeys.MAIN);
            sentryThread.setMain(Boolean.valueOf(zEquals));
            sentryThread.setCrashed(Boolean.valueOf(zEquals));
            if (zEquals && !this.isBackground) {
                z10 = true;
            }
            sentryThread.setCurrent(Boolean.valueOf(z10));
        }
        sentryThread.setStacktrace(parseStacktrace(lines, sentryThread));
        return sentryThread;
    }

    public List<DebugImage> getDebugImages() {
        return new ArrayList(this.debugImages.values());
    }

    public List<SentryThread> getThreads() {
        return this.threads;
    }

    public void parse(Lines lines) {
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        while (lines.hasNext()) {
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = next.text;
            if (matches(matcher, str) || matches(matcher2, str)) {
                lines.rewind();
                SentryThread thread = parseThread(lines);
                if (thread != null) {
                    this.threads.add(thread);
                }
            }
        }
    }
}
