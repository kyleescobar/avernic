public class class193 extends class201 {
   static int field2187 = 0;
   static int[] field2163;
   static int[] field2185 = new int[10000];
   static int[] field2186 = new int[10000];
   static int[] field2188;
   boolean field2179 = false;
   byte field2164 = 0;
   byte[] field2159;
   byte[] field2160;
   byte[] field2166;
   byte[] field2169;
   byte[] field2174;
   class202[] field2189;
   class209[] field2152;
   class209[] field2176;
   int field2154 = 0;
   int field2162;
   int field2165;
   int field2177 = 0;
   int field2180;
   int field2181;
   int field2182;
   int field2183;
   int[] field2150;
   int[] field2151;
   int[] field2153;
   int[] field2155;
   int[] field2156;
   int[] field2157;
   int[] field2170;
   int[] field2171;
   int[][] field2172;
   int[][] field2173;
   short[] field2158;
   short[] field2161;
   short[] field2167;
   short[] field2168;
   short[] field2184;
   public short field2175;
   public short field2178;

   static {
      field2188 = Rasterizer3D.sineTable;
      field2163 = Rasterizer3D.cosineTable;
   }

   class193() {
   }

   public static class193 method3316(class277 var0, int var1, int var2) {
      byte[] var3 = var0.method4412(var1, var2);
      return var3 == null ? null : new class193(var3);
   }

   class193(byte[] var1) {
      if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3331(var1);
      } else {
         this.method3318(var1);
      }

   }

   void method3331(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = var1.length - 23;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedShort();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2166 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2166[var26] = var2.readByte();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2177 = var9;
      this.field2154 = var10;
      this.field2165 = var11;
      this.field2151 = new int[var9];
      this.field2150 = new int[var9];
      this.field2153 = new int[var9];
      this.field2155 = new int[var10];
      this.field2156 = new int[var10];
      this.field2157 = new int[var10];
      if (var17 == 1) {
         this.field2170 = new int[var9];
      }

      if (var12 == 1) {
         this.field2174 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2169 = new byte[var10];
      } else {
         this.field2164 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2160 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2171 = new int[var10];
      }

      if (var16 == 1) {
         this.field2158 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2159 = new byte[var10];
      }

      this.field2184 = new short[var10];
      if (var11 > 0) {
         this.field2167 = new short[var11];
         this.field2168 = new short[var11];
         this.field2161 = new short[var11];
      }

      var2.offset = var11;
      var3.offset = var38;
      var4.offset = var39;
      var5.offset = var40;
      var6.offset = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method5961();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method5961();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method5961();
         }

         this.field2151[var51] = var48 + var53;
         this.field2150[var51] = var49 + var54;
         this.field2153[var51] = var50 + var55;
         var48 = this.field2151[var51];
         var49 = this.field2150[var51];
         var50 = this.field2153[var51];
         if (var17 == 1) {
            this.field2170[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37;
      var3.offset = var28;
      var4.offset = var30;
      var5.offset = var33;
      var6.offset = var31;
      var7.offset = var35;
      var8.offset = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2184[var51] = (short)var2.readUnsignedShort();
         if (var12 == 1) {
            this.field2174[var51] = var3.readByte();
         }

         if (var13 == 255) {
            this.field2169[var51] = var4.readByte();
         }

         if (var14 == 1) {
            this.field2160[var51] = var5.readByte();
         }

         if (var15 == 1) {
            this.field2171[var51] = var6.readUnsignedByte();
         }

         if (var16 == 1) {
            this.field2158[var51] = (short)(var7.readUnsignedShort() - 1);
         }

         if (this.field2159 != null && this.field2158[var51] != -1) {
            this.field2159[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34;
      var3.offset = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if (var56 == 1) {
            var51 = var2.method5961() + var54;
            var52 = var2.method5961() + var51;
            var53 = var2.method5961() + var52;
            var54 = var53;
            this.field2155[var55] = var51;
            this.field2156[var55] = var52;
            this.field2157[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method5961() + var54;
            var54 = var53;
            this.field2155[var55] = var51;
            this.field2156[var55] = var52;
            this.field2157[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method5961() + var54;
            var54 = var53;
            this.field2155[var55] = var51;
            this.field2156[var55] = var52;
            this.field2157[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method5961() + var54;
            var54 = var53;
            this.field2155[var55] = var51;
            this.field2156[var55] = var57;
            this.field2157[var55] = var53;
         }
      }

      var2.offset = var41;
      var3.offset = var42;
      var4.offset = var43;
      var5.offset = var44;
      var6.offset = var45;
      var7.offset = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2166[var55] & 255;
         if (var56 == 0) {
            this.field2167[var55] = (short)var2.readUnsignedShort();
            this.field2168[var55] = (short)var2.readUnsignedShort();
            this.field2161[var55] = (short)var2.readUnsignedShort();
         }
      }

      var2.offset = var26;
      var55 = var2.readUnsignedByte();
      if (var55 != 0) {
         new class211();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readInt();
      }

   }

   void method3318(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = var1.length - 18;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedShort();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field2177 = var9;
      this.field2154 = var10;
      this.field2165 = var11;
      this.field2151 = new int[var9];
      this.field2150 = new int[var9];
      this.field2153 = new int[var9];
      this.field2155 = new int[var10];
      this.field2156 = new int[var10];
      this.field2157 = new int[var10];
      if (var11 > 0) {
         this.field2166 = new byte[var11];
         this.field2167 = new short[var11];
         this.field2168 = new short[var11];
         this.field2161 = new short[var11];
      }

      if (var16 == 1) {
         this.field2170 = new int[var9];
      }

      if (var12 == 1) {
         this.field2174 = new byte[var10];
         this.field2159 = new byte[var10];
         this.field2158 = new short[var10];
      }

      if (var13 == 255) {
         this.field2169 = new byte[var10];
      } else {
         this.field2164 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2160 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2171 = new int[var10];
      }

      this.field2184 = new short[var10];
      var4.offset = var21;
      var5.offset = var32;
      var6.offset = var33;
      var7.offset = var45;
      var8.offset = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method5961();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method5961();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method5961();
         }

         this.field2151[var38] = var35 + var40;
         this.field2150[var38] = var36 + var41;
         this.field2153[var38] = var37 + var42;
         var35 = this.field2151[var38];
         var36 = this.field2150[var38];
         var37 = this.field2153[var38];
         if (var16 == 1) {
            this.field2170[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30;
      var5.offset = var26;
      var6.offset = var24;
      var7.offset = var28;
      var8.offset = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2184[var38] = (short)var4.readUnsignedShort();
         if (var12 == 1) {
            var39 = var5.readUnsignedByte();
            if ((var39 & 1) == 1) {
               this.field2174[var38] = 1;
               var2 = true;
            } else {
               this.field2174[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2159[var38] = (byte)(var39 >> 2);
               this.field2158[var38] = this.field2184[var38];
               this.field2184[var38] = 127;
               if (this.field2158[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2159[var38] = -1;
               this.field2158[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2169[var38] = var6.readByte();
         }

         if (var14 == 1) {
            this.field2160[var38] = var7.readByte();
         }

         if (var15 == 1) {
            this.field2171[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29;
      var5.offset = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if (var43 == 1) {
            var38 = var4.method5961() + var41;
            var39 = var4.method5961() + var38;
            var40 = var4.method5961() + var39;
            var41 = var40;
            this.field2155[var42] = var38;
            this.field2156[var42] = var39;
            this.field2157[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method5961() + var41;
            var41 = var40;
            this.field2155[var42] = var38;
            this.field2156[var42] = var39;
            this.field2157[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method5961() + var41;
            var41 = var40;
            this.field2155[var42] = var38;
            this.field2156[var42] = var39;
            this.field2157[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method5961() + var41;
            var41 = var40;
            this.field2155[var42] = var38;
            this.field2156[var42] = var44;
            this.field2157[var42] = var40;
         }
      }

      var4.offset = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2166[var42] = 0;
         this.field2167[var42] = (short)var4.readUnsignedShort();
         this.field2168[var42] = (short)var4.readUnsignedShort();
         this.field2161[var42] = (short)var4.readUnsignedShort();
      }

      if (this.field2159 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2159[var43] & 255;
            if (var44 != 255) {
               if ((this.field2167[var44] & '\uffff') == this.field2155[var43] && (this.field2168[var44] & '\uffff') == this.field2156[var43] && (this.field2161[var44] & '\uffff') == this.field2157[var43]) {
                  this.field2159[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.field2159 = null;
         }
      }

      if (!var3) {
         this.field2158 = null;
      }

      if (!var2) {
         this.field2174 = null;
      }

   }

   public class193(class193[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field2177 = 0;
      this.field2154 = 0;
      this.field2165 = 0;
      this.field2164 = -1;

      int var9;
      class193 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            this.field2177 += var10.field2177;
            this.field2154 += var10.field2154;
            this.field2165 += var10.field2165;
            if (var10.field2169 != null) {
               var4 = true;
            } else {
               if (this.field2164 == -1) {
                  this.field2164 = var10.field2164;
               }

               if (this.field2164 != var10.field2164) {
                  var4 = true;
               }
            }

            var3 |= var10.field2174 != null;
            var5 |= var10.field2160 != null;
            var6 |= var10.field2171 != null;
            var7 |= var10.field2158 != null;
            var8 |= var10.field2159 != null;
         }
      }

      this.field2151 = new int[this.field2177];
      this.field2150 = new int[this.field2177];
      this.field2153 = new int[this.field2177];
      this.field2170 = new int[this.field2177];
      this.field2155 = new int[this.field2154];
      this.field2156 = new int[this.field2154];
      this.field2157 = new int[this.field2154];
      if (var3) {
         this.field2174 = new byte[this.field2154];
      }

      if (var4) {
         this.field2169 = new byte[this.field2154];
      }

      if (var5) {
         this.field2160 = new byte[this.field2154];
      }

      if (var6) {
         this.field2171 = new int[this.field2154];
      }

      if (var7) {
         this.field2158 = new short[this.field2154];
      }

      if (var8) {
         this.field2159 = new byte[this.field2154];
      }

      this.field2184 = new short[this.field2154];
      if (this.field2165 > 0) {
         this.field2166 = new byte[this.field2165];
         this.field2167 = new short[this.field2165];
         this.field2168 = new short[this.field2165];
         this.field2161 = new short[this.field2165];
      }

      this.field2177 = 0;
      this.field2154 = 0;
      this.field2165 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field2154; ++var11) {
               if (var3 && var10.field2174 != null) {
                  this.field2174[this.field2154] = var10.field2174[var11];
               }

               if (var4) {
                  if (var10.field2169 != null) {
                     this.field2169[this.field2154] = var10.field2169[var11];
                  } else {
                     this.field2169[this.field2154] = var10.field2164;
                  }
               }

               if (var5 && var10.field2160 != null) {
                  this.field2160[this.field2154] = var10.field2160[var11];
               }

               if (var6 && var10.field2171 != null) {
                  this.field2171[this.field2154] = var10.field2171[var11];
               }

               if (var7) {
                  if (var10.field2158 != null) {
                     this.field2158[this.field2154] = var10.field2158[var11];
                  } else {
                     this.field2158[this.field2154] = -1;
                  }
               }

               if (var8) {
                  if (var10.field2159 != null && var10.field2159[var11] != -1) {
                     this.field2159[this.field2154] = (byte)(var10.field2159[var11] + this.field2165);
                  } else {
                     this.field2159[this.field2154] = -1;
                  }
               }

               this.field2184[this.field2154] = var10.field2184[var11];
               this.field2155[this.field2154] = this.method3354(var10, var10.field2155[var11]);
               this.field2156[this.field2154] = this.method3354(var10, var10.field2156[var11]);
               this.field2157[this.field2154] = this.method3354(var10, var10.field2157[var11]);
               ++this.field2154;
            }

            for(var11 = 0; var11 < var10.field2165; ++var11) {
               byte var12 = this.field2166[this.field2165] = var10.field2166[var11];
               if (var12 == 0) {
                  this.field2167[this.field2165] = (short)this.method3354(var10, var10.field2167[var11]);
                  this.field2168[this.field2165] = (short)this.method3354(var10, var10.field2168[var11]);
                  this.field2161[this.field2165] = (short)this.method3354(var10, var10.field2161[var11]);
               }

               ++this.field2165;
            }
         }
      }

   }

   final int method3354(class193 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2151[var2];
      int var5 = var1.field2150[var2];
      int var6 = var1.field2153[var2];

      for(int var7 = 0; var7 < this.field2177; ++var7) {
         if (var4 == this.field2151[var7] && var5 == this.field2150[var7] && var6 == this.field2153[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2151[this.field2177] = var4;
         this.field2150[this.field2177] = var5;
         this.field2153[this.field2177] = var6;
         if (var1.field2170 != null) {
            this.field2170[this.field2177] = var1.field2170[var2];
         }

         var3 = this.field2177++;
      }

      return var3;
   }

   public class193(class193 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2177 = var1.field2177;
      this.field2154 = var1.field2154;
      this.field2165 = var1.field2165;
      int var6;
      if (var2) {
         this.field2151 = var1.field2151;
         this.field2150 = var1.field2150;
         this.field2153 = var1.field2153;
      } else {
         this.field2151 = new int[this.field2177];
         this.field2150 = new int[this.field2177];
         this.field2153 = new int[this.field2177];

         for(var6 = 0; var6 < this.field2177; ++var6) {
            this.field2151[var6] = var1.field2151[var6];
            this.field2150[var6] = var1.field2150[var6];
            this.field2153[var6] = var1.field2153[var6];
         }
      }

      if (var3) {
         this.field2184 = var1.field2184;
      } else {
         this.field2184 = new short[this.field2154];

         for(var6 = 0; var6 < this.field2154; ++var6) {
            this.field2184[var6] = var1.field2184[var6];
         }
      }

      if (!var4 && var1.field2158 != null) {
         this.field2158 = new short[this.field2154];

         for(var6 = 0; var6 < this.field2154; ++var6) {
            this.field2158[var6] = var1.field2158[var6];
         }
      } else {
         this.field2158 = var1.field2158;
      }

      if (var5) {
         this.field2160 = var1.field2160;
      } else {
         this.field2160 = new byte[this.field2154];
         if (var1.field2160 == null) {
            for(var6 = 0; var6 < this.field2154; ++var6) {
               this.field2160[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field2154; ++var6) {
               this.field2160[var6] = var1.field2160[var6];
            }
         }
      }

      this.field2155 = var1.field2155;
      this.field2156 = var1.field2156;
      this.field2157 = var1.field2157;
      this.field2174 = var1.field2174;
      this.field2169 = var1.field2169;
      this.field2159 = var1.field2159;
      this.field2164 = var1.field2164;
      this.field2166 = var1.field2166;
      this.field2167 = var1.field2167;
      this.field2168 = var1.field2168;
      this.field2161 = var1.field2161;
      this.field2170 = var1.field2170;
      this.field2171 = var1.field2171;
      this.field2172 = var1.field2172;
      this.field2173 = var1.field2173;
      this.field2152 = var1.field2152;
      this.field2189 = var1.field2189;
      this.field2176 = var1.field2176;
      this.field2175 = var1.field2175;
      this.field2178 = var1.field2178;
   }

   public class193 method3320() {
      class193 var1 = new class193();
      if (this.field2174 != null) {
         var1.field2174 = new byte[this.field2154];

         for(int var2 = 0; var2 < this.field2154; ++var2) {
            var1.field2174[var2] = this.field2174[var2];
         }
      }

      var1.field2177 = this.field2177;
      var1.field2154 = this.field2154;
      var1.field2165 = this.field2165;
      var1.field2151 = this.field2151;
      var1.field2150 = this.field2150;
      var1.field2153 = this.field2153;
      var1.field2155 = this.field2155;
      var1.field2156 = this.field2156;
      var1.field2157 = this.field2157;
      var1.field2169 = this.field2169;
      var1.field2160 = this.field2160;
      var1.field2159 = this.field2159;
      var1.field2184 = this.field2184;
      var1.field2158 = this.field2158;
      var1.field2164 = this.field2164;
      var1.field2166 = this.field2166;
      var1.field2167 = this.field2167;
      var1.field2168 = this.field2168;
      var1.field2161 = this.field2161;
      var1.field2170 = this.field2170;
      var1.field2171 = this.field2171;
      var1.field2172 = this.field2172;
      var1.field2173 = this.field2173;
      var1.field2152 = this.field2152;
      var1.field2189 = this.field2189;
      var1.field2175 = this.field2175;
      var1.field2178 = this.field2178;
      return var1;
   }

   public class193 method3321(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3349();
      int var7 = var2 + this.field2181;
      int var8 = var2 + this.field2182;
      int var9 = var4 + this.field2183;
      int var10 = var4 + this.field2162;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class193 var11;
            if (var5) {
               var11 = new class193();
               var11.field2177 = this.field2177;
               var11.field2154 = this.field2154;
               var11.field2165 = this.field2165;
               var11.field2151 = this.field2151;
               var11.field2153 = this.field2153;
               var11.field2155 = this.field2155;
               var11.field2156 = this.field2156;
               var11.field2157 = this.field2157;
               var11.field2174 = this.field2174;
               var11.field2169 = this.field2169;
               var11.field2160 = this.field2160;
               var11.field2159 = this.field2159;
               var11.field2184 = this.field2184;
               var11.field2158 = this.field2158;
               var11.field2164 = this.field2164;
               var11.field2166 = this.field2166;
               var11.field2167 = this.field2167;
               var11.field2168 = this.field2168;
               var11.field2161 = this.field2161;
               var11.field2170 = this.field2170;
               var11.field2171 = this.field2171;
               var11.field2172 = this.field2172;
               var11.field2173 = this.field2173;
               var11.field2175 = this.field2175;
               var11.field2178 = this.field2178;
               var11.field2150 = new int[var11.field2177];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2177; ++var12) {
                  var13 = this.field2151[var12] + var2;
                  var14 = this.field2153[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2150[var12] = this.field2150[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2177; ++var12) {
                  var13 = (-this.field2150[var12] << 16) / super.field2346;
                  if (var13 < var6) {
                     var14 = this.field2151[var12] + var2;
                     var15 = this.field2153[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2150[var12] = this.field2150[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method3333();
            return var11;
         }
      } else {
         return this;
      }
   }

   void method3322() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field2170 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2177; ++var3) {
            var4 = this.field2170[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2172 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2172[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2177; this.field2172[var4][var1[var4]++] = var3++) {
            var4 = this.field2170[var3];
         }

         this.field2170 = null;
      }

      if (this.field2171 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2154; ++var3) {
            var4 = this.field2171[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2173 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2173[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2154; this.field2173[var4][var1[var4]++] = var3++) {
            var4 = this.field2171[var3];
         }

         this.field2171 = null;
      }

   }

   public void method3315() {
      for(int var1 = 0; var1 < this.field2177; ++var1) {
         int var2 = this.field2151[var1];
         this.field2151[var1] = this.field2153[var1];
         this.field2153[var1] = -var2;
      }

      this.method3333();
   }

   public void method3324() {
      for(int var1 = 0; var1 < this.field2177; ++var1) {
         this.field2151[var1] = -this.field2151[var1];
         this.field2153[var1] = -this.field2153[var1];
      }

      this.method3333();
   }

   public void method3325() {
      for(int var1 = 0; var1 < this.field2177; ++var1) {
         int var2 = this.field2153[var1];
         this.field2153[var1] = this.field2151[var1];
         this.field2151[var1] = -var2;
      }

      this.method3333();
   }

   public void method3379(int var1) {
      int var2 = field2188[var1];
      int var3 = field2163[var1];

      for(int var4 = 0; var4 < this.field2177; ++var4) {
         int var5 = this.field2153[var4] * var2 + this.field2151[var4] * var3 >> 16;
         this.field2153[var4] = this.field2153[var4] * var3 - this.field2151[var4] * var2 >> 16;
         this.field2151[var4] = var5;
      }

      this.method3333();
   }

   public void method3327(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2177; ++var4) {
         int[] var10000 = this.field2151;
         var10000[var4] += var1;
         var10000 = this.field2150;
         var10000[var4] += var2;
         var10000 = this.field2153;
         var10000[var4] += var3;
      }

      this.method3333();
   }

   public void method3362(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2154; ++var3) {
         if (this.field2184[var3] == var1) {
            this.field2184[var3] = var2;
         }
      }

   }

   public void method3329(short var1, short var2) {
      if (this.field2158 != null) {
         for(int var3 = 0; var3 < this.field2154; ++var3) {
            if (this.field2158[var3] == var1) {
               this.field2158[var3] = var2;
            }
         }

      }
   }

   public void method3330() {
      int var1;
      for(var1 = 0; var1 < this.field2177; ++var1) {
         this.field2153[var1] = -this.field2153[var1];
      }

      for(var1 = 0; var1 < this.field2154; ++var1) {
         int var2 = this.field2155[var1];
         this.field2155[var1] = this.field2157[var1];
         this.field2157[var1] = var2;
      }

      this.method3333();
   }

   public void method3368(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2177; ++var4) {
         this.field2151[var4] = this.field2151[var4] * var1 / 128;
         this.field2150[var4] = this.field2150[var4] * var2 / 128;
         this.field2153[var4] = this.field2153[var4] * var3 / 128;
      }

      this.method3333();
   }

   public void method3332() {
      if (this.field2152 == null) {
         this.field2152 = new class209[this.field2177];

         int var1;
         for(var1 = 0; var1 < this.field2177; ++var1) {
            this.field2152[var1] = new class209();
         }

         for(var1 = 0; var1 < this.field2154; ++var1) {
            int var2 = this.field2155[var1];
            int var3 = this.field2156[var1];
            int var4 = this.field2157[var1];
            int var5 = this.field2151[var3] - this.field2151[var2];
            int var6 = this.field2150[var3] - this.field2150[var2];
            int var7 = this.field2153[var3] - this.field2153[var2];
            int var8 = this.field2151[var4] - this.field2151[var2];
            int var9 = this.field2150[var4] - this.field2150[var2];
            int var10 = this.field2153[var4] - this.field2153[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2174 == null) {
               var15 = 0;
            } else {
               var15 = this.field2174[var1];
            }

            if (var15 == 0) {
               class209 var16 = this.field2152[var2];
               var16.field2496 += var11;
               var16.field2494 += var12;
               var16.field2495 += var13;
               ++var16.field2493;
               var16 = this.field2152[var3];
               var16.field2496 += var11;
               var16.field2494 += var12;
               var16.field2495 += var13;
               ++var16.field2493;
               var16 = this.field2152[var4];
               var16.field2496 += var11;
               var16.field2494 += var12;
               var16.field2495 += var13;
               ++var16.field2493;
            } else if (var15 == 1) {
               if (this.field2189 == null) {
                  this.field2189 = new class202[this.field2154];
               }

               class202 var17 = this.field2189[var1] = new class202();
               var17.field2347 = var11;
               var17.field2348 = var12;
               var17.field2349 = var13;
            }
         }

      }
   }

   void method3333() {
      this.field2152 = null;
      this.field2176 = null;
      this.field2189 = null;
      this.field2179 = false;
   }

   void method3349() {
      if (!this.field2179) {
         super.field2346 = 0;
         this.field2180 = 0;
         this.field2181 = 999999;
         this.field2182 = -999999;
         this.field2162 = -99999;
         this.field2183 = 99999;

         for(int var1 = 0; var1 < this.field2177; ++var1) {
            int var2 = this.field2151[var1];
            int var3 = this.field2150[var1];
            int var4 = this.field2153[var1];
            if (var2 < this.field2181) {
               this.field2181 = var2;
            }

            if (var2 > this.field2182) {
               this.field2182 = var2;
            }

            if (var4 < this.field2183) {
               this.field2183 = var4;
            }

            if (var4 > this.field2162) {
               this.field2162 = var4;
            }

            if (-var3 > super.field2346) {
               super.field2346 = -var3;
            }

            if (var3 > this.field2180) {
               this.field2180 = var3;
            }
         }

         this.field2179 = true;
      }
   }

   static void method3335(class193 var0, class193 var1, int var2, int var3, int var4, boolean var5) {
      var0.method3349();
      var0.method3332();
      var1.method3349();
      var1.method3332();
      ++field2187;
      int var6 = 0;
      int[] var7 = var1.field2151;
      int var8 = var1.field2177;

      int var9;
      for(var9 = 0; var9 < var0.field2177; ++var9) {
         class209 var10 = var0.field2152[var9];
         if (var10.field2493 != 0) {
            int var11 = var0.field2150[var9] - var3;
            if (var11 <= var1.field2180) {
               int var12 = var0.field2151[var9] - var2;
               if (var12 >= var1.field2181 && var12 <= var1.field2182) {
                  int var13 = var0.field2153[var9] - var4;
                  if (var13 >= var1.field2183 && var13 <= var1.field2162) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class209 var15 = var1.field2152[var14];
                        if (var12 == var7[var14] && var13 == var1.field2153[var14] && var11 == var1.field2150[var14] && var15.field2493 != 0) {
                           if (var0.field2176 == null) {
                              var0.field2176 = new class209[var0.field2177];
                           }

                           if (var1.field2176 == null) {
                              var1.field2176 = new class209[var8];
                           }

                           class209 var16 = var0.field2176[var9];
                           if (var16 == null) {
                              var16 = var0.field2176[var9] = new class209(var10);
                           }

                           class209 var17 = var1.field2176[var14];
                           if (var17 == null) {
                              var17 = var1.field2176[var14] = new class209(var15);
                           }

                           var16.field2496 += var15.field2496;
                           var16.field2494 += var15.field2494;
                           var16.field2495 += var15.field2495;
                           var16.field2493 += var15.field2493;
                           var17.field2496 += var10.field2496;
                           var17.field2494 += var10.field2494;
                           var17.field2495 += var10.field2495;
                           var17.field2493 += var10.field2493;
                           ++var6;
                           field2185[var9] = field2187;
                           field2186[var14] = field2187;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2154; ++var9) {
            if (field2185[var0.field2155[var9]] == field2187 && field2185[var0.field2156[var9]] == field2187 && field2185[var0.field2157[var9]] == field2187) {
               if (var0.field2174 == null) {
                  var0.field2174 = new byte[var0.field2154];
               }

               var0.field2174[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2154; ++var9) {
            if (field2186[var1.field2155[var9]] == field2187 && field2186[var1.field2156[var9]] == field2187 && field2186[var1.field2157[var9]] == field2187) {
               if (var1.field2174 == null) {
                  var1.field2174 = new byte[var1.field2154];
               }

               var1.field2174[var9] = 2;
            }
         }

      }
   }

   public final class207 method3336(int var1, int var2, int var3, int var4, int var5) {
      this.method3332();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class207 var8 = new class207();
      var8.field2409 = new int[this.field2154];
      var8.field2417 = new int[this.field2154];
      var8.field2418 = new int[this.field2154];
      if (this.field2165 > 0 && this.field2159 != null) {
         int[] var9 = new int[this.field2165];

         int var10;
         for(var10 = 0; var10 < this.field2154; ++var10) {
            if (this.field2159[var10] != -1) {
               ++var9[this.field2159[var10] & 255];
            }
         }

         var8.field2424 = 0;

         for(var10 = 0; var10 < this.field2165; ++var10) {
            if (var9[var10] > 0 && this.field2166[var10] == 0) {
               ++var8.field2424;
            }
         }

         var8.field2454 = new int[var8.field2424];
         var8.field2426 = new int[var8.field2424];
         var8.field2427 = new int[var8.field2424];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2165; ++var11) {
            if (var9[var11] > 0 && this.field2166[var11] == 0) {
               var8.field2454[var10] = this.field2167[var11] & '\uffff';
               var8.field2426[var10] = this.field2168[var11] & '\uffff';
               var8.field2427[var10] = this.field2161[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2441 = new byte[this.field2154];

         for(var11 = 0; var11 < this.field2154; ++var11) {
            if (this.field2159[var11] != -1) {
               var8.field2441[var11] = (byte)var9[this.field2159[var11] & 255];
            } else {
               var8.field2441[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2154; ++var16) {
         byte var17;
         if (this.field2174 == null) {
            var17 = 0;
         } else {
            var17 = this.field2174[var16];
         }

         byte var18;
         if (this.field2160 == null) {
            var18 = 0;
         } else {
            var18 = this.field2160[var16];
         }

         short var12;
         if (this.field2158 == null) {
            var12 = -1;
         } else {
            var12 = this.field2158[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class209 var13;
         int var14;
         class202 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2189[var16];
                  var14 = var1 + (var3 * var19.field2347 + var4 * var19.field2348 + var5 * var19.field2349) / (var7 + var7 / 2);
                  var8.field2409[var16] = method3361(this.field2184[var16] & '\uffff', var14);
                  var8.field2418[var16] = -1;
               } else if (var17 == 3) {
                  var8.field2409[var16] = 128;
                  var8.field2418[var16] = -1;
               } else {
                  var8.field2418[var16] = -2;
               }
            } else {
               int var15 = this.field2184[var16] & '\uffff';
               if (this.field2176 != null && this.field2176[this.field2155[var16]] != null) {
                  var13 = this.field2176[this.field2155[var16]];
               } else {
                  var13 = this.field2152[this.field2155[var16]];
               }

               var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
               var8.field2409[var16] = method3361(var15, var14);
               if (this.field2176 != null && this.field2176[this.field2156[var16]] != null) {
                  var13 = this.field2176[this.field2156[var16]];
               } else {
                  var13 = this.field2152[this.field2156[var16]];
               }

               var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
               var8.field2417[var16] = method3361(var15, var14);
               if (this.field2176 != null && this.field2176[this.field2157[var16]] != null) {
                  var13 = this.field2176[this.field2157[var16]];
               } else {
                  var13 = this.field2152[this.field2157[var16]];
               }

               var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
               var8.field2418[var16] = method3361(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2189[var16];
               var14 = var1 + (var3 * var19.field2347 + var4 * var19.field2348 + var5 * var19.field2349) / (var7 + var7 / 2);
               var8.field2409[var16] = method3338(var14);
               var8.field2418[var16] = -1;
            } else {
               var8.field2418[var16] = -2;
            }
         } else {
            if (this.field2176 != null && this.field2176[this.field2155[var16]] != null) {
               var13 = this.field2176[this.field2155[var16]];
            } else {
               var13 = this.field2152[this.field2155[var16]];
            }

            var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
            var8.field2409[var16] = method3338(var14);
            if (this.field2176 != null && this.field2176[this.field2156[var16]] != null) {
               var13 = this.field2176[this.field2156[var16]];
            } else {
               var13 = this.field2152[this.field2156[var16]];
            }

            var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
            var8.field2417[var16] = method3338(var14);
            if (this.field2176 != null && this.field2176[this.field2157[var16]] != null) {
               var13 = this.field2176[this.field2157[var16]];
            } else {
               var13 = this.field2152[this.field2157[var16]];
            }

            var14 = var1 + (var3 * var13.field2496 + var4 * var13.field2494 + var5 * var13.field2495) / (var7 * var13.field2493);
            var8.field2418[var16] = method3338(var14);
         }
      }

      this.method3322();
      var8.field2443 = this.field2177;
      var8.field2425 = this.field2151;
      var8.field2410 = this.field2150;
      var8.field2458 = this.field2153;
      var8.field2412 = this.field2154;
      var8.field2429 = this.field2155;
      var8.field2466 = this.field2156;
      var8.field2415 = this.field2157;
      var8.field2419 = this.field2169;
      var8.field2420 = this.field2160;
      var8.field2442 = this.field2164;
      var8.field2451 = this.field2172;
      var8.field2445 = this.field2173;
      var8.field2422 = this.field2158;
      return var8;
   }

   static final int method3361(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final int method3338(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
