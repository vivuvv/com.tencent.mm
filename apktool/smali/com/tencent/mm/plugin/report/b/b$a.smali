.class public final Lcom/tencent/mm/plugin/report/b/b$a;
.super Lcom/tencent/mm/protocal/h$c;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/protocal/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/plugin/report/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public fTP:Lcom/tencent/mm/protocal/b/aao;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/tencent/mm/protocal/h$c;-><init>()V

    .line 14
    new-instance v0, Lcom/tencent/mm/protocal/b/aao;

    invoke-direct {v0}, Lcom/tencent/mm/protocal/b/aao;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/plugin/report/b/b$a;->fTP:Lcom/tencent/mm/protocal/b/aao;

    return-void
.end method


# virtual methods
.method public final getCmdId()I
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    return v0
.end method

.method public final tY()[B
    .locals 3

    .prologue
    .line 19
    invoke-static {}, Lcom/tencent/mm/protocal/z;->aTw()Lcom/tencent/mm/protocal/z;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/protocal/h$c;->iUJ:Lcom/tencent/mm/protocal/z;

    .line 20
    iget-object v0, p0, Lcom/tencent/mm/plugin/report/b/b$a;->fTP:Lcom/tencent/mm/protocal/b/aao;

    new-instance v1, Lcom/tencent/mm/protocal/b/alx;

    invoke-direct {v1}, Lcom/tencent/mm/protocal/b/alx;-><init>()V

    invoke-static {}, Lcom/tencent/mm/sdk/platformtools/ay;->aVA()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/mm/protocal/b/alx;->aO([B)Lcom/tencent/mm/protocal/b/alx;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/mm/protocal/b/aao;->jbx:Lcom/tencent/mm/protocal/b/alx;

    .line 21
    iget-object v0, p0, Lcom/tencent/mm/plugin/report/b/b$a;->fTP:Lcom/tencent/mm/protocal/b/aao;

    invoke-static {p0}, Lcom/tencent/mm/protocal/h;->a(Lcom/tencent/mm/protocal/h$c;)Lcom/tencent/mm/protocal/b/dc;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/mm/protocal/b/ali;->jGS:Lcom/tencent/mm/protocal/b/dc;

    .line 22
    iget-object v0, p0, Lcom/tencent/mm/plugin/report/b/b$a;->fTP:Lcom/tencent/mm/protocal/b/aao;

    invoke-virtual {v0}, Lcom/tencent/mm/protocal/b/aao;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public final tZ()I
    .locals 1

    .prologue
    .line 27
    const/16 v0, 0x1f3

    return v0
.end method
