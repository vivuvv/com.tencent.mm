.class public final Lcom/tencent/mm/d/a/ev;
.super Lcom/tencent/mm/sdk/c/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/ev$b;,
        Lcom/tencent/mm/d/a/ev$a;
    }
.end annotation


# static fields
.field public static arQ:Z

.field public static arR:Z


# instance fields
.field public azx:Lcom/tencent/mm/d/a/ev$a;

.field public azy:Lcom/tencent/mm/d/a/ev$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/ev;->arQ:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/ev;->arR:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/b;-><init>()V

    .line 21
    new-instance v0, Lcom/tencent/mm/d/a/ev$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/ev$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/ev;->azx:Lcom/tencent/mm/d/a/ev$a;

    .line 26
    new-instance v0, Lcom/tencent/mm/d/a/ev$b;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/ev$b;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/ev;->azy:Lcom/tencent/mm/d/a/ev$b;

    .line 16
    const-string/jumbo v0, "GameOperation"

    iput-object v0, p0, Lcom/tencent/mm/d/a/ev;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/ev;->arR:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/ev;->jUI:Z

    return-void
.end method
