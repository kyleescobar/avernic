import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class class71 extends class354 {
   int field1008 = 0;
   int field1009;
   int field1010;
   int field1011;
   int field1012;
   int field1013;
   int field1014;
   int field1015;
   int field1016;
   int field1017;
   int field1018;
   int field1019 = -1;

   class71() {
   }

   public static class143 method1746(int var0) {
      class143 var2 = (class143)class143.field1568.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class143.field1565.method4412(3, var0);
         var2 = new class143();
         if (null != var3) {
            var2.method2405(new Buffer(var3));
         }

         class143.field1568.method3882(var2, (long)var0);
         return var2;
      }
   }

   public static void method1744(PacketBuffer var0) {
      class43 var2 = (class43)class42.field356.method4724();
      if (null != var2) {
         int var3 = var0.offset;
         var0.writeInt(var2.field358);

         for(int var4 = 0; var4 < var2.field359; ++var4) {
            if (0 != var2.field361[var4]) {
               var0.writeByte(var2.field361[var4]);
            } else {
               try {
                  int var5 = var2.field360[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.field364[var4];
                     var7 = var6.getInt((Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var7);
                  } else if (var5 == 1) {
                     var6 = var2.field364[var4];
                     var6.setInt((Object)null, var2.field363[var4]);
                     var0.writeByte(0);
                  } else if (2 == var5) {
                     var6 = var2.field364[var4];
                     var7 = var6.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var7);
                  }

                  Method var23;
                  if (var5 != 3) {
                     if (var5 == 4) {
                        var23 = var2.field365[var4];
                        var7 = var23.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var7);
                     }
                  } else {
                     var23 = var2.field365[var4];
                     byte[][] var24 = var2.field362[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if (null == var25) {
                        var0.writeByte(0);
                     } else if (var25 instanceof Number) {
                        var0.writeByte(1);
                        var0.writeLong(((Number)var25).longValue());
                     } else if (var25 instanceof String) {
                        var0.writeByte(2);
                        var0.writeStringCP1252((String)var25);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var11) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var12) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var13) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var14) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var15) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var16) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var17) {
                  var0.writeByte(-16);
               } catch (SecurityException var18) {
                  var0.writeByte(-17);
               } catch (IOException var19) {
                  var0.writeByte(-18);
               } catch (NullPointerException var20) {
                  var0.writeByte(-19);
               } catch (Exception var21) {
                  var0.writeByte(-20);
               } catch (Throwable var22) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.method6088(var3);
         var2.remove();
      }
   }

   static final void method1745(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8 >= 0 ? var8 : -var8;
      int var11 = var9;
      if (var9 < var10) {
         var11 = var10;
      }

      if (0 != var11) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if (var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var13 * var5 >> 17;
         int var15 = 1 + var13 * var5 >> 17;
         int var16 = var12 * var5 >> 17;
         int var17 = 1 + var12 * var5 >> 17;
         var0 -= class394.field4249;
         var1 -= class394.field4247;
         int var18 = var14 + var0;
         int var19 = var0 - var15;
         int var20 = var7 + var0 - var15;
         int var21 = var14 + var7 + var0;
         int var22 = var1 + var16;
         int var23 = var1 - var17;
         int var24 = var8 + var1 - var17;
         int var25 = var16 + var8 + var1;
         Rasterizer3D.method3423(var18, var19, var20);
         Rasterizer3D.method3426(var22, var23, var24, var18, var19, var20, var4);
         Rasterizer3D.method3423(var18, var20, var21);
         Rasterizer3D.method3426(var22, var24, var25, var18, var20, var21, var4);
      }
   }
}
