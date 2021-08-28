import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class119 extends class104 {
   static int[] field1407;
   int field1405;
   String field1403;
   long field1404;
   // $FF: synthetic field
   final class107 this$0;

   public static int method2189(int var0) {
      return class233.field2802[var0];
   }

   class119(class107 var1) {
      this.this$0 = var1;
      this.field1404 = -1L;
      this.field1403 = null;
      this.field1405 = 0;
   }

   void method2083(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1404 = var1.method5954();
      }

      this.field1403 = var1.method5956();
      this.field1405 = var1.readUnsignedShort();
   }

   void method2084(class115 var1) {
      var1.method2124(this.field1404, this.field1403, this.field1405);
   }

   public static void method2188(Buffer var0, int var1) {
      class43 var3 = new class43();
      var3.field359 = var0.readUnsignedByte();
      var3.field358 = var0.readInt();
      var3.field360 = new int[var3.field359];
      var3.field361 = new int[var3.field359];
      var3.field364 = new Field[var3.field359];
      var3.field363 = new int[var3.field359];
      var3.field365 = new Method[var3.field359];
      var3.field362 = new byte[var3.field359][][];

      for(int var4 = 0; var4 < var3.field359; ++var4) {
         try {
            int var5 = var0.readUnsignedByte();
            String var6;
            String var7;
            int var8;
            if (0 != var5 && var5 != 1 && 2 != var5) {
               if (var5 == 3 || 4 == var5) {
                  var6 = var0.readStringNullTerminated();
                  var7 = var0.readStringNullTerminated();
                  var8 = var0.readUnsignedByte();
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.readStringNullTerminated();
                  }

                  String var26 = var0.readStringNullTerminated();
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if (var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.readInt();
                        var11[var12] = new byte[var13];
                        var0.method5960(var11[var12], 0, var13);
                     }
                  }

                  var3.field360[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = Interface.method4259(var9[var13]);
                  }

                  Class var28 = Interface.method4259(var26);
                  if (Interface.method4259(var6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = Interface.method4259(var6).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if (var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if (var27.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if (var27[var20] != var18[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if (var19 && var28 == var17.getReturnType()) {
                              var3.field365[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.field362[var4] = var11;
               }
            } else {
               var6 = var0.readStringNullTerminated();
               var7 = var0.readStringNullTerminated();
               var8 = 0;
               if (1 == var5) {
                  var8 = var0.readInt();
               }

               var3.field360[var4] = var5;
               var3.field363[var4] = var8;
               if (Interface.method4259(var6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field364[var4] = Interface.method4259(var6).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.field361[var4] = -1;
         } catch (SecurityException var22) {
            var3.field361[var4] = -2;
         } catch (NullPointerException var23) {
            var3.field361[var4] = -3;
         } catch (Exception var24) {
            var3.field361[var4] = -4;
         } catch (Throwable var25) {
            var3.field361[var4] = -5;
         }
      }

      class42.field356.method4721(var3);
   }
}
