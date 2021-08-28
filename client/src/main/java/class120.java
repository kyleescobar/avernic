import java.util.Arrays;
import java.util.Date;

public abstract class class120 extends class354 {
   class120() {
   }

   static class203 method2198(int var0) {
      class203 var2 = (class203)class159.field1858.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         var2 = class8.method50(class159.field1859, class159.field1871, var0, false);
         if (null != var2) {
            class159.field1858.method3882(var2, (long)var0);
         }

         return var2;
      }
   }

   static void method2199() {
      client.field417 = -1L;
      class7.field14.field967 = 0;
      class256.field3128 = true;
      client.field421 = true;
      client.field636 = -1L;
      class332.method5327();
      client.packetWriter.clearBuffer();
      client.packetWriter.field1201.offset = 0;
      client.packetWriter.serverPacket = null;
      client.packetWriter.field1212 = null;
      client.packetWriter.field1214 = null;
      client.packetWriter.field1213 = null;
      client.packetWriter.serverPacketLength = 0;
      client.packetWriter.field1210 = 0;
      client.field423 = 0;
      client.field571 = 0;
      client.field424 = 0;
      class116.method2185();
      MouseHandler.field146 = 0;
      class286.method4582();
      client.field561 = 0;
      client.field563 = false;
      client.field498 = 0;
      client.cameraAngleY = 0;
      client.field482 = 0;
      class368.field4128 = null;
      client.minimapState = 0;
      client.field639 = -1;
      client.field644 = 0;
      client.field597 = 0;
      client.field459 = class81.field1160;
      client.field433 = class81.field1160;
      client.field685 = 0;
      PlayerList.localPlayerCount = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         PlayerList.playerAppearances[var1] = null;
         PlayerList.movementDirectionCache[var1] = 1;
      }

      for(var1 = 0; var1 < 2048; ++var1) {
         client.localPlayers[var1] = null;
      }

      for(var1 = 0; var1 < 32768; ++var1) {
         client.field567[var1] = null;
      }

      client.field535 = -1;
      client.field538.method4671();
      client.field539.method4671();

      for(var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               client.field536[var1][var2][var3] = null;
            }
         }
      }

      client.field537 = new class296();
      class13.field80.method1323();

      for(var1 = 0; var1 < class282.field3631; ++var1) {
         class140 var4 = class49.method1383(var1);
         if (null != var4) {
            class244.field2912[var1] = 0;
            class244.field2911[var1] = 0;
         }
      }

      class38.field311.method1887();
      client.field510 = -1;
      if (-1 != client.rootInterface) {
         class5.method16(client.rootInterface);
      }

      for(InterfaceParent var5 = (InterfaceParent)client.interfaceParents.method5736(); null != var5; var5 = (InterfaceParent)client.interfaceParents.method5739()) {
         class162.closeInterface(var5, true);
      }

      client.rootInterface = -1;
      client.interfaceParents = new class364(8);
      client.field574 = null;
      client.field545 = 0;
      client.isMenuOpen = false;
      client.field598.method4197((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field532[var1] = null;
         client.field533[var1] = false;
      }

      class65.field935 = new class364(32);
      client.field415 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.field617[var1] = true;
      }

      PacketBufferNode var6 = class149.getPacketBufferNode(ClientPacket.field2572, client.packetWriter.isaacCipher);
      var6.packetBuffer.writeByte(class238.method4117());
      var6.packetBuffer.writeShort(class69.canvasWidth);
      var6.packetBuffer.writeShort(client.canvasHeight);
      client.packetWriter.addNode(var6);
      class69.field972 = null;
      class42.field355 = null;
      Arrays.fill(client.field637, (Object)null);
      class322.field3845 = null;
      Arrays.fill(client.field638, (Object)null);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field620[var1] = new class286();
      }

      class293.field3711 = null;
   }

   static int method2200(int var0, class59 var1, boolean var2) {
      String var4;
      int var10;
      if (4100 == var0) {
         var4 = class51.field738[--class2.field4];
         var10 = class51.field747[--class51.field746];
         class51.field738[++class2.field4 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class2.field4 -= 2;
            var4 = class51.field738[class2.field4];
            var5 = class51.field738[class2.field4 + 1];
            class51.field738[++class2.field4 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = class51.field738[--class2.field4];
            var10 = class51.field747[--class51.field746];
            class51.field738[++class2.field4 - 1] = var4 + class241.method4139(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class51.field738[--class2.field4];
            class51.field738[++class2.field4 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var12;
            if (4104 == var0) {
               var12 = class51.field747[--class51.field746];
               long var15 = 86400000L * ((long)var12 + 11745L);
               class51.field745.setTime(new Date(var15));
               var7 = class51.field745.get(5);
               int var17 = class51.field745.get(2);
               int var9 = class51.field745.get(1);
               class51.field738[++class2.field4 - 1] = var7 + "-" + class51.field752[var17] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (4106 == var0) {
                  var12 = class51.field747[--class51.field746];
                  class51.field738[++class2.field4 - 1] = Integer.toString(var12);
                  return 1;
               } else if (var0 == 4107) {
                  class2.field4 -= 2;
                  class51.field747[++class51.field746 - 1] = class199.method3495(class167.method2887(class51.field738[class2.field4], class51.field738[1 + class2.field4], class284.field3644));
                  return 1;
               } else {
                  int var6;
                  byte[] var14;
                  class302 var16;
                  if (var0 == 4108) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[class51.field746 + 1];
                     var14 = class124.archive13.method4412(var6, 0);
                     var16 = new class302(var14);
                     class51.field747[++class51.field746 - 1] = var16.method4882(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[1 + class51.field746];
                     var14 = class124.archive13.method4412(var6, 0);
                     var16 = new class302(var14);
                     class51.field747[++class51.field746 - 1] = var16.method4902(var4, var10);
                     return 1;
                  } else if (4110 == var0) {
                     class2.field4 -= 2;
                     var4 = class51.field738[class2.field4];
                     var5 = class51.field738[class2.field4 + 1];
                     if (class51.field747[--class51.field746] == 1) {
                        class51.field738[++class2.field4 - 1] = var4;
                     } else {
                        class51.field738[++class2.field4 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class51.field738[--class2.field4];
                     class51.field738[++class2.field4 - 1] = class303.escapeBrackets(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class51.field738[--class2.field4];
                     var10 = class51.field747[--class51.field746];
                     class51.field738[++class2.field4 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class304.method4958((char)var12) ? 1 : 0;
                     return 1;
                  } else if (4114 == var0) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class268.method4353((char)var12) ? 1 : 0;
                     return 1;
                  } else if (4115 == var0) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class94.method2049((char)var12) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class282.method4533((char)var12) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class51.field738[--class2.field4];
                     if (var4 != null) {
                        class51.field747[++class51.field746 - 1] = var4.length();
                     } else {
                        class51.field747[++class51.field746 - 1] = 0;
                     }

                     return 1;
                  } else if (4118 == var0) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[1 + class51.field746];
                     class51.field738[++class2.field4 - 1] = var4.substring(var10, var6);
                     return 1;
                  } else if (4119 == var0) {
                     var4 = class51.field738[--class2.field4];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var13 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        char var8 = var4.charAt(var7);
                        if ('<' == var8) {
                           var13 = true;
                        } else if ('>' == var8) {
                           var13 = false;
                        } else if (!var13) {
                           var11.append(var8);
                        }
                     }

                     class51.field738[++class2.field4 - 1] = var11.toString();
                     return 1;
                  } else if (4120 == var0) {
                     var4 = class51.field738[--class2.field4];
                     var10 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class2.field4 -= 2;
                     var4 = class51.field738[class2.field4];
                     var5 = class51.field738[1 + class2.field4];
                     var6 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = var4.indexOf(var5, var6);
                     return 1;
                  } else if (4122 == var0) {
                     var4 = class51.field738[--class2.field4];
                     class51.field738[++class2.field4 - 1] = var4.toUpperCase();
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class2.field4 -= 2;
               var4 = class51.field738[class2.field4];
               var5 = class51.field738[1 + class2.field4];
               if (MouseHandler.localPlayer.field979 != null && MouseHandler.localPlayer.field979.field2931) {
                  class51.field738[++class2.field4 - 1] = var5;
               } else {
                  class51.field738[++class2.field4 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   abstract void method2191(Buffer var1);

   abstract void method2192(class124 var1);
}
