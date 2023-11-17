package com.example.emulador_relogio.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.wear.compose.material.MaterialTheme;
import androidx.wear.compose.material.TextKt;
import com.example.emulador_relogio.R.string;
import com.example.emulador_relogio.presentation.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 8, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\b"},
        d2 = {"DefaultPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "Greeting", "greetingName", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "WearApp", "app_debug"}
)
public final class MainActivityKt {
    @Composable
    @ComposableTarget(
            applier = "androidx.compose.ui.UiComposable"
    )
    public static final void WearApp(@NotNull final String greetingName, @Nullable Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(greetingName, "greetingName");
        $composer = $composer.startRestartGroup(-1233001061);
        ComposerKt.sourceInformation($composer, "C(WearApp)38@1506L544:MainActivity.kt#dsbsyi");
        final int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty = $changed | ($composer.changed(greetingName) ? 4 : 2);
        }

        if (($dirty & 11) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1233001061, $dirty, -1, "com.example.emulador_relogio.presentation.WearApp (MainActivity.kt:37)");
            }

            ThemeKt.Emulador_relogioTheme((Function2) ComposableLambdaKt.composableLambda($composer, -1107326662, true, new Function2() {
                @Composable
                @ComposableTarget(
                        applier = "androidx.compose.ui.UiComposable"
                )
                public final void invoke(@Nullable Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C46@1900L6,43@1787L257:MainActivity.kt#dsbsyi");
                    if (($changed & 11) == 2 && $composer.getSkipping()) {
                        $composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1107326662, $changed, -1, "com.example.emulador_relogio.presentation.WearApp.<anonymous> (MainActivity.kt:38)");
                        }

                        Modifier modifier$iv = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default((Modifier)Modifier.Companion, 0.0F, 1, (Object)null), MaterialTheme.INSTANCE.getColors($composer, MaterialTheme.$stable).getBackground-0d7_KjU(), (Shape)null, 2, (Object)null);
                        Arrangement.Vertical verticalArrangement$iv = (Arrangement.Vertical)Arrangement.INSTANCE.getCenter();
                        String var6 = greetingName;
                        int var7 = $dirty;
                        int $changed$ivx = 48;
                        int $i$f$Column = false;
                        $composer.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation($composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
                        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 14 & $changed$ivx >> 3 | 112 & $changed$ivx >> 3);
                        int $changed$iv$iv = 112 & $changed$ivx << 3;
                        int $i$f$Layout = false;
                        $composer.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation($composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        CompositionLocal this_$iv$iv$ivxx = (CompositionLocal) CompositionLocalsKt.getLocalDensity();
                        int $changed$iv$iv$ivx = true;
                        int $changed$iv$iv$ivxx = false;
                        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object var16 = $composer.consume(this_$iv$iv$ivxx);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Density density$iv$iv = (Density)var16;
                        CompositionLocal this_$iv$iv$iv = (CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection();
                        $changed$iv$iv$ivxx = true;
                        int $changed$iv$iv$iv = false;
                        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object var18 = $composer.consume(this_$iv$iv$iv);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        LayoutDirection layoutDirection$iv$iv = (LayoutDirection)var18;
                        CompositionLocal this_$iv$iv$ivx = (CompositionLocal)CompositionLocalsKt.getLocalViewConfiguration();
                        $changed$iv$iv$iv = true;
                        int $i$f$getCurrent = false;
                        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object var19 = $composer.consume(this_$iv$iv$ivx);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration)var19;
                        Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
                        Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
                        int $changed$iv$iv$ivxxx = 6 | 7168 & $changed$iv$iv << 9;
                        int $i$f$ReusableComposeNode = false;
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }

                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                            $composer.createNode(factory$iv$iv$iv);
                        } else {
                            $composer.useNode();
                        }

                        $composer.disableReusing();
                        Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.constructor-impl($composer);
                        int var21 = false;
                        Updater.set-impl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, ComposeUiNode.Companion.getSetDensity());
                        Updater.set-impl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.set-impl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, ComposeUiNode.Companion.getSetViewConfiguration());
                        $composer.enableReusing();
                        skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl($composer)), $composer, 112 & $changed$iv$iv$ivxxx >> 3);
                        $composer.startReplaceableGroup(2058660585);
                        int $changed$iv = 14 & $changed$iv$iv$ivxxx >> 9;
                        int var24 = false;
                        ComposerKt.sourceInformationMarkerStart($composer, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                        int var25 = 6 | 112 & $changed$ivx >> 6;
                        ColumnScope var10000 = (ColumnScope) ColumnScopeInstance.INSTANCE;
                        int var28 = false;
                        ComposerKt.sourceInformationMarkerStart($composer, 1562392289, "C49@1997L37:MainActivity.kt#dsbsyi");
                        MainActivityKt.Greeting(var6, $composer, 14 & var7);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceableGroup();
                        $composer.endNode();
                        $composer.endReplaceableGroup();
                        $composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                }

                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object p1, Object p2) {
                    this.invoke((Composer)p1, ((Number)p2).intValue());
                    return Unit.INSTANCE;
                }
            }), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        ScopeUpdateScope var10000 = $composer.endRestartGroup();
        if (var10000 != null) {
            var10000.updateScope((Function2)(new Function2() {
                public final void invoke(@Nullable Composer $composer, int $force) {
                    MainActivityKt.WearApp(greetingName, $composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }

                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object p1, Object p2) {
                    this.invoke((Composer)p1, ((Number)p2).intValue());
                    return Unit.INSTANCE;
                }
            }));
        }

    }

    @Composable
    @ComposableTarget(
            applier = "androidx.compose.ui.UiComposable"
    )
    public static final void Greeting(@NotNull final String greetingName, @Nullable Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(greetingName, "greetingName");
        $composer = $composer.startRestartGroup(1478512648);
        ComposerKt.sourceInformation($composer, "C(Greeting)59@2225L6,60@2256L50,56@2107L205:MainActivity.kt#dsbsyi");
        int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty = $changed | ($composer.changed(greetingName) ? 4 : 2);
        }

        if (($dirty & 11) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478512648, $changed, -1, "com.example.emulador_relogio.presentation.Greeting (MainActivity.kt:55)");
            }

            Modifier var4 = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, (Object)null);
            int var5 = TextAlign.Companion.getCenter-e0LSkKk();
            long var6 = MaterialTheme.INSTANCE.getColors($composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            int var10000 = string.hello_world;
            Object[] var8 = new Object[]{greetingName};
            TextKt.Text-fLXpl1I(StringResources_androidKt.stringResource(var10000, var8, $composer, 64), var4, var6, 0L, (FontStyle)null, (FontWeight)null, (FontFamily)null, 0L, (TextDecoration)null, TextAlign.box-impl(var5), 0L, 0, false, 0, (Function1)null, (TextStyle)null, $composer, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        ScopeUpdateScope var9 = $composer.endRestartGroup();
        if (var9 != null) {
            var9.updateScope((Function2)(new Function2() {
                public final void invoke(@Nullable Composer $composer, int $force) {
                    MainActivityKt.Greeting(greetingName, $composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }

                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object p1, Object p2) {
                    this.invoke((Composer)p1, ((Number)p2).intValue());
                    return Unit.INSTANCE;
                }
            }));
        }

    }

    @Preview(
            showSystemUi = true,
            device = "id:wearos_small_round"
    )
    @Composable
    @ComposableTarget(
            applier = "androidx.compose.ui.UiComposable"
    )
    public static final void DefaultPreview(@Nullable Composer $composer, final int $changed) {
        $composer = $composer.startRestartGroup(1188784585);
        ComposerKt.sourceInformation($composer, "C(DefaultPreview)67@2423L26:MainActivity.kt#dsbsyi");
        if ($changed == 0 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1188784585, $changed, -1, "com.example.emulador_relogio.presentation.DefaultPreview (MainActivity.kt:66)");
            }

            WearApp(com.example.emulador_relogio.presentation.LiveLiterals.MainActivityKt.INSTANCE.String$arg-0$call-WearApp$fun-DefaultPreview(), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        ScopeUpdateScope var10000 = $composer.endRestartGroup();
        if (var10000 != null) {
            var10000.updateScope((Function2)(new Function2() {
                public final void invoke(@Nullable Composer $composer, int $force) {
                    MainActivityKt.DefaultPreview($composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }

                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object p1, Object p2) {
                    this.invoke((Composer)p1, ((Number)p2).intValue());
                    return Unit.INSTANCE;
                }
            }));
        }

    }
}
