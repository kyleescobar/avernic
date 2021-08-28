public class class115 {
   static int field1387;
   boolean field1361;
   boolean field1362;
   class363 field1385;
   int field1364 = 0;
   int field1365 = 0;
   int[] field1375;
   int[] field1376;
   long field1371;
   long[] field1366;
   long[] field1382;
   public boolean field1367;
   public boolean[] field1378;
   public byte field1360;
   public byte field1369;
   public byte field1370;
   public byte field1384;
   public byte[] field1374;
   public int field1372;
   public int field1379 = -1;
   public int field1380 = -1;
   public int field1381;
   public int[] field1377;
   public String field1368 = null;
   public String[] field1363;
   public String[] field1373;

   public class115(Buffer var1) {
      this.method2135(var1);
   }

   public static boolean method2183(int var0) {
      return var0 >= class258.field3149.field3163 && var0 <= class258.field3143.field3163 || class258.field3160.field3163 == var0;
   }

   void method2118(int var1) {
      if (this.field1361) {
         if (null != this.field1366) {
            System.arraycopy(this.field1366, 0, this.field1366 = new long[var1], 0, this.field1372);
         } else {
            this.field1366 = new long[var1];
         }
      }

      if (this.field1362) {
         if (null != this.field1373) {
            System.arraycopy(this.field1373, 0, this.field1373 = new String[var1], 0, this.field1372);
         } else {
            this.field1373 = new String[var1];
         }
      }

      if (this.field1374 != null) {
         System.arraycopy(this.field1374, 0, this.field1374 = new byte[var1], 0, this.field1372);
      } else {
         this.field1374 = new byte[var1];
      }

      if (this.field1376 != null) {
         System.arraycopy(this.field1376, 0, this.field1376 = new int[var1], 0, this.field1372);
      } else {
         this.field1376 = new int[var1];
      }

      if (this.field1377 != null) {
         System.arraycopy(this.field1377, 0, this.field1377 = new int[var1], 0, this.field1372);
      } else {
         this.field1377 = new int[var1];
      }

      if (null != this.field1378) {
         System.arraycopy(this.field1378, 0, this.field1378 = new boolean[var1], 0, this.field1372);
      } else {
         this.field1378 = new boolean[var1];
      }

   }

   void method2119(int var1) {
      if (this.field1361) {
         if (this.field1382 != null) {
            System.arraycopy(this.field1382, 0, this.field1382 = new long[var1], 0, this.field1381);
         } else {
            this.field1382 = new long[var1];
         }
      }

      if (this.field1362) {
         if (null != this.field1363) {
            System.arraycopy(this.field1363, 0, this.field1363 = new String[var1], 0, this.field1381);
         } else {
            this.field1363 = new String[var1];
         }
      }

   }

   public int method2120(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field1372; ++var3) {
            if (this.field1373[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method2138(int var1, int var2, int var3) {
      int var5 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1376[var1] & var5) >>> var2;
   }

   public Integer method2141(int var1) {
      if (this.field1385 == null) {
         return null;
      } else {
         class354 var3 = this.field1385.method5716((long)var1);
         return null != var3 && var3 instanceof class353 ? new Integer(((class353)var3).field3964) : null;
      }
   }

   public int[] method2122() {
      if (null == this.field1375) {
         String[] var2 = new String[this.field1372];
         this.field1375 = new int[this.field1372];

         for(int var3 = 0; var3 < this.field1372; this.field1375[var3] = var3++) {
            var2[var3] = this.field1373[var3];
            if (var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         class283.method4547(var2, this.field1375);
      }

      return this.field1375;
   }

   void method2124(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field1361) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field1362) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.field1366 || this.field1372 >= this.field1366.length) || var3 != null && (this.field1373 == null || this.field1372 >= this.field1373.length)) {
            this.method2118(5 + this.field1372);
         }

         if (null != this.field1366) {
            this.field1366[this.field1372] = var1;
         }

         if (null != this.field1373) {
            this.field1373[this.field1372] = var3;
         }

         if (this.field1379 == -1) {
            this.field1379 = this.field1372;
            this.field1374[this.field1372] = 126;
         } else {
            this.field1374[this.field1372] = 0;
         }

         this.field1376[this.field1372] = 0;
         this.field1377[this.field1372] = var4;
         this.field1378[this.field1372] = false;
         ++this.field1372;
         this.field1375 = null;
      }
   }

   void method2125(int var1) {
      if (var1 >= 0 && var1 < this.field1372) {
         --this.field1372;
         this.field1375 = null;
         if (0 == this.field1372) {
            this.field1366 = null;
            this.field1373 = null;
            this.field1374 = null;
            this.field1376 = null;
            this.field1377 = null;
            this.field1378 = null;
            this.field1379 = -1;
            this.field1380 = -1;
         } else {
            System.arraycopy(this.field1374, var1 + 1, this.field1374, var1, this.field1372 - var1);
            System.arraycopy(this.field1376, var1 + 1, this.field1376, var1, this.field1372 - var1);
            System.arraycopy(this.field1377, 1 + var1, this.field1377, var1, this.field1372 - var1);
            System.arraycopy(this.field1378, 1 + var1, this.field1378, var1, this.field1372 - var1);
            if (null != this.field1366) {
               System.arraycopy(this.field1366, var1 + 1, this.field1366, var1, this.field1372 - var1);
            }

            if (this.field1373 != null) {
               System.arraycopy(this.field1373, 1 + var1, this.field1373, var1, this.field1372 - var1);
            }

            this.method2126();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method2126() {
      if (this.field1372 == 0) {
         this.field1379 = -1;
         this.field1380 = -1;
      } else {
         this.field1379 = -1;
         this.field1380 = -1;
         int var2 = 0;
         byte var3 = this.field1374[0];

         for(int var4 = 1; var4 < this.field1372; ++var4) {
            if (this.field1374[var4] > var3) {
               if (125 == var3) {
                  this.field1380 = var2;
               }

               var2 = var4;
               var3 = this.field1374[var4];
            } else if (this.field1380 == -1 && this.field1374[var4] == 125) {
               this.field1380 = var4;
            }
         }

         this.field1379 = var2;
         if (this.field1379 != -1) {
            this.field1374[this.field1379] = 126;
         }

      }
   }

   void method2127(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field1361) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field1362) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field1382 == null || this.field1381 >= this.field1382.length) || null != var3 && (null == this.field1363 || this.field1381 >= this.field1363.length)) {
            this.method2119(this.field1381 + 5);
         }

         if (null != this.field1382) {
            this.field1382[this.field1381] = var1;
         }

         if (null != this.field1363) {
            this.field1363[this.field1381] = var3;
         }

         ++this.field1381;
      }
   }

   void method2128(int var1) {
      --this.field1381;
      if (0 == this.field1381) {
         this.field1382 = null;
         this.field1363 = null;
      } else {
         if (null != this.field1382) {
            System.arraycopy(this.field1382, var1 + 1, this.field1382, var1, this.field1381 - var1);
         }

         if (this.field1363 != null) {
            System.arraycopy(this.field1363, 1 + var1, this.field1363, var1, this.field1381 - var1);
         }
      }

   }

   int method2129(int var1, byte var2) {
      if (126 != var2 && 127 != var2) {
         if (var1 == this.field1379 && (-1 == this.field1380 || this.field1374[this.field1380] < 125)) {
            return -1;
         } else if (this.field1374[var1] == var2) {
            return -1;
         } else {
            this.field1374[var1] = var2;
            this.method2126();
            return var1;
         }
      } else {
         return -1;
      }
   }

   public static boolean method2179(int var0) {
      return var0 >= 0 && var0 < 112 ? KeyHandler.pressedKeys[var0] : false;
   }

   boolean method2130(int var1) {
      if (this.field1379 != var1 && this.field1374[var1] != 126) {
         this.field1374[this.field1379] = 125;
         this.field1380 = this.field1379;
         this.field1374[var1] = 126;
         this.field1379 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method2131(int var1, boolean var2) {
      if (this.field1378[var1] == var2) {
         return -1;
      } else {
         this.field1378[var1] = var2;
         return var1;
      }
   }

   int method2132(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field1376[var1];
      if ((var9 & var8) == var2) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field1376[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method2133(int var1, int var2) {
      if (null != this.field1385) {
         class354 var4 = this.field1385.method5716((long)var1);
         if (null != var4) {
            if (var4 instanceof class353) {
               class353 var5 = (class353)var4;
               if (var2 == var5.field3964) {
                  return false;
               }

               var5.field3964 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.field1385 = new class363(4);
      }

      this.field1385.method5727(new class353(var2), (long)var1);
      return true;
   }

   boolean method2134(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (this.field1385 != null) {
         class354 var9 = this.field1385.method5716((long)var1);
         if (null != var9) {
            if (var9 instanceof class353) {
               class353 var10 = (class353)var9;
               if (var2 == (var10.field3964 & var8)) {
                  return false;
               }

               var10.field3964 &= ~var8;
               var10.field3964 |= var2;
               return true;
            }

            var9.remove();
         }
      } else {
         this.field1385 = new class363(4);
      }

      this.field1385.method5727(new class353(var2), (long)var1);
      return true;
   }

   boolean method2162(int var1, long var2) {
      if (null != this.field1385) {
         class354 var4 = this.field1385.method5716((long)var1);
         if (null != var4) {
            if (var4 instanceof class352) {
               class352 var5 = (class352)var4;
               if (var2 == var5.field3963) {
                  return false;
               }

               var5.field3963 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.field1385 = new class363(4);
      }

      this.field1385.method5727(new class352(var2), (long)var1);
      return true;
   }

   boolean method2139(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.field1385 != null) {
         class354 var4 = this.field1385.method5716((long)var1);
         if (null != var4) {
            if (var4 instanceof class350) {
               class350 var5 = (class350)var4;
               if (var5.field3961 instanceof String) {
                  if (var2.equals(var5.field3961)) {
                     return false;
                  }

                  var5.remove();
                  this.field1385.method5727(new class350(var2), var5.field3966);
                  return true;
               }
            }

            var4.remove();
         }
      } else {
         this.field1385 = new class363(4);
      }

      this.field1385.method5727(new class350(var2), (long)var1);
      return true;
   }

   void method2135(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.readUnsignedByte();
         if ((var4 & 1) != 0) {
            this.field1361 = true;
         }

         if ((var4 & 2) != 0) {
            this.field1362 = true;
         }

         if (!this.field1361) {
            this.field1366 = null;
            this.field1382 = null;
         }

         if (!this.field1362) {
            this.field1373 = null;
            this.field1363 = null;
         }

         this.field1364 = var1.readInt();
         this.field1365 = var1.readInt();
         if (var3 <= 3 && this.field1365 != 0) {
            this.field1365 += 16912800;
         }

         this.field1372 = var1.readUnsignedShort();
         this.field1381 = var1.readUnsignedByte();
         this.field1368 = var1.readStringNullTerminated();
         if (var3 >= 4) {
            var1.readInt();
         }

         this.field1367 = var1.readUnsignedByte() == 1;
         this.field1360 = var1.readByte();
         this.field1369 = var1.readByte();
         this.field1370 = var1.readByte();
         this.field1384 = var1.readByte();
         int var5;
         if (this.field1372 > 0) {
            if (this.field1361 && (this.field1366 == null || this.field1366.length < this.field1372)) {
               this.field1366 = new long[this.field1372];
            }

            if (this.field1362 && (this.field1373 == null || this.field1373.length < this.field1372)) {
               this.field1373 = new String[this.field1372];
            }

            if (null == this.field1374 || this.field1374.length < this.field1372) {
               this.field1374 = new byte[this.field1372];
            }

            if (null == this.field1376 || this.field1376.length < this.field1372) {
               this.field1376 = new int[this.field1372];
            }

            if (this.field1377 == null || this.field1377.length < this.field1372) {
               this.field1377 = new int[this.field1372];
            }

            if (null == this.field1378 || this.field1378.length < this.field1372) {
               this.field1378 = new boolean[this.field1372];
            }

            for(var5 = 0; var5 < this.field1372; ++var5) {
               if (this.field1361) {
                  this.field1366[var5] = var1.method5954();
               }

               if (this.field1362) {
                  this.field1373[var5] = var1.method5956();
               }

               this.field1374[var5] = var1.readByte();
               if (var3 >= 2) {
                  this.field1376[var5] = var1.readInt();
               }

               if (var3 >= 5) {
                  this.field1377[var5] = var1.readUnsignedShort();
               } else {
                  this.field1377[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field1378[var5] = var1.readUnsignedByte() == 1;
               } else {
                  this.field1378[var5] = false;
               }
            }

            this.method2126();
         }

         if (this.field1381 > 0) {
            if (this.field1361 && (null == this.field1382 || this.field1382.length < this.field1381)) {
               this.field1382 = new long[this.field1381];
            }

            if (this.field1362 && (null == this.field1363 || this.field1363.length < this.field1381)) {
               this.field1363 = new String[this.field1381];
            }

            for(var5 = 0; var5 < this.field1381; ++var5) {
               if (this.field1361) {
                  this.field1382[var5] = var1.method5954();
               }

               if (this.field1362) {
                  this.field1363[var5] = var1.method5956();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.readUnsignedShort();
            if (var5 > 0) {
               this.field1385 = new class363(var5 < 16 ? class27.method470(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.readInt();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.readInt();
                     this.field1385.method5727(new class353(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method5954();
                     this.field1385.method5727(new class352(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.readStringNullTerminated();
                     this.field1385.method5727(new class350(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   static void method2184() {
      class56.field800 = false;
      class56.field815.method6446(class56.field825, 0);
      class56.field803.method6446(382 + class56.field825, 0);
      class89.field1229.method6349(382 + class56.field825 - class89.field1229.field4263 / 2, 18);
   }
}
