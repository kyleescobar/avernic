public class class356 extends class354 {
   static byte[][] regionMapArchives;
   boolean field3980;
   boolean field3993;
   int field3986;
   int field3989;
   int field3990;
   int field3991;
   int field3992;
   int field3996;
   int field3997;
   int field3998;
   int field4002;
   int field4003;
   int field4004;
   int field4005;
   int field4006;
   int field4009;
   int field4010;
   int[] field3999 = new int[3];
   String field3978;
   String field3987;
   String field3988;
   String field3994;
   String field4000;
   String field4001;
   String field4008;

   class356(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field3986 = var1;
      this.field3980 = var2;
      this.field3997 = var3;
      this.field3989 = var4;
      this.field3990 = var5;
      this.field3991 = var6;
      this.field3992 = var7;
      this.field3993 = var8;
      this.field4010 = var9;
      this.field3996 = var10;
      this.field4006 = var11;
      this.field3998 = var12;
      this.field3978 = var13;
      this.field3987 = var14;
      this.field4000 = var15;
      this.field4001 = var16;
      this.field4002 = var17;
      this.field4003 = var18;
      this.field4004 = var19;
      this.field4005 = var20;
      this.field3988 = var21;
      this.field4008 = var22;
      this.field3999 = var23;
      this.field4009 = var24;
      this.field3994 = var25;
   }

   public void write(Buffer var1) {
      var1.writeByte(8);
      var1.writeByte(this.field3986);
      var1.writeByte(this.field3980 ? 1 : 0);
      var1.writeShort(this.field3997);
      var1.writeByte(this.field3989);
      var1.writeByte(this.field3990);
      var1.writeByte(this.field3991);
      var1.writeByte(this.field3992);
      var1.writeByte(this.field3993 ? 1 : 0);
      var1.writeShort(this.field4010);
      var1.writeByte(this.field3996);
      var1.writeMedium(this.field4006);
      var1.writeShort(this.field3998);
      var1.writeJagStringCP1252(this.field3978);
      var1.writeJagStringCP1252(this.field3987);
      var1.writeJagStringCP1252(this.field4000);
      var1.writeJagStringCP1252(this.field4001);
      var1.writeByte(this.field4003);
      var1.writeShort(this.field4002);
      var1.writeJagStringCP1252(this.field3988);
      var1.writeJagStringCP1252(this.field4008);
      var1.writeByte(this.field4004);
      var1.writeByte(this.field4005);

      for(int var3 = 0; var3 < this.field3999.length; ++var3) {
         var1.writeInt(this.field3999[var3]);
      }

      var1.writeInt(this.field4009);
      var1.writeJagStringCP1252(this.field3994);
   }

   public int method5457() {
      byte var2 = 39;
      int var3 = var2 + class282.method4545(this.field3978);
      var3 += class282.method4545(this.field3987);
      var3 += class282.method4545(this.field4000);
      var3 += class282.method4545(this.field4001);
      var3 += class282.method4545(this.field3988);
      var3 += class282.method4545(this.field4008);
      var3 += class282.method4545(this.field3994);
      return var3;
   }
}
